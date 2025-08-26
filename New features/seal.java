sealed class A permits B,C
{

}

sealed class B extends A permits D
{

}

non-sealed class C extends A
{

}

final class D extends B
{

}

sealed interface X permits Y
{

}
non-sealed interface Y extends X
{

}

public class seal
{
  public static void main(String args[])
  {

  }
}