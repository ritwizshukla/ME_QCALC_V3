package com.crio.qcalc;

public class StandardCalculator {
    
    private int result;     

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public void add(int num1, int num2){
        setResult(num1+num2);        
    }    
    
    public int getResult() {
        return result;
    }

    public void setResult(int value) {
        this.result = value;
    }

    public void subtract(int num1, int num2)
    {
        if (num1>num2){
            setResult(num1 - num2);
        }
        else {
           setResult(num2 - num1);
        }
    }    
    
    public void  multiply(int num1, int num2){
       setResult(num1*num2);
    }    
    
    public void divide(int num1, int num2){
        if (num1>num2){
            
            setResult(num1/num2);
        }
        else {
            
            setResult(num2/num1);
        } 
    }

    
public void clearResult(){
     result = 0;
}

public void printResult(){

System.out.println(" Standard calculator result "+ getResult());

}

}