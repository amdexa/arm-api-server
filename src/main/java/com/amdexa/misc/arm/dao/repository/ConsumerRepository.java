package com.amdexa.misc.arm.dao.repository;

import com.amdexa.misc.arm.dao.model.Consumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository  extends CrudRepository<Consumer, Long> {
}
