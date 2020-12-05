package vea.jdm2020;

import vea.jdm2020.mission.Mission;
import vea.jdm2020.player.Player;
import vea.jdm2020.shop.ShopBuy;
import vea.jdm2020.shop.ShopSell;
import vea.jdm2020.soldier.Soldier;
import vea.jdm2020.soldier.SoldierFactory;
import vea.jdm2020.vehicle.VehicleParts;
import vea.jdm2020.weapon.Weapon;
import vea.jdm2020.weapon.weaponTypes.Pistol;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SoldierFactory factory = new SoldierFactory();
        Soldier soldier1 = factory.createSoldier("medic");
        soldier1.getInfo();
        Soldier soldier2 = factory.createSoldier("pilot");
        soldier2.getInfo();
        Soldier soldier3 = factory.createSoldier("spy");
        soldier3.getInfo();
        Soldier soldier4 = factory.createSoldier("sniper");
        soldier4.getInfo();

        Player player = Player.getInstance();
        player.addMedic(soldier1);
        player.addPilots(soldier2);
        player.addSpy(soldier3);
        player.addSniper(soldier4);

        // Squad requirements {Medics, Pilots, Spies, Snipers}
        int[] necessarySoldiers = {0, 1, 0, 1};
        Mission mission1 = new Mission(necessarySoldiers, 1, 1200, 500, player);
        mission1.missionInfo();

        // Player is creating a squad for the mission
        ArrayList<Soldier> squad1 = new ArrayList<>();
        squad1.add(player.getMedics().get(0));

        //Player is assigning a squad that doesn't match the requirements
        mission1.startMission(squad1);
        squad1.remove(player.getMedics().get(0));

        //Player is making a squad that does match the requirements
        squad1.add(player.getPilots().get(0));
        squad1.add(player.getSnipers().get(0));
        mission1.startMission(squad1);
        mission1.missionInfo();
        soldier1.getInfo();
        soldier2.getInfo();
        soldier3.getInfo();
        soldier4.getInfo();


        System.out.println("========= Players info =========");
        System.out.println("Gold: " + player.getGold());

        // Creating a vehicle with 6 total parts and the main part
        VehicleParts vehicle = new VehicleParts("Tank", 2000, player);

        // Creating Body and Wheel childs for the tank
        VehicleParts body = new VehicleParts("Body", 1000, player);
        VehicleParts wheels = new VehicleParts("Wheels", 1500, player);

        vehicle.addPart(body);
        vehicle.addPart(wheels);
        
        // Creating Gun and Radio child for the Body
        VehicleParts gun = new VehicleParts("Gun", 600, player);
        VehicleParts radio = new VehicleParts("Radio", 300, player);

        // Creating Suspension and Engine child for the Wheels
        VehicleParts suspension = new VehicleParts("Suspension", 400, player);
        VehicleParts engine = new VehicleParts("Engine", 800, player);
        
        body.addPart(gun);
        body.addPart(radio);
        wheels.addPart(suspension);
        wheels.addPart(engine);

        // Player buys the radio child
        radio.buying(player.getGold());

        // Prints out all children of tank, radio's has been bought should be equal to true
        System.out.println(vehicle.toString());
        for (VehicleParts headParts:vehicle.getParts()) {
            System.out.println(headParts.toString());
            for (VehicleParts lesserParts:headParts.getParts()) {
                System.out.println(lesserParts.toString());
            }
        }

        // Gives the player 1000 gold
        System.out.println("========= Players info =========");
        player.addGold(1000);
        System.out.println("Gold: " + player.getGold());

        // Adds a pistol to the shop so the player can buy it
        ShopBuy shopBuy = new ShopBuy(player);
        ShopSell shopSell = new ShopSell(player);
        Weapon randomPistol = new Pistol();
        shopBuy.addWeaponToShop(randomPistol);
        shopBuy.buyWeapon(0);

        // Shows that the player has a pistol in its inventory
        System.out.println("========= Players info =========");
        System.out.println("Weapon: " + player.getPistolInv().get(0).weaponInfo());
        System.out.println("Gold: " + player.getGold());

        // Player sells the pistol
        shopSell.sellItem(player.getPistolInv().get(0));
        System.out.println("========= Players info =========");
        try {
            System.out.println("Weapon: " + player.getPistolInv().get(0).weaponInfo());
        } catch(Exception e) {
            System.out.println("Player doesn't have a pistol in its inventory");
        }
        System.out.println("Gold: " + player.getGold());

    }
}
