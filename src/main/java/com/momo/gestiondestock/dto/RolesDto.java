package com.momo.gestiondestock.dto;

import com.momo.gestiondestock.model.AbstractEntity;
import com.momo.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;



@Data
@Builder


public class RolesDto extends AbstractEntity {

    private Integer id;


    private String libelle;

    private UtilisateurDto utilisateur;

    public RolesDto fromEntity(Roles roles){
        if( roles == null ){
            return null;
        }
        return RolesDto.builder()
                .id(roles.getId())
                .libelle(roles.getLibelle())
                .utilisateur(UtilisateurDto.fromEntity(roles.getUtilisateur()))
                .build();
    }

    public Roles toEntity (Roles rolesDto){
        if(rolesDto == null){
            return null;
        }

        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setLibelle(roles.getLibelle());
        return roles;
    }

}
