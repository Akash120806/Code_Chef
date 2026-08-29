import java.util.*;
import java.lang.*;
import java.io.*;

class RegularCleaning {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;

        c = 10 - (N % 10);
        System.out.println(c);
        sc.close();

    }
}
