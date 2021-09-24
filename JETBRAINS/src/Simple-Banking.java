package src;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class Banking {

    public static void main(String[] args) {
        BankingInfo newBank = new BankingInfo();

        while(newBank.exit){
            newBank.intro();
            switch (newBank.in()) {
                case "1":
                newBank.createAccount();
                break;

                case "2":
                newBank.login();

                break;

                case "0":
                newBank.end();
                default:
                    break;
            }
        }
    }
}


class BankingInfo{

    Scanner sc = new Scanner(System.in);
    HashMap <String, String> account = new HashMap<>();

    private int BIN = 400000;

    public boolean exit = true;
    
    public void end(){
        System.out.println("Bye!");
        exit=false;
    }

    public String in(){
        return sc.next();
    }

    public void intro(){
        System.out.println("1. Create an account");
        System.out.println("2. Log into account");
        System.out.println("0. Exit");
    }

    public void createAccount(){
        Random random = new Random();
        String cardPin = String.valueOf(random.nextInt(10000+1-1000)+1000);
        String cardNum1 = String.valueOf(random.nextInt(1000000 + 1 - 100000) + 100000);
        String cardNum2 = String.valueOf(random.nextInt(10000+1-1000)+1000); 
        
        String cardNum = (BIN+cardNum1+cardNum2);


        System.out.println("Your card number:");
        System.out.println(cardNum);
        System.out.println("Your card PIN:");
        System.out.println(cardPin);

        account.put(cardNum, cardPin);

    }

    public void login(){
        System.out.println("Enter your card number:");
        String card = sc.next();
        System.out.println("Enter your PIN:");
        String pin =  sc.next();
        

        if(account.containsKey(card) && account.containsValue(pin)){
            System.out.println("You have successfully logged in!");
            System.out.println("1. Balance");
            System.out.println("2. Log out");
            System.out.println("0. Exit");

            String loginOption = sc.next();
            switch (loginOption) {
                case "1":
                    System.out.println("Balance: 0");
                    break;
                case "2":
                    System.out.println("You have successfully logged out!");
                    break;
                case "0":
                    break;    
                default:
                    break;
            }
        } else{
            System.out.println("Wrong card number or PIN!");
        }

    }

}