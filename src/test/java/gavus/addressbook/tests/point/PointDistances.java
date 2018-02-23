package gavus.addressbook.tests.point;

import org.junit.Assert;
import org.junit.Test;
import gavus.point.Point;

import static gavus.point.PointsDistances.distanceBetweenPoints;

public class PointDistances {

    @Test
    public void pointTest() {
        Point one = new Point(1.00, 1.00);
        Point two = new Point(3.00, 3.00);
        Assert.assertEquals(distanceBetweenPoints(one, two), 2.8, 1.00);
    }
}
