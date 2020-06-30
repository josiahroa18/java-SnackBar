package snackBar;

// Compile: javac snackBar/*.java
// Create jar: jar cvfe snackBar.jar snackBar.Main snackBar/*.class
// Execute jar: java -jar snackBar.jar

public class Main {
    public static void main(String[] args){
        Customer customerOne = new Customer("Jane", 45.25);
        Customer customerTwo = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack snackOne = new Snack("Chips", 36, 1.75, food.getId());
        Snack snackTwo = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack snackThree = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack snackFour = new Snack("Soda", 24, 2.50, drink.getId());
        Snack snackFive = new Snack("Water", 20, 2.75, drink.getId());

        // customer 1 buys 3 of snack 4
        customerOne.buySnacks(snackFour.getTotalCost(3));
        snackFour.buySnack(3);
        System.out.println("Customer 1 cash on hand $" + customerOne.getCash());
        System.out.println("Quantity of snack 4 is " + snackFour.getQuantity());
        System.out.println();

        customerOne.buySnacks(snackThree.getTotalCost(1));
        snackThree.buySnack(1);
        System.out.println("Customer 1 cash on hand $" + customerOne.getCash());
        System.out.println("Quantity of snack 3 is " + snackThree.getQuantity());
        System.out.println();

        customerTwo.buySnacks(snackFour.getTotalCost(2));
        snackFour.buySnack(2);
        System.out.println("Customer 2 cash on hand $" + customerTwo.getCash());
        System.out.println("Quantity of snack 4 is " + snackFour.getQuantity());
        System.out.println();

        customerOne.addCash(10.00);
        System.out.println("Customer 1 cash on hand $" + customerOne.getCash());
        System.out.println();

        customerOne.buySnacks(snackTwo.getTotalCost(1));
        snackTwo.buySnack(1);
        System.out.println("Customer 1 cash on hand $" + customerOne.getCash());
        System.out.println("Quantity of snack 2 is " + snackTwo.getQuantity());
        System.out.println();

        snackThree.addQuantity(12);
        System.out.println("Quantity of snack 3 is " + snackThree.getQuantity());
        System.out.println();

        customerTwo.buySnacks(snackThree.getTotalCost(3));
        snackThree.buySnack(3);
        System.out.println("Customer 2 cash on hand $" + customerTwo.getCash());
        System.out.println("Quantity of snack 3 is " + snackThree.getQuantity());
        System.out.println();

    }
}