public class Worker extends  People
{
    private double Salary;
    public Worker(String name, int age, double weight)
    {
        super(name ,age ,weight);
    }

    @Override
    public void speak() {
        System.out.println("I AM A WORKER!");
    }

    public double getSalary()
    {
        return Salary;
    }
    public void setSalary(double salary)
    {
        Salary = salary;
    }

    public void repairFuel(Ship ship)
    {
        ship.setFuelLeak(false);
    }

    public void repairOxygen(Ship ship)
    {
        ship.setOxygenLeak(false);
    }
}
