package com.web.elijah.service.impl;

import com.web.elijah.mapper.WxUserInfoMapper;
import com.web.elijah.model.WxUserInfo;
import com.web.elijah.service.WxUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author:王旭
 * @date:2019/9/26 18:23
 * </p>
 * Description:
 */
@Service
public class WxUserInfoServiceImpl implements WxUserInfoService {
    @Autowired
    private WxUserInfoMapper wxUserInfoMapper;

    @Override
    public void insert() {
        WxUserInfo po = new WxUserInfo();
        po.setName("张三");
        wxUserInfoMapper.insert(po);
    }

    @Override
    public void lambdaTest() {
        WxUserInfo po = new WxUserInfo();
        po.setName("张三");
        Consumer<WxUserInfo> consumer=wxUserInfo -> {
            System.out.println("consumer的元素有:"+wxUserInfo.getName());
        };
        consumer.accept(po);
        Predicate<WxUserInfo> xx=x -> x.getName().equals("张三");
        System.out.println("这个判断Predicate:"+xx.test(po));
    }

    @Override
    public void listLambda() {
        List<WxUserInfo> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            WxUserInfo po=new WxUserInfo();
            po.setName("超级英雄"+i);
            list.add(po);
        }
        List<String> collect = list.stream().map(WxUserInfo::getName).collect(Collectors.toList());
        collect.forEach(System.out::println);
        boolean b = list.stream().anyMatch(wxUserInfo ->
                wxUserInfo.getName().contains("5")
        );
        System.out.println("boolean的值:"+b);
        Predicate<WxUserInfo> predicate=wxUserInfo -> wxUserInfo.getName().endsWith("1");
        Predicate<WxUserInfo> predicate1=wxUserInfo -> wxUserInfo.getName().startsWith("超级");
        list.stream().filter(wxUserInfo -> wxUserInfo.getName().endsWith("2")).forEach(in->{
            System.out.println("当前命中名称的:"+in.getName());
        });

    }


    @Override
    public void mapLambda() {
        List list= Arrays.asList(1,2,3,4,5);
        list.stream().map((in)-> Integer.valueOf(in.toString())+ 10).forEach(System.out::println);
        Object o = list.stream().map((in) -> Integer.valueOf(in.toString()) + 10).reduce((sum, in) -> Integer.valueOf(sum.toString()) + Integer.valueOf(in.toString())).get();
        System.out.println("sum的值:"+o.toString());
    }
}
