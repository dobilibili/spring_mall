import java.util.Scanner;

public class DetachFilePath {

    public static void main(String[] args) {

        //输出提示信息

        System.out.println("请输入文件的绝对路径");

        //输入绝对文件路径

        Scanner sc = new Scanner(System.in);

        //获取文件绝对路径

        String Path = sc.nextLine();

        //找到字符串中的最后一个‘\’,'.'

        int SplitIndex = Path.lastIndexOf("\\");//转义字符，所以需要”\\“

        int TypeIndex = Path.lastIndexOf(".");

        //如果没有拓展名,即没有‘.’

        if(TypeIndex < 0 ){

            TypeIndex = Path.length();

        }

        //字符串从开始到SplitIndex为文件路径

        String FilePath = Path.substring(0,SplitIndex);

        System.out.println("----------------------------");

        System.out.println("文件路径为："+FilePath);

        //SplitIndex+1到‘.’为文件名

        String FileName = Path.substring(SplitIndex+1,TypeIndex);

        System.out.println("----------------------------");

        System.out.println("文件名为："+FileName);

        //TypeIndex+1到字符串最后为文件扩展名

        String FileTypeName = Path.substring(TypeIndex);

        System.out.println("----------------------------");

        System.out.println("文件扩展名为："+FileTypeName);

        //把文件路径字符串中的路径分隔符“\”用“*”替换。

        String str = Path.replaceAll("\\\\","*");

        System.out.println("----------------------------");

        System.out.println("替换后的路径为："+str);

    }

}
