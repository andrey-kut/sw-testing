package ru.stqa.pft.sandbox;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

    @Test
    public void testDis(){
        Point p1 = new Point(1.2,1.2);
        Point p2 = new Point(4.1, 2.9);
        Assert.assertEquals(p1.distance(p2), 3.3615472627943217);
    }
}
