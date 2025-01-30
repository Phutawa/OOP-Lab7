public  class TTriangle extends GeometricObject {
    private double side1 ,side2 ,side3;

    public TTriangle(){
        super("white" ,false);
        
    }
    public TTriangle(double side1 ,double side2 ,double side3 ,String color ,boolean filled){
        super(color ,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double GetSide1(){
        return side1;
    }
    public double GetSide2(){
        return side2;
    }
    public double GetSide3(){
        return side3;
    }
    @Override
    public double getArea(){
        double perimeter = getPerimeter() / 2.0 ;
        return Math.sqrt( perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3 ;
    }
    
}
