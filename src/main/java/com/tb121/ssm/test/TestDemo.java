package com.tb121.ssm.test;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import java.util.HashMap;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args) {
        EntityWrapper wrapper=new EntityWrapper();
        Map<String,Object> map=new HashMap<>(16);
        map.put("username","123");
        map.put("password","456");
        String sql=wrapper.allEq(map).getSqlSegment();
        System.out.println("allEq-->sql:--->"+sql);
        sql=wrapper.andNew().andNew("username={0}","111").getSqlSegment();
        System.out.println(sql);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Integer i=new Integer(129);
        int m=129;
        System.out.println(i.equals(m));
        System.out.println(i==m);

    }
}
