import java.util.Scanner;

public class Git{

    public static void main(String[] args){
        System.out.print("Ingresa tu nombre: ");
        Scanner cin = new Scanner(System.in);
        String name = cin.nextLine();

        System.out.println("Hola " + name);
        cin.close();

    }
}