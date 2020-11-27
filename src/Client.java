public class Client
{
    public Chair chair;

    public void sit()
    {
        System.out.println("Sitted");
    }
    public void setChair(Chair chair)
    {
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }
}
