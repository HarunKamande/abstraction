
public class Rhombus extends Shape {
    public int diagonal1;
    public int diagonal2;

    public Rhombus(int diagonal1, int diagonal2) {
        super(diagonal1, diagonal2);
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
    }
    @Override
    public void display(){
        System.out.println("Diagonal1 "+ diagonal1);
        System.out.println("Diagonal2: "+ diagonal2);
    }
    @Override
    public void calculate() {
        double answer=diagonal1*diagonal2*0.5;
        System.out.println("Answer is "+ answer);

    }

    public static void main(String[] args) {
        Rhombus r1=new Rhombus(23,56);
        r1.display();
        r1.calculate();
    }
}
