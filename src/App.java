
import oop.BetuMember;
import oop.Car;
import oop.LeaderBetu;
import oop.Task;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App ha = new App();
        // ha.test();
        ha.classMethod();
    }

    public void classMethod() {
        // Car Honda = new Car("aa");
        // Honda.color = "den";
        // Honda.sayhello();

        // Car Vinfast = new Car();
        // Vinfast.color = "trang";
        // Vinfast.hi();

        Car vn = new Car();
        vn.biensoxe = 11011;
        vn.hi();

        System.out.println("");

        Car ts = new Car(123);
        ts.hi();

        Car b = new Car("s01");
        b.he();

        Car c = new Car();
        c.model = "s02";
        c.he();
    }

    public void test() {
        String name = new String();
        Car Volvo = new Car(); // khởi tạo đối tượng Car tên Volvo, nguyên liệu để khởi tạo đối tượng cần 1
                               // class, nguyên liệu để có class là phải tạo 1 file .java
        Car Audi = new Car();
        Car Toyota = new Car();
        BetuMember ha = new BetuMember();
        Task riskfree = new Task();
        Task lossback = new Task();
        Task PlayerProp = new Task();
        Task nextjs = new Task();

        LeaderBetu thang = new LeaderBetu();
        thang.name = "Thang";
        thang.mergeTask = PlayerProp;

        riskfree.nametask = "risk free";
        riskfree.linkjira = "betf-1903";

        ha.name = "Nguyen Ha";
        ha.age = 25;
        ha.phone = "033123094";
        ha.dagia = true;
        ha.email = "ha.nguyen@sotatek.com";

        Task taskDevelopCuaHa[] = { lossback, nextjs };

        ha.refinement = riskfree;
        ha.develop = taskDevelopCuaHa;

        ha.nhanTask(lossback);
        ha.nhanTask(nextjs);
        ha.khongNhanTask(lossback);

        int number1 = 2;
        number1 = 3;
        number1 = 4;

        System.out.println(ha.refinement.nametask);
        System.out.println(ha.refinement.linkjira);
    }

    // code ở đây

}
