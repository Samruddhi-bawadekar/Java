class calculator
{
    
        public int add(int n1,int n2,int n3)
        {
           return n1+n2+n3;
        }

        public int add(int n1,int n2)
        {
           return n1+n2;
        }

        public double add(double n1,int n2)
        {
           return n1+n2;
        }
}
public class methodoverload
{
public static void main(String[] args) 
{
    calculator calc=new calculator();
    double calculator=calc.add(4.0,5);
    System.out.println(calculator);
}
}

