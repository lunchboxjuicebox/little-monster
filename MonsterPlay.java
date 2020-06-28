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

        boolean keepGoing = true;
        while(myMonster.getAge() <= myMonster.getLifespan() && keepGoing)
        {
            System.out.println();
            myMonster.displayMonster();

            System.out.print("\n(P)et, po(K)e, (F)eed, (E)xercise, (Q)uit: ");
            String userCommand = input.next();
            char command = userCommand.charAt(0);
            switch (command)
            {
                case 'P':
                case 'p':
                    myMonster.pet();
                    break;
                case 'K':
                case 'k':
                    myMonster.poke();
                    break;
                case 'F':
                case 'f':
                    System.out.print("Feed how much? ");
                    int amtFood = input.nextInt();
                    myMonster.feed(amtFood);
                    break;
                case 'E':
                case 'e':
                    System.out.print("How many hours will you walk "+monsterName+"? ");
                    int amtExercise = input.nextInt();
                    myMonster.exercise(amtExercise);
                    break;
                case 'Q':
                case 'q':
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Command not recognized.");
            }
        }
        System.out.println();
        System.out.println("Oh no! " + monsterName + " expired (×_×)⌒☆ ");
        System.out.println("                 ______");
    }
}