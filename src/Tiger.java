public class Tiger extends ZooAnimal
{
    private String color;

    public Tiger(String name, int age, String color)
    {
        super(name, age);
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void roar()
    {
        System.out.println("ROAR! I am a tiger and my name is " + getName()); // fill in the blank as described in (a)
    }
}