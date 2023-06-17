/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.afb;
import com.a.a.d.aff;
import com.a.a.d.afh;
import com.a.a.d.dw;
import com.a.a.d.sz;
import com.a.a.d.yl;
import com.a.a.d.yq;
import java.util.Map;
import java.util.NoSuchElementException;

class afg
implements yq {
    private final yl b;
    final /* synthetic */ afb a;

    afg(afb afb2, yl yl2) {
        this.a = afb2;
        this.b = yl2;
    }

    @Override
    public Object a(Comparable comparable) {
        return this.b.f(comparable) ? this.a.a(comparable) : null;
    }

    @Override
    public Map.Entry b(Comparable comparable) {
        Map.Entry entry;
        if (this.b.f(comparable) && (entry = this.a.b(comparable)) != null) {
            return sz.a(((yl)entry.getKey()).c(this.b), entry.getValue());
        }
        return null;
    }

    @Override
    public yl c() {
        dw dw2;
        Map.Entry entry = afb.a(this.a).floorEntry(this.b.b);
        if (entry != null && ((aff)entry.getValue()).c().a(this.b.b) > 0) {
            dw2 = this.b.b;
        } else {
            dw2 = afb.a(this.a).ceilingKey(this.b.b);
            if (dw2 == null || dw2.a(this.b.c) >= 0) {
                throw new NoSuchElementException();
            }
        }
        Map.Entry entry2 = afb.a(this.a).lowerEntry(this.b.c);
        if (entry2 == null) {
            throw new NoSuchElementException();
        }
        dw dw3 = ((aff)entry2.getValue()).c().a(this.b.c) >= 0 ? this.b.c : ((aff)entry2.getValue()).c();
        return yl.a(dw2, dw3);
    }

    @Override
    public void b(yl yl2, Object object) {
        cl.a(this.b.a(yl2), "Cannot put range %s into a subRangeMap(%s)", new Object[]{yl2, this.b});
        this.a.b(yl2, object);
    }

    @Override
    public void b(yq yq2) {
        if (yq2.f().isEmpty()) {
            return;
        }
        yl yl2 = yq2.c();
        cl.a(this.b.a(yl2), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", new Object[]{yl2, this.b});
        this.a.b(yq2);
    }

    @Override
    public void d() {
        this.a.a(this.b);
    }

    @Override
    public void a(yl yl2) {
        if (yl2.b(this.b)) {
            this.a.a(yl2.c(this.b));
        }
    }

    @Override
    public yq c(yl yl2) {
        if (!yl2.b(this.b)) {
            return afb.b(this.a);
        }
        return this.a.c(yl2.c(this.b));
    }

    @Override
    public Map f() {
        return new afh(this);
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
        return this.f().toString();
    }

    static /* synthetic */ yl a(afg afg2) {
        return afg2.b;
    }
}

