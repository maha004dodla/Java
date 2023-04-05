abstract class animal
{
    public abstract void makesound();
    public void eat()
    {
        System.out.println("I am eating");
    }
}
class Dog extends animal
{
    public void makesound()
    {
        System.out.println("Barking bow bow...");
    }
}
class cat extends animal
{
    public void makesound()
    {
        System.out.println("meow..meow");
    }
}
class mainclassA
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        cat c=new cat();
        d.makesound();
        d.eat();
        c.makesound();
        c.eat();

    }
}