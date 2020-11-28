package vea.jdm2020.soldier;


public interface Soldier {
    public boolean isOnMission();
    public void gainedExp(int experience);
    public void levelUp();
    public void changeWeapon();
    public void changeItems();
    public String getSoldierType();
    // TODO Change the output of getInfo
    public void getInfo();
    public int getLevel();
}
