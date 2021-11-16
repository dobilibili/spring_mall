import java.util.Scanner;

public class SplitAdmissionNumber {

    public static void main(String[] args) {

        //输出提示信息

        System.out.println("请输入准考证号");

        //输入准考证号

        Scanner sc = new Scanner(System.in);

        //获取准考证号

        String str1 = sc.nextLine();

        StringBuffer Num = new StringBuffer(str1);

        //获取考场号

        String PlaceNum = Num.substring(0,2);

        System.out.println("----------------------------");

        System.out.println("考场号为："+PlaceNum);

        //获取考室号

        String RoomNum = Num.substring(2,4);

        System.out.println("----------------------------");

        System.out.println("考室号为："+RoomNum);

        //获取考生序号

        String StuNum = Num.substring(4,8);

        System.out.println("----------------------------");

        System.out.println("考生号为："+StuNum);

        //获取考试类型

        String ExamType = Num.substring(8);

        System.out.println("----------------------------");

        if (ExamType.equals("1")){

            System.out.println("考试类型为A类");

        }   else if (ExamType.equals("2")){

            System.out.println("考试类型为B类");

        }   else if (ExamType.equals("3")){

            System.out.println("考试类型为C类");

        }   else {

            System.out.println("暂无此考试类型");

        }

        //在准考证号码的最前面插入学校代码，

        System.out.println("----------------------------");

        System.out.println("请输入学校代码用于附加在准考证前：");

        Scanner scanner = new Scanner(System.in);

        String school = scanner.next();

        System.out.println("----------------------------");

        Num.insert(0,school);

        System.out.println("插入学校代码后的准考证号为："+Num);

    }

}
