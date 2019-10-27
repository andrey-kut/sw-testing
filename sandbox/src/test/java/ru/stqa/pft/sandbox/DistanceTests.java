package ru.stqa.pft.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.Distance.distance;

public class DistanceTests {

    @Test
    public void testDis(){
        Point p1 = new Point(1.2,1.2);
        Point p2 = new Point(4.1, 2.9);
        Assert.assertEquals(distance(p1,p2), 3.3615472627943217);
    }
}
