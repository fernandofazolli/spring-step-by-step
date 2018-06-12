package br.com.fazolli.spring.ioc.step_by_step;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fernandofazolli on 11/06/18.
 */
public class ApplicationIoc {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

        final ServiceIoc serviceIoc = ctx.getBean("serviceIoc",ServiceIoc.class);

        System.out.println(serviceIoc.getIocName());

    }
}
