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

        dice d1 = new dice();
        dice d2 = new dice();


        //----------------------------------------
        //LOGIK
        //----------------------------------------

        outer: while (p1Score <= 40 || p2Score <= 40){
            while(p1Turn){  //Spiller 1
                d1.roll();  //Ruller terning 1
                d2.roll();  //Ruller terning 2
                p1Score = p1Score+d1.getFaceValue()+d2.getFaceValue();
                System.out.println("Player 1 har "+ p1Score + " point");
                p1Turn=false;
                p2Turn=true;
            }

            while(p2Turn){ //Spiller 2
                d1.roll();  //Ruller terning 1
                d2.roll();  //Ruller terning 2
                p2Score = p2Score+d1.getFaceValue()+d2.getFaceValue();
                System.out.println("Player 2 har "+ p2Score + " point");
                if (p1Score>=40 || p2Score>=40){
                    break outer;    //Hopper ud af det yderste while loop navngivet "outer"
                }else {
                    p2Turn = false;
                    p1Turn = true;
                }
            }
        }
        //-------------------------------------
        //RESULTAT AF TERNING KAST
        //-------------------------------------
        if (p1Score==p2Score){
            System.out.println("Den blev uafgjort!");
        }
        else if(p1Score > p2Score){
            System.out.println("Player 1 has won!");
        } else {
            System.out.println("Player 2 has won!");
        }
    }
}

