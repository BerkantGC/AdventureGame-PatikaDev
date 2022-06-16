import java.util.Scanner;

public class Player{
    /*private int damage;
    private int health;
    private int money;
    private String name;*/

    public void selectChar()
    {
        int givenID;
        Scanner input = new Scanner(System.in);
        System.out.printf("Choose your character\n 1)Samurai\t 2)Archer\t 3)Knight\n");
        givenID = input.nextInt();
        input.close();

        switch (givenID) {
            case 1:
                Samurai samurai = new Samurai("Samurai", 1, 5, 21, 15);
                System.out.println(samurai.name + " ID: " + samurai.ID + " Damage: " +samurai.damage + " Health: " + samurai.health + " Money: " + samurai.money);
                break;

            case 2:
                Archer archer = new Archer("Archer", 2, 7, 18, 20);
                System.out.println(archer.name + " ID: " + archer.ID + " Damage: " + archer.damage + " Health: " + archer.health + " Money: " + archer.money);
                break;

            case 3:
                Knight knight = new Knight("Knight", 3, 8, 24, 5);
                System.out.println(knight.name + " ID: " + knight.ID + " Damage: " + knight.damage + " Health: " + knight.health + " Money: "+ knight.money);
            default:
                break;
        }

    }

}