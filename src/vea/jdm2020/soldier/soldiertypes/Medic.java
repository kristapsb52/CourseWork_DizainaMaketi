package vea.jdm2020.soldier.soldiertypes;

import vea.jdm2020.soldier.Soldier;
import vea.jdm2020.soldier.SoldierData;
import vea.jdm2020.weapon.Weapon;
import vea.jdm2020.weapon.WeaponFacade;

public class Medic extends SoldierData implements Soldier {
    private String soldierType = "Medic";
    private void assignDefaultWeapon() {
        WeaponFacade tempWeapon = new WeaponFacade();
        setWeapon(tempWeapon.getPistol());
    }
    public Medic() {
        assignDefaultWeapon();
        getRandomName();
    }

    @Override
    public void gainedExp(int experience) {
        int exp = getExp();
        int experienceToLevelUp = getExpToLevelUp();
        exp += experience;
        if (exp > experienceToLevelUp) {
            setExp(exp - experienceToLevelUp);
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
    public String getSoldierType() {
        return this.soldierType;
    }

    @Override
    public void getInfo() {
        System.out.println("------Medic------\n" +
                "Name: " + getName() + "\n" +
                "Level: " + getLevel() + "\n" +
                "Exp: " + getExp() + "/" + getExpToLevelUp() + "\n" +
                "Medics weapon is: " + getWeapon());
    }

    @Override
    public int getLevel() {
        return getLvl();
    }
}
