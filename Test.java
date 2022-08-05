import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String str = scanner.nextLine();
        boolean flag = true;
        try {
            while (flag) {
                String index = scanner.next();
                if (index.length() > 1) {
                    System.out.println("enter one char");
                } else {
                    System.out.println(str.indexOf(index));
                    flag = false;
                }
            }
        } catch (Exception e) {
            System.out.println("plz enter one char");
        }
    }
}
