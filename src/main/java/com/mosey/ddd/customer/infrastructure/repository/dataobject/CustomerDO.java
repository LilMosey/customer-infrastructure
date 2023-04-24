package com.mosey.ddd.customer.infrastructure.repository.dataobject;

import com.mosey.ddd.customer.domain.sdk.entity.CustomerEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author TangJie
 * @since 2023/4/19
 */
@Data
//@Table("tb_customer")
public class CustomerDO implements Serializable {
    private static final long serialVersionUID = 1472158960236247193L;

//    @Id
//    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

//    @Column(name = "gmt_create", nullable = false)
    private Date gmtCreate;

//    @Column(name = "gmt_modified", columnDefinition = "timestamp default current_timestamp", nullable = false)
    private Date gmtModified;

//    @Column(name = "creator_id")
    private String creatorId;

//    @Column(name = "updator_id")
    private String updatorId;

//    @Column(name = "name")
    private String name;

//    @Column(name = "phone")
    private String phone;

//    @Column(name = "black_list_reason")
    private String blackListReason;

//    @Column(name = "black_list")
    private Boolean blackList;

    /**
     * 可以使用mapstruct等框架去转。
     * @return
     */
    public CustomerEntity toEntity(){
        return new CustomerEntity(id,name,phone,blackList,blackListReason);
    }
}
