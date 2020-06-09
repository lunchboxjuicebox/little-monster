public class Monster {
    private String name;
    private int lifespan;
    private int age;

    public Monster()
    {
        name = "(no name)";
        lifespan = 12;
    }

    public Monster(String newName, int newLifespan)
    {
        name = newName;
        lifespan = newLifespan;
        age = 0;
    }

    public int getAge()
    {
        return age;
    }

    public int getLifespan()
    {
        return lifespan;
    }
}