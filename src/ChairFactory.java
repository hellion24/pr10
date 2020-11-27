public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair ()
    {
        System.out.println("VictorianChair created");
        return new VictorianChair();
    }
    @Override
    public MagicChair createMagicChair ()
    {
        System.out.println("MagicChair created");
        return new MagicChair();
    }
    @Override
    public FunctionalChair createFunctionalChair ()
    {
        System.out.println("FunctionalChair created");
        return new FunctionalChair();
    }
}
