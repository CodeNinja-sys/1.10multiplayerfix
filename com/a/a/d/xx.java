/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ck;
import com.a.a.d.pn;
import com.a.a.d.qb;
import com.a.a.d.xy;
import com.a.a.l.z;
import java.util.HashMap;
import java.util.Map;

public final class xx
extends qb
implements ck {
    private static final pn a = new xy();
    private static final long c = 0L;

    public static xx b() {
        return new xx(new HashMap());
    }

    public static xx a(Map map) {
        return new xx(map);
    }

    private xx(Map map) {
        super(map, a);
    }

    @Override
    public Object a(Class class_, Object object) {
        return xx.c(class_, this.put(class_, object));
    }

    @Override
    public Object a(Class class_) {
        return xx.c(class_, this.get(class_));
    }

    private static Object c(Class class_, Object object) {
        return z.b(class_).cast(object);
    }

    static /* synthetic */ Object b(Class class_, Object object) {
        return xx.c(class_, object);
    }
}

