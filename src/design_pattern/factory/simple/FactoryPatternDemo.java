package design_pattern.factory.simple;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        System.out.println("-----------------反射实现-------------------");

        Shape shape4 = (Shape) shapeFactory.getShapeObject(Rectangle.class);
        shape4.draw();

        Shape shape5 = (Shape) shapeFactory.getShapeObject(Circle.class);
        shape5.draw();

        Shape shape6 = (Shape) shapeFactory.getShapeObject(Square.class);
        shape6.draw();

        System.out.println("-----------------反射+泛型实现-------------------");

        Shape shape7 = shapeFactory.getShape(Rectangle.class);
        shape7.draw();

        Shape shape8 = shapeFactory.getShape(Circle.class);
        shape8.draw();

        Shape shape9 = shapeFactory.getShape(Square.class);
        shape9.draw();
    }
}
