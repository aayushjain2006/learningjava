import java.util.*;
public class Practice4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bulb = sc.nextInt();

        switch (bulb) {
            case 1 -> System.out.println("hello");
            case 2 -> System.out.println("hi");
            case 3 -> System.out.println("bonjour");
            default -> System.out.println("invalid button");
        }
        sc.close();
    }
}