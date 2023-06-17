/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.vi;
import java.util.AbstractCollection;
import java.util.Map;

abstract class wm
extends AbstractCollection {
    wm() {
    }

    abstract vi a();

    @Override
    public int size() {
        return this.a().g();
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return this.a().b(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return this.a().c(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    public void clear() {
        this.a().h();
    }
}

