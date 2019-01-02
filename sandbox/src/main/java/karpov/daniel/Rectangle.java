package karpov.daniel;

public class Rectangle {
    public double a;
    public double b;

    public Rectangle(double len, double width)
    {
        this.a = len;
        this.b = width;
    }

    public double area()
    {
        return this.a * this.b;
    }
}
