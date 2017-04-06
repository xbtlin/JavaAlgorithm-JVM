public class StaticDispatch
{
    static abstract class Human
    {
    }
    static class Man extends Human
    {
    }
    static class Woman extends Human
    {
    }

    public void sayHello(Human guy)
    {
        System.out.println("hello guy");
    }
    public void sayHello(Man guy)
    {
        System.out.println("hello man");
    }
    public void sayHello(Woman guy)
    {
        System.out.println("hello woman");
    }

    public static void main(String[] args)
    {
        StaticDispatch sr = new StaticDispatch();
        Human man = new Man();//静态类型为Human ,实际类型
        Human woman = new Woman();

        sr.sayHello(man);
        sr.sayHello(woman);
    }
} 