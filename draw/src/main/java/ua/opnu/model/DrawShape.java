package ua.opnu.model;

import java.awt.*;

public abstract class DrawShape {

    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2;

    protected Point startPoint;
    protected Point endPoint;

    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public static DrawShape newInstance(int shapeType) {
        switch (shapeType) {
            case SHAPE_RECTANGLE:
                return new Rectangle();
            case SHAPE_ROUNDED_RECT:
                return new RoundedRectangle();
            case SHAPE_ELLIPSE:
                return new Ellipse();
            default:
                return null;
        }
    }

    public Shape getShape() {
        return getShape(startPoint, endPoint);
    }

    // Абстрактный метод: теперь каждая фигура обязана его реализовать
    public abstract Shape getShape(Point startPoint, Point endPoint);

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}