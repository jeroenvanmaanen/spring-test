package org.leialearns.spring.test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TransactionHelperTest {

    @Test
    public void testTransactionHelper() {
        TransactionHelper transactionHelper = Runnable::run;
        transactionHelper.runInTransaction(() -> assertTrue(true));
    }
}
