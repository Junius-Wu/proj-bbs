//package bbs.config;
//
//import bbs.BBSApp;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.thymeleaf.TemplateEngine;
//import org.thymeleaf.spring4.SpringTemplateEngine;
//import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring4.view.ThymeleafViewResolver;
//import org.thymeleaf.templateresolver.ITemplateResolver;
//
///**
// * Created by jun on 17/3/10.
// * Thymeleaf 模板引擎的基本设置
// */
//@Configuration
//public class ThymeleafConfig {
//    // 使用thymeleaf 视图解析器
//    @Bean
//    public ViewResolver viewResolver() {
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine());
//        resolver.setCharacterEncoding("UTF-8");
//        return resolver;
//    }
//
//    // 使用模板引擎
//    private TemplateEngine templateEngine() {
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.setTemplateResolver(templateResolver());
//        return engine;
//    }
//
//    // 模板解析器
//    private ITemplateResolver templateResolver() {
//        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//        resolver.setApplicationContext(BBSApp.getApplicationContext());
//        resolver.setPrefix("/WEB-INF/templates/");
//        resolver.setTemplateMode("HTML");
//        return resolver;
//    }
//}
