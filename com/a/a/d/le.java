/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.afb;
import com.a.a.d.afm;
import com.a.a.d.jn;
import com.a.a.d.lb;
import com.a.a.d.yl;
import com.a.a.d.yq;
import com.a.a.d.yr;
import java.util.Map;

public final class le {
    private final yr a = afm.c();
    private final yq b = afb.a();

    public le a(yl yl2, Object object) {
        cl.a(yl2);
        cl.a(object);
        cl.a(!yl2.j(), "Range must not be empty, but was %s", new Object[]{yl2});
        if (!this.a.k().c(yl2)) {
            for (Map.Entry entry : this.b.f().entrySet()) {
                yl yl3 = (yl)entry.getKey();
                if (!yl3.b(yl2) || yl3.c(yl2).j()) continue;
                throw new IllegalArgumentException("Overlapping ranges: range " + yl2 + " overlaps with entry " + entry);
            }
        }
        this.a.a(yl2);
        this.b.b(yl2, object);
        return this;
    }

    public le a(yq yq2) {
        for (Map.Entry entry : yq2.f().entrySet()) {
            this.a((yl)entry.getKey(), entry.getValue());
        }
        return this;
    }

    public lb a() {
        Map map = this.b.f();
        jn jn2 = new jn(map.size());
        jn jn3 = new jn(map.size());
        for (Map.Entry entry : map.entrySet()) {
            jn2.c(entry.getKey());
            jn3.c(entry.getValue());
        }
        return new lb(jn2.b(), jn3.b());
    }
}

