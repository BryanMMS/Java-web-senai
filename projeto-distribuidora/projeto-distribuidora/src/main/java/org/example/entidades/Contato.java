package org.example.entidades;


import javax.persistence.*;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO")
    private Long idContato;



    @Column(name = "TELEFONE_CONTATO")
    private Long telefoneContato;

    public Contato(){

    }

    public Contato(Long idContato, String nomeContato, Long telefoneContato){
        this.idContato = idContato;

        this.telefoneContato = telefoneContato;
    }

    public Long getIdContato() {
        return idContato;
    }

    public void setIdContato(Long idContato) {
        this.idContato = idContato;
    }


    public Long getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(Long telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
