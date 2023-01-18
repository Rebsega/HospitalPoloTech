package pessoa.funcionario.medico;

import pessoa.funcionario.Funcionario;
import pessoa.paciente.Paciente;
import pessoa.tipoPessoaEnum.TipoPessoaEnum;

import java.util.List;

public class Cirurgiao extends Funcionario {
    private String especialidade;

    public Cirurgiao(String idFuncionario, String nome, Boolean isAdmin, TipoPessoaEnum tipoPessoaEnum, String especialidade){
        super(idFuncionario, nome, isAdmin, tipoPessoaEnum);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String diagnostico(List<String> sintomas, Paciente paciente) {
        return "Cirurgião não faz diagnóstico";
    }
}
