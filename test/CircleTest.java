
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

//for parameterized test case
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//for parameter list
import java.util.Collection;
import java.util.Arrays;
import java.text.DecimalFormat;


/**
 *
 * @author francescaworsnop
 */
    
    @RunWith(Parameterized.class)
public class CircleTest {
        
   DecimalFormat df = new DecimalFormat("0.00");
    //create variable
    double radius, expResult;
    
    // create parameterized constructor

    public CircleTest(double radius, double expResult) {
        this.radius = radius;
        this.expResult = expResult;
    }
    //use annotation "Parameters"
//create method to pass parameter list
    // return type = Collection
    // return value = Arraya[group of elements]
    // eg.{a,b,actualResult}
    //method name getParameters()
    @Parameters
    
     public static Collection<Double[]> getParameters()
    {
        Double[][] arr;
        arr = new Double[][]{ {2.0,12.56},{4.0,50.26},{-2.0,12.57}};
        return Arrays.asList(arr);
    }//collection ends
     //create test case  
    @Test
    public void addPTest()
    {
        Circle obj = new Circle(radius);
        double Result = Double.parseDouble(df.format(obj.draw()));
        assertEquals(expResult, Result,0.5);
        
    
    
    
    }//test ends
    }
