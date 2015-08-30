package demo

import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor

class MyPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        def definition = registry.getBeanDefinition('demo.DemoController')
        def scope = definition.scope

        println "The Demo Controller Scope Is $scope"
    }

    @Override
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
