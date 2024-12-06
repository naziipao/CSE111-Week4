public class Triangle {
    public int a;
    public int b;
    public int c;
    public int perimeter;

    public void updateSides(int one, int two, int three) {
        a = one;
        b = two;
        c = three;
    }

    public void triangleDetails() {
        System.out.println("Three sides of the triangle are: " + a + ", " + b + ", " + c);
        perimeter = a + b + c;
        System.out.println("Perimeter: " + perimeter);
    }

    public String printTriangleType() {
        if (a == b && b == c) {
            return "This is an Equilateral Triangle.";
        } else if (a != b && b != c && c != a) {
            return "This is a Scalene Triangle.";
        } else {
            return "This is a Isosceles Triangle.";
        }
    }

    public void compareTrinagles(Triangle obj) {
        if (this != obj) {
            if (perimeter == obj.perimeter) {
                System.out.println("Only the perimeter of both triangles is equal.");
            } else if (this.a == obj.a && this.b == obj.b && this.c == obj.c) {
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            } else {
                System.out.println("Addresses, length of the sides and perimeter all are different.");
            }
        } else {
            System.out.println("These two triangle objects have the same address.");
        }
    }
}
