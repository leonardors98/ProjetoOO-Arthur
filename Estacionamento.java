package AtividadeOO_Arthur;

public class Estacionamento {

    private int quantidadeVagas;
    private int quantidadeVagasLivres;
    private boolean EstacionamentoCheio;

    public Estacionamento(int quantidadeVagas) {
        setVagasLivres(quantidadeVagas);
        setQuantidadeVagas(quantidadeVagas);
    }

    public Estacionamento() {
    }

    public void saiuCarro() {
        if (quantidadeVagas != quantidadeVagasLivres)
            this.quantidadeVagasLivres++;
        if (quantidadeVagasLivres > 0)
            EstacionamentoCheio = false;
    }

    public void entrouCarro() {
        this.quantidadeVagasLivres--;
        if (quantidadeVagasLivres == 0)
            EstacionamentoCheio = true;
    }

    public void setVagasLivres(int quantidadeVagasLivres) {
        this.quantidadeVagasLivres = quantidadeVagasLivres;
    }

    public int getVagasLivres() {
        return this.quantidadeVagasLivres;
    }

    public void setQuantidadeVagas(int quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }

    public int getQuantidadeVagas() {
        return this.quantidadeVagas;
    }

    public boolean getEstacionamentoCheio() {
        return this.EstacionamentoCheio;
    }

    public void Fechar() {

    }
}
