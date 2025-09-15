public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Área do retângulo: " + rectangle.area());

        rectangle.setLargura(7);
        rectangle.setAltura(12);
        System.out.println("Nova área do retângulo: " + rectangle.area());

        Square square = new Square(4);
        System.out.println("Área do quadrado: " + square.area());

        square.setSide(6);
        System.out.println("Nova área do quadrado: " + square.area());
}
}