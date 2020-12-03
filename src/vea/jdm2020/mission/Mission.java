package vea.jdm2020.mission;

import vea.jdm2020.mission.states.CompletedState;
import vea.jdm2020.mission.states.MissionState;
import vea.jdm2020.mission.states.ReadyState;
import vea.jdm2020.mission.states.StartState;
import vea.jdm2020.player.Player;
import vea.jdm2020.soldier.Soldier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Mission {
    private int[] necessarySoldierTypes;
    private int requiredLevel;
    private int XP_Reward;
    private int gold_Reward;
    private double chance;
    private MissionState missionState;
    private Player player;

    public Mission(int[] necessarySoldierTypes, int requiredLevel, int XP_Reward, int gold_Reward, Player player) {
        this.necessarySoldierTypes = necessarySoldierTypes;
        this.requiredLevel = requiredLevel;
        this.missionState = new ReadyState();
        this.XP_Reward = XP_Reward;
        this.gold_Reward = gold_Reward;
        this.player = player;
        this.player.addMission(this);
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public double getChance() {
        return chance;
    }

    public void calculateChance(ArrayList<Soldier> missionSoldiers) {
        int totalLevel = 0;
        for (Soldier soldier : missionSoldiers) {
            totalLevel += soldier.getLevel();
        }
        this.chance = (double)totalLevel / requiredLevel * 100;
    }


    public void startMission(ArrayList<Soldier> missionSoldiers) {
        int[] tempSoldiers = {0, 0, 0, 0};
        for (Soldier soldier: missionSoldiers) {
            if (soldier.getSoldierType() == "Medic") {
                tempSoldiers[0] += 1;
            } else if (soldier.getSoldierType() == "Pilot") {
                tempSoldiers[1] += 1;
            } else if (soldier.getSoldierType() == "Spy") {
                tempSoldiers[2] += 1;
            } else if (soldier.getSoldierType() == "Sniper") {
                tempSoldiers[3] += 1;
            }
        }
        if (Arrays.equals(tempSoldiers, necessarySoldierTypes)) {
            calculateChance(missionSoldiers);
            MissionState startState = new StartState();
            startState.doMission(this);
            completeMission(missionSoldiers);
        } else {
            System.out.println("Created squad does not meet the requirements \n");
        }
    }

    public void missionInfo() {
        System.out.println("----- Mission Info ----- \n" +
                "necessary soldiers:" + "\n" +
                "Medics: " + necessarySoldierTypes[0] + "\n" +
                "Pilots: " + necessarySoldierTypes[1] + "\n" +
                "Spies: " + necessarySoldierTypes[2] + "\n" +
                "Snipers: " + necessarySoldierTypes[3] + "\n" +
                "required level: " + requiredLevel + "\n" +
                "chance: " + chance + "%\n");
    }

    public void setMissionState(MissionState state) {
        this.missionState = state;
    }

    public MissionState getState() {
        return this.missionState;
    }

    private void completeMission(ArrayList<Soldier> missionSoldiers) {
        Random rand = new Random();
        MissionState missionState = new CompletedState();
        missionState.doMission(this);
        if (chance > rand.nextDouble() * 100) {
            System.out.println("Mission was succesful");
            player.addGold(gold_Reward);
            for (Soldier soldier : missionSoldiers) {
                soldier.gainedExp(XP_Reward);
            }
        } else {
            // Since mission was not succesful player does not receive any gold
            System.out.println("Mission was not succesful");
            for (Soldier soldier : missionSoldiers) {
                soldier.gainedExp(XP_Reward/20);
            }
        }

        player.removeMission(this);
    }
}
