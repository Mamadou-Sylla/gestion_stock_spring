package com.momo.gestiondestock.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="fournisseur")
public class Fournisseur extends AbstractEntity{

    @Column(name = "prenom")
    private String prenom;


    @Column(name = "nom")
    private String nom;


    @Embedded
    private Adresse adresse;


    @Column(name = "photo")
    private String photo;


    @Column(name = "email")
    private String email;


    @Column(name = "numTel")
    private String numTel;


    @OneToMany(mappedBy = "fournisseur")
    private List <CommandeFournisseur> commandeFournisseur;
}
