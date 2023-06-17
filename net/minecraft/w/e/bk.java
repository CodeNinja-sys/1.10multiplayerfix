/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.w.ac;
import net.minecraft.w.d;
import net.minecraft.w.e.c;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class bk
extends c {
    public bk(k k2) {
        super(k2);
        this.d(0.7f, 0.5f);
    }

    public static void d(a a2) {
        f.a(a2, "CaveSpider");
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.a).a(12.0);
    }

    @Override
    public boolean j(n n2) {
        if (super.j(n2)) {
            if (n2 instanceof l) {
                int n3 = 0;
                if (this.aQ.R() == net.minecraft.q.l.c) {
                    n3 = 7;
                } else if (this.aQ.R() == net.minecraft.q.l.d) {
                    n3 = 15;
                }
                if (n3 > 0) {
                    ((l)n2).c(new net.minecraft.d.j(net.minecraft.a.c.s, n3 * 20, 0));
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public ac a(z z2, ac ac2) {
        return ac2;
    }

    @Override
    public float ce_() {
        return 0.45f;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.s;
    }
}

