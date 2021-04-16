package practice;

public class Vehicle {
    double speed;//声明double型变量speed,刻画速度
    int power;//声明int型变量power,刻画功率

    void speedUp(int s) {
        speed = speed + s;//将参数s的值与成员变量speed的和赋值给成员变量speed
    }
    void speedDown ( int d){
        speed = speed - d;  //将成员变量speed与参数d的差赋值给成员变量speed
    }
    void setPower ( int p){
        power = p;    //将参数p的值赋值给成员变量power
    }
    int getPower () {
        return power;  //返回成员变量power的值
    }
    double getSpeed () {
        return speed;
    }
}
