package com.jiangtj.cloud.sbaserver;

import com.jiangtj.utils.authspringstarter.AuthServer;
import de.codecentric.boot.admin.server.web.client.HttpHeadersProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

/**
 * Created At 2021/3/24.
 */
@Configuration
public class SBAJwtConfig {

    @Bean
    public HttpHeadersProvider customHttpHeadersProvider(AuthServer authServer) {
        return instance -> {
            String instanceName = instance.getRegistration().getName();
            HttpHeaders httpHeaders = new HttpHeaders();
            String header = authServer.builder(instanceName).build();
            httpHeaders.add(authServer.getOptions(instanceName).getRequest().getHeaderName(), header);
            return httpHeaders;
        };
    }

}
