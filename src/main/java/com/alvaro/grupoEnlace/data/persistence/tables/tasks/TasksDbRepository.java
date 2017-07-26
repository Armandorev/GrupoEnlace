package com.alvaro.grupoEnlace.data.persistence.tables.tasks;

import com.alvaro.grupoEnlace.data.persistence.tables.users.UsersGrupoEnlace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by armandosanchezmedina on 05/07/2017.
 */

@Repository
public interface TasksDbRepository extends CrudRepository<TasksGrupoEnlace,TasksGrupoEnlace.TasksPrimaryKey> {
    TasksGrupoEnlace findById(int id);
}