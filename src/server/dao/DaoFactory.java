package server.dao;

import server.dao.description.StudentInfoDao;
import server.dao.description.UserDao;
import server.dao.impl.StudentInfoDaoImpl;
import server.dao.impl.UserDaoImpl;

public class DaoFactory {
    private final UserDao userDao = new UserDaoImpl();
    private final StudentInfoDao studentInfoDao=new StudentInfoDaoImpl();

    public UserDao getUserDao() {
        return userDao;
    }

    public StudentInfoDao getStudentInfoDao() {
        return studentInfoDao;
    }

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        static final DaoFactory INSTANCE = new DaoFactory();
    }
}
