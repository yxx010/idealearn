public class StringTrimTest {
        public static void main(String args[]) {
            String Str = new String("    www.runoob.com    ");
            System.out.print("原始值 :" );
            System.out.println( Str );
            System.out.print("删除头尾空白 :" );
            System.out.println( Str.trim() );
        }
}
