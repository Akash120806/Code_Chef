import java.util.*;

class GridJump {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int min= Integer.MAX_VALUE;
            for (int d = 0; d <= Math.min(a,b); d++) {
                int right =a- d;
                int up =b-d;
                int rc = ((right + 1)/2)*p;
                int uc = ((up+1) / 2)*q;
                int dc = d*r;
                 int totalCost = rc + uc + dc;

                min = Math.min(min, totalCost);
            }
            System.out.println(min);
            t--;
        }
        sc.close();
    }
}