package padroesestruturais.facade;

public class Paciente {

    public boolean alta() {
        return pacienteFacade.verificarPendenciasSaude(this);
    }
}