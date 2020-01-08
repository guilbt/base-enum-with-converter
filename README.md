Small sample of code showing how to generalize Enum conversions in projects with JPA.
The examples is only to show how the classes can be used, but won't propelly work unless you configure a database with the DATABASE_OBJECT class.

So, why i did this?

I got in a big Spring + JPA project in which for every new enum in a Data Class that would not use default values (0, 1, 2, 3, ...) there would be a need for a new Class implementing javax's AttributeConverter.

```
@Converter
public class XYZConversor implements AttributeConverter<XYZ, Integer> {
    @Override
    public Integer convertToDatabaseColumn(XYZ attribute) {
        if (attribute == null)
            return null;
        return attribute.getValue();
    }

    @Override
    public XYZ convertToEntityAttribute(Integer dbData) {
        if (dbData == null)
            return null;
        return XYZ.fromInt(dbData);
    }
}

```

So i thought to myself, wouldn't it be cool to be able to generalize this conversion?

And this repository's code is what i came up with :).

If anyone had a better solution for this problem, i'm completely open for lectures.	
