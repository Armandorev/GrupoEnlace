package com.alvaro.grupoEnlace.data.persistence.persistors;

import com.alvaro.grupoEnlace.entities.User;
import com.alvaro.grupoEnlace.data.persistence.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by armandosanchezmedina on 25/06/2017.
 */
@Service
public class PersistenceService {

    private ApplicationRepository applicationRepository;

    @Autowired
    public PersistenceService(ApplicationRepository applicationRepository){
        this.applicationRepository = applicationRepository;
    }

    public User getUsersById(int id) {
        return applicationRepository.getUsersById(id);
    }
    public List<User> getAllUsers() {
        return applicationRepository.getAllUsers();
    }
}
