/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.g;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.c.am;
import org.apache.commons.c.ao;
import org.apache.commons.c.g.d;
import org.apache.commons.c.o;

public class b {
    public static Field a(Class class_, String string) {
        Field field = b.a(class_, string, false);
        d.a(field);
        return field;
    }

    public static Field a(Class class_, String string, boolean bl2) {
        AnnotatedElement annotatedElement;
        ao.a(class_ != null, "The class must not be null", new Object[0]);
        ao.a(am.d((CharSequence)string), "The field name must not be blank/empty", new Object[0]);
        for (annotatedElement = class_; annotatedElement != null; annotatedElement = annotatedElement.getSuperclass()) {
            try {
                Field field = annotatedElement.getDeclaredField(string);
                if (!Modifier.isPublic(field.getModifiers())) {
                    if (!bl2) continue;
                    field.setAccessible(true);
                }
                return field;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                // empty catch block
            }
        }
        annotatedElement = null;
        for (Class class_2 : o.e(class_)) {
            try {
                Field field = class_2.getField(string);
                ao.a(annotatedElement == null, "Reference to field %s is ambiguous relative to %s; a matching field exists on two or more implemented interfaces.", new Object[]{string, class_});
                annotatedElement = field;
            }
            catch (NoSuchFieldException noSuchFieldException) {}
        }
        return annotatedElement;
    }

    public static Field b(Class class_, String string) {
        return b.b(class_, string, false);
    }

    public static Field b(Class class_, String string, boolean bl2) {
        ao.a(class_ != null, "The class must not be null", new Object[0]);
        ao.a(am.d((CharSequence)string), "The field name must not be blank/empty", new Object[0]);
        try {
            Field field = class_.getDeclaredField(string);
            if (!d.a(field)) {
                if (bl2) {
                    field.setAccessible(true);
                } else {
                    return null;
                }
            }
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            return null;
        }
    }

    public static Field[] a(Class class_) {
        List list = b.b(class_);
        return list.toArray(new Field[list.size()]);
    }

    public static List b(Class class_) {
        ao.a(class_ != null, "The class must not be null", new Object[0]);
        ArrayList<Field> arrayList = new ArrayList<Field>();
        for (Class class_2 = class_; class_2 != null; class_2 = class_2.getSuperclass()) {
            Field[] arrfield;
            for (Field field : arrfield = class_2.getDeclaredFields()) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    public static Object a(Field field) {
        return b.a(field, false);
    }

    public static Object a(Field field, boolean bl2) {
        ao.a(field != null, "The field must not be null", new Object[0]);
        ao.a(Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", new Object[]{field.getName()});
        return b.a(field, (Object)null, bl2);
    }

    public static Object c(Class class_, String string) {
        return b.c(class_, string, false);
    }

    public static Object c(Class class_, String string, boolean bl2) {
        Field field = b.a(class_, string, bl2);
        ao.a(field != null, "Cannot locate field '%s' on %s", new Object[]{string, class_});
        return b.a(field, false);
    }

    public static Object d(Class class_, String string) {
        return b.d(class_, string, false);
    }

    public static Object d(Class class_, String string, boolean bl2) {
        Field field = b.b(class_, string, bl2);
        ao.a(field != null, "Cannot locate declared field %s.%s", new Object[]{class_.getName(), string});
        return b.a(field, false);
    }

    public static Object a(Field field, Object object) {
        return b.a(field, object, false);
    }

    public static Object a(Field field, Object object, boolean bl2) {
        ao.a(field != null, "The field must not be null", new Object[0]);
        if (bl2 && !field.isAccessible()) {
            field.setAccessible(true);
        } else {
            d.a(field);
        }
        return field.get(object);
    }

    public static Object a(Object object, String string) {
        return b.a(object, string, false);
    }

    public static Object a(Object object, String string, boolean bl2) {
        ao.a(object != null, "target object must not be null", new Object[0]);
        Class<?> class_ = object.getClass();
        Field field = b.a(class_, string, bl2);
        ao.a(field != null, "Cannot locate field %s on %s", new Object[]{string, class_});
        return b.a(field, object, false);
    }

    public static Object b(Object object, String string) {
        return b.b(object, string, false);
    }

    public static Object b(Object object, String string, boolean bl2) {
        ao.a(object != null, "target object must not be null", new Object[0]);
        Class<?> class_ = object.getClass();
        Field field = b.b(class_, string, bl2);
        ao.a(field != null, "Cannot locate declared field %s.%s", new Object[]{class_, string});
        return b.a(field, object, false);
    }

    public static void b(Field field, Object object) {
        b.b(field, object, false);
    }

    public static void b(Field field, Object object, boolean bl2) {
        ao.a(field != null, "The field must not be null", new Object[0]);
        ao.a(Modifier.isStatic(field.getModifiers()), "The field %s.%s is not static", new Object[]{field.getDeclaringClass().getName(), field.getName()});
        b.a(field, (Object)null, object, bl2);
    }

    public static void a(Class class_, String string, Object object) {
        b.a(class_, string, object, false);
    }

    public static void a(Class class_, String string, Object object, boolean bl2) {
        Field field = b.a(class_, string, bl2);
        ao.a(field != null, "Cannot locate field %s on %s", new Object[]{string, class_});
        b.b(field, object, false);
    }

    public static void b(Class class_, String string, Object object) {
        b.b(class_, string, object, false);
    }

    public static void b(Class class_, String string, Object object, boolean bl2) {
        Field field = b.b(class_, string, bl2);
        ao.a(field != null, "Cannot locate declared field %s.%s", new Object[]{class_.getName(), string});
        b.a(field, (Object)null, object, false);
    }

    public static void a(Field field, Object object, Object object2) {
        b.a(field, object, object2, false);
    }

    public static void a(Field field, Object object, Object object2, boolean bl2) {
        ao.a(field != null, "The field must not be null", new Object[0]);
        if (bl2 && !field.isAccessible()) {
            field.setAccessible(true);
        } else {
            d.a(field);
        }
        field.set(object, object2);
    }

    public static void b(Field field) {
        b.b(field, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(Field field, boolean bl2) {
        block8: {
            ao.a(field != null, "The field must not be null", new Object[0]);
            try {
                boolean bl3;
                if (!Modifier.isFinal(field.getModifiers())) break block8;
                Field field2 = Field.class.getDeclaredField("modifiers");
                boolean bl4 = bl3 = bl2 && !field2.isAccessible();
                if (bl3) {
                    field2.setAccessible(true);
                }
                try {
                    field2.setInt(field, field.getModifiers() & 0xFFFFFFEF);
                }
                finally {
                    if (bl3) {
                        field2.setAccessible(false);
                    }
                }
            }
            catch (NoSuchFieldException noSuchFieldException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
    }

    public static void a(Object object, String string, Object object2) {
        b.a(object, string, object2, false);
    }

    public static void a(Object object, String string, Object object2, boolean bl2) {
        ao.a(object != null, "target object must not be null", new Object[0]);
        Class<?> class_ = object.getClass();
        Field field = b.a(class_, string, bl2);
        ao.a(field != null, "Cannot locate declared field %s.%s", new Object[]{class_.getName(), string});
        b.a(field, object, object2, false);
    }

    public static void b(Object object, String string, Object object2) {
        b.b(object, string, object2, false);
    }

    public static void b(Object object, String string, Object object2, boolean bl2) {
        ao.a(object != null, "target object must not be null", new Object[0]);
        Class<?> class_ = object.getClass();
        Field field = b.b(class_, string, bl2);
        ao.a(field != null, "Cannot locate declared field %s.%s", new Object[]{class_.getName(), string});
        b.a(field, object, object2, false);
    }
}

