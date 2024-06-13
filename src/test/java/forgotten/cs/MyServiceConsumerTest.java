package forgotten.cs;

import builders.dsl.expectations.Expectations;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.TestFactory;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class MyServiceConsumerTest {

    @Inject MyServiceConsumer service;

    @TestFactory
    Expectations testMyServices() {
        return Expectations.given("key", "implementation")
                .<String, Class<?>>are("bar", MyBarService.class)
                .and("defaultMyService", DefaultMyService.class)
                .and("foo", MyFooService.class)
                .verify("service #implementation has key #key", (key, implementation) -> {
                    Map<String, MyService> serviceMap = service.getMyServices();
                    serviceMap.forEach((k, v) -> {
                        if (implementation.isInstance(v)) {
                            assertEquals(key, k);
                        }
                    });
                });

    }

}