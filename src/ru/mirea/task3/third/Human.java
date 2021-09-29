package ru.mirea.task3.third;

class human {
    protected int height;
    protected String sex;
    protected int weight;
    protected String name;

    public human(String sex, int weight, int height, String name)
    {
        this.sex = sex;
        this.weight = weight;
        this.name = name;
        this.height = height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public String massIndex(int weight, int height)
    {
        int BMI = weight/(height*height);
        if(BMI < 18)
        {
            return "Underweight";
        }
        else if(BMI < 25)
        {
            return "Healthy weight";
        }
        else
        {
            return "Overweight";
        }
    }

    public String toString()
    {
        if (sex == "male")
        {
            return "This is " + name + " and he is " + massIndex(weight, height);
        }
        else
        {
            return "This is " + name + " and she is " + massIndex(weight, height);
        }
    }

    public void sneeze()
    {
        System.out.println("ACHOOOOOOOO!!");
    }
}

class head {
    public static String eyesColor;

    public head (String eyesColor)
    {
        this.eyesColor = eyesColor;
    }

    public String getHeight()
    {
        return eyesColor;
    }

    public void setHeight(String eyesColor)
    {
        this.eyesColor = eyesColor;
    }

    public void turnHead(int degree)
    {
        if(degree > 270)
        {
            System.out.println("Not even an owl can do that");
        }
        else if (degree > 160)
        {
            System.out.println("You're not an owl to do that");
        }
        else
        {
            System.out.println("You turned your head by " + degree + " degrees");
        }
    }
}

class legs {
    public static int height;

    public legs(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public void run()
    {
        System.out.println("You ran away");
    }
}

class arms {
    public static int length;

    public arms(int length)
    {
        this.length = length;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public void reach(int distance)
    {
        if(distance > length)
        {
            System.out.println("You can't reach that");
        }
        else
        {
            System.out.println("You reached what you wanted");
        }
    }
}

