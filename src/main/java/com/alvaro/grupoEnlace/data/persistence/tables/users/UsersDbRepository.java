package com.alvaro.grupoEnlace.data.persistence.tables.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by armandosanchezmedina on 25/06/2017.
 */
@Repository
public interface UsersDbRepository extends CrudRepository<UsersGrupoEnlace,UsersGrupoEnlace.UsersPrimaryKey> {
    UsersGrupoEnlace findById(int id);
}
