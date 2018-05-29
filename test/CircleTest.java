import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private double pi = 3.14;
    private Circle circle1;
    private Circle circle2;


    @Before
    public void setup(){
         circle1 = new Circle(1);
         circle2 = new Circle(2);
    }

    @Test
    public void getAreaWhenInputIs1(){
        assertEquals(pi,circle1.getArea(), 0.00001);
    }

    @Test
    public void getAreaWhenInputIs2(){
        assertEquals(pi*4,circle2.getArea(), 0.00001);
    }

    @Test
    public void getPerimeterWhenInputIs1(){
        assertEquals(pi*2,circle1.getPerimeter(), 0.00001);
    }

    @Test
    public void getPerimeterWhenInputIs2(){
        assertEquals(pi*4,circle2.getPerimeter(), 0.00001);
    }
}
