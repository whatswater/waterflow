package me.maxwell.workflow.api;

import java.util.*;

public class SymbolMap {
    private Map<Symbol<?>, Object> innerMap = new TreeMap<>();

    public SymbolMap() {

    }

    public SymbolMap(SymbolMap map) {
        this.innerMap.putAll(map.innerMap);
    }

    public <T> T get(Symbol<T> key) {
        Object obj = this.innerMap.get(key);
        return (T)obj;
    }

    public <T> T getOrDefault(Symbol<T> key, T defaultValue) {
        T t;
        if ((t = get(key)) != null || containsKey(key)) {
            return t;
        }
        else {
            return defaultValue;
        }
    }

    public <T> T put(Symbol<T> key, T value) {
        return (T)this.innerMap.put(key, value);
    }

    public <T> T putIfAbsent(Symbol<T> key, T value) {
        T t = get(key);
        if (t == null) {
            t = put(key, value);
        }

        return t;
    }

    public int size() {
        return this.innerMap.size();
    }

    public boolean isEmpty() {
        return this.innerMap.isEmpty();
    }

    public <T> boolean containsKey(Symbol<T> key) {
        return this.innerMap.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return this.innerMap.containsValue(value);
    }

    public <T> T remove(Symbol<T> key) {
        return (T)this.innerMap.remove(key);
    }

    public <T> boolean remove(Symbol<T> key, T value) {
        T curValue = get(key);
        if (!Objects.equals(curValue, value) ||
                (curValue == null && !containsKey(key))) {
            return false;
        }
        remove(key);
        return true;
    }

    public void putAll(Map<? extends Symbol<?>, ? extends Object> m) {
        this.innerMap.putAll(m);
    }

    public void clear() {
        this.innerMap.clear();
    }

    public Set<Symbol<?>> keySet() {
        return this.innerMap.keySet();
    }

    public Collection<Object> values() {
        return this.innerMap.values();
    }
}
