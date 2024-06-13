package forgotten.cs;

import jakarta.inject.Singleton;

import java.util.Map;

@Singleton
public class MyServiceConsumer {

    private final Map<String, MyService> myServices;

    public MyServiceConsumer(Map<String, MyService> myServices) {
        this.myServices = myServices;
    }

    public Map<String, MyService> getMyServices() {
        return myServices;
    }
}
