package com.example;

import java.sql.*;

import com.example.oop.BetuMember;
import com.example.oop.Car;
import com.example.oop.LeaderBetu;
import com.example.oop.Task;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App ha = new App();
        // ha.test();
        // ha.classMethod();
        // ha.practiveOop();
        final String DB_URL = "jdbc:mysql://localhost:3306/classicmodels";
        final String user = "root";
        final String password = "root";

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(DB_URL, user, password);
            System.out.println("connect database successfully");
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM customers where customerNumber=103");
            while(rs.next()) {
                System.out.println("name: " + rs.getString("customerName"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("err "+ e.getMessage());
        }
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
    public void practiveOop() {
        BetuMember ha = new BetuMember();
        BetuMember thube = new BetuMember();

        Task PlayerProp = new Task();
        Task Lossback = new Task();
        Task Nextjs = new Task();
        Task BonusBet = new Task();

        ha.name = "Nguyen Thi Ha";

        thube.review = BonusBet;
        thube.refinement = Lossback;
        ha.refinement = BonusBet;
        ha.developTask.add(Nextjs);
        ha.developTask.add(PlayerProp);

        ha.refinement.nametask = "Bonus Bet";

        System.out.println("Ten b Ha: " + ha.name);
        System.out.println("Task refinement: " + ha.refinement.nametask);
    }
}



