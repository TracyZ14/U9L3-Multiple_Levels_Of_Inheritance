public class BabyKoala extends ZooAnimal {


    private boolean eyesOpen;

    // write this constructor as described in (b)
    public BabyKoala(String name)
    {
        super(name, 0);
        this.eyesOpen = false;
    }

    public boolean hasEyesOpen()
    {
        return eyesOpen;
    }

    public void openEyes()
    {
        System.out.println("hello world!");
        eyesOpen = true;
    }
}