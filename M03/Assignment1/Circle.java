

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;
  
    public Circle() {
    }
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    /** Return radius */
    public double getRadius() {
      return radius;
    }
  
    /** Set a new radius */
    public void setRadius(double radius) {
      this.radius = radius;
    }
  
    @Override /** Return area */
    public double getArea() {
      return radius * radius * Math.PI;
    }
  
    /** Return diameter */
    public double getDiameter() {
      return 2 * radius;
    }
  
    @Override /** Return perimeter */
    public double getPerimeter() {
      return 2 * radius * Math.PI;
    }
  
    /* Print the circle info */
    public void printCircle() {
      System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    }
  
    @Override /** Return a string representation of a Circle object */
    public String toString() {
      return super.toString() + " radius: " + radius;
    }

    public int compareTo(Circle o) {
        if (getRadius() > o.radius) {
            return 1;
        } else if (getRadius() < o.radius) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return getRadius() == other.radius;
        }
        return false;
    }

}