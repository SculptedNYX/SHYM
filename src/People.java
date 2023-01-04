public abstract class People
{
    private String name;
    private int age;
    private double weight;
    public People(String name, int age, double weight)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
        Ship.setPeopleCount(Ship.getPeopleCount()+1);
        Ship.setTotalWeight(Ship.getTotalWeight()+weight);
    }

    public abstract void speak();
}

