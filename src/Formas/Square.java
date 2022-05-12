package Formas;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Dentro do metodo de desenhar do quadrado");
    }

}
