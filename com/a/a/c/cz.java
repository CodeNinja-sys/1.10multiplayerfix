/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.cu;
import com.a.a.c.dl;
import com.a.a.c.dn;
import com.a.a.c.do;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class cz
extends dl
implements cu,
Serializable {
    private static final long f = 7249069246863182397L;

    @Override
    final long a(long l2, long l3) {
        return l2 + l3;
    }

    @Override
    public void a(long l2) {
        long l3;
        dn[] arrdn = this.c;
        if (this.c != null || !this.b(l3 = this.d, l3 + l2)) {
            long l4;
            dn dn2;
            int n2;
            boolean bl2 = true;
            do do_ = (do)a.get();
            int n3 = do_.b;
            if (arrdn == null || (n2 = arrdn.length) < 1 || (dn2 = arrdn[n2 - 1 & n3]) == null || !(bl2 = dn2.a(l4 = dn2.h, l4 + l2))) {
                this.a(l2, do_, bl2);
            }
        }
    }

    @Override
    public void a() {
        this.a(1L);
    }

    public void c() {
        this.a(-1L);
    }

    @Override
    public long b() {
        long l2 = this.d;
        dn[] arrdn = this.c;
        if (arrdn != null) {
            for (dn dn2 : arrdn) {
                if (dn2 == null) continue;
                l2 += dn2.h;
            }
        }
        return l2;
    }

    public void d() {
        this.b(0L);
    }

    public long e() {
        long l2 = this.d;
        dn[] arrdn = this.c;
        this.d = 0L;
        if (arrdn != null) {
            for (dn dn2 : arrdn) {
                if (dn2 == null) continue;
                l2 += dn2.h;
                dn2.h = 0L;
            }
        }
        return l2;
    }

    public String toString() {
        return Long.toString(this.b());
    }

    @Override
    public long longValue() {
        return this.b();
    }

    @Override
    public int intValue() {
        return (int)this.b();
    }

    @Override
    public float floatValue() {
        return this.b();
    }

    @Override
    public double doubleValue() {
        return this.b();
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.b());
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.e = 0;
        this.c = null;
        this.d = objectInputStream.readLong();
    }
}

