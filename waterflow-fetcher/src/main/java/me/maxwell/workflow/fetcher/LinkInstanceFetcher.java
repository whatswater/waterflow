package me.maxwell.workflow.fetcher;

import me.maxwell.workflow.api.LinkInstance;

/**
 * 根据一些简略信息，获取LinkInstance对象
 * 一般情况下，是个查数据库操作
 * 类似于函数式编程中的闭包
 */
public interface LinkInstanceFetcher {
    LinkInstance fetch();
}
