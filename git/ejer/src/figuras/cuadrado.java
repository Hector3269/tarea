package figuras;

public class cuadrado extends FiguraGeometrica {

    public cuadrado(double valor1) {
        super(valor1);
    }

    @Override
    public double getArea() {
        double lado = super.getValor1();
        return Math.pow(lado, 2);
    }

}
