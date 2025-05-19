package Figures;

public class Circle {
    public void printCircle(int r) {
        for (int i = -r; i <= r; i++) {
            for (int j = 0; j <= 2*r - 2*function(r, i); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 4*function(r, i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public double function (int r, int x) {
        return Math.sqrt(r*r-x*x);
    }
}
