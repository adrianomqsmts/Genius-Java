package modelo;

public enum CorModelo {
    VERDE(0), VERMELHO(1), AZUL(2), AMARELO(3);

    private final int valor;

    private CorModelo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static CorModelo getVERDE() {
        return VERDE;
    }

    public static CorModelo getVERMELHO() {
        return VERMELHO;
    }

    public static CorModelo getAZUL() {
        return AZUL;
    }

    public static CorModelo getAMARELO() {
        return AMARELO;
    }


}
