public class ArrayTest {
    public void intArray(int []myints){
        int i=0;
        for (int myint:myints){
            System.out.print(myint);
            i+=1;
            if (i<myints.length){
                System.out.print(",");
            }
            else{
                System.out.println();
            }
        }
    }
    //public void toSmall{

   // }
    public static void main(String[]args)
    {
        ArrayTest arr=new ArrayTest();
        int [] a={2,4,6,8,9};
        arr.intArray(new int []{2,4});
        arr.intArray(a);
    }
}
