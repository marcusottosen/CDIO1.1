public class game {
    public void main() {


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

        int preD1P1, preD2P1, preD1P2, preD2P2;

        preD1P1 = 0;
        preD2P1 = 0;
        preD1P2 = 0;
        preD2P2 = 0;


        //----------------------------------------
        //LOGIK
        //----------------------------------------

        outer: while (p1Score <= 40 || p2Score <= 40){
            while(p1Turn){  //Spiller 1
                d1.roll();  //Ruller terning 1
                d2.roll();  //Ruller terning 2
                //Tjekker først om der er blevet slået 2 6'ere i 2 ture i træk.

                if (d1.getFaceValue() == 6 && d2.getFaceValue() == 6 && preD1P1 == 6 && preD2P1 == 6){
                    break outer;
                }


                //Her starter turen efter der er tjekket for 6'ere
                p1Score = p1Score+d1.getFaceValue()+d2.getFaceValue();
                System.out.println("\nPlayer 1 slog " + d1.getFaceValue() + " og " + d2.getFaceValue());
                System.out.println("Player 1 har "+ p1Score + " point");

                if (d1.getFaceValue() == d2.getFaceValue()){
                    if(d1.getFaceValue() == 1 && d2.getFaceValue() == 1){
                        p1Score = 0;
                        System.out.print("Player 1 har mistet sine point\n");
                    }
                    System.out.print("Player 1 får en ekstra tur\n");
                    continue;
                }
                else {
                    p1Turn=false;
                    p2Turn=true;
                }
                //Tilføjer værdien af slaget til variable for at vi kan sammenligne næste slag med forrige slag.
                preD1P1 = d1.getFaceValue();
                preD2P1 = d2.getFaceValue();
            }

            while(p2Turn){ //Spiller 2
                d1.roll();  //Ruller terning 1
                d2.roll();  //Ruller terning 2
                //Tjekker først om der er blevet slået 2 6'ere i 2 ture i træk
                if (d1.getFaceValue() == 6 && d2.getFaceValue() == 6 && preD1P2 == 6 && preD2P2 == 6){
                    break outer;
                }

                //Her starter turen efter der er tjekket for 6'ere
                p2Score = p2Score+d1.getFaceValue()+d2.getFaceValue();
                System.out.println("\nPlayer 2 slog " + d1.getFaceValue() + " og " + d2.getFaceValue());
                System.out.println("Player 2 har "+ p2Score + " point");
                if (p1Score>=40 || p2Score>=40){
                    break outer;    //Hopper ud af det yderste while loop navngivet "outer"
                }
                if (d1.getFaceValue() == d2.getFaceValue()){
                    if(d1.getFaceValue() == 1 && d2.getFaceValue() == 1){
                        p2Score = 0;
                        System.out.print("Player 2 har mistet sine point\n");
                    }
                    System.out.print("Player 2 får en ekstra tur\n");
                    continue;
                }
                else {
                    p2Turn = false;
                    p1Turn = true;
                }
                //Tilføjer værdien af slaget til variable for at vi kan sammenligne næste slag med forrige slag.
                preD1P2 = d1.getFaceValue();
                preD2P2 = d2.getFaceValue();
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

