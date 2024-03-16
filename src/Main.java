public class Main
{
    public static void main(String[] args)
    {
        Tiger tiger = new Tiger("Leo", 10, "striped");
        tiger.roar();
        BabyKoala koala = new BabyKoala("Fluffy");
        System.out.println(koala.getAge());
        System.out.println(koala.hasEyesOpen());
    }
}