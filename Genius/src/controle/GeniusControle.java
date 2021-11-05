package controle;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import modelo.CorModelo;
import modelo.GeniusModelo;

public class GeniusControle {

    private final GeniusModelo geniusModelo;
    private final CorControle corControle;
    private Timer tempo5Segundos;

    public GeniusControle() {
        corControle = new CorControle();
        geniusModelo = new GeniusModelo();
    }

    public void zerarIndex() {
        geniusModelo.setIndexVerificar(0);
    }

    public void recomecarRodada() {
        geniusModelo.setRodada(1);
        geniusModelo.setIndexVerificar(0);
    }

    public ArrayList<CorModelo> gerarListaCor() {
        for (int i = 0; i < 8; i++) {
            corControle.setCor(corControle.getRandomCor());
        }
        return corControle.getSequenciaDeCores();
    }

    public boolean verificarCor(CorModelo cor) {
        if (corControle.getCor(geniusModelo.getIndexVerificar()) == cor) {
            return true;
        }
        return false;
    }

    public int getRodada() {
        return geniusModelo.getRodada();
    }

    public void msgTempoExpeirado() {
        JOptionPane.showMessageDialog(null, "O TEMPO EXPIROU", "FIM DE JOGO", JOptionPane.ERROR_MESSAGE);
    }

    public void msgPressionarBotaoErrado() {
        JOptionPane.showMessageDialog(null, "ERROU A SEQUÊNCIA", "FIM DE JOGO", JOptionPane.ERROR_MESSAGE);
    }

    public void msgParabens() {
        JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ É GÉNIUS!!!", "FIM DE JOGO", JOptionPane.PLAIN_MESSAGE);

    }

    public int getIndex() {
        return geniusModelo.getIndexVerificar();
    }

    public void setRodada() {
        geniusModelo.rodada();
    }

    public void setIndex() {
        geniusModelo.index();
    }
}
