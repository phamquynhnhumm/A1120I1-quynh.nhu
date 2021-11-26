package _bai5_Accessmodifier_staticmethod_staticproperty._thuchanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazde 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("mazda 6","SKyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
