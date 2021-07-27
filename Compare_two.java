public class Compare_two {

static void lineCompareWithCompareTo(double y1, double y2){
        String startPoint = String.valueOf(y1);
        String endPoint = String.valueOf(y2);
        int etl = startPoint.compareTo(endPoint);
        if (etl == 0) {
            System.out.println("The Two Lines Are Equal.");
        } else if(etl == 1){
            System.out.println("The One Line Is Greater Than Another Line.");
        } else {
            System.out.println("The One Line Is Lesser Than Another Line.");
        }
    }
public static void main(String args[]){
        double x1=10, y1=30, x2=20, y2=20;
        // Compare two points using CompareTo Method.
        lineCompareWithCompareTo(y1, y2);
}
}
