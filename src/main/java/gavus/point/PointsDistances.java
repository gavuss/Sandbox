package gavus.point;

public class PointsDistances {

    public static double distanceBetweenPoints(Point one, Point two) {
        double x1 = one.getX();
        double y1 = one.getY();

        double x2 = two.getX();
        double y2 = two.getY();

        double deltaX = Math.pow((x2 - x1), 2);
        double deltaY = Math.pow((y2 - y1), 2);

        double result = Math.sqrt((deltaX + deltaY));
        return result;
    }
}
