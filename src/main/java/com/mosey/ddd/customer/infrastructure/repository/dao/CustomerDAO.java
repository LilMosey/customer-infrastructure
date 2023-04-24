package com.mosey.ddd.customer.infrastructure.repository.dao;

import com.mosey.ddd.customer.infrastructure.repository.dataobject.CustomerDO;
import org.springframework.stereotype.Repository;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Repository
public class CustomerDAO {

    // sql : select * from xxx where id = #{id};
    public CustomerDO selectById(Long id) {
        CustomerDO customerDO =  new CustomerDO();
        customerDO.setId(1L);
        customerDO.setName("Tom");
        customerDO.setPhone("13000001893");
        customerDO.setBlackList(false);
        return customerDO;
    }
}
