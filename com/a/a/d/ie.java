/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bw;
import com.a.a.d.hy;
import com.a.a.d.hz;
import com.a.a.d.ia;
import com.a.a.d.if;
import com.a.a.d.ii;
import com.a.a.d.ik;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

final class ie
extends AbstractMap
implements bw,
Serializable {
    final /* synthetic */ hy a;

    private ie(hy hy2) {
        this.a = hy2;
    }

    bw a() {
        return this.a;
    }

    @Override
    public int size() {
        return hy.c(this.a);
    }

    @Override
    public void clear() {
        this.a().clear();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a().containsValue(object);
    }

    public Object get(Object object) {
        ia ia2 = hy.b(this.a, object, hy.a(object));
        return ia2 == null ? null : ia2.e;
    }

    @Override
    public Object put(Object object, Object object2) {
        return hy.a(this.a, object, object2, false);
    }

    @Override
    public Object a(Object object, Object object2) {
        return hy.a(this.a, object, object2, true);
    }

    public Object remove(Object object) {
        ia ia2 = hy.b(this.a, object, hy.a(object));
        if (ia2 == null) {
            return null;
        }
        hy.a(this.a, ia2);
        return ia2.e;
    }

    @Override
    public bw aT_() {
        return this.a();
    }

    public Set keySet() {
        return new ii(this);
    }

    @Override
    public Set c() {
        return this.a().keySet();
    }

    public Set entrySet() {
        return new if(this);
    }

    Object d() {
        return new ik(this.a);
    }

    public /* synthetic */ Collection values() {
        return this.c();
    }

    /* synthetic */ ie(hy hy2, hz hz2) {
        this(hy2);
    }
}

