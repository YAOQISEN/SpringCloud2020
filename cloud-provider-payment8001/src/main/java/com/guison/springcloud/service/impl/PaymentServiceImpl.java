package com.guison.springcloud.service.impl;

import com.guison.springcloud.dao.PaymentDao;
import com.guison.springcloud.entities.Payment;
import com.guison.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment  getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
