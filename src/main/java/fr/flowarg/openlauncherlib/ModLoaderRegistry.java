package fr.flowarg.openlauncherlib;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Registry allowing applications to declare additional mod loaders
 * with their JSON file name providers at runtime.
 */
public final class ModLoaderRegistry {
    private static final Map<String, BiFunction<String, String, String>> CUSTOM_LOADERS = new HashMap<>();

    private ModLoaderRegistry() {
    }

    public static void register(String name, BiFunction<String, String, String> jsonProvider) {
        CUSTOM_LOADERS.put(name.toLowerCase(), jsonProvider);
    }

    public static BiFunction<String, String, String> get(String name) {
        return CUSTOM_LOADERS.get(name.toLowerCase());
    }
}
