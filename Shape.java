// Unnati Waghe

abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("Shape info");
    }
}

class Circle extends Shape {
    void calculate_area() {
        System.out.println(3.14 * 5 * 5);
    }
}

class Rectangle2 extends Shape {
    void calculate_area() {
        System.out.println(4 * 5);
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.calculate_area();
        s.display_info();
    }
}
