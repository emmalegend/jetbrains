import java.util.Scanner;
class CoffeeMachine {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = sc.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = sc.nextInt();

         System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = sc.nextInt();

         System.out.println("Write how many cups of coffee you will need:");
        int cups = sc.nextInt();
        
        int totalWater = water/200;       
        int totalMilk = milk/50;       
        int totalCoffee = coffee/15; 
        
        int counter = 0;
        int remainCups = 0;
        
        while(totalWater>0 && totalMilk>0 && totalCoffee>0){
            counter++;
            totalWater--;
            totalMilk--;
            totalCoffee--;
        };

        if(counter > 0){
            remainCups = counter-cups;
        };

        if(counter >= cups && remainCups > 0) {
            System.out.println("Yes i can make that amount of coffee (and even " + remainCups + " more than that)");
        } else if(counter == cups){
            System.out.println("Yes, i can make that amount of coffee");
        } else if(counter < cups){
            System.out.println("No, i can only make " + counter + " cup(s) of coffee");
        } else{
            System.out.println("No i can only make 0 cups of coffee");
        };

        System.out.println("counter: " + counter);
    };
};