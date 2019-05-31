/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {

    public static void main(String[] args) {
        int item = 5;
        int limit = 10;
        int Menu;

        System.out.println("item" + item);
        System.out.println("limit" + limit);

        System.out.print("Menu Nakubb");

        Scanner sc = new Scanner(System.in);

        System.out.println("I.Add");
        System.out.println("II.Remove");
        System.out.println("III.Check");
        System.out.println("Please input Number");

        Menu = sc.nextInt();

        if (Menu == 1) {
            System.out.println("I.Add");

            if (item < limit) {
                System.out.println("input amount to add");
                int amount = sc.nextInt();
                if (item + amount > limit) {
                    System.out.println(" item เกิน ");
                } else {
                    item = item + amount;
                    System.out.println("item" + item);
                    System.out.println("limit" + limit);
                }
            } else {
                System.out.println("It's Full");
            }

        }

        if (Menu == 2) {
            if (item > 0) {

                System.out.println("remove");
                System.out.println("input amount to remove");
                int amount = sc.nextInt();
                if (item - amount < 0) {
                    System.out.println("remove mai dai");
                } else {
                    item = item - amount;
                    System.out.println("item" + item);
                    System.out.println("limit" + limit);
                }

            } else {
                System.out.println("It's Emthy");
            }
        }
        if (Menu == 3) {
            System.out.println("item" + item);
            System.out.println("limit" + limit);
        }
    }
}
