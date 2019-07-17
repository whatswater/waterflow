package me.maxwell.waterflow.impl;

import me.maxwell.workflow.api.Context;
import me.maxwell.workflow.api.LinkDefinition;
import me.maxwell.workflow.api.LinkInstance;

import java.util.Map;

public class DefaultLinkDefinition implements LinkDefinition {
    public static final String START_LINK_DEFINITION = "link_start";
    public static final String END_LINK_DEFINITION = "link_end";

    private String id;
    private String defineName;

    @Override
    public LinkInstance createLinkInstance(Context context, Map<String, Object> variables) {
        String contextId = context.getId();
        return null;
    }

    @Override
    public Map<String, Object> getLinkConstants() {
        return null;
    }

    @Override
    public <T> T getLinkConstant(String key, Class<T> cls) {
        return null;
    }

    @Override
    public boolean isStartLink() {
        return START_LINK_DEFINITION.equals(defineName);
    }

    @Override
    public boolean isEndLink() {
        return END_LINK_DEFINITION.equals(defineName);
    }

    @Override
    public String getDefineName() {
        return defineName;
    }
}
