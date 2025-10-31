package school.sptech;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Imagem {
    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public void adicionar(Figura figura){
    figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma =0.0;
        for(Figura i : figuras){
            soma += i.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> areaMaior = new ArrayList<>();
        for (Figura i : figuras){
            if(i.calcularArea() > 20){
                areaMaior.add(i);
            }
        }
        return areaMaior;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrado = new ArrayList<>();
        for (Figura i : figuras){
            if(i instanceof Quadrado){
                quadrado.add(i);
            }
        }
        return quadrado;
    }

}
