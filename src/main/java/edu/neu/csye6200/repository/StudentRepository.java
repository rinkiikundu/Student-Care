package edu.neu.csye6200.repository;

import edu.neu.csye6200.model.StudentClass;
import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends AbsolutePersonRepository<StudentClass> {
}
