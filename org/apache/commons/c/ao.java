/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.c.am;
import org.apache.commons.c.c;

public class ao {
    private static final String a = "The value %s is not in the specified exclusive range of %s to %s";
    private static final String b = "The value %s is not in the specified inclusive range of %s to %s";
    private static final String c = "The string %s does not match the pattern %s";
    private static final String d = "The validated object is null";
    private static final String e = "The validated expression is false";
    private static final String f = "The validated array contains null element at index: %d";
    private static final String g = "The validated collection contains null element at index: %d";
    private static final String h = "The validated character sequence is blank";
    private static final String i = "The validated array is empty";
    private static final String j = "The validated character sequence is empty";
    private static final String k = "The validated collection is empty";
    private static final String l = "The validated map is empty";
    private static final String m = "The validated array index is invalid: %d";
    private static final String n = "The validated character sequence index is invalid: %d";
    private static final String o = "The validated collection index is invalid: %d";
    private static final String p = "The validated state is false";
    private static final String q = "Cannot assign a %s to a %s";
    private static final String r = "Expected type: %s, actual: %s";

    public static void a(boolean bl2, String string, long l2) {
        if (!bl2) {
            throw new IllegalArgumentException(String.format(string, l2));
        }
    }

    public static void a(boolean bl2, String string, double d2) {
        if (!bl2) {
            throw new IllegalArgumentException(String.format(string, d2));
        }
    }

    public static void a(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
    }

    public static void a(boolean bl2) {
        if (!bl2) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Object a(Object object) {
        return ao.a(object, d, new Object[0]);
    }

    public static Object a(Object object, String string, Object ... arrobject) {
        if (object == null) {
            throw new NullPointerException(String.format(string, arrobject));
        }
        return object;
    }

    public static Object[] a(Object[] arrobject, String string, Object ... arrobject2) {
        if (arrobject == null) {
            throw new NullPointerException(String.format(string, arrobject2));
        }
        if (arrobject.length == 0) {
            throw new IllegalArgumentException(String.format(string, arrobject2));
        }
        return arrobject;
    }

    public static Object[] a(Object[] arrobject) {
        return ao.a(arrobject, i, new Object[0]);
    }

    public static Collection a(Collection collection, String string, Object ... arrobject) {
        if (collection == null) {
            throw new NullPointerException(String.format(string, arrobject));
        }
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
        return collection;
    }

    public static Collection a(Collection collection) {
        return ao.a(collection, k, new Object[0]);
    }

    public static Map a(Map map, String string, Object ... arrobject) {
        if (map == null) {
            throw new NullPointerException(String.format(string, arrobject));
        }
        if (map.isEmpty()) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
        return map;
    }

    public static Map a(Map map) {
        return ao.a(map, l, new Object[0]);
    }

    public static CharSequence a(CharSequence charSequence, String string, Object ... arrobject) {
        if (charSequence == null) {
            throw new NullPointerException(String.format(string, arrobject));
        }
        if (charSequence.length() == 0) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
        return charSequence;
    }

    public static CharSequence a(CharSequence charSequence) {
        return ao.a(charSequence, j, new Object[0]);
    }

    public static CharSequence b(CharSequence charSequence, String string, Object ... arrobject) {
        if (charSequence == null) {
            throw new NullPointerException(String.format(string, arrobject));
        }
        if (am.c(charSequence)) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
        return charSequence;
    }

    public static CharSequence b(CharSequence charSequence) {
        return ao.b(charSequence, h, new Object[0]);
    }

    public static Object[] b(Object[] arrobject, String string, Object ... arrobject2) {
        ao.a((Object)arrobject);
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            if (arrobject[i2] != null) continue;
            Object[] arrobject3 = org.apache.commons.c.c.d(arrobject2, (Object)i2);
            throw new IllegalArgumentException(String.format(string, arrobject3));
        }
        return arrobject;
    }

    public static Object[] b(Object[] arrobject) {
        return ao.b(arrobject, f, new Object[0]);
    }

    public static Iterable a(Iterable iterable, String string, Object ... arrobject) {
        ao.a((Object)iterable);
        int n2 = 0;
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == null) {
                Object[] arrobject2 = org.apache.commons.c.c.b(arrobject, new Object[]{n2});
                throw new IllegalArgumentException(String.format(string, arrobject2));
            }
            ++n2;
        }
        return iterable;
    }

    public static Iterable a(Iterable iterable) {
        return ao.a(iterable, g, new Object[0]);
    }

    public static Object[] a(Object[] arrobject, int n2, String string, Object ... arrobject2) {
        ao.a((Object)arrobject);
        if (n2 < 0 || n2 >= arrobject.length) {
            throw new IndexOutOfBoundsException(String.format(string, arrobject2));
        }
        return arrobject;
    }

    public static Object[] a(Object[] arrobject, int n2) {
        return ao.a(arrobject, n2, m, n2);
    }

    public static Collection a(Collection collection, int n2, String string, Object ... arrobject) {
        ao.a((Object)collection);
        if (n2 < 0 || n2 >= collection.size()) {
            throw new IndexOutOfBoundsException(String.format(string, arrobject));
        }
        return collection;
    }

    public static Collection a(Collection collection, int n2) {
        return ao.a(collection, n2, o, n2);
    }

    public static CharSequence a(CharSequence charSequence, int n2, String string, Object ... arrobject) {
        ao.a((Object)charSequence);
        if (n2 < 0 || n2 >= charSequence.length()) {
            throw new IndexOutOfBoundsException(String.format(string, arrobject));
        }
        return charSequence;
    }

    public static CharSequence a(CharSequence charSequence, int n2) {
        return ao.a(charSequence, n2, n, n2);
    }

    public static void b(boolean bl2) {
        if (!bl2) {
            throw new IllegalStateException(p);
        }
    }

    public static void b(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalStateException(String.format(string, arrobject));
        }
    }

    public static void a(CharSequence charSequence, String string) {
        if (!Pattern.matches(string, charSequence)) {
            throw new IllegalArgumentException(String.format(c, charSequence, string));
        }
    }

    public static void a(CharSequence charSequence, String string, String string2, Object ... arrobject) {
        if (!Pattern.matches(string, charSequence)) {
            throw new IllegalArgumentException(String.format(string2, arrobject));
        }
    }

    public static void a(Object object, Object object2, Comparable comparable) {
        if (comparable.compareTo(object) < 0 || comparable.compareTo(object2) > 0) {
            throw new IllegalArgumentException(String.format(b, comparable, object, object2));
        }
    }

    public static void a(Object object, Object object2, Comparable comparable, String string, Object ... arrobject) {
        if (comparable.compareTo(object) < 0 || comparable.compareTo(object2) > 0) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
    }

    public static void a(long l2, long l3, long l4) {
        if (l4 < l2 || l4 > l3) {
            throw new IllegalArgumentException(String.format(b, l4, l2, l3));
        }
    }

    public static void a(long l2, long l3, long l4, String string) {
        if (l4 < l2 || l4 > l3) {
            throw new IllegalArgumentException(String.format(string, new Object[0]));
        }
    }

    public static void a(double d2, double d3, double d4) {
        if (d4 < d2 || d4 > d3) {
            throw new IllegalArgumentException(String.format(b, d4, d2, d3));
        }
    }

    public static void a(double d2, double d3, double d4, String string) {
        if (d4 < d2 || d4 > d3) {
            throw new IllegalArgumentException(String.format(string, new Object[0]));
        }
    }

    public static void b(Object object, Object object2, Comparable comparable) {
        if (comparable.compareTo(object) <= 0 || comparable.compareTo(object2) >= 0) {
            throw new IllegalArgumentException(String.format(a, comparable, object, object2));
        }
    }

    public static void b(Object object, Object object2, Comparable comparable, String string, Object ... arrobject) {
        if (comparable.compareTo(object) <= 0 || comparable.compareTo(object2) >= 0) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
    }

    public static void b(long l2, long l3, long l4) {
        if (l4 <= l2 || l4 >= l3) {
            throw new IllegalArgumentException(String.format(a, l4, l2, l3));
        }
    }

    public static void b(long l2, long l3, long l4, String string) {
        if (l4 <= l2 || l4 >= l3) {
            throw new IllegalArgumentException(String.format(string, new Object[0]));
        }
    }

    public static void b(double d2, double d3, double d4) {
        if (d4 <= d2 || d4 >= d3) {
            throw new IllegalArgumentException(String.format(a, d4, d2, d3));
        }
    }

    public static void b(double d2, double d3, double d4, String string) {
        if (d4 <= d2 || d4 >= d3) {
            throw new IllegalArgumentException(String.format(string, new Object[0]));
        }
    }

    public static void a(Class class_, Object object) {
        if (!class_.isInstance(object)) {
            throw new IllegalArgumentException(String.format(r, class_.getName(), object == null ? "null" : object.getClass().getName()));
        }
    }

    public static void a(Class class_, Object object, String string, Object ... arrobject) {
        if (!class_.isInstance(object)) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
    }

    public static void a(Class class_, Class class_2) {
        if (!class_.isAssignableFrom(class_2)) {
            throw new IllegalArgumentException(String.format(q, class_2 == null ? "null" : class_2.getName(), class_.getName()));
        }
    }

    public static void a(Class class_, Class class_2, String string, Object ... arrobject) {
        if (!class_.isAssignableFrom(class_2)) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
    }
}

