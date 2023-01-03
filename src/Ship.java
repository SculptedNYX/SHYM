public class Ship
{
    private String spaceShipType, engine, jetType, item;
    private int industryDate, noBodyParts;
    private double fuelRate, fuelCapacity, oxygenCapacity;
    private boolean doorsStatus = false;
    private boolean Start = false;
    private boolean fuelLeak = false, oxygenLeak = false;
    private static int peopleCount=0;
    private static double totalWeight= 0;
    private Pilot pilot;

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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getJetType() {
        return jetType;
    }

    public void setJetType(String jetType) {
        this.jetType = jetType;
    }

    public int getIndustryDate() {
        return industryDate;
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

    public double getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(double fuelRate) {
        this.fuelRate = fuelRate;
    }

    public boolean isDoorsStatus() {
        return doorsStatus;
    }

    public void setDoorsStatus(boolean doorsStatus) {
        this.doorsStatus = doorsStatus;
    }

    public boolean isStart() {
        return Start;
    }

    public void setStart(boolean start) {
        Start = start;
    }

    public boolean checkDoors()
    {
        if(doorsStatus)
        {
            System.out.println("Doors Are Closed");
            return doorsStatus;
        }
        else System.out.println("Doors Are Open!");
        return doorsStatus;
    }
    public boolean checkFuel()
    {
        if (fuelCapacity < 0)
        {
            System.out.println("LOW FUEL LEVEL!");
            return false;
        }
        else System.out.println("Fuel level is " + fuelCapacity);
        return true;
    }
    public boolean checkOxygen()
    {
        if (oxygenCapacity < 0)
        {
            System.out.println("LOW OXYGEN LEVEL!");
            return false;
        }
        else System.out.println("OXYGEN level is " + oxygenCapacity);
        return true;
    }
    public boolean checkShip()
    {
        if (industryDate < 2000)
        {
            System.out.println("Ship Must Be Totaled");
            return false;
        }
        else System.out.println("Ship is Okay");
        return true;
    }
}
