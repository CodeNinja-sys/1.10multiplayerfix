/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ar {
    private static final Map a;

    private ar() {
    }

    private static void a(Map map, Class class_, Object object) {
        map.put(class_, object);
    }

    public static Object a(Class class_) {
        Object v2 = a.get(cl.a(class_));
        return v2;
    }

    static {
        HashMap hashMap = new HashMap();
        ar.a(hashMap, Boolean.TYPE, false);
        ar.a(hashMap, Character.TYPE, Character.valueOf('\u0000'));
        ar.a(hashMap, Byte.TYPE, (byte)0);
        ar.a(hashMap, Short.TYPE, (short)0);
        ar.a(hashMap, Integer.TYPE, 0);
        ar.a(hashMap, Long.TYPE, 0L);
        ar.a(hashMap, Float.TYPE, Float.valueOf(0.0f));
        ar.a(hashMap, Double.TYPE, 0.0);
        a = Collections.unmodifiableMap(hashMap);
    }
}

