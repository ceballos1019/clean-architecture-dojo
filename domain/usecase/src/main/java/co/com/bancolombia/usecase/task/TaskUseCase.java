package co.com.bancolombia.usecase.task;

import co.com.bancolombia.model.task.Task;
import co.com.bancolombia.model.task.gateways.TaskRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class TaskUseCase {
    private final TaskRepository repository;

    public Mono<Task> createTask(Task task) {
        return repository.save(task);
    }

    public Mono<List<Task>> findAllTask() {
        return repository.findAll();
    }
}
