public class Monster {
    private String name;
    private int lifespan;
    private int age;
    private int mood; // (2 = joyful, 1 = happy, 0 = neutral, -1 = sad, -2 = angry)

    // default constructor
    public Monster()
    {
        name = "(no name)";
        lifespan = 12;
    }

    // overloaded constructor
    public Monster(String newName, int newLifespan)
    {
        name = newName;
        lifespan = newLifespan;
        age = 0;
    }

    private void makeOlder()
    {
        age++;
        if(age>=lifespan)
        {
            name = "Zombie" + name;
        }
    }

    public int getAge()
    {
        return age;
    }

    public int getLifespan()
    {
        return lifespan;
    }

    public void poke()
    {
        if(mood>0)
        {
            mood--;
        }
    }

    public void pet()
    {
        if(mood<4)
        {
            mood++;
        }
    }


}