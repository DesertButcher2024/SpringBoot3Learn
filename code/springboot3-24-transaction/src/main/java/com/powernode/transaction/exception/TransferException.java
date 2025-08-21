package com.powernode.transaction.exception;

/**
 * 转账异常
 */
public class TransferException extends RuntimeException {

    public TransferException() {
    }

    public TransferException(String message) {
        super(message);
    }
}
