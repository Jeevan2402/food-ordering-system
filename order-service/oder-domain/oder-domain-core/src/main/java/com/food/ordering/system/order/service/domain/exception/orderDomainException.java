package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

public class orderDomainException extends DomainException {
    public orderDomainException(String message) {
        super(message);
    }

    public orderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
