package me.maxwell.workflow.api;

/**
 * 流程运行环境对象
 */
public class Context {
    private String id;
    private String historyId;

    private SymbolMap variables = new SymbolMap();
    public <T> void putVariable(Symbol<T> key, T value) {
        variables.put(key, value);
    }
    public <T> T getVariable(Symbol<T> key) {
        return variables.get(key);
    }
}
