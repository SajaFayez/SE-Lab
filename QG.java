
package qg;
import java.util.Random;

public class QG {

    
    public static void main(String[] args) {
        String[] quotes = {
            "Stay positive, work hard, and make it happen.",
            "Success is not final, failure is not fatal.",
            "Choose to see the good in every situation, even when it's hard.",
            "Don’t stop when you’re tired, stop when you’re done.",
            "Great things never come from comfort zones."
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        System.out.println("✨ Your Quote for Today ✨");
        System.out.println(quotes[index]);
    }
}

    
    

