package me.maxwell.workflow.api;

public interface LinkInstanceService {
    /**
     * 持久化环节实例对象
     * @param linkInstance 持久化流程实例对象
     * @return
     */
    LinkInstance persistentInstance(LinkInstance linkInstance);

    /**
     * 根据环节实例Id获取环节实例对象
     * @param linkInstanceId 环节实例Id
     * @return
     */
    LinkInstance getLinkInstance(String linkInstanceId);

    /**
     * 根据环节实例Id删除环节实例对象
     * @param linkInstanceId 环节实例Id
     */
    void deleteLinkInstance(String linkInstanceId);

    /**
     * 获取跳转到此环节的前续环节
     * @param linkInstance 环节实例
     * @return
     */
    LinkInstance[] getPrevInstance(LinkInstance linkInstance);

    /**
     * 获取此环节跳转到的后续环节
     * @param linkInstance 环节实例
     * @return
     */
    LinkInstance[] getNextInstance(LinkInstance linkInstance);

    /**
     * 准备变更状态
     * @param state 状态值
     * @return
     */
    String prepare(String msgId, int state);

    /**
     * 提交变更的状态
     * @param msgId 消息Id
     * @return
     */
    String commit(String msgId);

    /**
     * 撤销状态变更
     * @param msgId
     * @return
     */
    String cancel(String msgId);
}
