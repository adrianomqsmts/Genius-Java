package controle;

import java.util.ArrayList;
import java.util.Random;
import modelo.CorModelo;

public class CorControle {

    private final ArrayList<CorModelo> sequenciaCor;

    public CorControle() {
        this.sequenciaCor = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GeniusModelo{" + "sequenciaCor=" + sequenciaCor + '}';
    }

    public ArrayList<CorModelo> getSequenciaDeCores() {
        return sequenciaCor;
    }

    public CorModelo getCor(int index) {
        return sequenciaCor.get(index);
    }

    public void setCor(CorModelo cor) {
        this.sequenciaCor.add(cor);
    }

    public CorModelo getRandomCor() {
        Random rand = new Random();
        int a = rand.nextInt(5);
        switch (a) {
            case 0:
                return CorModelo.VERDE;
            case 1:
                return CorModelo.VERMELHO;
            case 2:
                return CorModelo.AZUL;
            default:
                return CorModelo.AMARELO;
        }
    }

}
