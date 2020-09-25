public class main {
    public static void main(String[] args) {


        //----------------------------------------
        //OPRETTELSE AF DICE & SPILLER 1 & 2
        //----------------------------------------
        int p1Score=0;
        int p2Score=0;

        boolean p1Turn, p2Turn;
        p1Turn = true;
        p2Turn = false;

        Dice d1 = new Dice();
        Dice d2 = new Dice();

        while (p1Score <= 40 || p2Score <= 40){


            do{
                d1.roll();
                d2.roll();
                p1Score = p1Score+d1+d2;

                p1Turn = false;

            } while (p1Turn == true);
            do{
                d1.roll();
                d2.roll();
                p2Score = p2Score+d1+d2;

                p2Turn = false;

            } while (p2Turn == true);
        }

        if(p1Score >= 40){
            System.out.println("Player 1 has won");
        } else if(p2Score >= 40){
            System.out.println("Player 2 has won");
        }


        //----------------------------------------
        //LOGIK
        //----------------------------------------

        // Find vinder af runde

        //add score til spiller

        // Har en spiller 40points? find vinder


    }
}

