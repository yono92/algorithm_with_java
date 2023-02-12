package tobyspring.helloboot;

import org.springframework.stereotype.Component;

@Component
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello My name is" + name;
    }
}
