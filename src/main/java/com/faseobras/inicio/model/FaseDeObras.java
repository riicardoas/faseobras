package com.faseobras.inicio.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Getter
@Setter
public class FaseDeObras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDaFase;

    @ManyToMany(mappedBy = "FaseDeObras")
    private List<Equipamentos> equipamentos = new ArrayList<>();

    public FaseDeObras() {
    }

    public FaseDeObras(Integer id, String nomeDaFase) {
        this.id = id;
        this.nomeDaFase = nomeDaFase;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FaseDeObras other = (FaseDeObras) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}