package com.SpringApp.StudentCtr.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student foo = new Student("foo", "foo@foo.com", LocalDate.of(1000, JANUARY, 1));
            Student bar = new Student("bar", "bar@bar.com", LocalDate.of(1001, JANUARY, 11));

            repository.saveAll(List.of(foo, bar));
        };
    }
}
