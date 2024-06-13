package forgotten.cs;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Named("bar")
@Singleton
public class MyBarService implements MyService {
}
