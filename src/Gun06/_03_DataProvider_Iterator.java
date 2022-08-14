package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {

    @Test(dataProvider="getData")
    void UsernameTest(String username){
        System.out.println("Username= " + username);
    }
    @DataProvider
    public Iterator<Object> getData(){

        List<Object>data=new ArrayList<>();
        data.add("Nurhayat");
        data.add("Alper");
        data.add("Melike");
        data.add("Mehmet");
        data.add("Göker");

        return data.iterator();
    }

    /*********************************/

    @Test(dataProvider="getData2")
    void UsernameTest(String username, String password) {
        System.out.println("Username= " + username + ", password= " + password);
    }
    @DataProvider
    public Iterator<Object[]> getData2(){

        List<Object[]>data=new ArrayList<>();
        data.add(new Object[]{"Nazim","122333"});
        data.add(new Object[]{"Goker", "22222"});
        data.add(new Object[]{"Melike", "22255550"});
        data.add(new Object[]{"Mehmet", "2222220"});

        return data.iterator();
    }
}
