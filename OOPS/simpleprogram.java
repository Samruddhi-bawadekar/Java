class Calc
{
    public int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}


class simpleprogram
{
    public static void main(String[] args) 
    {
       int num1=4;
       int num2=5;

       Calc calc=new Calc();
       int result=calc.add(num1,num2);
       System.out.println(result);
    }
}