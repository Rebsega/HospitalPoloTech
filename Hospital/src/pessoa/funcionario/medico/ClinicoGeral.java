package pessoa.funcionario.medico;

import pessoa.funcionario.Funcionario;
import pessoa.paciente.Paciente;
import pessoa.tipoPessoaEnum.TipoPessoaEnum;

import java.util.List;

public class ClinicoGeral extends Funcionario {

    private String especialidade;

    public ClinicoGeral(){}

    public ClinicoGeral(String idFuncionario, String nome, Boolean isAdmin, TipoPessoaEnum tipoPessoaEnum, String especialidade){
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
        System.out.println("Dados os sintomas: " + sintomas + " do paciente: " + paciente.getNome() + " o diagnóstico é de Cansaço");
        return "Cansaço";
    }
}
