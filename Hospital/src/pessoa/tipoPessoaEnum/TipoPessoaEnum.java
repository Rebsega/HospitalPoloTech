package pessoa.tipoPessoaEnum;

public enum TipoPessoaEnum {

    /**
     * O correto seria somente paciente e funcionario, para seguir o padrão de pacotes de Pessoa,
     * mas para seguir a ideia do projeto, sem aumentar a complexidade, manteve-se o enum com médico e atendente, não funcionário
     */
    PACIENTE ("Paciente"),
    ATENDENTE ("Atendente"),
    MEDICO ("Médico");

    private final String descricao;

    TipoPessoaEnum(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
