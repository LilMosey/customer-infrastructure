package com.mosey.ddd.customer.infrastructure.repository.impl;

import com.mosey.ddd.customer.domain.sdk.entity.CustomerEntity;
import com.mosey.ddd.customer.domain.sdk.repository.CustomerRepository;
import com.mosey.ddd.customer.infrastructure.repository.dao.CustomerDAO;
import com.mosey.ddd.customer.infrastructure.repository.dataobject.CustomerDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    /**
     * 按照ddd的概念一个仓储可以对应多个dao实现，
     * ddd中的仓储针对聚合的，一个聚合包含一个聚合根实体还有若干个非聚合根实体
     * 而一个实体对应一个dao实现
     * 一个仓储的聚合根原则上保证事务的一致性
     */

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public CustomerEntity findById(Long id) {
        CustomerDO customerDO = customerDAO.selectById(id);

        return customerDO.toEntity();
    }


}
