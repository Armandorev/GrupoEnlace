package com.alvaro.grupoEnlace.data.persistence.tables.taskUsers;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by armandosanchezmedina on 05/07/2017.
 */
@Entity
@Table(name = "TASKS_USUARIOS")
@IdClass(TasksUsers.TasksUsersPrimaryKey.class)
public class TasksUsers {

    @Id
    @Column(name="ID_TAREA", columnDefinition = "INTEGER")
    private int idTarea;

    @Id
    @Column(name="ID_USUARIO", columnDefinition = "INTEGER")
    private int idUsuario;

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public static class TasksUsersPrimaryKey implements Serializable {
        private int idTarea;
        private int idUsuario;

        protected TasksUsersPrimaryKey(){}

        public TasksUsersPrimaryKey(int idTarea,int idUsuario){

            this.idTarea = idTarea;
            this.idUsuario = idUsuario;

        }
    }
}
