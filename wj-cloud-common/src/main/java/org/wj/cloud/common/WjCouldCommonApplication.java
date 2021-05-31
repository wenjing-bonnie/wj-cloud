package org.wj.cloud.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目公共模块
 *
 */
@SpringBootApplication
public class WjCouldCommonApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello WjCouldCommonApplication!" );
        SpringApplication.run(WjCouldCommonApplication.class,args);
    }
}
