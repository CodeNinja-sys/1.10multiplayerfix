/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import java.util.Comparator;
import net.minecraft.client.k.a.h;
import net.minecraft.client.k.a.j;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.r.c;
import net.minecraft.r.o;

class k
implements Comparator {
    final /* synthetic */ h a;

    k(h h2) {
        this.a = h2;
    }

    public int a(c c2, c c3) {
        cg cg2 = c2.a();
        cg cg3 = c3.a();
        net.minecraft.r.k k2 = null;
        net.minecraft.r.k k3 = null;
        if (this.a.y == 2) {
            k2 = o.a(cn.a(cg2));
            k3 = o.a(cn.a(cg3));
        } else if (this.a.y == 0) {
            k2 = o.a(cg2);
            k3 = o.a(cg3);
        } else if (this.a.y == 1) {
            k2 = o.b(cg2);
            k3 = o.b(cg3);
        } else if (this.a.y == 3) {
            k2 = o.d(cg2);
            k3 = o.d(cg3);
        } else if (this.a.y == 4) {
            k2 = o.e(cg2);
            k3 = o.e(cg3);
        }
        if (k2 != null || k3 != null) {
            int n2;
            if (k2 == null) {
                return 1;
            }
            if (k3 == null) {
                return -1;
            }
            int n3 = j.a(h.a(this.a)).a(k2);
            if (n3 != (n2 = j.a(h.a(this.a)).a(k3))) {
                return (n3 - n2) * this.a.z;
            }
        }
        return cg.a(cg2) - cg.a(cg3);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((c)object, (c)object2);
    }
}

