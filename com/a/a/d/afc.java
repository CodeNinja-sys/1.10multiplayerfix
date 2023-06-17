/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.yl;
import com.a.a.d.yq;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;

final class afc
implements yq {
    afc() {
    }

    @Override
    public Object a(Comparable comparable) {
        return null;
    }

    @Override
    public Map.Entry b(Comparable comparable) {
        return null;
    }

    @Override
    public yl c() {
        throw new NoSuchElementException();
    }

    @Override
    public void b(yl yl2, Object object) {
        cl.a(yl2);
        throw new IllegalArgumentException("Cannot insert range " + yl2 + " into an empty subRangeMap");
    }

    @Override
    public void b(yq yq2) {
        if (!yq2.f().isEmpty()) {
            throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
        }
    }

    @Override
    public void d() {
    }

    @Override
    public void a(yl yl2) {
        cl.a(yl2);
    }

    @Override
    public Map f() {
        return Collections.emptyMap();
    }

    @Override
    public yq c(yl yl2) {
        cl.a(yl2);
        return this;
    }
}

