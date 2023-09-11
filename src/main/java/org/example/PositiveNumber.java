package org.example;


public class PositiveNumber {
    private int number;


    public PositiveNumber(){
        this.number=0;
    }

    public PositiveNumber(int number){
        if(number>=0)
            this.number=number;
        else
            throw new IllegalArgumentException("Negative numbers are not acceptable!");
    }

    public int getNumber() {
        return number;
    }

    public void increaseByOne(){

        if (number == Integer. MAX_VALUE){
            throw new IllegalStateException ("Increment exceeded maximum value");
        }
        number++;
    }

    public String toString(){
        return String.format("The number is %d",number);
    }
}
