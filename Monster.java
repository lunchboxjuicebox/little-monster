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
        age = 0;
        mood = 2;
    }

    // overloaded constructor
    public Monster(String newName, int newLifespan)
    {
        name = newName;
        lifespan = newLifespan;
        age = 0;
        mood = 2;
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

        /* --- DRAW PET --- */
        System.out.print("     __     "); // top of head
        // space before the top of tail
        for(int i=0; i < size; i++)
        {
            System.out.print(" ");
        }
        System.out.println("_"); // top of the tail
        System.out.print("   o'')}_");
        // body segment top half
        for (int i = 0; i < size; i++)
        {
            System.out.print("_");  
        }
        
        /* --- MOOD --- */
        System.out.println(" ------------------------------");
        System.out.print("| Status/Mood: ");
        if(mood<=0)
        {
            System.out.println("angry! Σ(▼□▼メ) |");
        }
        else if (mood==1)
        {
            System.out.println("sad (｡T ω T｡)   |");
        }
        else if (mood==2)
        {
            System.out.println("meh (・_・)ノ    |");
        }
        else if (mood==3)
        {
            System.out.println("happy (o˘◡˘o)   |");
        }
        else if (mood>=4)
        {
            System.out.println("joyful! ٩(⁀ᗢ⁀｡)۶|");
        }
        System.out.print(" ------------------------------");
    }

}