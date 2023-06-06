package edu.neu.csye6200.repository;

import edu.neu.csye6200.model.AbsolutePersonClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface AbsolutePersonRepository<T extends AbsolutePersonClass> extends CrudRepository<T, Integer> {
}
