package co.com.bancolombia.model.task;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Task {
    private String id;
    private String name;
    private String description;
}
