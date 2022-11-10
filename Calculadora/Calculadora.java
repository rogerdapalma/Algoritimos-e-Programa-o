package Calculadora;
public class Calculadora {
    
    public Calculadora(){
    
    }

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    private double num1;
    private double num2;

    public double soma(double num1,double num2) {
        return (num1 + num2);

    }
    public double sub(double num1,double num2) {
        return (num1 - num2);

    }
    
    public double mult(double num1,double num2) {
        return (num1 * num2);

    }
    
    public double div(double num1, double num2) {
        return (num1 / num2);

    }
    

}
