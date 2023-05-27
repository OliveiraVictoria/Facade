package padroesestruturais.facade;

public class Financeiro extends Setor {

    private static Financeiro finaceiro = new Financeiro();

    private Financeiro() {};

    public static Financeiro getInstancia() {
        return finaceiro;
    }

    public boolean verificarPacienteComPendencia(Paciente paciente) {
    }
}
