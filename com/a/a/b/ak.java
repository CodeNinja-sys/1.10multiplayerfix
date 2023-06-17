/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.al;
import com.a.a.b.an;
import com.a.a.b.ao;
import com.a.a.b.ap;
import com.a.a.b.aq;
import com.a.a.b.bl;
import com.a.a.b.cl;

public abstract class ak
implements bl {
    private final boolean a;
    private transient ak b;

    protected ak() {
        this(true);
    }

    ak(boolean bl2) {
        this.a = bl2;
    }

    protected abstract Object c(Object var1);

    protected abstract Object b(Object var1);

    public final Object d(Object object) {
        return this.e(object);
    }

    Object e(Object object) {
        if (this.a) {
            return object == null ? null : cl.a(this.c(object));
        }
        return this.c(object);
    }

    Object f(Object object) {
        if (this.a) {
            return object == null ? null : cl.a(this.b(object));
        }
        return this.b(object);
    }

    public Iterable a(Iterable iterable) {
        cl.a(iterable, (Object)"fromIterable");
        return new al(this, iterable);
    }

    public ak a() {
        ak ak2 = this.b;
        return ak2 == null ? (this.b = new aq(this)) : ak2;
    }

    public ak a(ak ak2) {
        return new an(this, (ak)cl.a(ak2));
    }

    @Override
    public final Object a(Object object) {
        return this.d(object);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public static ak a(bl bl2, bl bl3) {
        return new ao(bl2, bl3, null);
    }

    public static ak b() {
        return ap.a;
    }
}

