package MyTestJavaProject;

import java.util.LinkedList;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        //Linked List

        LinkedList<String> words = new LinkedList<String>();

        Scanner scan = new Scanner(System.in);

        String word = "";

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter your word");
            word = scan.nextLine();
            while(word.isBlank())
            {
                word = scan.nextLine();
            }
            word.trim();
            words.add(word);
        }

        System.out.println(words);
    }
}
