interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Point implements Movable {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Circle implements Movable {

    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public void print() {
        System.out.println("Center: (" + center.x + ", " + center.y + "), radius=" + radius);
    }
}

public class Main {

    public static void main(String[] args) {

        Point p = new Point(2,3);
        Circle c = new Circle(new Point(5,5), 10);

        System.out.println("Initial positions:");

        p.print();
        c.print();

        p.moveUp();
        p.moveRight();

        c.moveLeft();
        c.moveDown();

        System.out.println("\nAfter movement:");

        p.print();
        c.print();
    }
}