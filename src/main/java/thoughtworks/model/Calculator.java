/*
 * Copyright 2008 Inc.
 *
 * (details of open-source license...)
 */


package thoughtworks.model;


public class Calculator {

    private int firstNumber = 0;

    private int secondNumber = 0;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int calculate() {
        return firstNumber + secondNumber;
    }
}
