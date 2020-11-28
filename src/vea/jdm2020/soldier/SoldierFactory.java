package vea.jdm2020.soldier;

import vea.jdm2020.soldier.soldiertypes.Medic;
import vea.jdm2020.soldier.soldiertypes.Pilot;
import vea.jdm2020.soldier.soldiertypes.Sniper;
import vea.jdm2020.soldier.soldiertypes.Spy;

public class SoldierFactory {
    public Soldier createSoldier(String soldierType) {
        if (soldierType == null) {
            return null;
        }
        if (soldierType == "medic") {
            return new Medic();
        } else if (soldierType == "pilot") {
            return new Pilot();
        } else if (soldierType == "sniper") {
            return new Sniper();
        } else if (soldierType == "spy") {
            return new Spy();
        }
        return null;
    }

}
