/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.List;
import java.util.Map;
import org.apache.commons.a.c.a.m;
import org.apache.commons.a.c.a.p;

final class n {
    private final Map a;
    private final CharSequence b;
    private m c;
    private int d;
    private final int e;
    private boolean f;

    public n(Map map, CharSequence charSequence, m m2, int n2, int n3) {
        if (map == null) {
            throw new NullPointerException("The finalRules argument must not be null");
        }
        this.a = map;
        this.c = m2;
        this.b = charSequence;
        this.d = n2;
        this.e = n3;
    }

    public int a() {
        return this.d;
    }

    public m b() {
        return this.c;
    }

    public n c() {
        this.f = false;
        int n2 = 1;
        List list = (List)this.a.get(this.b.subSequence(this.d, this.d + n2));
        if (list != null) {
            for (p p2 : list) {
                String string = p2.b();
                n2 = string.length();
                if (!p2.a(this.b, this.d)) continue;
                this.c.a(p2.c(), this.e);
                this.f = true;
                break;
            }
        }
        if (!this.f) {
            n2 = 1;
        }
        this.d += n2;
        return this;
    }

    public boolean d() {
        return this.f;
    }
}

