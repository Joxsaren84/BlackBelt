package ru.joxaren.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{

    public void getResult(){

        int divisible = 21;

        class Division{
            //private int divisible;
            private int divider;
/*
            public int getDivisible() {
                return divisible;
            }

            public void setDivisible(int divisible) {
                this.divisible = divisible;
            }
*/
            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public int getQuotient(){
                return divisible / divider;
            }

            public int getRemainder(){
                return divisible % divider;
            }
        }

        Division division = new Division();
      //  division.setDivisible(21);
        division.setDivider(4);

        System.out.println("Divisible = " + divisible);
        System.out.println("Divider = " + division.getDivider());
        System.out.println("Quotient = " + division.getQuotient());
        System.out.println("Remainder = " + division.getRemainder());


    }
}
