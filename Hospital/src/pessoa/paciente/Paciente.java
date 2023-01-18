package pessoa.paciente;

import pessoa.Pessoa;
import pessoa.tipoPessoaEnum.TipoPessoaEnum;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {

    private List<String> sintomas;

    public Paciente(){}


    public Paciente(String idPaciente, String nome, TipoPessoaEnum tipoPessoaEnum){
        super(idPaciente, nome, tipoPessoaEnum);
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }
}
