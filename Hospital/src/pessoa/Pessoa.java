package pessoa;

import pessoa.tipoPessoaEnum.TipoPessoaEnum;

public abstract class Pessoa {

    private String id;
    private String nome;
    private TipoPessoaEnum tipoPessoa;

    public Pessoa(){}

    public Pessoa(String id, String nome, TipoPessoaEnum tipoPessoa){
        this.id = id;
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoaEnum getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
