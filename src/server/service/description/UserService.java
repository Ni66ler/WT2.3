package server.service.description;

import server.entity.User;
import server.exceptions.ServiceException;

import java.util.Optional;

public interface UserService {

    Optional<User> login(String login, String password) throws ServiceException;


}
