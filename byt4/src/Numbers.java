public class Numbers {
    private int n1;
    private int n2;

    private String calculationWanted;

    public Numbers(int newNumber1, int newNumber2, String calcWanted){

        n1 = newNumber1;
        n2 = newNumber2;
        calculationWanted = calcWanted;

    }

    public int getNumber1(){ return n1; }
    public int getNumber2(){ return n2; }
    public String getCalcWanted(){ return calculationWanted; }
}
