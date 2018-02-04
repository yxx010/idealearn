public class HelloJava {
public static void main(String [] args){
    String c="Xiao";
    int i=5;
    //String who;
    String whos[]={"Yang","Zhang"};
    System.out.println(c+" Hello Java");
    HelloJava hl=new HelloJava();
    hl.eat(c);
   System.out.println(hl.count(i) + hl.count(i));
   hl.eats(0,4);
   hl.whoEats(whos);
   hl.whoEats(new String[]{"a", "b", "c"});

}
public void eat(String a){
    System.out.println(a+" eat");
   return;
}
public int count(int i){
    return i;
}
private void eats(int i,int j){
    for(i=0;i<j;i++) System.out.println(i+1+"个人在吃");
}
public void  whoEats(String []whos){
    int i=0;
    for(String who:whos){
        i+=1;
        System.out.print(who);
        if(i<whos.length) {
            System.out.print(",");
        }
        else{
            System.out.println();
        }
    }
}
}


