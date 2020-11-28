package vea.jdm2020.soldier.soldiertypes;

import vea.jdm2020.soldier.Soldier;
import vea.jdm2020.soldier.SoldierData;
import vea.jdm2020.weapon.WeaponFacade;

public class Pilot extends SoldierData implements Soldier {
    private String soldierType = "Pilot";
    private void assignDefaultWeapon() {
        WeaponFacade tempWeapon = new WeaponFacade();
        setWeapon(tempWeapon.getShotgun());
    }

    public Pilot() {
        assignDefaultWeapon();
        getRandomName();
    }

    @Override
    public boolean isOnMission() {
        return false;
    }

    @Override
    public void gainedExp(int experience) {
        int exp = getExp();
        int[] experienceToLevelUp = {1000, 1500, 2000, 2500};
        exp += experience;
        if (exp > experienceToLevelUp[getLevel()-1]) {
            setExp(exp - experienceToLevelUp[getLevel()-1]);
            levelUp();
        } else {
            setExp(exp);
        }
    }

    @Override
    public void levelUp() {
        System.out.println("Level up!");
        setLvl(getLevel()+1);
    }

    @Override
    public void changeWeapon() {

    }

    @Override
    public void changeItems() {

    }

    @Override
    public String getSoldierType() {
        return this.soldierType;
    }

    @Override
    public void getInfo() {
        System.out.println("------Pilot------\n" +
                "Name: " + getName() + "\n" +
                "Level: " + getLevel() + "\n" +
                "Exp: " + getExp() + "/" + getExpToLevelUp() + "\n" +
                "Pilots weapon is: " + getWeapon());
    }

    @Override
    public int getLevel() {
        return getLvl();
    }
}
