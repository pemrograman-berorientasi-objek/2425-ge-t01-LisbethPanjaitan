package fintech.driver; 

import java.util.Scanner;
import fintech.model.*;
/**
 * @autor 12S23041- Lisbeth Panjaitan
 * @autor 12S23021- Eunike Purba
 */

 public class Driver1 {

    public static void main(String[] _args) {

        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        String name = input.nextLine();
        String owner = input.nextLine();

        Account account = new Account(owner, name);
        System.out.println(account);
        input.close();
    }
}