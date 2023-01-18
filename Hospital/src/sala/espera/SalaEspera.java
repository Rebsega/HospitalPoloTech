package sala.espera;

import pessoa.paciente.Paciente;
import sala.Sala;
import sala.tipoSalaEnum.TipoSalaEnum;

import java.util.ArrayList;
import java.util.List;

public class SalaEspera extends Sala {

    private ArrayList<Paciente> pacienteList;

    public SalaEspera(){}

    public SalaEspera(String id, TipoSalaEnum tipoSala, Boolean ocupada){
        super(id, tipoSala, ocupada);
    }

    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(ArrayList<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    public final void acrescentaListaEspera(Paciente paciente) {
        this.pacienteList.add(paciente);
    }
}
