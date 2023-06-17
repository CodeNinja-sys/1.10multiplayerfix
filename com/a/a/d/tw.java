/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.d.bw;
import com.a.a.d.tx;
import com.a.a.d.ty;
import java.util.Collection;
import java.util.Set;

final class tw
extends ty
implements bw {
    private final bw d;

    private static cm a(cm cm2) {
        return new tx(cm2);
    }

    tw(bw bw2, cm cm2) {
        super(bw2, cm2);
        this.d = new tw(bw2.aT_(), tw.a(cm2), this);
    }

    private tw(bw bw2, cm cm2, bw bw3) {
        super(bw2, cm2);
        this.d = bw3;
    }

    bw d() {
        return (bw)this.a;
    }

    @Override
    public Object a(Object object, Object object2) {
        cl.a(this.b(object, object2));
        return this.d().a(object, object2);
    }

    @Override
    public bw aT_() {
        return this.d;
    }

    @Override
    public Set c() {
        return this.d.keySet();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.c();
    }
}

