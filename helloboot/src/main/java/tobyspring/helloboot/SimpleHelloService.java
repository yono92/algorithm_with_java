package tobyspring.helloboot;

public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello My name is" + name;
    }
}
