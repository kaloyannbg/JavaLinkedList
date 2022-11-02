
import java.util.LinkedList;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        //Linked List
        
        LinkedList<String> cars = new LinkedList<String>();

        Scanner scan = new Scanner(System.in);

        String word = "";

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter your name");
            word = scan.nextLine();
            while(word.isBlank())
            {
                word = scan.nextLine();
            }
            word.trim();
            cars.add(word);
        }

        System.out.println(cars);
        


    }
}
