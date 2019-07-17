package me.maxwell.workflow.api;

import java.util.Map;

public interface ContextService {
    /**
     * 查询流转上下文
     * @param contextId 流转上下文Id
     * @return
     */
    Context getContext(String contextId);

    /**
     * 持久化流转上下文
     * @param context 流转上下文
     * @return
     */
    Context persistentContext(Context context);

    /**
     * 删除流转上下文
     * @param contextId 流转上下文Id
     * @return
     */
    Context deleteContext(String contextId);

    /**
     * 获取流转变量
     * @param context 流转上下文
     * @param symbol 变量key
     * @param <T> 变量类型
     * @return
     */
    <T> T getVariable(Context context, Symbol<T> symbol);

    /**
     * 获取指定变量
     * @param context 流转上下文
     * @param pattern 变量key的pattern
     * @return
     */
    Map<String, Object> getVariables(Context context, String pattern);

    /**
     * 获取所有变量
     * @param context 流转上下文
     * @return
     */
    Map<String, Object> getVariables(Context context);
}
