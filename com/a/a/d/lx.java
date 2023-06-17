/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.lw;
import java.util.Comparator;
import java.util.Map;

public class lx
extends ju {
    private final Comparator c;

    public lx(Comparator comparator) {
        this.c = (Comparator)cl.a(comparator);
    }

    public lx a(Object object, Object object2) {
        super.b(object, object2);
        return this;
    }

    public lx b(Map.Entry entry) {
        super.a(entry);
        return this;
    }

    public lx a(Map map) {
        super.b(map);
        return this;
    }

    public lw a() {
        return lw.a(this.c, false, this.b, this.a);
    }

    @Override
    public /* synthetic */ jt b() {
        return this.a();
    }

    @Override
    public /* synthetic */ ju b(Map map) {
        return this.a(map);
    }

    @Override
    public /* synthetic */ ju a(Map.Entry entry) {
        return this.b(entry);
    }

    @Override
    public /* synthetic */ ju b(Object object, Object object2) {
        return this.a(object, object2);
    }
}

