/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.r.d;
import net.minecraft.r.k;
import net.minecraft.u.aq;
import net.minecraft.u.ca;
import net.minecraft.w.a.b;

public class f {
    protected final Map a = sz.e();

    public boolean a(d d2) {
        return this.a((k)d2) > 0;
    }

    public boolean b(d d2) {
        return d2.c == null || this.a(d2.c);
    }

    public int c(d d2) {
        if (this.a(d2)) {
            return 0;
        }
        int n2 = 0;
        d d3 = d2.c;
        while (d3 != null && !this.a(d3)) {
            d3 = d3.c;
            ++n2;
        }
        return n2;
    }

    public void b(b b2, k k2, int n2) {
        if (!k2.d() || this.b((d)k2)) {
            this.a(b2, k2, this.a(k2) + n2);
        }
    }

    public void a(b b2, k k2, int n2) {
        ca ca2 = (ca)this.a.get(k2);
        if (ca2 == null) {
            ca2 = new ca();
            this.a.put(k2, ca2);
        }
        ca2.a(n2);
    }

    public int a(k k2) {
        ca ca2 = (ca)this.a.get(k2);
        return ca2 == null ? 0 : ca2.a();
    }

    public aq b(k k2) {
        ca ca2 = (ca)this.a.get(k2);
        return ca2 != null ? ca2.b() : null;
    }

    public aq a(k k2, aq aq2) {
        ca ca2 = (ca)this.a.get(k2);
        if (ca2 == null) {
            ca2 = new ca();
            this.a.put(k2, ca2);
        }
        ca2.a(aq2);
        return aq2;
    }
}

