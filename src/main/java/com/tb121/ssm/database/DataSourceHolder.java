package com.tb121.ssm.database;
/**
* @Description:    数据源支持类
* @Author:         wengzhongjie
* @CreateDate:     2018-12-21 12:35
*/
public class DataSourceHolder {
    private final static ThreadLocal<String> local = new ThreadLocal<>();

    public final static String MASTER = "master";
    public final static String SLAVE = "slave";


    /**
     * 设置数据源
     * @param key
     */
    public static void putDataSourceKey(String key) {
        local.set(key);
    }

    public static String getDataSourceKey() {
        String key=local.get();
        local.remove();
        return key;
    }

    public static void setMaster() {
        putDataSourceKey(MASTER);
    }

    public static void setSlave() {
        putDataSourceKey(SLAVE);
    }

}
