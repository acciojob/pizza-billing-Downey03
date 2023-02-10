package com.driver;

public class Pizza {

    private int price;
    private boolean extraCheese;
    private boolean extraToppins;
    private boolean carryBag;
    private final int cheesePrice;
    private final int toppinPrice;
    private final int bagPrice;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price += 300;
            this.toppinPrice = 70 ;
        }
        else {
            this.price += 400;
            this.toppinPrice = 120 ;
        }
        cheesePrice = 80;
        bagPrice = 20;

    }

    public int getPrice(){
        System.out.print("Base Price Of The Pizza: ");
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheese || extraToppins) return;
        extraCheese = true;
    }

    public void addExtraToppings(){
        if(extraToppins) return;
        extraToppins = true;
    }

    public void addTakeaway(){
       if(carryBag) return;
       carryBag = true;
    }

    public String getBill(){

        if(extraCheese) {
            System.out.println("Extra Cheese Added: " + cheesePrice);
            price += cheesePrice;
        }
        if(extraToppins) {
            System.out.println("Extra Toppings Added: " + toppinPrice);
            price += toppinPrice;
        }
        if(carryBag) {
            System.out.println("Paperbag Added: " + bagPrice);
            price += bagPrice;
        }
        System.out.print("Total Price: ");
        bill = String.valueOf(price);
        return this.bill;
    }
}
