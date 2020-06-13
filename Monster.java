public class Monster {
    private String name;
    private int lifespan;
    private int age;
    private int mood; // (2 = joyful, 1 = happy, 0 = neutral, -1 = sad, -2 = angry)
    private int size;

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

    public void feed(int amount)
    {
        size += amount;
        makeOlder();
    }

    public void exercise(int amount)
    {
        size -= amount;
        if(size<1)
        {
            System.out.println("No more energy!");
            size = 1;
            makeOlder();
        }
    }

    public void displayMonster()
    {
        System.out.println(name + " | " + age + " yrs | Max: " + lifespan + " yrs |");
    }

}