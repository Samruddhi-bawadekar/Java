public class wrap {
    public static void main(String args[])
    {
        int num=7;
       // Integer num1=8;//
       Integer num1=num;   //AutoBoxing

        //int num2=num1.intValue();//Unboxing//

        int num2=num1;  // Auto unboxing


        System.out.println(num2);


        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3*2);
        
    }
}
