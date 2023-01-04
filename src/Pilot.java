public class Pilot extends People
{
    private String Experience;
    private int flightScore;
    private String destination;
    public Pilot(String name, int age, double weight, String Experience, int flightScore)
    {
        super(name,age,weight);
        this.Experience = Experience;
        this.flightScore = flightScore;
    }

    @Override
    public void speak() {
        System.out.println("I AM A PILOT!");
    }

    public void releaseBodyPart(Ship A1)
    {
        A1.setNoBodyParts(A1.getNoBodyParts() - 1);
        System.out.println("Body Number : " + A1.getNoBodyParts() + ", part is ejected successfully");
    }

    public void waterSystem(Ship A1)
    {
        A1.setOnFire(false);
        System.out.println("water system on");
    }

}
