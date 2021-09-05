import java.util.Scanner;
class CoffeMachine{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffebeans = 120;
        int cups = 9;
        int money = 550;

        System.out.println("The coffee machine has: ");
        System.out.println(400+" ml of water");
        System.out.println(540+" ml of milk");
        System.out.println(120+" g of coffee beans");
        System.out.println(9+" disposable cups");
        System.out.println("$"+550+" of money");

        System.out.println("Write action (buy, fill, take):");
        String action = sc.nextLine();

        if(action.equals("buy")){
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int choice = sc.nextInt();
            if(choice == 1){
                water -= 250;
                coffebeans -=16;
                money+=4;
                cups -=1;

                System.out.println("The coffee machine has: ");
                System.out.println(water+" ml of water");
                System.out.println(milk+" ml of milk");
                System.out.println(coffebeans+" g of coffee beans");
                System.out.println(cups+" disposable cups");
                System.out.println("$"+money+" of money");
            } else if (choice == 2){
                water -= 350;
                milk -=75;
                coffebeans -=20;
                money+=7;
                cups -=1;

                System.out.println("The coffee machine has: ");
                System.out.println(water+" ml of water");
                System.out.println(milk+" ml of milk");
                System.out.println(coffebeans+" g of coffee beans");
                System.out.println(cups+" disposable cups");
                System.out.println("$"+money+" of money");
            } else if (choice == 3){
                water -= 200;
                coffebeans -=12;
                milk -= 100;
                money+=6;
                cups -=1;

                System.out.println("The coffee machine has: ");
                System.out.println(water+" ml of water");
                System.out.println(milk+" ml of milk");
                System.out.println(coffebeans+" g of coffee beans");
                System.out.println(cups+" disposable cups");
                System.out.println("$"+money+" of money");
            } else{return;}
        } else if (action.equals("fill")){
            System.out.println("Write how many ml of water you want to add:");
            water += sc.nextInt();

            System.out.println("Write how many ml of milk you want to add:");
            milk += sc.nextInt();

            System.out.println("Write how many grams of coffee beans you want to add:");
            coffebeans += sc.nextInt();

            System.out.println("Write how many disposable cups you want to add:");
            cups += sc.nextInt();

            System.out.println("The coffee machine has: ");
            System.out.println(water+" ml of water");
            System.out.println(milk+" ml of milk");
            System.out.println(coffebeans+" g of coffe beans");
            System.out.println(cups+" disposable cups");
            System.out.println("$"+money+" of money");
        } else if (action.equals("take")){
            System.out.println("I gave you $550");
            money = 0;

            System.out.println("The coffee machine has: ");
            System.out.println(water+" ml of water");
            System.out.println(milk+" ml of milk");
            System.out.println(coffebeans+" g of coffee beans");
            System.out.println(cups+" disposable cups");
            System.out.println("$"+money+" of money");
        }


     }    
}