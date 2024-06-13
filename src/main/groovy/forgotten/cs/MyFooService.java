package forgotten.cs;

import groovy.transform.CompileStatic;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Named("foo")
@Singleton
@CompileStatic
public class MyFooService implements MyService {
}
