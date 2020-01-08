package com.guilbt.examples.utils;

import com.guilbt.examples.model.DatabaseObject;
import com.guilbt.baseenum.utils.BaseEnumConverter;

import javax.persistence.Converter;

@Converter
public class DatabaseObjectTypeStringConverter extends BaseEnumConverter<String, DatabaseObject.TypeString> {
    public DatabaseObjectTypeStringConverter() {
        super(DatabaseObject.TypeString.class);
    }
}
