/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.afc;
import com.a.a.d.afd;
import com.a.a.d.aff;
import com.a.a.d.afg;
import com.a.a.d.dw;
import com.a.a.d.sz;
import com.a.a.d.yl;
import com.a.a.d.yq;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;

public final class afb
implements yq {
    private final NavigableMap a = sz.f();
    private static final yq b = new afc();

    public static afb a() {
        return new afb();
    }

    private afb() {
    }

    @Override
    public Object a(Comparable comparable) {
        Map.Entry entry = this.b(comparable);
        return entry == null ? null : entry.getValue();
    }

    @Override
    public Map.Entry b(Comparable comparable) {
        Map.Entry entry = this.a.floorEntry(dw.b(comparable));
        if (entry != null && ((aff)entry.getValue()).a(comparable)) {
            return (Map.Entry)entry.getValue();
        }
        return null;
    }

    @Override
    public void b(yl yl2, Object object) {
        if (!yl2.j()) {
            cl.a(object);
            this.a(yl2);
            this.a.put(yl2.b, new aff(yl2, object));
        }
    }

    @Override
    public void b(yq yq2) {
        for (Map.Entry entry : yq2.f().entrySet()) {
            this.b((yl)entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void d() {
        this.a.clear();
    }

    @Override
    public yl c() {
        Map.Entry entry = this.a.firstEntry();
        Map.Entry entry2 = this.a.lastEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return yl.a(((aff)entry.getValue()).a().b, ((aff)entry2.getValue()).a().c);
    }

    private void a(dw dw2, dw dw3, Object object) {
        this.a.put(dw2, new aff(dw2, dw3, object));
    }

    @Override
    public void a(yl yl2) {
        aff aff2;
        Map.Entry entry;
        if (yl2.j()) {
            return;
        }
        Map.Entry entry2 = this.a.lowerEntry(yl2.b);
        if (entry2 != null && ((aff)(entry = (aff)entry2.getValue())).c().a(yl2.b) > 0) {
            if (((aff)entry).c().a(yl2.c) > 0) {
                this.a(yl2.c, ((aff)entry).c(), ((aff)entry2.getValue()).getValue());
            }
            this.a(((aff)entry).b(), yl2.b, ((aff)entry2.getValue()).getValue());
        }
        if ((entry = this.a.lowerEntry(yl2.c)) != null && (aff2 = (aff)entry.getValue()).c().a(yl2.c) > 0) {
            this.a(yl2.c, aff2.c(), ((aff)entry.getValue()).getValue());
            this.a.remove(yl2.b);
        }
        this.a.subMap(yl2.b, yl2.c).clear();
    }

    @Override
    public Map f() {
        return new afd(this, null);
    }

    @Override
    public yq c(yl yl2) {
        if (yl2.equals(yl.c())) {
            return this;
        }
        return new afg(this, yl2);
    }

    private yq b() {
        return b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof yq) {
            yq yq2 = (yq)object;
            return this.f().equals(yq2.f());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.f().hashCode();
    }

    @Override
    public String toString() {
        return this.a.values().toString();
    }

    static /* synthetic */ NavigableMap a(afb afb2) {
        return afb2.a;
    }

    static /* synthetic */ yq b(afb afb2) {
        return afb2.b();
    }
}

