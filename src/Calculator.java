public class Calculator {


    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public boolean isGreater(double num1, double num2) {
        return num1 > num2;

    }







    public static void main(String[] args) {
        //Create an instance of the Calculator class
        Calculator cal = new Calculator();
         int sum = cal.addition(5,4);
        System.out.println("Addition result: " + sum);//This will print Addition result

    // Test the isGreater method
        double num1= 5.5;
        double num2= 3.0;
        boolean greater = cal.isGreater(num1, num2);
        System.out.println("Is " + num1 + "greater than" + num2 + "?" + greater);// This will print IsGreater result
    }
}