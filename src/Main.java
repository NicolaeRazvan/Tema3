public class Main {

    public static void main(String[] args) {
        //Cerinta 1

        Calculator calc = new Calculator();
        System.out.println(calc.suma(12 ,3));
        System.out.println(calc.impartire(12 ,3));
        System.out.println(calc.calcul1(12 ,3,7));
        System.out.println(calc.calcul2(12 ,3,7));
        System.out.println(calc.calcul3(12,3,7,10));
        System.out.println(calc.calcul4(12,6,20,4,3,9));

        //Cerinta 3
        int x = 10;
        int y = 13;

        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(x, y);
        System.out.println("The bigger number is:" + biggest);

        //Cerinta 4
        String text = "FastTrackIT";
        System.out.println(op.verifyProvidedText(text));

        //Cerinta 5
        System.out.println( op.cerinta5("FastTrackIT", 5));

        //Cerinta 6
        System.out.println(op.cerinta6(9));

        //Cerinta 7
        System.out.println(op.cerinta7(6));

        //Cerinta 8
        op.cerinta8(14);

        //Cerinta 9
        System.out.println(op.isNumberEven(6));

        //Cerinta 10
        System.out.println(op.isEligibleToVote(6));

        //Cerinta 11

        System.out.println(op.cerinta11(7,8,12));
    }

}
