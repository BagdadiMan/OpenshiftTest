package users.Services;

import users.Models.User;
import users.Repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public List<User> getAllAirport() {
        return usersRepository.findAll();
    }
}
