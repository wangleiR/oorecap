import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private Rectangle rectangle1;
    private Rectangle rectangle2;

    @Before
    public void setup(){
        rectangle1 = new Rectangle(1,1);
        rectangle2 = new Rectangle(1,3);
    }

    @Test
    public void getAreaWithInputOneAndOne(){
        assertEquals(1, rectangle1.getArea(), 0.00001);
    }

    @Test
    public void getAreaWithInputOneAndThree(){
        assertEquals(3, rectangle2.getArea(), 0.00001);
    }

    @Test
    public void getPerimeterWithInputOneAndOne(){
        assertEquals(4, rectangle1.getPerimeter(), 0.00001);
    }

    @Test
    public void getPerimeterWithInputOneAndThree(){
        assertEquals(8, rectangle2.getPerimeter(), 0.00001);
    }


}
