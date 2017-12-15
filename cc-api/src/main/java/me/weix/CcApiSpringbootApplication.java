package me.weix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan
@ImportResource({ "classpath:cc-provider.xml" })
public class CcApiSpringbootApplication {

	public static void main(String[] args) {

        SpringApplication.run(CcApiSpringbootApplication.class, args);
    }
}
