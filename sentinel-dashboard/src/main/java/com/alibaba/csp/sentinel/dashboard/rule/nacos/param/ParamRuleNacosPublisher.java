package com.alibaba.csp.sentinel.dashboard.rule.nacos.param;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version 1.0
 * @since 2020/12/18.
 */
@Component("paramRuleNacosPublisher")
public class ParamRuleNacosPublisher implements DynamicRulePublisher<List<FlowRuleEntity>> {

    /**
     * Publish rules to remote rule configuration center for given application name.
     *
     * @param app   app name
     * @param rules list of rules to push
     * @throws Exception if some error occurs
     */
    @Override
    public void publish(String app, List<FlowRuleEntity> rules) throws Exception {

    }
}
