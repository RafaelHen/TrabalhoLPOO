package trabLPII;

public class Produto {
    private int cod;
    private String nome;
    private double valor;
    private int qtd;
    private int codR;

    public Produto(int cod, String nome, double valor, int qtd, int codR) {
        this.cod = cod;
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
        this.codR = codR;
    }

    public int getCodR() {
        return codR;
    }

    public void setCodR(int codR) {
        this.codR = codR;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return this.cod+"\t"+this.nome+"\t"+this.valor+"\t"+this.qtd+"\t"+this.codR+"\n";
    }
}
