/*
 * Decompiled with CFR 0.150.
 */
package b.a;

import java.util.HashMap;
import java.util.Map;

public final class b {
    private static final Map a = new HashMap(13);

    private b() {
        throw new UnsupportedOperationException();
    }

    public static String a(String string) {
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public static Class a(Class class_) {
        return class_.isPrimitive() ? (Class)a.get(class_) : class_;
    }

    static {
        a.put(Boolean.TYPE, Boolean.class);
        a.put(Byte.TYPE, Byte.class);
        a.put(Character.TYPE, Character.class);
        a.put(Double.TYPE, Double.class);
        a.put(Float.TYPE, Float.class);
        a.put(Integer.TYPE, Integer.class);
        a.put(Long.TYPE, Long.class);
        a.put(Short.TYPE, Short.class);
        a.put(Void.TYPE, Void.class);
    }
}

