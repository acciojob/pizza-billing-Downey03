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
    private boolean billCreated;
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
       // if(extraCheese) return;
        extraCheese = true ;
    }

    public void addExtraToppings(){
     //   if(extraToppins) return;
        extraToppins = true;
    }

    public void addTakeaway(){
    //   if(carryBag) return;
       carryBag = true;
    }

    public String getBill(){

        if(billCreated) return "";
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
        bill+="Total Price: "+price+"\n";
        billCreated = true;
        return this.bill;
    }
}
