package org.ztf5.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "familias")
public class Familia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_familias")
    public int id;

    @Column(name = "nombre")
    public String nombre;

    public Familia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Familia() {
    }

    public int getId() {
        return this.id;
    }

    // public void setId(int id) {
    // this.id = id;
    // }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}