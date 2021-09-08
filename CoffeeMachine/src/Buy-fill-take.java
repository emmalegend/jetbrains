import java.util.Scanner;
class CoffeMachine{
    
    public static void main(String[] args) {
        
    
        ProcessInput coffee = new ProcessInput();

        while(coffee.exit){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (coffee.in()) {
                case "buy": 
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
               
                    switch (coffee.in()) {
                        case "1":
                            coffee.one();
                            break;
                        
                        case "2":
                           coffee.two();
                            break;

                        case "3":
                            coffee.three();
                            break;
                        case "back":
                            break;
                                    
                            default:
                            break;
                    }
                break;    
               
                case "fill":
                coffee.fill();
                break;

                case "take":
                coffee.take();
                break;

                case "exit":
                coffee.exit();
                break;

                case "remaining":
                coffee.machineStatus();
                break;

                default:
                    break;
            }

           
        }
    }
}    
class ProcessInput{
    Scanner sc = new Scanner(System.in);

    private static int water = 400;
    private static int milk = 540;
    private static int coffebeans = 120;
    private static int cups = 9;
    private static int money = 550;
    boolean exit = true;

    public void machineStatus(){
        System.out.println("The coffee machine has: ");
        System.out.println(water+" ml of water");
        System.out.println(milk+" ml of milk");
        System.out.println(coffebeans+" g of coffee beans");
        System.out.println(cups+" disposable cups");
        System.out.println("$"+money+" of money");
    }

    public String in(){
        return sc.next();
    }

    public void exit(){
        exit=false;
    }

    public void take(){
        System.out.println("I gave you $"+money);
        money = 0;
    }

    public void fill(){
        System.out.println("Write how many ml of water you want to add:");
        water += sc.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        milk += sc.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        coffebeans += sc.nextInt();

        System.out.println("Write how many disposable cups you want to add:");
        cups += sc.nextInt();
    }

    public void one(){
        if(water<250){System.out.println("Sorry, Not enough water");}
        else if(coffebeans<16){System.out.println("Sorry, Not enough coffeebeans");}
        else if(cups<1){System.out.println("Sorry, Not enough disposable cups");}
        else{
        cups -=1;
        coffebeans -=16;
        water -= 250;
        money+=4;
        System.out.println("I have enough resources, making you a coffee!");
        };
    }

    public void two(){
        if(water<350){System.out.println("Sorry, Not enough water");}
        else if(coffebeans<20){System.out.println("Sorry, Not enough coffeebeans");}
        else if(milk<75){System.out.println("Sorry, Not enough Milk");}
        else if(cups<1){System.out.println("Sorry, Not enough disposable cups");}
        else{
        water -= 350;
        milk-=75;
        cups -=1;
        coffebeans -=20;
        money+=7;
        System.out.println("I have enough resources, making you a coffee!");
        };
    }

    public void three(){
        if(water<200){System.out.println("Sorry, Not enough water");}
        else if(coffebeans<12){System.out.println("Sorry, Not enough coffeebeans");}
        else if(milk<100){System.out.println("Sorry, Not enough Milk");}
        else if(cups<1){System.out.println("Sorry, Not enough disposable cups");}
        else{    
        water -= 200;
        cups -=1;
        coffebeans -=12;
        money+=6;
        milk-=100;
        System.out.println("I have enough resources, making you a coffee!");
        };
    }

}