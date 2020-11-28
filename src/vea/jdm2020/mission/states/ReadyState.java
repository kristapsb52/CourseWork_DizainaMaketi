package vea.jdm2020.mission.states;

import vea.jdm2020.mission.Mission;

public class ReadyState implements MissionState {

    @Override
    public void doMission(Mission mission) {
        System.out.println("Mission is ready");
        mission.setMissionState(this);
    }
}
