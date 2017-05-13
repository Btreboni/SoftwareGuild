
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */

/*
Type in the code below, make it work!
What happens if we change the condition to check for a "no" instead?
(To do this, comment out the old condition, and write a new one!)
Why is there no int in front of "loopsLooped" when we assign it value?
(Answer in a comment)

*/
public class RollerCoaster {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "n";
        int loopsLooped = 0;
        while (keepRiding.equals("y")) {
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.print("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }
        System.out.println();
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    
    }
}

/*
We're going to go on a roller coaster...
Let me know when you want to get off...!
WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!
Want to keep going? (yes/no): yes
WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!
Want to keep going? (yes/no): yes
WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!
Want to keep going? (yes/no): yes
WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!
Want to keep going? (yes/no): yes
WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!
Want to keep going? (yes/no): no
Wow, that was FUN!
We looped that loop 5 times!!
*/