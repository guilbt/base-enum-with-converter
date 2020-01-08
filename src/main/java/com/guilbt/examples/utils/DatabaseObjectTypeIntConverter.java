package com.guilbt.examples.utils;

import com.guilbt.examples.model.DatabaseObject;
import com.guilbt.baseenum.utils.BaseEnumConverter;

import javax.persistence.Converter;

@Converter
public class DatabaseObjectTypeIntConverter extends BaseEnumConverter<Integer, DatabaseObject.TypeInt> {
    public DatabaseObjectTypeIntConverter() { super(DatabaseObject.TypeInt.class); }
}
