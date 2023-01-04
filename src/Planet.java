public class Planet {
    private final double Distance;
    private final double Fuel_Required;
    private final double Mission_Risk;
    private final double Max_passenger;
    private final String requiredItem;
    private final String name;

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

    public String getName() {
        return name;
    }

    public double getDistance() {
        return Distance;
    }

    public double getFuel_Required() {
        return Fuel_Required;
    }


    public double getMission_Risk() {
        return Mission_Risk;
    }

    public double getMax_passenger() {
        return Max_passenger;
    }

    public void getdata() {

        System.out.println("Distace: " + getDistance());


        System.out.println("Fuel Required " + getFuel_Required());


        System.out.println("Mission Risk: " + getMission_Risk());


        System.out.println("Maximum Passenger: " + getMax_passenger());

    }
}
