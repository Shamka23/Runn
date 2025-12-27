package type_safe_bag;

import java.util.*;

public class TypeSafeBag {

    private final Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> type, T value) {
        map.put(type, value);
    }

    public <T> Optional<T> get(Class<T> type) {
        Object value = map.get(type);

        if (value == null) {
            return Optional.empty();
        }

        return Optional.of(type.cast(value));
    }
}
