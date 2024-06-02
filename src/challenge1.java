package src;

//The challenge was to do the arithmetic, then test if there was zero
//remainder. There was zero remainder as expected.

public class challenge1 {
    public static void main(String[] args) {
        double myFirstDouble = 20.00d;
        double mySecondDoube = 80.00d;
        //double myFirstResult= ((myFirstDouble+mySecondDoube)*100.00d) % 40;
        boolean zeroRemainder = ((((myFirstDouble+mySecondDoube)*100.00d) % 40.00d)==0) ? true : false;
        System.out.println("My zeroRemainder value is: "+zeroRemainder);
        if (zeroRemainder == false){
            System.out.println("Got some remainder.");
        }
    }
}
