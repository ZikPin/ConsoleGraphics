package Figures;

public class Romb {
    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Math.abs(i-n/2); j++) { System.out.print(" "); }
            for (int j = 0; j < n-2*Math.abs(i-n/2); j++) { System.out.print("*"); }
            System.out.println();
        }
    }
}
