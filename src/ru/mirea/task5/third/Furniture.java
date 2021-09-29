package ru.mirea.task5.third;

public abstract class Furniture
{
    protected String material;
    protected String size;
    protected int cost;
    public Furniture()
    {
        material = "деревянный";
        size = "маленький";
    }
    public Furniture(String material, String size)
    {
        this.material = material;
        this.size = size;
    }
    public String getMaterial()
    {
        return material;
    }

    public String getSize()
    {
        return size;
    }

    public int getCost()
    {
        return cost;
    }

    public void setMaterial(String color)
    {
        this.material = color;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public abstract String toString();
}