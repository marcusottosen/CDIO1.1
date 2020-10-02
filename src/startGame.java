import java.util.Scanner;

public class startGame {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        game run = new game();

        System.out.println("Type 'start' to start the game");
        String start = input.next();
        if(start.toLowerCase().equals("start")) {
            run.main();
        } else{
            System.out.println("We couldn't understand your command. Please type 'start' to start the game");
        }
    }


}
