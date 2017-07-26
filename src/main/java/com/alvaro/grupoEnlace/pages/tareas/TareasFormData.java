package com.alvaro.grupoEnlace.pages.tareas;

import com.alvaro.grupoEnlace.data.persistence.tables.tasks.TasksGrupoEnlace;
import com.alvaro.grupoEnlace.entities.Tarea;
import com.alvaro.grupoEnlace.entities.User;

import java.util.List;

/**
 * Created by armandosanchezmedina on 02/07/2017.
 */
public class TareasFormData {
    List<TasksGrupoEnlace> tareas;
    User user;

    public User getUsuario() {
        return user;
    }

    public void setUsuario(User user) {
        this.user = user;
    }

    public List<TasksGrupoEnlace> getTareas() {
        return tareas;
    }

    public void setTareas(List<TasksGrupoEnlace> tareas) {
        this.tareas = tareas;
    }
}
