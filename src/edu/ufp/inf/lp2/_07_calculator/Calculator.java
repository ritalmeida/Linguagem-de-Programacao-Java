package edu.ufp.inf.lp2._07_calculator;

import java.math.BigDecimal;

public class Calculator {

    private BigDecimal valueInMem;

    public Calculator(){

        this.valueInMem = new BigDecimal(0.0);
    }

    public Calculator(BigDecimal valueInMem) {

        this.valueInMem = valueInMem;
    }

    public void setValueInMem(BigDecimal valueInMem) {

        this.valueInMem = valueInMem;
    }

    protected enum Op {NOOP, SUM, SUBTRACT, MULTIPLY, DIVIDE}

    public Double getValueInMem(){

        return 0.0;
    }

    public void resetCalc(){

    }

    public void setValueInMem(Double value){
    }


    public Double makeOperation(Op operation, Double number){
        switch (operation){
            case SUM:
                sum(number);
                break;
            case SUBTRACT:
                subtract(number);
                break;
            case MULTIPLY:
                multiply(number);
                break;
            case DIVIDE:
                divide(number);
        }
        return getValueInMem();
    }

    private void sum(Double number){

        double n = valueInMem.doubleValue();
        n += number;
    }

    private void subtract(Double number){

        double n = valueInMem.doubleValue();
        n -= number;
    }

    private void multiply(Double number){

        double n = valueInMem.doubleValue();
        n *= number;
    }

    private void divide(Double number){

        double n = valueInMem.doubleValue();
        n /= number;
    }
}