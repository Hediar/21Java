package ch08_02;
import java.util.Scanner;

abstract class Shape{
    double area = 0.0;
    public void cal(){}
    public void result(){}
}
/*
변수: 가로, 세로, 넓이
기능: 넓이 계산, 출력, toString
*/
class Rectangle extends Shape{
    private double width;
    private double height;
    //double area;

    public void setWidth(double w){ width = w;}
    public double getWidth(){ return width;}
    public void setHeight(double h){ height = h;}
    public double getHeight(){ return height;}

    //@override
    public void cal(){
        area = width * height;
    }
    //@override
    public void result(){
        System.out.println("Rectangle의 값은 "+toString());
    }
    public String toString(){
        return " " + area;
    }

}

class Triangle extends Shape{
    private double width;
    private double height;
    //double area;
    public void setWidth(double w){ width = w;}
    public double getWidth(){ return width;}
    public void setHeight(double h){ height = h;}
    public double getHeight(){ return height;}
    public void cal(){
        area = width * height / 2;
    }
    public String toString(){
        return " " + area;
    }
    public void result(){
        System.out.println("Triangle의 값은 "+toString());
    }
}

class Circle extends Shape {
    private double radian;
    //double area;

    public void setRadian(double r) {
        radian = r;
    }
    public double getRadian() {
        return radian;
    }
    public void cal() {
        area = radian * radian;
    }
    public String toString() {
        return " " + area + "π";
    }
    public void result(){
        System.out.println("Circle의 값은 " + toString() + "(" + area * 3.14 + ")");
    }
}


public class FigureArea {
    public static void main(String[] args) {
        //선언
        Scanner scan = new Scanner(System.in);  //받는거
        Rectangle rec = new Rectangle();    //가로, 세로, 넓이 + 넓이 계산, 출력
        Triangle tri = new Triangle();  // ==직사각형, 넓이 계산만 다름
        Circle cir = new Circle();      // ==원형

        //출력 + 값 받는 기능
        System.out.println("2021250005_이세령");
        System.out.print("Rectangle의 width와 height를 입력 : ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        rec.setWidth(a);
        rec.setHeight(b);
        System.out.print("Triangle의 width와 height를 입력: ");
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        tri.setWidth(c);
        tri.setHeight(d);
        System.out.print("Circle의 radian를 입력 : ");
        double e = scan.nextDouble();
        cir.setRadian(e);

        //실제 계산
        rec.cal();
        tri.cal();
        cir.cal();

        //최종 출력
        rec.result();
        tri.result();
        cir.result();
    }
}
