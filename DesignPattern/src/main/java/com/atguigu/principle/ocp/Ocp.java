package com.atguigu.principle.ocp;

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
    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //接收Shape对象，根据type 来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }

    }

    //绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    //绘制圆形
    public void drawCircle(Shape r) {
        System.out.println("圆形 ");
    }

    //绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println("三角形 ");
    }

}

//shape 类，基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    public Rectangle() {
        this.m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        this.m_type = 2;
    }
}

//新增三角形
class Triangle extends Shape {
    public Triangle() {
        this.m_type = 3;
    }
}
