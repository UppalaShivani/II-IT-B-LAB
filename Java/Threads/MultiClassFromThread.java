class A extends Thread
{
public void run()
{
for (int i=0;i<=3;i++)
{
System.out.println("IT");
}
}
}

class B extends Thread
{

public void run()
{
for (int i=0;i<=3;i++)
{
System.out.println("BVRITH");
}
}
}

class C extends Thread
{

public void run()
{
for (int i=0;i<=3;i++)
{
System.out.println("II-IT-B");
}
}
}


class MultiClassFromThread
{
public static void main(String args[])
{
A a = new A();
B b = new B();
C c = new C();
a.start();
b.start();
c.start();
System.out.println("Hello");
}
}
