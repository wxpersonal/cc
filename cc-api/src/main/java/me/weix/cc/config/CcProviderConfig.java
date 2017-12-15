package me.weix.cc.config;

/**
 * Created by wxper on 2017/12/14.
 */
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.core.env.Environment;

@Configuration
public class CcProviderConfig implements EnvironmentAware {

    private RelaxedPropertyResolver relaxedPropertyResolver;

    private static final String ENV_DUBBO = "dubbo.";

    @Override
    public void setEnvironment(Environment environment) {
        relaxedPropertyResolver = new RelaxedPropertyResolver(environment, ENV_DUBBO);
    }

    /**
     * 注入dubbo上下文
     *
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        // 当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(relaxedPropertyResolver.getProperty("application.name"));
        applicationConfig.setLogger(relaxedPropertyResolver.getProperty("application.logger"));
        return applicationConfig;
    }

    /**
     * 设置dubbo扫描包
     * @return
     */
    /*@Bean
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(relaxedPropertyResolver.getProperty("scan"));
        return annotationBean;
    }*/



    /**
     * 注入dubbo注册中心配置,基于zookeeper
     *
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol(relaxedPropertyResolver.getProperty("register.protocol"));
        registry.setAddress(relaxedPropertyResolver.getProperty("register.address"));
        return registry;
    }

    /**
     * 默认基于dubbo协议提供服务
     *
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        // 服务提供者协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName(relaxedPropertyResolver.getProperty("protocol.name"));
        protocolConfig.setPort(Integer.parseInt(relaxedPropertyResolver.getProperty("protocol.port")));
        protocolConfig.setThreads(200);
        return protocolConfig;
    }

    /**
     * dubbo服务提供
     *
     * @param applicationConfig
     * @param registryConfig
     * @param protocolConfig
     * @return
     */
    @Bean(name = "myProvider")
    public ProviderConfig providerConfig(ApplicationConfig applicationConfig, RegistryConfig registryConfig,
                                         ProtocolConfig protocolConfig) {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(Integer.parseInt(relaxedPropertyResolver.getProperty("provider.timeout")));
        providerConfig.setRetries(Integer.parseInt(relaxedPropertyResolver.getProperty("provider.retries")));
        providerConfig.setDelay(Integer.parseInt(relaxedPropertyResolver.getProperty("provider.delay")));
        providerConfig.setApplication(applicationConfig);
        providerConfig.setRegistry(registryConfig);
        providerConfig.setProtocol(protocolConfig);
        return providerConfig;
    }
}