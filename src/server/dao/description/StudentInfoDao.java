package server.dao.description;


import server.entity.StudentInfo;
import server.exceptions.DaoException;

import java.util.List;
import java.util.Optional;

public interface StudentInfoDao {

    List<StudentInfo> findAll() throws DaoException;

    Optional<StudentInfo> findByGradeBookNumber(String gradeBookNumber) throws DaoException;

    List<StudentInfo> findBySpeciality(String gradeBookNumber) throws DaoException;

    void updateStudentInfoByGradeBookNumber(String gradeBookNumber,StudentInfo studentInfo) throws DaoException;

    void saveStudentInfo(StudentInfo studentInfo) throws DaoException;

}
