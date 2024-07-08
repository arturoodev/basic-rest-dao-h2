package com.arturocode.basicrest.service.interfaces;

import com.arturocode.basicrest.presentation.dto.UserDTO;


import java.util.List;
import java.util.Optional;

public interface IUserService {
    //Define los metodos que va a utilizar el servicio

    List<UserDTO> findAll();

    UserDTO findById(Long id);

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(UserDTO userDTO, Long id);

    String deleteUser(Long id);
}
