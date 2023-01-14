package com.exo.correction.exercice.data;

import com.exo.correction.exercice.UserDto;
import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Abderrahmane
 */

public class UserRepository {

    public List<UserDto> getUsers() {
        List<UserDto> userDtoList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            UserDto userDto = new UserDto();
            userDto.setId(i);
            userDto.setNom("Nom " + i);
            userDto.setTel("22 56 47 8 " + i);
            userDto.setEmail("email" + i + "@gmail.com");
            userDto.setNom("dfdfd5586 " + i);
            userDtoList.add(userDto);
        }

        return userDtoList;
    }

    public UserDto getUserById(int id) {
        Optional<UserDto> userOpt = getUsers().stream()
                .filter(u -> u.getId().intValue() == id)
                .findFirst();
        if (userOpt.isPresent()) {
            return userOpt.get();
        } else {
            return null;
        }
    }


    public List<UserDto> add(UserDto userDto) {
        List<UserDto> userDtoList = getUsers();
        Integer lastId = userDtoList.get(userDtoList.size() - 1).getId() + 1;
        userDto.setId(lastId);
        userDtoList.add(userDto);
        return userDtoList;
    }

    public List<UserDto> update(UserDto userDto, int id) {
        UserDto ancUser = getUserById(id);
        List<UserDto> userDtoList = getUsers();
        if (ancUser != null) {
            Integer index = null;
            for (int i = 0; i < userDtoList.size(); i++) {
                if (userDtoList.get(i).getId().equals(ancUser.getId())) {
                    index = i;
                }
            }

            ancUser.setNom(userDto.getNom());
            ancUser.setTel(userDto.getTel());
            ancUser.setEmail(userDto.getEmail());
            ancUser.setPassword(userDto.getPassword());
            if (index != null)
                userDtoList.set(index, ancUser);
        }

        return userDtoList;
    }
}
