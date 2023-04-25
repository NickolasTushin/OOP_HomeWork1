package ru.geekbrains;
public class Chokolate extends Product {

    
    private int callories;

    public int getCallories() {
        return callories;
    }

    public Chokolate(String name, double price, int callories){ // Шоколад
        super(name, price);
        this.callories = callories;
    }

    @Override
    String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - калории: %d", brand, name, price, callories);

    }
    
}
