package server.service.impl;


import server.dao.DaoFactory;
import server.dao.description.UserDao;
import server.entity.User;
import server.exceptions.DaoException;
import server.exceptions.ServiceException;
import server.service.description.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Override
    public Optional<User> login(String login, String password) throws ServiceException {
        if (login == null || password == null) {
            return Optional.empty();
        }
        try {
            UserDao userDao = DaoFactory.getInstance().getUserDao();
            return userDao.findByLoginAndPassword(login, password);
        } catch (DaoException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

}
