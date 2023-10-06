public class NumberManipulator {
    public int increamentByOne(int number){
       number++;
       return number;


    }


    public static void main(String[] args) {
        NumberManipulator manipulator = new NumberManipulator();
        int number = 5;
        System.out.println("initial number: " + number);
        int incrementedNumber = manipulator.increamentByOne(number);
        System.out.println("Number after increament:" + incrementedNumber);
    }


}