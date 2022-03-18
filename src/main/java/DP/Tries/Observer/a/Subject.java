package DP.Tries.Observer.a;

interface Subject {
    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers();
}
