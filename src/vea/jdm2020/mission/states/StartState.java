package vea.jdm2020.mission.states;

import vea.jdm2020.mission.Mission;

public class StartState implements MissionState {

    @Override
    public void doMission(Mission mission) {
        System.out.println("Mission has started");
        mission.setMissionState(this);
    }
}
