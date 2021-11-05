/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.Timer;
import modelo.CorModelo;

/**
 *
 * @author familia
 */
public class BotaoControle {

    private final JButton botao;
    private final CorModelo cor;
    private int tempo;
    private Timer tempo2;
    private Timer tempo3;

    public BotaoControle(JButton botao, CorModelo cor, int tempo) {
        this.botao = botao;
        this.cor = cor;
        this.tempo = tempo;

    }

    private void clarearBotao() {
        switch (this.cor) {
            case VERDE:
                botao.setBackground(new Color(0, 255, 0));
                break;
            case VERMELHO:
                botao.setBackground(new Color(255, 0, 0));
                break;
            case AZUL:
                botao.setBackground(new Color(0, 0, 255));
                break;
            case AMARELO:
                botao.setBackground(new Color(255, 255, 0));
                break;
        }
    }

    private void escurecerBotao() {
        switch (this.cor) {
            case VERDE:
                botao.setBackground(new Color(0, 125, 0));
                break;
            case VERMELHO:
                botao.setBackground(new Color(125, 0, 0));
                break;
            case AZUL:
                botao.setBackground(new Color(0, 0, 125));
                break;
            case AMARELO:
                botao.setBackground(new Color(125, 125, 0));
                break;
        }
    }

    public void piscarBotao() {
        tempo3 = new Timer(this.tempo - 300, (ActionEvent e) -> {
            clarearBotao();
            tempo2 = new Timer(1000, (ActionEvent e2) -> {
                escurecerBotao();
            });
            tempo2.setRepeats(false);
            tempo2.start();
        });
        tempo3.setRepeats(false);
        tempo3.start();

    }
}
