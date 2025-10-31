package school.sptech;

import java.util.concurrent.RecursiveTask;

public class Retangulo extends Figura {
    private Double altura;
    private Double base;

    public Retangulo(Double altura, Double base) {
        super();
        this.altura = altura;
        this.base = base;
    }
    public Retangulo() {
    }


    @Override public Double calcularArea(){
        return base*altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }
}
