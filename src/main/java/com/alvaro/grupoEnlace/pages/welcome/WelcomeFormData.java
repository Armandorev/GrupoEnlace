package com.alvaro.grupoEnlace.pages.welcome;

import com.alvaro.grupoEnlace.entities.User;

import java.util.List;

/**
 * Created by armandosanchezmedina on 25/06/2017.
 */
public class WelcomeFormData {

    List<User> users;
    int selectedUserId;

    public List<User> getUsers() {
        return users;
    }

    public int getSelectedUserId() {
        return selectedUserId;
    }

    public void setSelectedUserId(int selectedUserId) {
        this.selectedUserId = selectedUserId;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
