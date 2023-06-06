package edu.neu.csye6200.repository;

import edu.neu.csye6200.model.TeacherClass;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherRepository extends AbsolutePersonRepository<TeacherClass> {
}
