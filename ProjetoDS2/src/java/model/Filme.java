
package model;

import java.util.List;

public class Filme {
    private int duracao, faixaEtaria, id;
    private String trailer, genero, diretor, sinopse, titulo;
    private List<Elenco> elenco;

    public Filme(int duracao, int faixaEtaria, int id, String trailer, String genero, String diretor, String sinopse, String titulo, List<Elenco> elenco) {
        this.duracao = duracao;
        this.faixaEtaria = faixaEtaria;
        this.id = id;
        this.trailer = trailer;
        this.genero = genero;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.titulo = titulo;
        this.elenco = elenco;
    }

    public List<Elenco> getElenco() {
        return elenco;
    }

    public void setElenco(List<Elenco> elenco) {
        this.elenco = elenco;
    }

    

    

    public Filme() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
