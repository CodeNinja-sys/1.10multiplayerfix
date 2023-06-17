/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bw;
import com.a.a.d.cl;
import com.a.a.d.iq;
import com.a.a.d.it;
import com.a.a.d.ka;
import com.a.a.d.kb;
import com.a.a.d.lo;
import com.a.a.d.yy;
import com.a.a.d.yz;
import com.a.a.d.zd;
import java.util.Map;

class yx
extends it {
    static final double a = 1.2;
    private final transient ka[] b;
    private final transient ka[] c;
    private final transient ka[] d;
    private final transient int e;
    private final transient int f;
    private transient it g;

    yx(kb ... arrkb) {
        this(arrkb.length, arrkb);
    }

    yx(int n2, kb[] arrkb) {
        int n3 = iq.a(n2, 1.2);
        this.e = n3 - 1;
        ka[] arrka = yx.a(n3);
        ka[] arrka2 = yx.a(n3);
        ka[] arrka3 = yx.a(n2);
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            ka ka2;
            ka ka3;
            ka ka4;
            kb kb2 = arrkb[i2];
            Object object = kb2.getKey();
            Object object2 = kb2.getValue();
            int n5 = object.hashCode();
            int n6 = object2.hashCode();
            int n7 = iq.a(n5) & this.e;
            int n8 = iq.a(n6) & this.e;
            for (ka4 = ka3 = arrka[n7]; ka4 != null; ka4 = ka4.a()) {
                yx.a(!object.equals(ka4.getKey()), "key", kb2, ka4);
            }
            for (ka2 = ka4 = arrka2[n8]; ka2 != null; ka2 = ka2.b()) {
                yx.a(!object2.equals(ka2.getValue()), "value", kb2, ka2);
            }
            arrka[n7] = ka2 = ka3 == null && ka4 == null ? kb2 : new zd(kb2, ka3, ka4);
            arrka2[n8] = ka2;
            arrka3[i2] = ka2;
            n4 += n5 ^ n6;
        }
        this.b = arrka;
        this.c = arrka2;
        this.d = arrka3;
        this.f = n4;
    }

    yx(Map.Entry[] arrentry) {
        int n2 = arrentry.length;
        int n3 = iq.a(n2, 1.2);
        this.e = n3 - 1;
        ka[] arrka = yx.a(n3);
        ka[] arrka2 = yx.a(n3);
        ka[] arrka3 = yx.a(n2);
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            ka ka2;
            ka ka3;
            ka ka4;
            Map.Entry entry = arrentry[i2];
            Object k2 = entry.getKey();
            Object v2 = entry.getValue();
            cl.a(k2, v2);
            int n5 = k2.hashCode();
            int n6 = v2.hashCode();
            int n7 = iq.a(n5) & this.e;
            int n8 = iq.a(n6) & this.e;
            for (ka4 = ka3 = arrka[n7]; ka4 != null; ka4 = ka4.a()) {
                yx.a(!k2.equals(ka4.getKey()), "key", entry, ka4);
            }
            for (ka2 = ka4 = arrka2[n8]; ka2 != null; ka2 = ka2.b()) {
                yx.a(!v2.equals(ka2.getValue()), "value", entry, ka2);
            }
            arrka[n7] = ka2 = ka3 == null && ka4 == null ? new kb(k2, v2) : new zd(k2, v2, ka3, ka4);
            arrka2[n8] = ka2;
            arrka3[i2] = ka2;
            n4 += n5 ^ n6;
        }
        this.b = arrka;
        this.c = arrka2;
        this.d = arrka3;
        this.f = n4;
    }

    private static ka[] a(int n2) {
        return new ka[n2];
    }

    @Override
    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = iq.a(object.hashCode()) & this.e;
        for (ka ka2 = this.b[n2]; ka2 != null; ka2 = ka2.a()) {
            if (!object.equals(ka2.getKey())) continue;
            return ka2.getValue();
        }
        return null;
    }

    @Override
    lo d() {
        return new yy(this);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    public int size() {
        return this.d.length;
    }

    @Override
    public it a() {
        it it2 = this.g;
        return it2 == null ? (this.g = new yz(this, null)) : it2;
    }

    @Override
    public /* synthetic */ bw aT_() {
        return this.a();
    }

    static /* synthetic */ ka[] a(yx yx2) {
        return yx2.d;
    }

    static /* synthetic */ int b(yx yx2) {
        return yx2.f;
    }

    static /* synthetic */ int c(yx yx2) {
        return yx2.e;
    }

    static /* synthetic */ ka[] d(yx yx2) {
        return yx2.c;
    }
}

