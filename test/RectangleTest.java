import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//for parameterized testing
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
// for parameter list
import java.util.Collection;
import java.util.Arrays;


@RunWith(Parameterized.class)
public class RectangleTest {
    
    // create variable
    double width, height, expResult;
    
    // create parameterized constructor

    public RectangleTest(double width, double height, double expResult) {
        this.width = width;
        this.height = height;
        this.expResult = expResult;
    }
    
    
    @Parameters
    public static Collection<Double[]> getParameters()
    {
        Double[][] arr;
        arr = new Double[][]{ {2.0,4.0,8.0},{1.0,4.0,4.0}};
        return Arrays.asList(arr);
    }//collection ends
//create test case  
    @Test
    public void addPTest()
    {
        Rectangle obj = new Rectangle(width, height);
        double Result = obj.draw();
        assertEquals(expResult, Result,0.0);
        
    
    
    
    }//test ends
    
}
