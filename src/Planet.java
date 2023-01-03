public class Planet {
    private double Distance;
    private double Fuel_Required;
    private double Mission_Risk;
    private double Max_passenger;
    private String requiredItem, name;

    public Planet( double Distance, double Fuel_Required, double Mission_Risk,  double Max_passenger, String requiredItem, String name){

        this.Distance=Distance;
        this.Fuel_Required=Fuel_Required;
        this.Mission_Risk=Mission_Risk;
        this.Max_passenger=Max_passenger;
        this.requiredItem = requiredItem;
        this.name = name;
    }

    public String getRequiredItem() {
        return requiredItem;
    }

    public void setRequiredItem(String requiredItem) {
        this.requiredItem = requiredItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double Distance) {
        this.Distance = Distance;
    }

    public double getFuel_Required() {
        return Fuel_Required;
    }

    public void setFuel_Required(double Fuel_Required) {
        this.Fuel_Required = Fuel_Required;
    }

    public double getMission_Risk() {
        return Mission_Risk;
    }

    public void setMission_Risk(double Mission_Risk) {
        this.Mission_Risk = Mission_Risk;
    }

    public double getMax_passenger() {
        return Max_passenger;
    }

    public void setMin_passenger(double Max_passenger) {
        this.Max_passenger = Max_passenger;
    }


    public void getdata() {

        System.out.println("Distace: " + getDistance());


        System.out.println("Fuel Required " + getFuel_Required());


        System.out.println("Mission Risk: " + getMission_Risk());


        System.out.println("Maximum Passenger: " + getMax_passenger());

    }
}
