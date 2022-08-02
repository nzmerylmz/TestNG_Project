package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
    /*
    @BeforeClass --> Her class çalışıyorken önce burası çalışır
        @BeforeMethod --> Her test metodundan çalışıyorken önce burası çalışır
            @Test
            @Test
        @AfterMethod --> Her test metodundan çalışıyorken sonra burası çalışır
    @BAfterClass --> Her class çalışıyorken sonra burası çalışır
     */
    @BeforeClass
    void beforeClass() {
        System.out.println("Her classdan önce burası çalışacak: Before Class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Her test methoddan önce burası çalışacak: Before Method");
    }

    @Test
    void test1() {
        System.out.println("Test 1 çalıştı");
    }

    @Test
    void test2() {
        System.out.println("Test 2 çalıştı");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("Her test methoddan sonra burası çalışacak: After Method");
    }

    @AfterClass
    void afterClass() {
        System.out.println("Her classdan sonra burası çalışacak: After Class");
    }
}
