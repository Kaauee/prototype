package Formas;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Dentro do metodo de desenho do retangulo");
    }

}
