package org.wj.cloud.common.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class WjCloudApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello WjCloudApplication!" );
        SpringApplication.run(WjCloudApplication.class,args);
    }
}
