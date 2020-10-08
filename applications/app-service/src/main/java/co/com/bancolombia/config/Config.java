package co.com.bancolombia.config;

import co.com.bancolombia.model.task.gateways.TaskRepository;
import co.com.bancolombia.usecase.task.TaskUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public TaskUseCase taskUseCase (TaskRepository repository) {
        return new TaskUseCase(repository);
    }
}
