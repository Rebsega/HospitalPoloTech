package sala.tipoSalaEnum;

public enum TipoSalaEnum {
    ESPERA("Espera"),
    CONSULTA("Consulta"),
    EXAME("Exame"),
    CIRURGIA("Cirurgia");

    private final String descricao;

    TipoSalaEnum(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
