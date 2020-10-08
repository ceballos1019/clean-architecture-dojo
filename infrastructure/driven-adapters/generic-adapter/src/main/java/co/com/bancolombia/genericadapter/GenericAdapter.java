package co.com.bancolombia.genericadapter;

import co.com.bancolombia.model.task.Task;
import co.com.bancolombia.model.task.gateways.TaskRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class GenericAdapter implements TaskRepository {
    private final Map<String, Task> repo;

    public GenericAdapter(){
        repo = new HashMap<>();
    }

    @Override
    public Mono<Task> save(Task task) {
        repo.put(task.getId(), task);
        return Mono.just(task);
    }

    @Override
    public Mono<List<Task>> findAll() {
        return Mono.just(repo.values().stream().collect(Collectors.toList()));
    }
}
