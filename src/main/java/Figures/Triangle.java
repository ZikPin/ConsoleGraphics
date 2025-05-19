package Figures;

public class Triangle {
    public void printTriangle(int n) {
        for(int i = 0; i < 2*n; i++) {
            for(int j = 0; j < n-Math.abs(i-n); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
