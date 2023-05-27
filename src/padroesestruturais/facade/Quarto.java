package padroesestruturais.facade;

public class Quarto extends Setor {

    private static Quarto quarto = new Quarto();

    private Quarto() {};

    public static Quarto getInstancia() {
        return quarto;
    }

    public boolean verificarPacienteComPendencia(Paciente paciente) {
        return false;
    }
}
