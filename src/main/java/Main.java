import Smartphone.Smartphone;
import animal.Cat;
import animal.Dog;
import Movable.Point;
import Comparable.Car;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("cat");
        System.out.println(cat.makeSound());

        Dog dog = new Dog("dog");
        System.out.println(dog.makeSound());

        Point point =  new Point(1,2);

        point.moveTo(5,6);

        System.out.println(point.getX() +""+ point.getY());



        Smartphone phone = new Smartphone(5,6,7);

        double[] b = phone.getCoordinates();

        System.out.println(b[0] + "|"+b[1] +"|"+b[2]);

        Car a = new Car(10,2004,120);

        Car c = new Car(10,2004, 120);

        System.out.println(a.compareTo(c));




    }

}
