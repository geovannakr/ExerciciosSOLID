public class Square {
    protected Size size;

    public Square(int side) {
        this.size = new Size(side, side);
    }

    public void setSide(int side) {
        this.size.altura = side;
        this.size.largura = side;
    }

    public int area() {
        return size.getLargura() * size.getAltura();
    }
}