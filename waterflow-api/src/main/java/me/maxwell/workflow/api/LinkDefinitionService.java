package me.maxwell.workflow.api;

import java.util.Map;

/**
 * 流程环节服务
 */
public interface LinkDefinitionService {
    /**
     * 根据环节定义Id获取环节定义对象
     * @param linkDefinitionId 环节定义Id
     * @return
     */
    LinkDefinition getLinkDefinition(String linkDefinitionId);

    /**
     * 持久化流程定义对象环节定义对象
     * @param linkDefinition 环节定义
     * @return
     */
    LinkDefinition persistentLinkDefinition(LinkDefinition linkDefinition);

    /**
     * 删除流程定义
     * @param linkDefinitionId 流程定义Id
     */
    void deleteLinkDefinition(String linkDefinitionId);

    /**
     * 获取常量值
     * @param linkDefinition 环节定义对象
     * @param key 常量key
     * @param <T> 常量值类型
     * @return
     */
    <T> T getLinkConstant(LinkDefinition linkDefinition, Symbol<T> key);

    /**
     * 获取环节的所有常量
     * @param linkDefinition 环节定义对象
     * @return
     */
    Map<String, Object> getLinkConstants(LinkDefinition linkDefinition);

    /**
     * 获取指定的常量表
     * @param linkDefinition 环节定义对象
     * @param pattern key匹配的模式
     * @return
     */
    Map<String, Object> getLinkConstants(LinkDefinition linkDefinition, String pattern);

    /**
     * 是否是开始环节
     * @param linkDefinition 环节定义对象
     * @return
     */
    boolean isStartLink(LinkDefinition linkDefinition);

    /**
     * 是否是结束环节
     * @param linkDefinition 环节定义对象
     * @return
     */
    boolean isEndLink(LinkDefinition linkDefinition);


    /**
     * 根据流程流转环境和流程定义创建流程实例
     * @param context 流程流转环境
     * @param linkDefinition 流程定义
     * @return
     */
    LinkInstance createInstance(Context context, LinkDefinition linkDefinition);
}
