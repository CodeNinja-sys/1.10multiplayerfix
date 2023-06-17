/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bw;
import com.a.a.d.pn;
import com.a.a.d.qb;
import com.a.a.d.qh;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class pw
extends qb
implements bw {
    volatile bw a;

    pw(bw bw2, bw bw3, pn pn2) {
        super(bw2, pn2);
        this.a = bw3;
    }

    protected bw d() {
        return (bw)super.a();
    }

    @Override
    public Object a(Object object, Object object2) {
        this.b.a(object, object2);
        return this.d().a(object, object2);
    }

    @Override
    public bw aT_() {
        if (this.a == null) {
            this.a = new pw(this.d().aT_(), this, new qh(this.b));
        }
        return this.a;
    }

    @Override
    public Set c() {
        return this.d().c();
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.d();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.d();
    }
}

