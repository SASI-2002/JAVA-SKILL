
class cube {
    public static void main(String[] args) {
        Box dibba = new Box(10, 12, 9);
        System.out.println(dibba.Volume());
    }
}
class Box{
    double width,height,depth;

    public Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    public double Volume(){
        return width*height*depth;
    }
}
