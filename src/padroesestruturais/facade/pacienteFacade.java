package padroesestruturais.facade;

import padroesestruturais.facade.Financeiro;
import padroesestruturais.facade.Quarto;
import padroesestruturais.facade.Secretaria;

public class pacienteFacade {

    public static boolean verificarPendenciasFormatura(Paciente paciente) {
        if (Secretaria.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        if (Quarto.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        return true;

        public static boolean verificarPendenciasSaude(Paciente paciente) {
        }
    }
}
