package Gun03;

import org.testng.annotations.Test;

/*
  interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
  priority, dependecy;   Nasıl kullanırsın ?
  1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
  2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
     bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmaitk onları
     önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod ozaman çalışamaz.
*/
public class _01_Dependancy {
    @Test
    void startCar() {
        System.out.println("Car started");
    }
    @Test(dependsOnMethods = {"startCar"}) //bu testin çalışması, startCar'ın tarasız çalışmasına bağlı
    void driveCar() {
        System.out.println("Car was driven");
    }
    @Test(dependsOnMethods = {"startCar", "driveCar"})//bu testin çalışması için verilen iki testin hatasız çalışması gerekiyor
    void parkCar() {
        System.out.println("Car was parked");
    }
    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true)
    void stopCar() {
        System.out.println("Car was stopped");
    }
}
