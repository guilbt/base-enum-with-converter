package com.guilbt.baseenum.utils;

import com.guilbt.baseenum.model.BaseEnum;

import javax.persistence.AttributeConverter;

public class BaseEnumConverter<V, E extends BaseEnum<V>> implements AttributeConverter<E, V> {
    private Class<E> claz;

    public BaseEnumConverter(Class<E> claz) {
        this.claz = claz;
    }

    public V convertToDatabaseColumn(E value) {
        return value.getValue();
    }

    public E convertToEntityAttribute(V value) {
        return BaseEnum.getEnumFromValue(claz, value);
    }
}
