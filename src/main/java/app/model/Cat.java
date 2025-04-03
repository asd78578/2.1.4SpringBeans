package app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// Создайте бин Dog, унаследуйте его от Animal. Создайте на основе этого класса компонент.
@Component

public class Cat extends Animal {
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
