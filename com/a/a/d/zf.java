/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.iq;
import com.a.a.d.jt;
import com.a.a.d.ka;
import com.a.a.d.kb;
import com.a.a.d.lo;
import com.a.a.d.zh;
import com.a.a.d.zi;
import java.util.Map;

final class zf
extends jt {
    private final transient ka[] a;
    private final transient ka[] b;
    private final transient int c;
    private static final double d = 1.2;
    private static final long e = 0L;

    zf(kb ... arrkb) {
        this(arrkb.length, arrkb);
    }

    zf(int n2, kb[] arrkb) {
        this.a = this.a(n2);
        int n3 = iq.a(n2, 1.2);
        this.b = this.a(n3);
        this.c = n3 - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            kb kb2 = arrkb[i2];
            Object object = kb2.getKey();
            int n4 = iq.a(object.hashCode()) & this.c;
            ka ka2 = this.b[n4];
            ka ka3 = ka2 == null ? kb2 : new zi(kb2, ka2);
            this.b[n4] = ka3;
            this.a[i2] = ka3;
            this.a(object, ka3, ka2);
        }
    }

    zf(Map.Entry[] arrentry) {
        int n2 = arrentry.length;
        this.a = this.a(n2);
        int n3 = iq.a(n2, 1.2);
        this.b = this.a(n3);
        this.c = n3 - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            Map.Entry entry = arrentry[i2];
            Object k2 = entry.getKey();
            Object v2 = entry.getValue();
            cl.a(k2, v2);
            int n4 = iq.a(k2.hashCode()) & this.c;
            ka ka2 = this.b[n4];
            ka ka3 = ka2 == null ? new kb(k2, v2) : new zi(k2, v2, ka2);
            this.b[n4] = ka3;
            this.a[i2] = ka3;
            this.a(k2, ka3, ka2);
        }
    }

    private void a(Object object, ka ka2, ka ka3) {
        while (ka3 != null) {
            zf.a(!object.equals(ka3.getKey()), "key", ka2, ka3);
            ka3 = ka3.a();
        }
    }

    private ka[] a(int n2) {
        return new ka[n2];
    }

    @Override
    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = iq.a(object.hashCode()) & this.c;
        for (ka ka2 = this.b[n2]; ka2 != null; ka2 = ka2.a()) {
            Object object2 = ka2.getKey();
            if (!object.equals(object2)) continue;
            return ka2.getValue();
        }
        return null;
    }

    @Override
    public int size() {
        return this.a.length;
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    lo d() {
        return new zh(this, null);
    }

    static /* synthetic */ ka[] a(zf zf2) {
        return zf2.a;
    }
}

