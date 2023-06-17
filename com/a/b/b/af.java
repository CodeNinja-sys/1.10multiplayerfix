/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.b.a;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class af {
    private static final Map a;
    private static final Map b;

    private af() {
    }

    private static void a(Map map, Map map2, Class class_, Class class_2) {
        map.put(class_, class_2);
        map2.put(class_2, class_);
    }

    public static boolean a(Type type) {
        return a.containsKey(type);
    }

    public static boolean b(Type type) {
        return b.containsKey(com.a.b.b.a.a(type));
    }

    public static Class a(Class class_) {
        Class class_2 = (Class)a.get(com.a.b.b.a.a(class_));
        return class_2 == null ? class_ : class_2;
    }

    public static Class b(Class class_) {
        Class class_2 = (Class)b.get(com.a.b.b.a.a(class_));
        return class_2 == null ? class_ : class_2;
    }

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        af.a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        af.a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        af.a(hashMap, hashMap2, Character.TYPE, Character.class);
        af.a(hashMap, hashMap2, Double.TYPE, Double.class);
        af.a(hashMap, hashMap2, Float.TYPE, Float.class);
        af.a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        af.a(hashMap, hashMap2, Long.TYPE, Long.class);
        af.a(hashMap, hashMap2, Short.TYPE, Short.class);
        af.a(hashMap, hashMap2, Void.TYPE, Void.class);
        a = Collections.unmodifiableMap(hashMap);
        b = Collections.unmodifiableMap(hashMap2);
    }
}

