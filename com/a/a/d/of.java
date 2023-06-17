/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aan;
import com.a.a.d.iq;
import com.a.a.d.oc;
import com.a.a.d.oe;
import com.a.a.d.og;
import com.a.a.d.oh;
import java.util.Arrays;
import java.util.Iterator;

final class of
extends aan
implements oh {
    private final Object c;
    oe[] a;
    private int d = 0;
    private int e = 0;
    private oh f;
    private oh g;
    final /* synthetic */ oc b;

    of(oc oc2, Object object, int n2) {
        this.b = oc2;
        this.c = object;
        this.f = this;
        this.g = this;
        int n3 = iq.a(n2, 1.0);
        oe[] arroe = new oe[n3];
        this.a = arroe;
    }

    private int c() {
        return this.a.length - 1;
    }

    @Override
    public oh a() {
        return this.g;
    }

    @Override
    public oh b() {
        return this.f;
    }

    @Override
    public void a(oh oh2) {
        this.g = oh2;
    }

    @Override
    public void b(oh oh2) {
        this.f = oh2;
    }

    @Override
    public Iterator iterator() {
        return new og(this);
    }

    @Override
    public int size() {
        return this.d;
    }

    @Override
    public boolean contains(Object object) {
        int n2 = iq.a(object);
        oe oe2 = this.a[n2 & this.c()];
        while (oe2 != null) {
            if (oe2.a(object, n2)) {
                return true;
            }
            oe2 = oe2.b;
        }
        return false;
    }

    @Override
    public boolean add(Object object) {
        oe oe2;
        int n2 = iq.a(object);
        int n3 = n2 & this.c();
        oe oe3 = oe2 = this.a[n3];
        while (oe3 != null) {
            if (oe3.a(object, n2)) {
                return false;
            }
            oe3 = oe3.b;
        }
        oe3 = new oe(this.c, object, n2, oe2);
        oc.a(this.g, (oh)oe3);
        oc.a((oh)oe3, this);
        oc.a(oc.a(this.b).c(), oe3);
        oc.a(oe3, oc.a(this.b));
        this.a[n3] = oe3;
        ++this.d;
        ++this.e;
        this.d();
        return true;
    }

    private void d() {
        if (iq.a(this.d, this.a.length, 1.0)) {
            oe[] arroe = new oe[this.a.length * 2];
            this.a = arroe;
            int n2 = arroe.length - 1;
            for (oh oh2 = this.f; oh2 != this; oh2 = oh2.b()) {
                oe oe2 = (oe)oh2;
                int n3 = oe2.a & n2;
                oe2.b = arroe[n3];
                arroe[n3] = oe2;
            }
        }
    }

    @Override
    public boolean remove(Object object) {
        int n2 = iq.a(object);
        int n3 = n2 & this.c();
        oe oe2 = null;
        oe oe3 = this.a[n3];
        while (oe3 != null) {
            if (oe3.a(object, n2)) {
                if (oe2 == null) {
                    this.a[n3] = oe3.b;
                } else {
                    oe2.b = oe3.b;
                }
                oc.a((oh)oe3);
                oc.a(oe3);
                --this.d;
                ++this.e;
                return true;
            }
            oe2 = oe3;
            oe3 = oe3.b;
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(this.a, null);
        this.d = 0;
        for (oh oh2 = this.f; oh2 != this; oh2 = oh2.b()) {
            oe oe2 = (oe)oh2;
            oc.a(oe2);
        }
        oc.a(this, this);
        ++this.e;
    }

    static /* synthetic */ oh a(of of2) {
        return of2.f;
    }

    static /* synthetic */ int b(of of2) {
        return of2.e;
    }
}

