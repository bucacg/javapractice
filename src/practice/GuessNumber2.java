package practice;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {
    public static void main(String args[]) {
        Scanner reader =new Scanner(System.in);
        Random random=new Random();
        System.out.println("请你想一个1至100之间的整数，让电脑来猜测这个数");
        int realNumber = random.nextInt(100)+1;//random.nextInt(100)是[0,100)中的随机整数
        int computerGuess=5;
        while(computerGuess!=realNumber)//循环条件
        {
            if(computerGuess>realNumber)//猜大了的条件代码
            {
                System.out.println("猜大了,输出1，让电脑再来猜测这个数：");
                computerGuess= reader.nextInt();
            }
            else if (computerGuess<realNumber)//猜小了的条件代码
            {
                System.out.println("猜小了，输出0，让电脑再来猜测这个数：");
                computerGuess= reader.nextInt();
            }
        }
        System.out.println("猜对了！");
    }
}
