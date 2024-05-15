package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class ResturantId extends BaseId<UUID> {
    protected ResturantId(UUID value) {
        super(value);
    }
}
