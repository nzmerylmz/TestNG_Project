package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider="getData")
    void UsernameTest(String username){
        System.out.println("Username= " + username);
    }
    @DataProvider
    public Object[] getData(){
        Object[] data={"Nurhayat", "Alper", "Melike", "Mehmet", "Göker"};

        return data;
    }

    //----------------------------

    @Test(dataProvider="userlar")
    void UsernameTest2(String username){
        System.out.println("Username= " + username);
    }
    @DataProvider(name = "userlar")
    public Object[] getData2(){
        Object[] data={"Nurhayat", "Alper", "Melike", "Mehmet", "Göker"};

        return data;
    }
}
