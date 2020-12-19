public class Main {
    public static void main(String[] args){



        Chain chainCalc1 = new Add();
        Chain chainCalc2 = new Subtract();
        Chain chainCalc3 = new Multiplication();
        Chain chainCalc4 = new Divide();


        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4,2,"div");

        chainCalc1.calculate(request);

    }
}
