package HomeWork.hackerrank;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();

            StringBuffer s1 = new StringBuffer();
            StringBuffer s2 = new StringBuffer();

            for (int j = 0; j < s.length() - 1; j++) {
                if (j % 2 == 0)
                    s1.append(s.charAt(j));
                else
                    s2.append(s.charAt(j));
            }

            System.out.println(s1.toString() + ' ' + s2.toString());
        }
    }

}
