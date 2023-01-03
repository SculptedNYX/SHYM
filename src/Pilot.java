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

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public int getFlightScore() {
        return flightScore;
    }

    public void setFlightScore(int flightScore) {
        this.flightScore = flightScore;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String destination()
    {
        return destination;
    }
    public void releaseBodyPart(Ship A1)
    {
        A1.setNoBodyParts(A1.getNoBodyParts() - 1);
        System.out.println("Body Number : " + A1.getNoBodyParts() + ", part is ejected successfully");
    }

    public void closeDoors(Ship ship)
    {
        ship.setDoorsStatus(true);
    }

}
