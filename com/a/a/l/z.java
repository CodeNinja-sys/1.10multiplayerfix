/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class z {
    private static final Map a;
    private static final Map b;

    private z() {
    }

    private static void a(Map map, Map map2, Class class_, Class class_2) {
        map.put(class_, class_2);
        map2.put(class_2, class_);
    }

    public static Set a() {
        return a.keySet();
    }

    public static Set b() {
        return b.keySet();
    }

    public static boolean a(Class class_) {
        return b.containsKey(cl.a(class_));
    }

    public static Class b(Class class_) {
        cl.a(class_);
        Class class_2 = (Class)a.get(class_);
        return class_2 == null ? class_ : class_2;
    }

    public static Class c(Class class_) {
        cl.a(class_);
        Class class_2 = (Class)b.get(class_);
        return class_2 == null ? class_ : class_2;
    }

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        z.a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        z.a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        z.a(hashMap, hashMap2, Character.TYPE, Character.class);
        z.a(hashMap, hashMap2, Double.TYPE, Double.class);
        z.a(hashMap, hashMap2, Float.TYPE, Float.class);
        z.a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        z.a(hashMap, hashMap2, Long.TYPE, Long.class);
        z.a(hashMap, hashMap2, Short.TYPE, Short.class);
        z.a(hashMap, hashMap2, Void.TYPE, Void.class);
        a = Collections.unmodifiableMap(hashMap);
        b = Collections.unmodifiableMap(hashMap2);
    }
}

