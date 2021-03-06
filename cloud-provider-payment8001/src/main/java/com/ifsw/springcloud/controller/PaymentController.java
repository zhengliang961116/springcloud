package com.ifsw.springcloud.controller;

import com.ifsw.springcloud.base.Result;
import com.ifsw.springcloud.entity.Payment;
import com.ifsw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhengLiang
 * @description
 * @date 2020/12/9 23:36
 */

@RequestMapping("/provider/payment")
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public Result create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果：" + result);
        if (result > 0) {
            return new Result(200, "插入数据库成功", result);
        } else {
            return new Result(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/get/{id}")
    public Result getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        log.info("查询结果：" + payment);
        if (payment != null) {
            return new Result(200, "查询成功", payment);
        } else {
            return new Result(444, "查询失败", null);
        }
    }
}
