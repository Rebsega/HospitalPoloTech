package pessoa.funcionario;

import pessoa.Pessoa;
import pessoa.paciente.Paciente;
import pessoa.tipoPessoaEnum.TipoPessoaEnum;

import java.util.List;

public abstract class Funcionario extends Pessoa {
    private Boolean isAdmin; //para atendente manipular consultas e salas

    public Funcionario(){}

    public Funcionario(String idFuncionario, String nome, Boolean isAdmin, TipoPessoaEnum tipoPessoaEnum){
        super(idFuncionario, nome, tipoPessoaEnum);
        this.isAdmin = isAdmin;
    }

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public abstract String diagnostico(List<String> sintomas, Paciente paciente);
}
