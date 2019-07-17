package me.maxwell.workflow.fetcher;

import me.maxwell.workflow.api.LinkDefinition;

import java.util.Map;

/**
 * 流程定义Fetcher
 * @param <T>
 */
public interface LinkDefinitionFetcher<T> {
    /**
     * 获取流程环节定义
     * @param id 定义id
     * @return
     */
    LinkDefinition getLinkDefinition(T id);

    /**
     * 获取流程环节所有常量
     * @param id 定义id
     * @return
     */
    Map<String, Object> getConstants(T id);

    /**
     * 获取流程常量
     * @param id 定义id
     * @param key 常量名
     * @param cls 常量类型cls
     * @param <E> 常量类型
     * @return
     */
    <E> E getConstant(T id, String key, Class<E> cls);
}
