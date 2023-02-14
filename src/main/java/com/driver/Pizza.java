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

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isExtraToppins() {
        return extraToppins;
    }

    public void setExtraToppins(boolean extraToppins) {
        this.extraToppins = extraToppins;
    }

    public boolean isCarryBag() {
        return carryBag;
    }

    public void setCarryBag(boolean carryBag) {
        this.carryBag = carryBag;
    }

    public int getCheesePrice() {
        return cheesePrice;
    }

    public int getToppinPrice() {
        return toppinPrice;
    }

    public int getBagPrice() {
        return bagPrice;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public boolean isBillCreated() {
        return billCreated;
    }

    public void setBillCreated(boolean billCreated) {
        this.billCreated = billCreated;
    }

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

//        if(billCreated) return "";
//        bill="";
//        bill+="Base Price Of The Pizza: "+price+"\n";
//        if(extraCheese) {
//            bill+="Extra Cheese Added: " + cheesePrice+"\n";
//            price += cheesePrice;
//        }
//        if(extraToppins) {
//            bill+="Extra Toppings Added: " + toppinPrice+"\n";
//            price += toppinPrice;
//        }
//        if(carryBag) {
//            bill+="Paperbag Added: " + bagPrice+"\n";
//            price += bagPrice;
//        }
//        bill+="Total Price: "+price+"\n";
//        billCreated = true;
//        return this.bill;
//    }

        String bill = "";
        if(!billCreated){
//            bill += "Total Price: "+price+"\n";
//            this.isBillGenerated = true;
//            return this.bill;
            if(isVeg)
                bill = "Base Price Of The Pizza: 300\n";
            else
                bill = "Base Price Of The Pizza: 400\n";

            if(extraCheese)
                bill += "Extra Cheese Added: 80\n";
            if(extraToppins)
                bill += "Extra Toppings Added: "+toppinPrice+"\n";
            if(carryBag)
                bill += "Paperbag Added: 20\n";

            bill += "Total Price: "+price+"\n";
            return bill;

        }
        return bill;
    }
}
