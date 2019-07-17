package me.maxwell.workflow.api;

import lombok.Data;

/**
 * 环节定义
 */
@Data
public class LinkDefinition {
    private String id;          // 环节的Id
    private String name;        // 环节的Name

    private SymbolMap linkConstants = new SymbolMap();

    public <T> void putLinkConstant(Symbol<T> key, T value) {
        linkConstants.put(key, value);
    }

    public <T> T getLinkConstant(Symbol<T> key) {
        return linkConstants.get(key);
    }
}
