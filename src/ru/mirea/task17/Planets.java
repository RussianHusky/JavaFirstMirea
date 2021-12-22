package ru.mirea.task17;

import static java.lang.Math.pow;

public enum Planets {
    MERCURY(3.285, 2439.7),
    VENUS(4.867, 6051.8),
    EARTH(5.972, 6371),
    MARS(6.39, 3389.5),
    JUPITER(1.898, 69911),
    SATURN(5.683, 58232),
    URANUS(8.681, 25362),
    NEPTUNE(1.024, 24622)
    ;


    public double mass, radius;

    private Planets(double mass, double radius)
    {
        this.mass = mass;
        this.radius = radius;
    }
}

class Planet {
    public Planet(Planets planet){
        System.out.println(Math.round((6.67 * pow(10, -11)) * ((planet.mass * pow(10, 26)) /  pow(planet.radius, 2)) * 100.0) / 100.0);
    }
}