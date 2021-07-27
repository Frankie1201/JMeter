
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
public class ComStrTest {
   
    //create variable
    String a, b, expResult;
    // create parameterized constructor

    public ComStrTest(String a, String b, String expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
}
    
   @Parameters
    public static Collection<String[]> getParameters()
    {
        String[][] arr;
        arr = new String[][]{ {"1","0","10"},{"hi","bye","hibye"}, {"10","number","10number"},{"age","29","age29"} };
        return Arrays.asList(arr);
    
    
    }//collection ends
    //create test 
    
     @Test
    public void addPTest()
    {
        ComStr obj = new ComStr();
        String Result = obj.combine(a, b);
        assertEquals(expResult, Result);
        
    
    
    
    }//test ends 
    
}
