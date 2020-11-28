package vea.jdm2020.weapon;

import vea.jdm2020.weapon.weaponTypes.AssaultRifle;
import vea.jdm2020.weapon.weaponTypes.Pistol;
import vea.jdm2020.weapon.weaponTypes.Shotgun;
import vea.jdm2020.weapon.weaponTypes.SniperRifle;

public class WeaponFacade {
    private Weapon assaultRifle;
    private Weapon pistol;
    private Weapon shotgun;
    private Weapon sniperRifle;

    public WeaponFacade() {
        assaultRifle = new AssaultRifle();
        pistol = new Pistol();
        shotgun = new Shotgun();
        sniperRifle = new SniperRifle();
    }

    public Weapon getAssaultRifle() { return assaultRifle;}
    public Weapon getPistol() { return pistol; }
    public Weapon getShotgun() {return shotgun;}
    public Weapon getSniperRifle() {return sniperRifle;}

}
