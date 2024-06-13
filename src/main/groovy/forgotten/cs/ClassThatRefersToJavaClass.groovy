package forgotten.cs

import jakarta.inject.Singleton

@Singleton
class ClassThatRefersToJavaClass {

    private final MyFooService myFooService

    ClassThatRefersToJavaClass(MyFooService myFooService) {
        this.myFooService = myFooService
    }

}
