package vea.jdm2020.weapon.weaponTypes;

import vea.jdm2020.weapon.Weapon;

import java.util.Random;

public class Pistol implements Weapon {

    private String pistol;
    private void createPistol() {
        String[] listOfNames = {"USP .45", ".44 MAGNUM", "M9", "DESERT EAGLE"};
        Random rand = new Random();
        int randomWeapon = rand.nextInt(listOfNames.length);
        this.pistol = listOfNames[randomWeapon];
    }

    public Pistol () {
        createPistol();
    }


    @Override
    public void addAttachment() {

    }

    @Override
    public String weaponInfo() {
        return pistol;
    }

    @Override
    public String weaponType() {
        return "Pistol";
    }
}
