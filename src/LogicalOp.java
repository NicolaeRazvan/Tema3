public class LogicalOp {


    //Cerinta 3
    public int checkBiggerNumber(int first, int second){
        if (first < second){
            return second;
        } else {
            return first;
        }
    }
    //Cerinta 4
    public String verifyProvidedText(String text){
        if (text.equals("FastTrackIT")){
            return "Learning text comparison";
        }
        else return "Got to try some more";
    }

    //Cerinta 5
    public String cerinta5(String text, int number){
        if (text.equals("FastTrackIT") && number <= 3)
            return text + number;
        else if(!text.equals("FastTrackIT") && number >= 4)
            return text + number;
        else return "Not Found";
    }

    //Cerinta 6
    public String cerinta6(int b){
        if (b > 8 || b == 6) {
            return "The amount of snow this winter was(cm): " + b;
        }
        else {
            return "The forecast snow is(cm): " + b;
        }
    }

    //Cerinta 7

    public String cerinta7(int number){
        if (number > 4 && number != 4){
            return "The number is greater than 3 and not equal to 4";
        } else if(number == 4) {
            return "The number is equal to 4";
        } else if (number < 3){
            return "The number is lower than 3";
        } return "Not found";
    }

    //Cerinta 8

    public void cerinta8(int number){
        System.out.println(number);
       switch(number){
        case 6: System.out.println("The number is : 6!");break;
        case 12: System.out.println("The number is : 12!");break;
        case 200: System.out.println("The number is : 200!");break;
        default: System.out.println("The number is none of the above");
        }
    }

    //Cerinta 9

    public boolean isNumberEven(int number){
        if ( number %2 == 0){
            return true;
        } else return false;
    }

    //Cerinta 10

    public boolean isEligibleToVote(int number){
        if (number > 18){
            return true;
        } else return false;
    }

    //Cerinta 11


    public int cerinta11(int a , int b , int c ){
        int max = a;
        if (b > max ) {
            max = b;
        }
         if(c > max){
            max = c;
        }
        return max;
    }

}
