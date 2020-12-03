package vea.jdm2020.soldier;

import vea.jdm2020.soldier.names.Names;
import vea.jdm2020.weapon.Weapon;
import vea.jdm2020.weapon.WeaponIcon;

import javax.naming.Name;
import java.util.Random;

public class SoldierData {
    private int exp = 0;
    private int lvl = 1;
    private Weapon weapon;
    private WeaponIcon weaponName;
    private Names name;
    // TODO make a special item

    public SoldierData() {
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getWeapon() {
        return weapon.weaponInfo() + weaponName.weaponInfo();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        this.weaponName = new WeaponIcon(this.weapon);
    }

    public void getRandomName() {
        Random rand = new Random();
        this.name = Names.values()[rand.nextInt((Names.values().length))];
    }

    public Names getName() {
        return this.name;
    }

    public int getExpToLevelUp() {
        int[] experienceToLevelUp = {1000, 1500, 2000, 2500};
        return experienceToLevelUp[this.lvl-1];
    }
}
