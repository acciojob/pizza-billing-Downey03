package com.driver;

public class Pizza {

    private int price;
    private int total;
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
            this.price = 300;
            this.toppinPrice = 70 ;
        }
        else {
            this.price = 400;
            this.toppinPrice = 120 ;
        }
        cheesePrice = 80;
        bagPrice = 20;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extraToppins) return;
        this.total += this.cheesePrice;
    }

    public void addExtraToppings(){
        this.total += this.toppinPrice;
        extraToppins = true;
    }

    public void addTakeaway(){
       this.total += this.bagPrice;
       carryBag = true;
    }

    public String getBill(){

        bill="";
        bill+="Base Price Of The Pizza: "+price+"\n";
        if(extraCheese) {
            bill+="Extra Cheese Added: " + cheesePrice+"\n";
            price += cheesePrice;
        }
        if(extraToppins) {
            bill+="Extra Toppings Added: " + toppinPrice+"\n";
            price += toppinPrice;
        }
        if(carryBag) {
            bill+="Paperbag Added: " + bagPrice+"\n";
            price += bagPrice;
        }
        bill+="Total Price: "+(price+total)+"\n";

        return this.bill;
    }
}
