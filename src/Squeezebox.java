/**
 * Created by 216430 on 10/19/2017.
 */
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Squeezebox {
    public static void main(String[] args) throws IOException{
        System.out.println("TEST");
        Scanner in = new Scanner(new File("input.txt"));
        String[] cards = new String[52];
        for (int i = 0; i < 52; i++){
            cards[i] = in.next();
        }
        while (!cards[0].equals("#")){


            cards[0] = in.next();
            if (!cards[0].equals("#")){
                for (int i = 1; i < 52; i++){
                    cards[i] = in.next();
                }
            }
        }
    }
}
