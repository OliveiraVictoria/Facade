package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Paciente> pacientesComPendencia = new ArrayList<Paciente>();

    public void addpacinetesPendente(Paciente paciente) {
        this.pacientesComPendencia.add(paciente);
    }

    public boolean verificarPacienteComPendencia(Paciente paciente) {
        return this.pacientesComPendencia.contains(paciente);
    }

}

