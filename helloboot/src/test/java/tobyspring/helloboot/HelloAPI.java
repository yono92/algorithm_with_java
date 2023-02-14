package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class HelloAPI {

    @Test
    void serverFactory() {
        // http localhost:8080/hello?name=sejong
        TestRestTemplate restTemplate = new TestRestTemplate();

        ResponseEntity<String> spring =  restTemplate.getForEntity("http://localhost:8080/hello?name={name}", String.class, "spring");
        // status code 200
        Assertions.assertThat(spring.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
        // header (content-type) text/plain
        Assertions.assertThat(spring.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).isEqualTo(MediaType.TEXT_PLAIN_VALUE);
        // body Hello Spring
        Assertions.assertThat(spring.getBody()).isEqualTo("Hello Spring");
    }

}