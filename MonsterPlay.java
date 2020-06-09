/**
 * Little Monster program
 * 
 */

import java.util.Scanner;

public class MonsterPlay
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter Monster name: ");
        String monsterName = input.next();
        System.out.print("Enter lifespan: ");
        int monsterLifeSpan = input.nextInt();

        Monster myMonster = new Monster(monsterName, monsterLifeSpan);

        System.out.println("THE LIFESPAN IS: " + myMonster.getLifespan());
    }
}