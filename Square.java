public class Square extends Shape {

    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void calculate() {
        int area = height * width; // Calculate the area of the square
        System.out.println("The area of the square is: " + area);
    }

    public static void main(String[] args) {
        Square s1 = new Square(23, 56);
        s1.display();
        s1.calculate();
    }
}