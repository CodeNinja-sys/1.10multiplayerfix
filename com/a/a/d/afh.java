/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.afb;
import com.a.a.d.aff;
import com.a.a.d.afg;
import com.a.a.d.afi;
import com.a.a.d.afj;
import com.a.a.d.afl;
import com.a.a.d.ov;
import com.a.a.d.yl;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class afh
extends AbstractMap {
    final /* synthetic */ afg a;

    afh(afg afg2) {
        this.a = afg2;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public Object get(Object object) {
        try {
            if (object instanceof yl) {
                yl yl2 = (yl)object;
                if (!afg.a(this.a).a(yl2) || yl2.j()) {
                    return null;
                }
                aff aff2 = null;
                if (yl2.b.a(afg.a((afg)this.a).b) == 0) {
                    Map.Entry entry = afb.a(this.a.a).floorEntry(yl2.b);
                    if (entry != null) {
                        aff2 = (aff)entry.getValue();
                    }
                } else {
                    aff2 = (aff)afb.a(this.a.a).get(yl2.b);
                }
                if (aff2 != null && aff2.a().b(afg.a(this.a)) && aff2.a().c(afg.a(this.a)).equals(yl2)) {
                    return aff2.getValue();
                }
            }
        }
        catch (ClassCastException classCastException) {
            return null;
        }
        return null;
    }

    @Override
    public Object remove(Object object) {
        Object object2 = this.get(object);
        if (object2 != null) {
            yl yl2 = (yl)object;
            this.a.a.a(yl2);
            return object2;
        }
        return null;
    }

    @Override
    public void clear() {
        this.a.d();
    }

    private boolean a(cm cm2) {
        ArrayList arrayList = ov.a();
        for (Object object : this.entrySet()) {
            if (!cm2.a(object)) continue;
            arrayList.add(object.getKey());
        }
        for (Object object : arrayList) {
            this.a.a.a((yl)object);
        }
        return !arrayList.isEmpty();
    }

    @Override
    public Set keySet() {
        return new afi(this, this);
    }

    @Override
    public Set entrySet() {
        return new afj(this);
    }

    @Override
    public Collection values() {
        return new afl(this, this);
    }

    static /* synthetic */ boolean a(afh afh2, cm cm2) {
        return afh2.a(cm2);
    }
}

