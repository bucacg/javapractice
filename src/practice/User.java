package practice;

public class User {
    public static void main(String args[]) {
        Vehicle car1,car2;
        car1=new Vehicle(); //使用new 运算符和默认的构造方法创建对象car1
        car2=new Vehicle();//使用new 运算符和默认的构造方法创建对象car2
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("car1的功率是："+car1.getPower());
        System.out.println("car2的功率是："+car2.getPower());
        car1.speedUp(80); //car1调用speedUp方法将自己的speed的值增加80
        car2.speedUp(100); //car2调用speedUp方法将自己的speed的值增加100
        System.out.println("car1目前的速度："+car1.getSpeed());
        System.out.println("car2目前的速度："+car2.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("car1目前的速度："+car1.getSpeed());
        System.out.println("car2目前的速度："+car2.getSpeed());
        System.out.println("car1刹车");
    }
}
