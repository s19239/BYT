public class Add implements Chain {
    private  Chain nextInChain;

    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }


    public void calculate(Numbers request) {

        if(request.getCalcWanted() == "add"){

            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = "+
                    (request.getNumber1()+request.getNumber2()));

        } else {

            nextInChain.calculate(request);
            System.out.println("request was passed to the other operation");

        }

    }
}
