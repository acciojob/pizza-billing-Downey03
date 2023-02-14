package com.driver;

public class Pizza {


    private int price;
    private final Boolean isVeg;
    private boolean isAddExtraCheese;
    private boolean isAddTakeAway;
    private boolean isAddExtraToppings;
    private final boolean isBillGenerated;
    private final int extraCheese;
    private final int extraToppings;
    private final int takeAwayCharge;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.extraToppings = 70;
            //this.bill = "Base Price Of The Pizza: 300\n";
            this.price = 300;
        } else {
            this.extraToppings = 120;
            //this.bill = "Base Price Of The Pizza: 400\n";
            this.price = 400;
        }
        this.extraCheese = 80;
        this.takeAwayCharge = 20;

        isBillGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isAddExtraCheese||isAddExtraToppings){
            return;
        }
//        bill += "Extra Cheese Added: 80\n";
        price += extraCheese;
        isAddExtraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isAddExtraToppings){
            return;
        }
        price += extraToppings;
//        if(isVeg){
//            bill += "Extra Toppings Added: 70\n";
//            price += 70;
//        } else{
//            bill += "Extra Toppings Added: 120\n";
//            price += 120;
//        }
        isAddExtraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(isAddTakeAway){
            return;
        }
//        bill += "Paperbag Added: 20\n";
        price += takeAwayCharge;
        isAddTakeAway = true;
    }

    public String getBill(){
        // your code goes here
        String bill = "";
        if(!isBillGenerated){
//            bill += "Total Price: "+price+"\n";
//            this.isBillGenerated = true;
//            return this.bill;
            if(isVeg)
                bill = "Base Price Of The Pizza: 300\n";
            else
                bill = "Base Price Of The Pizza: 400\n";

            if(isAddExtraCheese)
                bill += "Extra Cheese Added: 80\n";
            if(isAddExtraToppings)
                bill += "Extra Toppings Added: "+extraToppings+"\n";
            if(isAddTakeAway)
                bill += "Paperbag Added: 20\n";

            bill += "Total Price: "+price+"\n";
            return bill;

        }
        return bill;
    }
}



//    private int price;
//    private boolean extraCheese;
//    private boolean extraToppins;
//    private boolean carryBag;
//    private final int cheesePrice;
//    private final int toppinPrice;
//    private final int bagPrice;
//    private Boolean isVeg;
//    private String bill;
//    private boolean billCreated;
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public boolean isExtraCheese() {
//        return extraCheese;
//    }
//
//    public void setExtraCheese(boolean extraCheese) {
//        this.extraCheese = extraCheese;
//    }
//
//    public boolean isExtraToppins() {
//        return extraToppins;
//    }
//
//    public void setExtraToppins(boolean extraToppins) {
//        this.extraToppins = extraToppins;
//    }
//
//    public boolean isCarryBag() {
//        return carryBag;
//    }
//
//    public void setCarryBag(boolean carryBag) {
//        this.carryBag = carryBag;
//    }
//
//    public int getCheesePrice() {
//        return cheesePrice;
//    }
//
//    public int getToppinPrice() {
//        return toppinPrice;
//    }
//
//    public int getBagPrice() {
//        return bagPrice;
//    }
//
//    public Boolean getVeg() {
//        return isVeg;
//    }
//
//    public void setVeg(Boolean veg) {
//        isVeg = veg;
//    }
//
//    public void setBill(String bill) {
//        this.bill = bill;
//    }
//
//    public boolean isBillCreated() {
//        return billCreated;
//    }
//
//    public void setBillCreated(boolean billCreated) {
//        this.billCreated = billCreated;
//    }
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//
//        if(isVeg){
//            this.price = 300;
//            this.toppinPrice = 70 ;
//        }
//        else {
//            this.price = 400;
//            this.toppinPrice = 120 ;
//        }
//        cheesePrice = 80;
//        bagPrice = 20;
//
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//       // if(extraCheese) return;
//        extraCheese = true ;
//    }
//
//    public void addExtraToppings(){
//     //   if(extraToppins) return;
//        extraToppins = true;
//    }
//
//    public void addTakeaway(){
//    //   if(carryBag) return;
//       carryBag = true;
//    }
//
//    public String getBill(){
//
////        if(billCreated) return "";
////        bill="";
////        bill+="Base Price Of The Pizza: "+price+"\n";
////        if(extraCheese) {
////            bill+="Extra Cheese Added: " + cheesePrice+"\n";
////            price += cheesePrice;
////        }
////        if(extraToppins) {
////            bill+="Extra Toppings Added: " + toppinPrice+"\n";
////            price += toppinPrice;
////        }
////        if(carryBag) {
////            bill+="Paperbag Added: " + bagPrice+"\n";
////            price += bagPrice;
////        }
////        bill+="Total Price: "+price+"\n";
////        billCreated = true;
////        return this.bill;
////    }
//
//        String bill = "";
//        if(!billCreated){
////            bill += "Total Price: "+price+"\n";
////            this.isBillGenerated = true;
////            return this.bill;
//            if(isVeg)
//                bill = "Base Price Of The Pizza: 300\n";
//            else
//                bill = "Base Price Of The Pizza: 400\n";
//
//            if(extraCheese)
//                bill += "Extra Cheese Added: 80\n";
//            if(extraToppins)
//                bill += "Extra Toppings Added: "+toppinPrice+"\n";
//            if(carryBag)
//                bill += "Paperbag Added: 20\n";
//
//            bill += "Total Price: "+price+"\n";
//            return bill;
//
//        }
//        return bill;
//    }
//}
