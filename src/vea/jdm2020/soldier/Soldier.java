package vea.jdm2020.soldier;


public interface Soldier {
    public void gainedExp(int experience);
    public void levelUp();
    public String getSoldierType();
    public void getInfo();
    public int getLevel();
}
