package vea.jdm2020.weapon.weaponTypes;

import vea.jdm2020.weapon.Weapon;

import java.util.Random;

public class Shotgun implements Weapon {

    private String shotgun;
    private int price = 800;

    private void createShotgun() {
        String[] listOfNames = {"SPAS-12", "AA-12", "STRIKER", "RANGER"};
        Random rand = new Random();
        int randomWeapon = rand.nextInt(listOfNames.length);
        this.shotgun = listOfNames[randomWeapon];
    }

    public Shotgun () {
        createShotgun();
    }

    @Override
    public String weaponInfo() {
        return shotgun;
    }

    @Override
    public String weaponType() {
        return "Shotgun";
    }

    @Override
    public int price() {
        return price;
    }
}
