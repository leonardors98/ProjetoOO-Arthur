package AtividadeOO_Arthur;

import javax.swing.JOptionPane;

public class Mercado {

    private boolean PossuiEstacionamento;
    private Estacionamento estacionamento = new Estacionamento();

    public Mercado() {
    }

    public void iniciar() {
        int reply = JOptionPane.showConfirmDialog(null, "Este estabelecimento possui estacionamento?", "Configurações",
                JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            this.PossuiEstacionamento = true;
            if (PossuiEstacionamento) {
                int quantidadeVagas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de vagas: "));

                this.estacionamento.setQuantidadeVagas(quantidadeVagas);
                this.estacionamento.setVagasLivres(quantidadeVagas);
            }
        } else {
            JOptionPane.showMessageDialog(null, "O mercado não possui estacionamento");
        }
    }

    public void saiuCarro() {
        // Estacionamento estacionamento = new Estacionamento();
        if(estacionamento.getQuantidadeVagas() != estacionamento.getVagasLivres())
            this.estacionamento.saiuCarro();
            else
            JOptionPane.showMessageDialog(null, "O estacionamento já esta vazio, não há carro para sair");
        
    }

    public void entrouCarro() {
        // Estacionamento estacionamento = new Estacionamento();
        if (!estacionamento.getEstacionamentoCheio()) {

            if (estacionamento.getQuantidadeVagas() != 0) {
                estacionamento.entrouCarro();
            }
        } else
            JOptionPane.showMessageDialog(null, "O estacionamento está cheio");

    }

    public void setPossuiEstacionamento(boolean PossuiEstacionamento) {
        this.PossuiEstacionamento = PossuiEstacionamento;
    }

    public boolean getPossuiEstacionamento() {
        return this.PossuiEstacionamento;
    }

    public int getQuantidadeVagas() {
        return estacionamento.getQuantidadeVagas();
    }

    public int getVagasLivres() {
        return estacionamento.getVagasLivres();
    }

}
