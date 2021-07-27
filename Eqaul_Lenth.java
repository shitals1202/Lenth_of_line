public class Equal_Lenth {

static void equalityOfTwoLines(double y1, double y2){
        String startPoint = String.valueOf(y1);
        String endPoint = String.valueOf(y2);
        boolean etl = startPoint.equals(endPoint);
        if (etl == true) {
            System.out.println("The Two Lines Are Equal.");
        }
        else {
            System.out.println("The Two Lines Aren't Equal.");
        }
    }
public static void main(String args[]){
        double x1=10, y1=30, x2=20, y2=20;
// Check two lines are equal or not.
        equalityOfTwoLines(y1, y2);
}
}
