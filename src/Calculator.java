import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        //Nikolai Was here
        Scanner input =new Scanner(System.in);

        System.out.println("Skriv dit første tal");
        int tal1=input.nextInt();

        System.out.println("Skriv dit andet tal");
        int tal2=input.nextInt();

        System.out.println("Vælg din operator");
        char operator=input.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(tal1+tal2);
                break;
            case '-':
                System.out.println(tal1-tal2);
                break;
            case '*':
                System.out.println(tal1*tal2);
                break;
            case'/':
                System.out.println(tal1/tal2);
                 break;
        }
    }
}
