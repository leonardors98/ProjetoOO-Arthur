package AtividadeOO_Arthur;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Mercado mercado = new Mercado();
        mercado.iniciar();
        int VagasMax = mercado.getQuantidadeVagas();
        int VagasLivres; 
        boolean sair = false;
        if(mercado.getPossuiEstacionamento())
        do {
            VagasLivres = mercado.getVagasLivres();
            String mensagem = "Dados atuais: " + VagasLivres + " vagas livres de " + VagasMax + " vagas totais";
            Object[] options = { "Entrou um carro", "Saiu um carro" };
            int n = JOptionPane.showOptionDialog(null, mensagem, "Sensor de entrada e saida",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (n == JOptionPane.YES_OPTION) {
                mercado.entrouCarro();
            } else if (n == JOptionPane.NO_OPTION)
                mercado.saiuCarro();
            else
                sair = true;
        } while (sair != true);
    }

}