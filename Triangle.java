class Triangle {
    double side1, side2, side3;

    public void getSide() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    double getArea() {
        double area;
        double s = (side1 + side2 + side3) / 2;

        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    double getPeremeter() {
        return (side1 + side2 + side3);
    }

}

class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getSide();

        System.out.println("Area of the Triangle is: " + t.getArea());

        System.out.println("Perimeter of the Triangle is: " + t.getPeremeter());
    }
}
