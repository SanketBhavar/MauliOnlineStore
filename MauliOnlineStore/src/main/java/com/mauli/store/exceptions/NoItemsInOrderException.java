package com.mauli.store.exceptions;

public class NoItemsInOrderException extends RuntimeException {

    public NoItemsInOrderException(String message) {
        super(message);
    }
}
