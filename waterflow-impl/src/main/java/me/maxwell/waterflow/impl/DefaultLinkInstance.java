package me.maxwell.waterflow.impl;

import me.maxwell.workflow.api.Context;
import me.maxwell.workflow.api.LinkDefinition;
import me.maxwell.workflow.api.LinkInstance;
import me.maxwell.workflow.fetcher.ContextFetcher;
import me.maxwell.workflow.fetcher.LinkDefinitionFetcher;

public class DefaultLinkInstance implements LinkInstance {
    private String id;
    private String linkDefinitionId;
    private String contextId;
    private String[] nextLinkInstanceIds;
    private String[] prevLinkInstanceIds;
    private LinkState state;

    private ContextFetcher<String> contextFetcher;
    private LinkDefinitionFetcher fetcher;

    @Override
    public Context getContext() {
        return contextFetcher.getContext(contextId);
    }

    @Override
    public LinkDefinition getLinkDefinition() {
        return fetcher.getLinkDefinition(linkDefinitionId);
    }

    @Override
    public LinkInstance[] getPrevInstance() {
        return new LinkInstance[0];
    }

    @Override
    public LinkInstance[] getNextInstance() {
        return new LinkInstance[0];
    }

    @Override
    public LinkState getState() {
        return state;
    }

    @Override
    public void preCommit(LinkDefinition[] nextList) {

    }

    @Override
    public void callback() {

    }

    @Override
    public LinkInstance[] commit() {
        return new LinkInstance[0];
    }

    @Override
    public void cancel() {

    }
}
