package vea.jdm2020.weapon.weaponTypes;

import vea.jdm2020.weapon.Weapon;

import java.util.Random;

public class SniperRifle implements Weapon {
    private String sniperRifle;
    private int price = 2000;

    public void createSniperRifle() {
        String[] listOfNames = {"Intervention", "BARRETT .50CAL", "WA2000", "M21 EBR"};
        Random rand = new Random();
        int randomWeapon = rand.nextInt(listOfNames.length);
        this.sniperRifle = listOfNames[randomWeapon];
    }

    public SniperRifle () {
        createSniperRifle();
    }

    @Override
    public void addAttachment() {

    }

    @Override
    public String weaponInfo() {
        return sniperRifle;
    }

    @Override
    public String weaponType() {
        return "Sniper Rifle";
    }

    @Override
    public int price() {
        return price;
    }
}
