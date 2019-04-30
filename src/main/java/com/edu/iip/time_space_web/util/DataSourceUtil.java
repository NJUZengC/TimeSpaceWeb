package com.edu.iip.time_space_web.util;

import com.edu.iip.time_space_web.model.MyDataSourceProperty;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author zengc
 * @date 2019/4/21 16:23
 */
public class DataSourceUtil {

    public static DataSource createDataSource (MyDataSourceProperty myDataSourceProperty)throws Exception{
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(myDataSourceProperty.getDataSourceUrl()+"?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername(myDataSourceProperty.getUserName());
        dataSource.setPassword(myDataSourceProperty.getPassword());
        return dataSource;
    }

}