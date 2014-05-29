package com.watson;

public interface INotifier {
    void run();
	void register(IListener listener);
    void unregister(IListener listener);
}