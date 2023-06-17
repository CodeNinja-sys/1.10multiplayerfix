/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import java.util.Comparator;
import net.minecraft.client.k.a.d;
import net.minecraft.client.k.a.j;
import net.minecraft.m.cg;
import net.minecraft.r.c;
import net.minecraft.r.k;
import net.minecraft.r.o;

class f
implements Comparator {
    final /* synthetic */ d a;

    f(d d2) {
        this.a = d2;
    }

    public int a(c c2, c c3) {
        cg cg2 = c2.a();
        cg cg3 = c3.a();
        int n2 = cg.a(cg2);
        int n3 = cg.a(cg3);
        k k2 = null;
        k k3 = null;
        if (this.a.y == 0) {
            k2 = o.c(cg2);
            k3 = o.c(cg3);
        } else if (this.a.y == 1) {
            k2 = o.a(cg2);
            k3 = o.a(cg3);
        } else if (this.a.y == 2) {
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
            int n4;
            if (k2 == null) {
                return 1;
            }
            if (k3 == null) {
                return -1;
            }
            int n5 = j.a(d.a(this.a)).a(k2);
            if (n5 != (n4 = j.a(d.a(this.a)).a(k3))) {
                return (n5 - n4) * this.a.z;
            }
        }
        return n2 - n3;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((c)object, (c)object2);
    }
}

