package forgotten.cs;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Map;
import java.util.stream.Collectors;

@Controller("/")
public class HomeController {

    private final MyFooService myFooService;
    private final MyServiceConsumer myServiceConsumer;

    public HomeController(MyFooService myFooService, MyServiceConsumer myServiceConsumer) {
        this.myFooService = myFooService;
        this.myServiceConsumer = myServiceConsumer;
    }

    @Get
    public Map<String, String> index() {
        return myServiceConsumer.getMyServices().entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().getClass().getSimpleName()));
    }

}
