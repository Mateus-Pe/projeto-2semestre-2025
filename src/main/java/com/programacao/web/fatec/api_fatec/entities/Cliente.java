package com.programacao.web.fatec.api_fatec.entities;

public class Cliente {
    private long id;
    private String nome;

    public Cliente(){

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
