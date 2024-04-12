public abstract class Shape {
    public int width;
    public int height;

    public Shape(){

    }
    public Shape(int height,int width){
        this.height=height;
        this.width=width;

    }
    public abstract void calculate();

    public void display(){
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
    }

}
