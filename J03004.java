import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0) {
            String name = scan.nextLine();
            String a[] = name.split(" ");
            for (String x : a) {
                if (x.length() > 0) {
                    System.out.print(Character.toUpperCase(x.charAt(0)));
                    System.out.print(x.substring(1).toLowerCase() + " ");
                }
            }
            System.out.println();
        }
        
        scan.close();
    }
}