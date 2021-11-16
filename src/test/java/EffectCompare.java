import java.util.Scanner;

public class EffectCompare {

    public static void main(String[] args) {

        //输出提示信息

        System.out.println("请输入想要追加字符'A'的个数");

        //输入n

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //分别初始化String 和StringBuffer的字符串

        String str1 = new String();

        StringBuffer str2 = new StringBuffer();

        //使用currentTimeMills()方法

        //currentTimeMills()方法返回一个long类型的值，

        //该值表示当前时间与1970年1月1日0点0分0秒之间的时间差，单位是毫秒，通常也将该值称做时间戳。

        //记录初始时间戳

        long StringStartTime = System.currentTimeMillis();

        //String循环

        for (int i = 0; i < n; i++){

            str1 = str1 + "A";

        }

        //记录结束时间戳

        long StringEndTime = System.currentTimeMillis();

//        System.out.println(str1);

        System.out.println("--------------------------------------");

        System.out.println("使用String实现追加n个‘A’，运行时间为："+(StringEndTime-StringStartTime)+"毫秒(ms)");

        //记录初始时间戳

        long StringBufferStartTime = System.currentTimeMillis();

        //String循环

        for (int i = 0; i < n; i++){

            str2 = str2.append("A");

        }

        //记录结束时间戳

        long StringBufferEndTime = System.currentTimeMillis();

//        System.out.println(str2);

        System.out.println("--------------------------------------");

        System.out.println("使用StringBuffer实现追加n个‘A’，运行时间为："+(StringBufferEndTime-StringBufferStartTime)+"毫秒(ms)");

    }

}
