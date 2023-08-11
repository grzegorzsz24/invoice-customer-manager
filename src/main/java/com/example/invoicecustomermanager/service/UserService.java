package com.example.invoicecustomermanager.service;

import com.example.invoicecustomermanager.dto.UserDTO;
import com.example.invoicecustomermanager.model.User;

public interface UserService {
    UserDTO createUser(User user);
}
