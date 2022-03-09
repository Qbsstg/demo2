package com.example.demo.config;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

/**
 * @author Qbss
 * @date 2022/3/3
 * @desc
 */
@springbo
public class sqlTest {



    public void init() {
        try {

            System.out.println("开始建表");
            ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration();

            configuration.setJdbcUrl("jdbc:mysql://124.70.103.155:3306/sqlTest");
            configuration.setJdbcUrl("com.mysql.jdbc.Driver");
            configuration.setJdbcUsername("ranking");
            configuration.setJdbcPassword("ranking@123");

            configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
            ProcessEngine processEngine = configuration.buildProcessEngine();
            System.out.println(processEngine.getName() + "********************");
            System.out.println("建表结束。。。");
        } catch (Exception e) {
            System.out.println("建表失败。。。");
            e.printStackTrace();
        }

    }

}
