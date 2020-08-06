package practice;

import java.util.HashMap;
import java.util.Scanner;

public class BANK {
    public static void main(String[] args) {
        HashMap<Integer,String> customer = new HashMap<>();
        HashMap<Integer,Integer> balance = new HashMap<>();
        Scanner in = new Scanner(System.in);
        while(true){
            int choice = in.nextInt();
            switch(choice){
                case 1:AddAccount();
                    break;
                case 2:CheckBalance();
                    break;
                case 3: Withdraw();
                    break;
                case 4: AddBalance();
                    break;
                default:
                    System.out.println("Wrong input");
            }
        }
    }

    private static void AddBalance() {

    }

    private static void Withdraw() {

    }

    private static void CheckBalance() {

    }

    private static void AddAccount() {

    }
}
