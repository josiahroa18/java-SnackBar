package snackBar;

public class Snack{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId){
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double cost(){
        return cost;
    }

    public int vendingMachineId(){
        return vendingMachineId;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId){
        this.vendingMachineId = vendingMachineId;
    }

    // Other
    public void addQuantity(int count){
        this.quantity += count;
    }

    public void buySnack(int count){
        this.quantity -= count;
    }

    public double getTotalCost(int quantity){
        return quantity * this.cost;
    }

}