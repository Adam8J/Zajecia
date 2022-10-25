import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jak masz na imię");
        String name = sc.nextLine();
        System.out.println("jak masz nazwisko");
        String name2 = sc.nextLine();
        System.out.println("jaka miejscowość");
        String city = sc.nextLine();
        System.out.println("ile masz lat");
        int age =sc.nextInt();
        if (age <18 ) {
            System.out.println("do widzenia " + name + name2;
        }else{
            System.out.println("witamy");
        }
    }
}
