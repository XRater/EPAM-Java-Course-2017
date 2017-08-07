package HomeWork.CodingBat.Warmup;

import java.util.Scanner;

class Front3 {

    public String front3(String str) {
        return str.length() >= 3 ? str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) : str + str + str;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
