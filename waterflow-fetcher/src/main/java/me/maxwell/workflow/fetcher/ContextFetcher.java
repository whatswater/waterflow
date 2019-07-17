package me.maxwell.workflow.fetcher;

import me.maxwell.workflow.api.Context;

public interface ContextFetcher<T> {
    Context getContext(T id);
}
