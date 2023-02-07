package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    private int cheese;

    boolean isExtraCheeseAdded;
    boolean isExtratoppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillGenerated=false;
        this.isExtraCheeseAdded=false;
        this.isExtratoppingsAdded=false;
        this.isTakeAwayAdded=false;
        this.bill="";

        if(isVeg)
        {
            this.price=300;
            this.toppings=70;
        }
        else
        {
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price=this.price+cheese;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtratoppingsAdded)
        {
            this.price=this.price+toppings;
            isExtratoppingsAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false)
        {
            this.price=this.price+20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            if(isExtraCheeseAdded)
                this.bill += "Extra Cheese Added: 80"+"\n";
            if(isExtratoppingsAdded)
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAwayAdded)
                this.bill += "Paperbag Added: 20"+"\n";

            this.bill += "Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }

        return this.bill;
    }
}
