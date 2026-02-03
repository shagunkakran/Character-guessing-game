import java.util.*;

public class AkinatorLevel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a character. Answer with yes/no");

        System.out.print("Is the character real? ");
        String ans1 = sc.next().toLowerCase();

        if(ans1.equals("yes")) {

            System.out.print("Is the character a cricketer? ");
            String ans2 = sc.next().toLowerCase();

            if(ans2.equals("yes")) {
                System.out.println("You are thinking of Virat Kohli!");
            } else {
                System.out.println("You are thinking of Elon Musk!");
            }

        } else {

            System.out.print("Is the character a superhero? ");
            String ans3 = sc.next().toLowerCase();

            if(ans3.equals("yes")) {
                System.out.println("You are thinking of Iron Man!");
            } else {
                System.out.println("You are thinking of Doraemon!");
            }
        }

        sc.close();
    }
}
