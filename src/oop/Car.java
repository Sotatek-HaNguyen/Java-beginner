package oop;

public class Car {
    public String color;
    public int biensoxe;
    public String model;
    public void sayhello(){
        System.out.println("chiec xe nay mau: "+ this.color);
    }
    public Car(){

    }
    public Car(int biensoxe){
       this.biensoxe = biensoxe;
    }
    public Car(String mauma){
        this.model = mauma; //this luôn lấy giá trị trong chính class của nó; "mauma" la tham số truyền vào
    }
    public void hi(){
        System.out.println("bien so xe la: " + this.biensoxe);
    }

    public void he(){
        System.out.println("mau ma cua xe la:" + this.model);
    }

}
