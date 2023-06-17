/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.iw;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.l.z;
import java.util.Map;

public final class iy {
    private final ju a = jt.n();

    public iy a(Class class_, Object object) {
        this.a.b(class_, object);
        return this;
    }

    public iy a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Class class_ = (Class)entry.getKey();
            Object v2 = entry.getValue();
            this.a.b(class_, iy.b(class_, v2));
        }
        return this;
    }

    private static Object b(Class class_, Object object) {
        return z.b(class_).cast(object);
    }

    public iw a() {
        return new iw(this.a.b(), null);
    }
}

