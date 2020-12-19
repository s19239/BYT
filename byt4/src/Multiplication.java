public class Multiplication implements Chain {

    private  Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "mul"){

            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = "+
                    (request.getNumber1()*request.getNumber2()));

        } else {

            nextInChain.calculate(request);
            System.out.println("request was passed to the other operation");

        }

    }
}
