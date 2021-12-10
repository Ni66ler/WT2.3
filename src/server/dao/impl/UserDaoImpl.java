package server.dao.impl;

import server.dao.description.UserDao;
import server.dao.parser.ParserFactory;
import server.entity.User;
import server.exceptions.DaoException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    @Override
    public Optional<User> findByLoginAndPassword(String login, String password) throws DaoException {
        try {
            return ParserFactory.getInstance().getUserParser().takeUser("src\\main\\resources\\Users.xml",login,password);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            throw new DaoException(e.getMessage(), e);
        }
    }

}
