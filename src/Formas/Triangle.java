package Formas;

public class Triangle extends Shape {

    public Triangle() {
        type = "Triangle";
    }

    @Override
    public void draw() {
        System.out.println("Dentro do metodo de desenhar do triangulo");
    }

}
