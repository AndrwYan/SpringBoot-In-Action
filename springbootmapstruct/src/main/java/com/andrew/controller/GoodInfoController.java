package com.andrew.controller;


import com.andrew.domain.GoodInfoBean;
import com.andrew.domain.GoodTypeBean;
import com.andrew.dto.GoodInfoDto;
import com.andrew.jpa.GoodInfoJPA;
import com.andrew.jpa.GoodTypeJPA;
import com.andrew.mapper.GoodInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


public class GoodInfoController {

    /**
     * 注入商品基本信息jpa
     */
    @Autowired
    private GoodInfoJPA goodInfoJPA;
    /**
     * 注入商品类型jpa
     */
    @Autowired
    private GoodTypeJPA goodTypeJPA;
    /**
     * 注入mapStruct转换Mapper
     */
    @Autowired
    private GoodInfoMapper goodInfoMapper;

    /**
     * 查询商品详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/detail/{id}")
    public GoodInfoDto detail(@PathVariable("id") Long id)
    {
        //查询商品基本信息
        GoodInfoBean goodInfoBean=goodInfoJPA.findOne(id);
        //查询商品类型基本信息
        GoodTypeBean typeBean=goodTypeJPA.findOne(goodInfoBean.getTypeId());
        //返回转换dto
        return goodInfoMapper.from(goodInfoBean,typeBean);
    }
}
