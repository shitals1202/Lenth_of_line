public class Length{
    static double lengthOfLine(double x1, double y1, double x2, double y2){
        double lol = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return lol;
    }

public static void main(String args[]){
        double x1=10, y1=30, x2=20, y2=20;

        // Find Length of line
        double lol = lengthOfLine(x1, y1, x2, y2);
        System.out.println("The Length Of Line Is : " + lol);
}
}
