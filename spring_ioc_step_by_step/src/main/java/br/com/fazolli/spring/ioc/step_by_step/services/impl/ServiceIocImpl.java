package br.com.fazolli.spring.ioc.step_by_step.services.impl;

import br.com.fazolli.spring.ioc.step_by_step.services.ServiceIoc;

/**
 * Created by fernandofazolli on 11/06/18.
 */
public class ServiceIocImpl implements ServiceIoc {
    public String getIocName() {
        return "Name from ServiceIocImpl class";
    }
}
