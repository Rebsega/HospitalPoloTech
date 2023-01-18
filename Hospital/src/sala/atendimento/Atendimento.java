package sala.atendimento;

import pessoa.Pessoa;
import pessoa.funcionario.Funcionario;
import pessoa.funcionario.atendente.Atendente;
import pessoa.paciente.Paciente;
import sala.Sala;

public final class Atendimento {

    private Pessoa paciente;
    private Atendente atendente;
    private Funcionario funcionario;
    private Sala sala;

    public Atendimento(){}

    public Atendimento(Pessoa paciente, Funcionario funcionario, Sala sala) {
        this.paciente = paciente;
        this.funcionario = funcionario;
        this.sala = sala;
    }

    public final Atendimento reservarSala(Sala sala, Funcionario funcionario, Paciente paciente){
        Atendimento atendimento = new Atendimento();
        atendimento.setSala(sala);
        atendimento.getSala().setOcupada(true);
        atendimento.setProfissional(funcionario);
        atendimento.setPaciente(paciente);
        return atendimento;
    }

    public void iniciarAtendimento(Atendente atendente, Paciente paciente, Funcionario funcionario, Sala sala){
        Atendimento atendimento = new Atendimento();
        atendimento.setAtendente(atendente);
        reservarSala(sala, funcionario, paciente);
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Pessoa getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Pessoa paciente) {
        this.paciente = paciente;
    }

    public Pessoa getProfissional() {
        return this.funcionario;
    }

    public void setProfissional(Funcionario profissional) {
        this.funcionario = profissional;
    }

    public Sala getSala() {
        return this.sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
