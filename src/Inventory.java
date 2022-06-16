public class Inventory
{
    boolean water, food, firewood;
    String weaponName, armorName;
    int weaponDamage, armorDefence;

    public Inventory(boolean water, boolean food, boolean firew, String weaponName, String armorName, int weaponDamage, int armorDefence)
    {
        this.water = water;
        this.food = food;
        this.firewood = firew;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDamage = weaponDamage;
        this.armorDefence = armorDefence;
    }
}