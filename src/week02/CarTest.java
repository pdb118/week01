package week02;

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car(color, "white", gearType "auto", door: 4);

        System.out.println("c1의 color=" + c1.color + " gearType=" + c1.gearType + " door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + " gearType=" + c2.gearType + " door=" + c2.door);

        String str = "바보";
        System.out.println(print(str));
    }

    public static String print(String str) {
        return str.equals("바보") ? "바보입니다" : "천재입니다";
    }
}
