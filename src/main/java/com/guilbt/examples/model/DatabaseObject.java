package com.guilbt.examples.model;

import com.guilbt.examples.utils.DatabaseObjectTypeIntConverter;
import com.guilbt.examples.utils.DatabaseObjectTypeStringConverter;
import com.guilbt.baseenum.model.BaseEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="DATABASE_OBJECT")
@Data
public class DatabaseObject {
    @Id
    @Column(name = "DATABASE_OBJECT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public enum TypeInt implements BaseEnum<Integer> {
        ZERO(0),
        ONE(1),
        TWO(2);

        private int value;

        TypeInt(int value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        public Class<Integer> getValueType () {
            return Integer.class;
        }
    }

    @Column(name = "TYPE_INT")
    @Convert(converter = DatabaseObjectTypeIntConverter.class)
    private TypeInt typeInt;

    public enum TypeString implements BaseEnum<String> {
        ZERO("0"),
        ONE("1"),
        TWO("2");

        private String value;

        TypeString(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    @Column(name = "TYPE_STRING")
    @Convert(converter = DatabaseObjectTypeStringConverter.class)
    private TypeString typeString;
}
