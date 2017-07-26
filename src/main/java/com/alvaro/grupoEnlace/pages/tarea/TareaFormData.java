package com.alvaro.grupoEnlace.pages.tarea;

import com.alvaro.grupoEnlace.data.persistence.tables.tasks.TasksGrupoEnlace;

/**
 * Created by armandosanchezmedina on 25/07/2017.
 */
public class TareaFormData {
    public TasksGrupoEnlace getTarea() {
        return tarea;
    }

    public void setTarea(TasksGrupoEnlace tarea) {
        this.tarea = tarea;
    }

    TasksGrupoEnlace tarea;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    int userId;

}
