package pessoa.funcionario.atendente;

import pessoa.funcionario.Funcionario;
import pessoa.paciente.Paciente;
import pessoa.tipoPessoaEnum.TipoPessoaEnum;

import java.util.List;

public final class Atendente extends Funcionario {

    public Atendente(){}

    public Atendente(String idFuncionario, String nome, Boolean isAdmin, TipoPessoaEnum tipoPessoaEnum){
        super(idFuncionario, nome, isAdmin, tipoPessoaEnum);
    }

    @Override
    public String diagnostico(List<String> sintomas, Paciente paciente) {
        return null;
    }
}
