package com.jydacai.DLMServer.config;

import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.apache.catalina.Context;
@Configuration
public class WebConfig  implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        		.allowedOrigins("*")
                .allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS")
                .allowCredentials(true).
                maxAge(3600);
    }
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		//registry.addViewController("/").setViewName("forward:/index.html");
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/").setViewName("index");
		

	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/templates/","classpath:/resources/", "classpath:/static/");
		registry.addResourceHandler("/GeoLite2/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/GeoLite2/");
		
	}
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        AntPathMatcher matcher = new AntPathMatcher();
        matcher.setCaseSensitive(false);
        configurer.setPathMatcher(matcher);
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
		//Execute order are the same as register order.
		//registry.addInterceptor(new ValidPathInterceptor())
		//	.addPathPatterns("/api/**")
		//	.addPathPatterns("/api/**");
		/*registry.addInterceptor(setBeanLogin())
			.addPathPatterns("/api/**");
		registry.addInterceptor(setBeanPrivilege())
			.addPathPatterns("/**");*/
    }
    @Bean
    TomcatServletWebServerFactory tomcatServletWebServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                // TODO Auto-generated method stub
                SecurityConstraint constraint = new SecurityConstraint();
                constraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/");
                constraint.addCollection(collection);
                context.addConstraint(constraint);
            }            
        };
        
        factory.addAdditionalTomcatConnectors(createTomcatConnector());
        return factory;        
        
    }
    
    private Connector createTomcatConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        connector.setPort(80);
        connector.setSecure(false);
        connector.setRedirectPort(443);
        return connector;
    }
    
}
