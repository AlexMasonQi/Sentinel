package com.alibaba.csp.sentinel.dashboard.rule.nacos.authority;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version 1.0
 * @since 2020/12/18.
 */
@Component("authorityRuleNacosProvider")
public class AuthorityRuleNacosProvider implements DynamicRuleProvider<List<FlowRuleEntity>> {

    @Override
    public List<FlowRuleEntity> getRules(String appName) throws Exception {
        return null;
    }
}
