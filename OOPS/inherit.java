class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}

class AdvCalc extends Calc
{
    public int mul(int n1,int n2)
    {
          return n1 * n2;
    }

    public int div(int n1,int n2)
    {
          return n1 / n2;
    }
}



public class inherit {
    public static void main(String[] args) {
        AdvCalc obj=new AdvCalc();
        int r1=obj.add(4,3);
        int r2=obj.sub(6,5 );
        int r3=obj.mul(5,6);
        int r4=obj.div(14,7);


        System.out.println(r1 + " "  + r2 +" " + r3 + " " + r4);
    }
}
