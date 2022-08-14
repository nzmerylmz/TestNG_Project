package Gun04;

import org.testng.annotations.*;

public class _01_Intro {
    /*
        @BeforeSuite
         @BeforeTest
          @BeforeGroups
           @BeforeClass
            @BeforeMethod
              @Test
              @Test
            @AfterMethod
           @AfterClass
          @AfterGroups
         @AfterTest
        @AfterSuite
     */
    @BeforeSuite
    void bSuite(){System.out.println("BeforeSuite");}

    @BeforeTest
    void bTest(){System.out.println("BeforeTest");}

    @BeforeGroups
    void bGroups(){System.out.println("BeforeGroups");}

    @BeforeClass
    void bClass(){System.out.println("BeforeClass");}

    @BeforeMethod
    void bMethod(){System.out.println("BeforeMethod");}

    @Test
    void TestKontrol_1(){System.out.println("TestIntro1");}

    @Test
    void TestKontrol_2(){System.out.println("TestIntro2");}

    @AfterMethod
    void aMethod(){System.out.println("AfterMethod");}

    @AfterClass
    void aClass(){System.out.println("AfterClass");}

    @AfterGroups
    void aGroups(){System.out.println("AfterGroups");}

    @AfterTest
    void aTest(){System.out.println("AfterTest");}

    @AfterSuite
    void aSuite(){System.out.println("AfterSuite");}
}
