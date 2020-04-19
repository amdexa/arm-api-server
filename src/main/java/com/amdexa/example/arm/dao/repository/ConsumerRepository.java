package com.amdexa.example.arm.dao.repository;

import com.amdexa.example.arm.dao.model.Consumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConsumerRepository  extends CrudRepository<Consumer, Long> {

    List<Consumer> findByFirstNameAndLastName(String firstName, String lastName);

    Optional<Consumer> findById(long id);
}
