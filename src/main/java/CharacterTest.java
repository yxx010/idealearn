public class CharacterTest {
    public static void main(String args[]) {
        System.out.println( Character.isLowerCase('c'));
        System.out.println( Character.isLowerCase('C'));
        System.out.println( ("CHENG").length());
        //将一个字符串变成大写的：方法一
        String str=new String();
        str="chen";
        System.out.println( new String(str).toUpperCase());
        //字符串变成大写的：方法二
        System.out.println( new String("chen").toUpperCase());
        //字符变成小写的
        System.out.println(Character.toLowerCase('a'));
        //字符变成小写的
        System.out.println(Character.toLowerCase('A'));
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}
