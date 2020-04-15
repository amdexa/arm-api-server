package com.amdexa.misc.arm.dao.repository;

import com.amdexa.misc.arm.dao.model.Consumer;
import com.amdexa.misc.arm.dao.model.ConsumerAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerAccountRepository extends CrudRepository<ConsumerAccount, Long> {

    List<ConsumerAccount>  findByConsumer(Consumer id);
}
