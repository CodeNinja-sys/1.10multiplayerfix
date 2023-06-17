/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.mk;
import com.a.a.d.mm;
import com.a.a.d.mn;
import com.a.a.d.mo;
import com.a.a.d.ql;
import java.util.concurrent.ConcurrentMap;

public final class ml {
    private ml() {
    }

    public static mk a() {
        ConcurrentMap concurrentMap = new ql().e();
        return new mm(concurrentMap);
    }

    public static mk b() {
        return new mo(null);
    }

    public static bl a(mk mk2) {
        return new mn((mk)cl.a(mk2));
    }
}

