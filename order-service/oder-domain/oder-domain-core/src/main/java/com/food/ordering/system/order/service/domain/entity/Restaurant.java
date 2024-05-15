package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.ResturantId;

import java.util.List;

public class Restaurant extends AggregateRoot<ResturantId> {
    private final List<Product> products;
    private boolean acitve;

    private Restaurant(Builder builder) {
        super.setId(builder.resturantId);
        products = builder.products;
        acitve = builder.acitve;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean isAcitve() {
        return acitve;
    }

    public static final class Builder {
        private ResturantId resturantId;
        private List<Product> products;
        private boolean acitve;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder resturantId(ResturantId val) {
            resturantId = val;
            return this;
        }

        public Builder products(List<Product> val) {
            products = val;
            return this;
        }

        public Builder acitve(boolean val) {
            acitve = val;
            return this;
        }

        public Restaurant builder() {
            return new Restaurant(this);
        }
    }
}
