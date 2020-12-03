package vea.jdm2020.weapon.weaponTypes;

import vea.jdm2020.weapon.Weapon;

import java.util.Random;

public class AssaultRifle implements Weapon {

    private String assaultRifle;
    private int price = 1500;

    private void createAssaultRifle() {
        String[] listOfNames = {"AK-47", "SCAR-H", "ACR", "TAR-21", "FAL", "FAMAS"};
        Random rand = new Random();
        int randomWeapon = rand.nextInt(listOfNames.length);
        this.assaultRifle = listOfNames[randomWeapon];
    }

    public AssaultRifle () {
        createAssaultRifle();
    }

    @Override
    public void addAttachment() {

    }

    @Override
    public String weaponInfo() {
        return assaultRifle;
    }

    @Override
    public String weaponType() {
        return "Assault Rifle";
    }

    @Override
    public int price() {
        return price;
    }


}
