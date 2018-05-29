import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private Rectangle square1;
    private Rectangle square2;

    @Before
    public void setup(){
        square1 = Rectangle.Square(1);
        square2 = Rectangle.Square(3);
    }

    @Test
    public void getAreaWithInputOne(){
        assertEquals(1, square1.getArea(), 0.00001);
    }

    @Test
    public void getAreaWithInputThree(){
        assertEquals(9, square2.getArea(), 0.00001);
    }

    @Test
    public void getPerimeterWithInputOne(){
        assertEquals(4, square1.getPerimeter(), 0.00001);
    }

    @Test
    public void getPerimeterWithInputThree(){
        assertEquals(12, square2.getPerimeter(), 0.00001);
    }
}
