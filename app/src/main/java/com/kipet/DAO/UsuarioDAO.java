package com.kipet.DAO;

/**
 * Created by Bruno on 07/09/2016.
 */
public class UsuarioDAO extends _Default {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public UsuarioDAO(){
        super();
        this.id = -1;
        this.nome = "";
        this.email = "";
        this.senha = "";
    }

    public void inserir(){
        String comando = String.format("INSERT INTO usuario (nomeUsuario, emailUsuario, senhaUsuario) VALUES('%s','%s','%s');",
                this.getNome(),this.getEmail(),this.getSenha());
        DB db = new DB();
        db.execute(comando);
        this._mensagem = db._mensagem;
        this._status = db._status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
