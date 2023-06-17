/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.util.ArrayList;
import java.util.List;
import org.apache.a.ae;
import org.apache.a.ai;
import org.apache.a.aj;
import org.apache.a.f;
import org.apache.a.j.c;
import org.apache.a.j.h;
import org.apache.a.k.l;
import org.apache.a.k.w;
import org.apache.a.l.i;
import org.apache.a.l.j;
import org.apache.a.o.d;
import org.apache.a.t;

public abstract class a
implements c {
    private static final int b = 0;
    private static final int c = 1;
    private final h d;
    private final org.apache.a.e.d e;
    private final List f;
    protected final w a;
    private int g;
    private t h;

    public a(h h2, w w2, j j2) {
        org.apache.a.o.a.a(h2, "Session input buffer");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        this.d = h2;
        this.e = i.b(j2);
        this.a = w2 != null ? w2 : l.b;
        this.f = new ArrayList();
        this.g = 0;
    }

    public a(h h2, w w2, org.apache.a.e.d d2) {
        this.d = (h)org.apache.a.o.a.a(h2, "Session input buffer");
        this.a = w2 != null ? w2 : l.b;
        this.e = d2 != null ? d2 : org.apache.a.e.d.a;
        this.f = new ArrayList();
        this.g = 0;
    }

    public static f[] a(h h2, int n2, int n3, w w2) {
        ArrayList arrayList = new ArrayList();
        return org.apache.a.i.g.a.a(h2, n2, n3, w2 != null ? w2 : l.b, arrayList);
    }

    public static f[] a(h h2, int n2, int n3, w w2, List list) {
        int n4;
        block9: {
            org.apache.a.o.a.a(h2, "Session input buffer");
            org.apache.a.o.a.a(w2, "Line parser");
            org.apache.a.o.a.a((Object)list, "Header line list");
            d d2 = null;
            d d3 = null;
            do {
                if (d2 == null) {
                    d2 = new d(64);
                } else {
                    d2.a();
                }
                int n5 = h2.a(d2);
                if (n5 == -1 || d2.e() < 1) break block9;
                if ((d2.a(0) == ' ' || d2.a(0) == '\t') && d3 != null) {
                    char c2;
                    for (n4 = 0; n4 < d2.e() && ((c2 = d2.a(n4)) == ' ' || c2 == '\t'); ++n4) {
                    }
                    if (n3 > 0 && d3.e() + 1 + d2.e() - n4 > n3) {
                        throw new ae("Maximum line length limit exceeded");
                    }
                    d3.a(' ');
                    d3.a(d2, n4, d2.e() - n4);
                    continue;
                }
                list.add(d2);
                d3 = d2;
                d2 = null;
            } while (n2 <= 0 || list.size() < n2);
            throw new ae("Maximum header count exceeded");
        }
        f[] arrf = new f[list.size()];
        for (n4 = 0; n4 < list.size(); ++n4) {
            d d4 = (d)list.get(n4);
            try {
                arrf[n4] = w2.a(d4);
                continue;
            }
            catch (ai ai2) {
                throw new aj(ai2.getMessage());
            }
        }
        return arrf;
    }

    protected abstract t b(h var1);

    public t a() {
        int n2 = this.g;
        switch (n2) {
            case 0: {
                try {
                    this.h = this.b(this.d);
                }
                catch (ai ai2) {
                    throw new aj(ai2.getMessage(), ai2);
                }
                this.g = 1;
            }
            case 1: {
                f[] arrf = org.apache.a.i.g.a.a(this.d, this.e.b(), this.e.a(), this.a, this.f);
                this.h.a(arrf);
                t t2 = this.h;
                this.h = null;
                this.f.clear();
                this.g = 0;
                return t2;
            }
        }
        throw new IllegalStateException("Inconsistent parser state");
    }
}

