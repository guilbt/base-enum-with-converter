package com.guilbt.baseenum.model;

public interface BaseEnum<V> {
    V getValue();

    static <E extends BaseEnum, V> E getEnumFromValue(Class<E> type, V value) {
        if (value == null) {
            return null;
        }
        for (E enumValue : type.getEnumConstants()) {
            if (enumValue.getValue().equals(value)) {
                return enumValue;
            }
        }
        return null;
    }
}
