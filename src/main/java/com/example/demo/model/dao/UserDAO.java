package com.example.demo.model.dao;

import java.util.ArrayList;

import com.example.demo.model.entity.UsersEntity;

public class UserDAO {

    ArrayList<UsersEntity> usersList = new ArrayList<>();

    public void addUser(UsersEntity user) {
        usersList.add(user);
    }

    public ArrayList<UsersEntity> getUsers() {
        return usersList;
    }

    // Método para filtrar usuarios por dirección
    public ArrayList<UsersEntity> getUsersByDirection(String direction) {
        ArrayList<UsersEntity> userByDirection = new ArrayList<>();

        for (UsersEntity user : usersList) {
            // Compara la dirección del usuario con la dirección proporcionada (ignorando mayúsculas/minúsculas)
            if (user.getDirection().equalsIgnoreCase(direction)) {
                userByDirection.add(user); // Agrega el usuario a la lista filtrada
            }
        }
        return userByDirection;
    }
}
