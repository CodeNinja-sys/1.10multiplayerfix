/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.afn;
import com.a.a.d.afo;
import com.a.a.d.afp;
import com.a.a.d.afw;
import com.a.a.d.ay;
import com.a.a.d.dw;
import com.a.a.d.yl;
import com.a.a.d.yr;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

public class afm
extends ay {
    final NavigableMap a;
    private transient Set b;
    private transient yr c;

    public static afm c() {
        return new afm(new TreeMap());
    }

    public static afm d(yr yr2) {
        afm afm2 = afm.c();
        afm2.b(yr2);
        return afm2;
    }

    private afm(NavigableMap navigableMap) {
        this.a = navigableMap;
    }

    @Override
    public Set l() {
        Set set = this.b;
        return set == null ? (this.b = new afo(this)) : set;
    }

    @Override
    public yl b(Comparable comparable) {
        cl.a(comparable);
        Map.Entry entry = this.a.floorEntry(dw.b(comparable));
        if (entry != null && ((yl)entry.getValue()).f(comparable)) {
            return (yl)entry.getValue();
        }
        return null;
    }

    @Override
    public boolean c(yl yl2) {
        cl.a(yl2);
        Map.Entry entry = this.a.floorEntry(yl2.b);
        return entry != null && ((yl)entry.getValue()).a(yl2);
    }

    private yl d(yl yl2) {
        cl.a(yl2);
        Map.Entry entry = this.a.floorEntry(yl2.b);
        return entry != null && ((yl)entry.getValue()).a(yl2) ? (yl)entry.getValue() : null;
    }

    @Override
    public yl e() {
        Map.Entry entry = this.a.firstEntry();
        Map.Entry entry2 = this.a.lastEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return yl.a(((yl)entry.getValue()).b, ((yl)entry2.getValue()).c);
    }

    @Override
    public void a(yl yl2) {
        Object object;
        cl.a(yl2);
        if (yl2.j()) {
            return;
        }
        dw dw2 = yl2.b;
        dw dw3 = yl2.c;
        Map.Entry entry = this.a.lowerEntry(dw2);
        if (entry != null) {
            object = (yl)entry.getValue();
            if (((yl)object).c.a(dw2) >= 0) {
                if (((yl)object).c.a(dw3) >= 0) {
                    dw3 = ((yl)object).c;
                }
                dw2 = ((yl)object).b;
            }
        }
        if ((object = this.a.floorEntry(dw3)) != null) {
            yl yl3 = (yl)object.getValue();
            if (yl3.c.a(dw3) >= 0) {
                dw3 = yl3.c;
            }
        }
        this.a.subMap(dw2, dw3).clear();
        this.e(yl.a(dw2, dw3));
    }

    @Override
    public void b(yl yl2) {
        Object object;
        cl.a(yl2);
        if (yl2.j()) {
            return;
        }
        Map.Entry entry = this.a.lowerEntry(yl2.b);
        if (entry != null) {
            object = (yl)entry.getValue();
            if (((yl)object).c.a(yl2.b) >= 0) {
                if (yl2.g() && ((yl)object).c.a(yl2.c) >= 0) {
                    this.e(yl.a(yl2.c, ((yl)object).c));
                }
                this.e(yl.a(((yl)object).b, yl2.b));
            }
        }
        if ((object = this.a.floorEntry(yl2.c)) != null) {
            yl yl3 = (yl)object.getValue();
            if (yl2.g() && yl3.c.a(yl2.c) >= 0) {
                this.e(yl.a(yl2.c, yl3.c));
            }
        }
        this.a.subMap(yl2.b, yl2.c).clear();
    }

    private void e(yl yl2) {
        if (yl2.j()) {
            this.a.remove(yl2.b);
        } else {
            this.a.put(yl2.b, yl2);
        }
    }

    @Override
    public yr k() {
        yr yr2 = this.c;
        return yr2 == null ? (this.c = new afp(this)) : yr2;
    }

    @Override
    public yr f(yl yl2) {
        return yl2.equals(yl.c()) ? this : new afw(this, yl2);
    }

    /* synthetic */ afm(NavigableMap navigableMap, afn afn2) {
        this(navigableMap);
    }

    static /* synthetic */ yl a(afm afm2, yl yl2) {
        return afm2.d(yl2);
    }
}

