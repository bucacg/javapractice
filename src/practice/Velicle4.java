package practice;

public class Velicle4 {
    double speed;//声明double型变量speed,刻画速度
    int power;//声明int型变量power,刻画功率
    int brake;

    void speedUp(int s) {
        speed = speed + s;//将参数s的值与成员变量speed的和赋值给成员变量speed
    }
    void speedDown ( int d){
        speed = speed - d;  //将成员变量speed与参数d的差赋值给成员变量speed
    }
    void setPower ( int p){
        power = p;    //将参数p的值赋值给成员变量power
    }
    void brake(){
        this.speed=0; //增加一个刹车方法void brake(),Velicle 类的对象调用它能将speed的值变为0
    }
    int getPower () {
        return power;  //返回成员变量power的值
    }
    double getSpeed () {
        return speed;
    }
}
