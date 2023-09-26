package JunitTest.CalcuateTest;


import JunitTest.sample.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class CalcuateTest {
    @Test
    public void testAdd(){
        Calculate c = new Calculate();
       int res= c.add(1,2);
        Assert.assertEquals(3,res);

    }
    @Test
    public void testSub(){
        Calculate c=new Calculate();
         int b=c.sub(1,2);
        Assert.assertEquals(-1,b);
    }

}

