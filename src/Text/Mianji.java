package Text;

import java.util.Scanner;

public class Mianji {

    public static void main(String[] args) {
        System.out.println("请输入图形的形状：");
        Scanner scan=new Scanner(System.in);
        String Xingzhuang=scan.next();
        Shape shape = null;
        if(Xingzhuang.equals("圆")){
            shape=new Circle();
        }else if(Xingzhuang.equals("长方形")){
            shape=new Rectangle();
        }else if(Xingzhuang.equals("正方形")){
            shape=new Square();
        }
        System.out.println(shape.Aera());
    }

}
