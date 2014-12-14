package org.leialearns.spring.test;

public interface TransactionHelper {
    void runInTransaction(Runnable runnable);
}
