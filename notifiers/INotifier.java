package com.watson.notifiers;

import com.watson.listeners.IListener;

public interface INotifier {
    void run();
	void register(IListener listener);
    void unregister(IListener listener);
}