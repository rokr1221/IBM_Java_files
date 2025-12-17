import java.util.Scanner;

public class scanner_demo {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the Username : ");

        String name = sc.nextLine();
        System.out.print("Hello, " + name);
    }
}
