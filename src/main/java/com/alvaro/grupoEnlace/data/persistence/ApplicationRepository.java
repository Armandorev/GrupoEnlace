package com.alvaro.grupoEnlace.data.persistence;

import com.alvaro.grupoEnlace.data.persistence.tables.taskUsers.TasksUsers;
import com.alvaro.grupoEnlace.data.persistence.tables.taskUsers.TasksUsersDbRepository;
import com.alvaro.grupoEnlace.data.persistence.tables.tasks.TasksDbRepository;
import com.alvaro.grupoEnlace.data.persistence.tables.tasks.TasksGrupoEnlace;
import com.alvaro.grupoEnlace.data.persistence.tables.users.UsersGrupoEnlace;
import com.alvaro.grupoEnlace.entities.Tarea;
import com.alvaro.grupoEnlace.entities.User;
import com.alvaro.grupoEnlace.data.persistence.tables.users.UsersDbRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by armandosanchezmedina on 25/06/2017.
 */
@Repository
public class ApplicationRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationRepository.class);

    @Autowired
    private UsersDbRepository usersDbReposiory;

    @Autowired
    private TasksDbRepository tasksDbRepository;

    @Autowired
    private TasksUsersDbRepository tasksUsersDbRepository;

    public User getUsersById(int id) {
        UsersGrupoEnlace userById = this.usersDbReposiory.findById(id);
        User user = new User(id);
        user.setName(userById.getName());
        user.setEmail(userById.getEmail());
        user.setType(userById.getType());

        return user;
    }

    public List<User> getAllUsers() {
        Iterable<UsersGrupoEnlace> allUsers = this.usersDbReposiory.findAll();
        List<User> usersToReturn = new ArrayList<>();
        for (UsersGrupoEnlace item : allUsers) {
            User user = new User(item.getId());
            user.setName(item.getName());
            user.setEmail(item.getEmail());
            user.setType(item.getType());
            usersToReturn.add(user);
        }
        return usersToReturn;
    }

    public List<TasksGrupoEnlace> getTareasByUserId(int id) {
        List<TasksUsers> listaTareas = this.tasksUsersDbRepository.findAllByIdUsuario(id);
        List<Integer> listaIds = new ArrayList<>();
        listaTareas.forEach( (tasksUsers) -> listaIds.add(tasksUsers.getIdTarea()) );
        List<TasksGrupoEnlace> tareasDetalle = new ArrayList<>();
        listaIds.forEach( (idTarea) -> tareasDetalle.add(this.tasksDbRepository.findById(idTarea)) );
        return tareasDetalle;
    }

    public TasksGrupoEnlace getTareaById(int id) {
        return this.tasksDbRepository.findById(id);
    }
}
