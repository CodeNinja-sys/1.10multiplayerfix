/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.b.dz;
import com.a.a.b.ea;
import com.a.a.b.eb;
import com.a.a.b.ed;
import com.a.a.b.ee;
import com.a.a.b.ef;
import java.util.concurrent.TimeUnit;

public final class dy {
    private dy() {
    }

    public static dx a(bl bl2, dx dx2) {
        cl.a(bl2);
        cl.a(dx2);
        return new eb(bl2, dx2);
    }

    public static dx a(dx dx2) {
        return dx2 instanceof ea ? dx2 : new ea((dx)cl.a(dx2));
    }

    public static dx a(dx dx2, long l2, TimeUnit timeUnit) {
        return new dz(dx2, l2, timeUnit);
    }

    public static dx a(Object object) {
        return new ee(object);
    }

    public static dx b(dx dx2) {
        return new ef((dx)cl.a(dx2));
    }

    public static bl a() {
        ed ed2 = ed.a;
        return ed2;
    }
}

