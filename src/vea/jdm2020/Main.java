package vea.jdm2020;

import vea.jdm2020.mission.Mission;
import vea.jdm2020.player.Player;
import vea.jdm2020.soldier.Soldier;
import vea.jdm2020.soldier.SoldierFactory;

import java.util.ArrayList;

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

        Player player = new Player();
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
    }
}
