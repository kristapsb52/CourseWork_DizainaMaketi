package vea.jdm2020.player;

import vea.jdm2020.mission.Mission;
import vea.jdm2020.soldier.Soldier;
import vea.jdm2020.weapon.Weapon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// TODO Add money to the player class
public class Player {
    // Lists of all the soldier types
    private ArrayList<Soldier> medics;
    private ArrayList<Soldier> pilots;
    private ArrayList<Soldier> spies;
    private ArrayList<Soldier> snipers;

    // Inventory of all the weapons
    private ArrayList<Weapon> ARInv;
    private ArrayList<Weapon> sniperInv;
    private ArrayList<Weapon> pistolInv;
    private ArrayList<Weapon> shotgunInv;

    // Squad of soldiers
    private ArrayList<Soldier> soldierSquad;

    // List of missions
    private ArrayList<Mission> availableMissions;

    // Players amount of gold
    private int gold;

    public Player() {
        medics = new ArrayList<>();
        pilots = new ArrayList<>();
        spies = new ArrayList<>();
        snipers = new ArrayList<>();

        ARInv = new ArrayList<>();
        sniperInv = new ArrayList<>();
        pistolInv = new ArrayList<>();
        shotgunInv = new ArrayList<>();

        soldierSquad = new ArrayList<>();
        availableMissions = new ArrayList<>();

        gold = 0;
    }

    // Adds soldiers to list
    public void addMedic(Soldier soldier) {
        if (soldier.getSoldierType() != "Medic") {
            System.out.println("Cannot add {" + soldier.getSoldierType() + "} to medics");
        } else {
            medics.add(soldier);
        }
    }
    public void addPilots(Soldier soldier) {
        if (soldier.getSoldierType() != "Pilot") {
            System.out.println("Cannot add {" + soldier.getSoldierType() + "} to pilots");
        } else {
            pilots.add(soldier);
        }
    }
    public void addSpy(Soldier soldier) {
        if (soldier.getSoldierType() != "Spy") {
            System.out.println("Cannot add {" + soldier.getSoldierType() +"} to spies");
        } else {
            spies.add(soldier);
        }
    }
    public void addSniper(Soldier soldier) {
        if (soldier.getSoldierType() != "Sniper") {
            System.out.println("Cannot add {" + soldier.getSoldierType() + "} to snipers");
        } else {
            snipers.add(soldier);
        }
    }

    // Adds weapons to list
    public void addAR (Weapon weapon) {
        if (weapon.weaponType() != "Assault Rifle") {
            System.out.println("Cannot add {" + weapon.weaponType() + "} to Assault Rifle inventory");
        } else {
            ARInv.add(weapon);
        }
    }
    public void addSniper (Weapon weapon) {
        if (weapon.weaponType() != "Sniper Rifle") {
            System.out.println("Cannot add {" + weapon.weaponType() + "} to Sniper Rifle inventory");
        } else {
            sniperInv.add(weapon);
        }
    }
    public void addShotgun (Weapon weapon) {
        if (weapon.weaponType() != "Shotgun") {
            System.out.println("Cannot add {" + weapon.weaponType() + "} to Shotgun inventory");
        } else {
            shotgunInv.add(weapon);
        }
    }
    public void addPistol (Weapon weapon) {
        if (weapon.weaponType() != "Pistol") {
            System.out.println("Cannot add {" + weapon.weaponType() + "} to Pistol inventory");
        } else {
            pistolInv.add(weapon);
        }
    }

    public List<Soldier> getMedics() {
        return medics;
    }

    public List<Soldier> getPilots() {
        return pilots;
    }

    public List<Soldier> getSpies() {
        return spies;
    }

    public List<Soldier> getSnipers() {
        return snipers;
    }

    public List<Weapon> getARInv() {
        return ARInv;
    }

    public List<Weapon> getSniperInv() {
        return sniperInv;
    }

    public List<Weapon> getPistolInv() {
        return pistolInv;
    }

    public List<Weapon> getShotgunInv() {
        return shotgunInv;
    }

    public void addSquadMember(Soldier soldier){
        soldierSquad.add(soldier);
    }

    public void removeSquadMember(Soldier soldier) {
        soldierSquad.remove(soldier);
    }

    public void addMission(Mission mission) {
        availableMissions.add(mission);
    }

    public void removeMission(Mission mission) {
        availableMissions.remove(mission);
    }

    public List<Mission> getAvailableMissions() {
        return availableMissions;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGold() {
        return this.gold;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }

}
