package com.tb121.ssm.database;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/**
* @Description:    自定义动态数据源类
* @Author:         wengzhongjie
* @CreateDate:     2018-12-21 12:33
*/
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSourceKey();
    }
}
