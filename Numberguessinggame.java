import java.util.Scanner;
public class Numberguessinggame {

    void game(){
        String response;
        int secret_number, c=0, number;
        Scanner in=new Scanner(System.in);
        secret_number=(int) (Math.random()*100)+1;
        do {
            System.out.println("Enter your number:");
            number=in.nextInt();
            if(number > secret_number){
                System.out.println("Lower");
            }
            if (number < secret_number) {
                System.out.println("Higher");
            
            }
            if(number == secret_number){
                System.out.println("GREAT YOU HAVE GUESSED THE COREECT NUMBER");
                break;
            }
            c=c+1;
        } while (c<5);
        if(c==5){
            System.out.println("GAME OVER YOU LOST");
            System.out.println("Correct number was:"+secret_number);
        }
        System.out.println("Wanna Play again ????(yes /no)");
            response=in.next();
            if(response.equalsIgnoreCase("yes")){
                game();
            }
        in.close();
        return;
    }

    public static void main(String args[]) {
        Numberguessinggame ob = new Numberguessinggame();
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!!!!");
        System.out.println("Instructions:");
        System.out.println("You will be given 5 tries to guess the number between 1 to 100, after each guess system will tell to go for a higher or a lower number for the next guess.");
        System.out.println("TO WIN THE GAME GUESS THE CORRECT NUMBER");
        ob.game();
    }
}
