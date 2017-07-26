package com.alvaro.grupoEnlace.data.persistence.tables.taskUsers;

import com.alvaro.grupoEnlace.data.persistence.tables.tasks.TasksGrupoEnlace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by armandosanchezmedina on 05/07/2017.
 */

@Repository
public interface TasksUsersDbRepository extends CrudRepository<TasksUsers,TasksUsers.TasksUsersPrimaryKey> {
    List<TasksUsers> findAllByIdUsuario(int idUsuario);
}