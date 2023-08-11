package com.example.invoicecustomermanager.service.implementation;

import com.example.invoicecustomermanager.dto.UserDTO;
import com.example.invoicecustomermanager.dtomapper.UserDTOMapper;
import com.example.invoicecustomermanager.model.User;
import com.example.invoicecustomermanager.repository.UserRepository;
import com.example.invoicecustomermanager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository<User> userRepository;
    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(userRepository.create(user));
    }
}
