package com.alvaro.grupoEnlace.data.persistence.tables.users;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by armandosanchezmedina on 25/06/2017.
 */
@Entity
@Table(name = "USERS_GRUPO_ENLACE")
@IdClass(UsersGrupoEnlace.UsersPrimaryKey.class)
public class UsersGrupoEnlace {

    @Id
    @Column(name="ID", columnDefinition = "INTEGER")
    private int id;

    @Column(name="TYPE", columnDefinition = "VARCHAR(2)")
    private String type;

    @Column(name="NAME", columnDefinition = "VARCHAR(30)")
    private String name;

    @Column(name="EMAIL", columnDefinition = "VARCHAR(100)")
    private String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class UsersPrimaryKey implements Serializable {
        private int id;

        protected UsersPrimaryKey(){}

        public UsersPrimaryKey(int id){
            this.id = id;
        }
    }
}

