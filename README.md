Small sample of code showing how to generalize Enum conversions in projects with JPA.
The examples is only to show how the classes can be used, but won't propelly work unless you configure a database with the DATABASE_OBJECT class.

So, why i did this?

I got in a big Spring + JPA project where for every enum that would not have default values (0, 1, 2, 3, ...) there would be a new Class with basically the same code.

```
@Converter
public class XYZConversor implements AttributeConverter<XYZ, Integer> {
    @Override
    public Integer convertToDatabaseColumn(XYZ attribute) {
        if (attribute == null)
            return null;
        return attribute.getId();
    }

    @Override
    public XYZ convertToEntityAttribute(Integer dbData) {
        if (dbData == null)
            return null;
        return VtexSite.fromInt(dbData);
    }
}

```

So i thought to myself, wouldn't it be cool to be able to generalize this conversion?

And this is what i came up with :).

If anyone had a better idea, i'm open for lectures.	