import org.junit.*;

public class LearnClass2 {

    @Test
    public void method1(){
        Assert.assertTrue("Value are not equals", 1 + 1 == 2);
    }

    @Test
    public void method2(){
        Assert.assertEquals( 20, 5 + 5);
    }

    @Test
    public void method3(){
        Assert.assertFalse("Value are equals", 1 + 1 == 2);
    }

    @Test
    public void method4(){
        Assert.assertNotEquals(20, 5 + 5);
    }

}
