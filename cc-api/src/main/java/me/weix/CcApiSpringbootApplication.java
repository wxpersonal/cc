package me.weix;

import me.weix.cc.service.ParameterRpcService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.remoting.rmi.RmiServiceExporter;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan
@ImportResource({ "classpath:cc-provider.xml" })
public class CcApiSpringbootApplication {

	public static void main(String[] args) {

        SpringApplication.run(CcApiSpringbootApplication.class, args);
    }

    /* rmi 服务器暴漏 服务*/
    @Bean
    public RmiServiceExporter rmiServiceExporter(ParameterRpcService parameterRpcService){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        // 客户端通过rmi调用的端口
        rmiServiceExporter.setRegistryPort(1111);
        // 客户端调用注册调用的服务名
        rmiServiceExporter.setServiceName("hello");
        // 注册的service
        rmiServiceExporter.setService(helloService);
        //注册的接口
        rmiServiceExporter.setServiceInterface(HelloService.class) ;
        return rmiServiceExporter ;
    }
}
