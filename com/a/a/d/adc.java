/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.acv;
import com.a.a.d.adi;
import com.a.a.d.bw;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class adc
extends adi
implements bw,
Serializable {
    private transient Set a;
    private transient bw b;
    private static final long f = 0L;

    private adc(bw bw2, Object object, bw bw3) {
        super(bw2, object);
        this.b = bw3;
    }

    bw a() {
        return (bw)super.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set c() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = acu.a(this.a().c(), this.h);
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a(Object object, Object object2) {
        Object object3 = this.h;
        synchronized (object3) {
            return this.a().a(object, object2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public bw aT_() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = new adc(this.a().aT_(), this.h, this);
            }
            return this.b;
        }
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.c();
    }

    @Override
    /* synthetic */ Map d() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }

    /* synthetic */ adc(bw bw2, Object object, bw bw3, acv acv2) {
        this(bw2, object, bw3);
    }
}

