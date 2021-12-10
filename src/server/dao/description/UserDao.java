package server.dao.description;


import server.entity.User;
import server.exceptions.DaoException;

import java.util.Optional;

public interface UserDao {

    Optional<User> findByLoginAndPassword(String login, String password) throws DaoException;



}
