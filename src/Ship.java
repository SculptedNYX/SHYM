public class Ship
{
    private String spaceShipType, item;
    private int industryDate, noBodyParts;
    private double fuelCapacity, oxygenCapacity;
    private boolean fuelLeak = false, oxygenLeak = false, onFire = false;
    private static int peopleCount=0;
    private static double totalWeight= 0;
    private Pilot pilot;
    private Worker worker;

    public boolean isOnFire() {
        return onFire;
    }

    public void setOnFire(boolean onFire) {
        this.onFire = onFire;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public boolean isFuelLeak() {
        return fuelLeak;
    }

    public void setFuelLeak(boolean fuelLeak) {
        this.fuelLeak = fuelLeak;
    }

    public boolean isOxygenLeak() {
        return oxygenLeak;
    }

    public void setOxygenLeak(boolean oxygenLeak) {
        this.oxygenLeak = oxygenLeak;
    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public static void setTotalWeight(double totalWeight) {
        Ship.totalWeight = totalWeight;
    }

    public static int getPeopleCount() {
        return peopleCount;
    }

    public static void setPeopleCount(int peopleCount) {
        Ship.peopleCount = peopleCount;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getOxygenCapacity() {
        return oxygenCapacity;
    }

    public void setOxygenCapacity(double oxygenCapacity) {
        this.oxygenCapacity = oxygenCapacity;
    }

    public String getSpaceShipType() {
        return spaceShipType;
    }

    public void setSpaceShipType(String spaceShipType) {
        this.spaceShipType = spaceShipType;
    }

    public void setIndustryDate(int industryDate) {
        this.industryDate = industryDate;
    }

    public int getNoBodyParts() {
        return noBodyParts;
    }

    public void setNoBodyParts(int noBodyParts) {
        this.noBodyParts = noBodyParts;
    }

    public boolean checkFuel()
    {
        if (fuelCapacity < 0)
        {
            System.out.println("LOW FUEL LEVEL!");
            return false;
        }
        else System.out.println("Fuel: " + fuelCapacity);
        return true;
    }
    public boolean checkOxygen()
    {
        if (oxygenCapacity < 0)
        {
            System.out.println("LOW OXYGEN LEVEL!");
            return false;
        }
        else System.out.println("OXYGEN: " + oxygenCapacity);
        return true;
    }
}
