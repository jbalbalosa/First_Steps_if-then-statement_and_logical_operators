public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("First Steps: if-then-statement");

        boolean isAlien = false;
        if(!isAlien) { //Simplified from if(isAlien == false)
            System.out.println("It is not an alien!");
            System.out.println("And I am scrared of aliens");
        }
        else
            System.out.println("You're an alien");


        //Logical Operators
        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }
        else
            System.out.println("You got the great score");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        //Assignment Operator and Equal Operator
        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
            System.out.println("Yes! it's a car");
        }

        //test of updates

    }
}