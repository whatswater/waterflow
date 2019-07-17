package me.maxwell.workflow.api;


import lombok.Data;

/**
 * 环节实例
 * 使用TCC机制，实现事件的事务性
 */
@Data
public class LinkInstance {
    private String id;                  // 环节实例Id
    private String contextId;           // 环节上下文Id
    private String linkDefinitionId;    // 环节定义Id
    private int linkState;              // 环节当前状态

    private SymbolMap props = new SymbolMap();
    public <T> void putProperty(Symbol<T> key, T value) {
        props.put(key, value);
    }
    public <T> T getProperty(Symbol<T> key) {
        return props.get(key);
    }
}
