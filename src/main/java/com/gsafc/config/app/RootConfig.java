package com.gsafc.config.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2016/10/23.
 */
@Configuration
@ComponentScan(basePackages = "com.gsafc.site",
        excludeFilters = @ComponentScan.Filter({
                Controller.class, RestController.class,
                ControllerAdvice.class, Repository.class
        })
)
public class RootConfig {
}
