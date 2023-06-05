package edu.sandbox.spring.context.annotationbasedconfiguration.service.impl;

import edu.sandbox.spring.context.annotationbasedconfiguration.services.AnnotationBasedService;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.impl.AnnotationBasedServiceImpl;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.impl.CircularDependencyImpl;
import edu.sandbox.spring.context.annotationbasedconfiguration.services.impl.DependencyImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig({
        AnnotationBasedServiceImpl.class,
        CircularDependencyImpl.class,
        DependencyImpl.class
})
@DisplayName("Test should check that AnnotationBasedService initialized properly")
class AnnotationBasedServiceTest {

    @Autowired
    private AnnotationBasedService annotationBasedService;

    @Test
    @DisplayName("should check that annotationBasedService is not null")
    void shouldCheckThatObjectNonNull() {
        Assertions.assertThat(annotationBasedService).isNotNull();
    }
}
