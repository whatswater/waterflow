package me.maxwell.workflow.api;

/**
 * 流转历史对象
 * 流转历史是一个有向无环图，每个环节都可以发起多个环节，也有两个环节归到一个环节的
 */
public interface FlowHistoryService {
    /**
     * 获取起始节点
     * @return
     */
    LinkInstance getStartNode(String historyId);

    /**
     * 根据节点名字获取流转节点列表
     * @param nodeName 节点名字
     * @return
     */
    LinkInstance[] getNode(String historyId, String nodeName);

    /**
     * 获取当前正在执行的环节列表
     * @return
     */
    LinkInstance[] getCurrentNode(String historyId);

    /**
     * 流程是否已经结束
     * @return
     */
    boolean isComplete(String historyId);
}
