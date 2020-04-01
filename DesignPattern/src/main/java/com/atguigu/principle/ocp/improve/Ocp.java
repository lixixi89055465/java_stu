package com.atguigu.principle.ocp.improve;

/**
 * @author lixiang
 * @date 2020-04-01-18:48
 * 方式一
 */
public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //接收Shape对象，根据type 来绘制不同的图形
    //接收shape 队形，调用draw方法 。
    public void drawShape(Shape s) {
        s.draw();
    }

}

//shape 类，基类
abstract class Shape {
    int m_type;

    abstract public void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("圆形");

    }
}

//新增三角形
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("三角形 ");
    }
}

//这是一个绘图的类
class OtherGraphic extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制其他图形 ");
    }
}
