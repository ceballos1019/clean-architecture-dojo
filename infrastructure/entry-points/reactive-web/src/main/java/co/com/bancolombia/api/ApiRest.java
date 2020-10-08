package co.com.bancolombia.api;

import co.com.bancolombia.model.task.Task;
import co.com.bancolombia.usecase.task.TaskUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final TaskUseCase useCase;

    @GetMapping()
    public Mono<List<Task>> findAllTask() {
        return useCase.findAllTask();
    }

    @PostMapping()
    public Mono<Task> createTask(@RequestBody Task task) {
        return useCase.createTask(task);
    }
}
