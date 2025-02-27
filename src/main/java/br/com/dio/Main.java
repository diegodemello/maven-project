package br.com.dio;

import br.com.dio.dto.UserDTO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setName("Diego");
        userDTO.setBirthday(LocalDate.now().minusYears(20));
    }
}
