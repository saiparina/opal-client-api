package pt.saipar.client.api.utils.map;

import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public final class MapBuilder<K, V, M extends Map<K, V>> {

    private final M map;

    public MapBuilder<K, V, M> put(final K key, final V value) {
        map.put(key, value);

        return this;
    }

    public M create() {
        return map;
    }

    public static <K, V, M extends Map<K, V>> MapBuilder<K, V, M> of(final M map) {
        return new MapBuilder<>(map);
    }

}
