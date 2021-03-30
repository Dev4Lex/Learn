import org.junit.*;

public class LearnClass1 {

    //Метод выполняется один раз в самом начале
    @BeforeClass
    public void beforeClassMethod(){

    }

    //Метод выполняется перед каждым тестовым методом
    @Before
    public void setUp(){

    }

    //Тестовые методы
    @Test
    public void method1(){
        Assert.assertTrue(1+1 == 2); //проверка, что условие вернуло True
        Assert.assertFalse(1 + 1 == 10); //проверка, что условие вернуло False
    }

    @Test
    @Ignore //не запускаем тест с данной аннотацией
    public void method2(){
        Assert.assertNull(null); //если возвращаемое значение null, то тест успешен
        Assert.assertNotNull(5); ///если возвращаемое значение не null, то тест успешен
    }

    @Test
    public void method3(){
        Assert.assertEquals(10, 5 + 5); //сравниваем ожидаемое значение с полученным
        Assert.assertNotEquals(10, 2 + 2); //сравниваем неожидаемое значение с полученным
    }

    //Метод выполняется после каждого тестового метода
    @After
    public void tearDown(){

    }

    //Метод выполняется один раз в самом конце
    @AfterClass
    public void afterClassMethod(){

    }

}
