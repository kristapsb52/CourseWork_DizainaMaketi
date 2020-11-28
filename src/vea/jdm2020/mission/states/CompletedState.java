package vea.jdm2020.mission.states;

import vea.jdm2020.mission.Mission;

public class CompletedState implements MissionState {

    @Override
    public void doMission(Mission mission) {
        System.out.println("Missions is completed");
        mission.setMissionState(this);
    }
}
