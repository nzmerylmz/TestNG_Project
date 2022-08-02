package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
//    public static void main(String[] args) {
//        webSitesiniAc();
//        loginTestIsleminiYap();
//        driverKapat();
//    }

    @Test(priority = 1) //annotation
    void webSitesiniAc(){
        System.out.println("Driver tanımlandı ve web sitesi açıldı");
    }

    @Test (priority = 2)
    void loginTestIsleminiYap(){
        System.out.println("Login test islemi yapıldı");
    }

    @Test (priority = 1)
    void driverKapat(){
        System.out.println("Driver kapatıldı ve çıkıldı.");
    }
}
