package sala;

import sala.tipoSalaEnum.TipoSalaEnum;

public class Sala {

    private String id;
    private TipoSalaEnum tipoSala;
    private Boolean ocupada;

    public Sala(){}

    public Sala(String id, TipoSalaEnum tipoSala, Boolean ocupada){
        this.id = id;
        this.tipoSala = tipoSala;
        this.ocupada = ocupada;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }

    public TipoSalaEnum getTipoSala() {
        return this.tipoSala;
    }

    public void setTipoSala(TipoSalaEnum tipoSala) {
        this.tipoSala = tipoSala;
    }
}
