/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import com.a.a.b.au;
import com.a.a.b.av;
import com.a.a.b.bl;
import com.a.a.b.cg;
import com.a.a.b.ck;
import com.a.a.b.cl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class as {
    private static final Map a = new WeakHashMap();

    private as() {
    }

    public static Field a(Enum enum_) {
        Class class_ = enum_.getDeclaringClass();
        try {
            return class_.getDeclaredField(enum_.name());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new AssertionError((Object)noSuchFieldException);
        }
    }

    public static bl a(Class class_) {
        return new av(class_, null);
    }

    public static cg a(Class class_, String string) {
        cl.a(class_);
        cl.a(string);
        return ck.a(class_, string);
    }

    private static Map d(Class class_) {
        HashMap<String, WeakReference<Enum>> hashMap = new HashMap<String, WeakReference<Enum>>();
        for (Enum enum_ : EnumSet.allOf(class_)) {
            hashMap.put(enum_.name(), new WeakReference<Enum>(enum_));
        }
        a.put(class_, hashMap);
        return hashMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static Map b(Class class_) {
        Map map = a;
        synchronized (map) {
            Map map2 = (Map)a.get(class_);
            if (map2 == null) {
                map2 = as.d(class_);
            }
            return map2;
        }
    }

    public static ak c(Class class_) {
        return new au(class_);
    }
}

