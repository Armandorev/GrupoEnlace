package com.alvaro.grupoEnlace.data.persistence.tables.tasks;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by armandosanchezmedina on 05/07/2017.
 */
@Entity
@Table(name = "TASKS_GRUPO_ENLACE")
@IdClass(TasksGrupoEnlace.TasksPrimaryKey.class)
public class TasksGrupoEnlace {
    @Id
    @Column(name="ID", columnDefinition = "INTEGER")
    private int id;

    @Column(name="TYPE", columnDefinition = "VARCHAR(2)")
    private String type;

    @Column(name="CREATOR", columnDefinition = "INTEGER")
    private String creator;

    @Column(name="TITLE", columnDefinition = "VARCHAR(30)")
    private String title;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="DESCRIPTION", columnDefinition = "VARCHAR(1000)")
    private String description;

    public static class TasksPrimaryKey implements Serializable {
        private int id;

        protected TasksPrimaryKey(){}

        public TasksPrimaryKey(int id){
            this.id = id;
        }
    }
}
