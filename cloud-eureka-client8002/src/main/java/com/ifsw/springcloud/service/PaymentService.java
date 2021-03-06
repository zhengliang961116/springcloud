package com.ifsw.springcloud.service;
import com.ifsw.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhengLiang
 * @description
 * @date 2020/12/9 23:34
 */


public interface PaymentService {
    /**
     * 保存
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    Payment getById(@Param("id") Long id);
}
