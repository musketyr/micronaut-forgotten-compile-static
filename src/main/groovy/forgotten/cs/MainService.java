package forgotten.cs;

import jakarta.inject.Singleton;

@Singleton
public class MainService {

    private final MyFooService myFooService;
    private final MyServiceConsumer myServiceConsumer;

    public MainService(MyFooService myFooService, MyServiceConsumer myServiceConsumer) {
        this.myFooService = myFooService;
        this.myServiceConsumer = myServiceConsumer;
    }

    public MyFooService getMyFooService() {
        return myFooService;
    }

    public MyServiceConsumer getMyServiceConsumer() {
        return myServiceConsumer;
    }


}
