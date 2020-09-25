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


                //hvis spilleren slår 2 ens, får spilleren en ekstra tur.
                if(d1 == d2){
                    //Hvis begge terninger slår 1 mister spilleren alle sine point.
                    if(d1 == 1 && d2 == 1){
                        p1Score = 0;
                    }
                    p1Turn = true;
                } else{
                    p1Turn = false;
                    p2Turn = true;
                }
            } while(p1Turn == true);
            do{

                //hvis spilleren slår 2 ens, får spilleren en ekstra tur.
                if(d1 == d2){
                    //Hvis begge terninger slår 1 mister spilleren alle sine point.
                    if(d1 == 1 && d2 == 1){
                        p2Score = 0;
                    }
                    p2Turn = true;
                } else{
                    p2Turn = false;
                    p1Turn = true;
                }
            } while (p2Turn == true);
        }


        //----------------------------------------
        //LOGIK
        //----------------------------------------

        // Find vinder af runde

        //add score til spiller

        // Har en spiller 40points? find vinder


    }
}
