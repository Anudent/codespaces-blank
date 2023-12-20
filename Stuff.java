public class Stuff {

    private int value;

    public Stuff(int num) {
        value = num;
    }

    public void printAddAmount(int amt) {
        int value = amt;
        value +=amt;
        System.err.println(value);
    }


    public void printAmountMystry(){
        int mystery = value + 6;
        System.out.println(mystery);
    }
    
    public int getValue(){
        return value;
    }



}