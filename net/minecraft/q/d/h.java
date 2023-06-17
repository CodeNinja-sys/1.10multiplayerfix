/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.d;

import java.util.List;
import net.minecraft.q.d.b;
import net.minecraft.q.d.d;
import net.minecraft.q.v;
import net.minecraft.w.f.ad;

class h
extends d {
    @Override
    public void a(v v2, b b2, List list, int n2, net.minecraft.u.b.b b3) {
        if (n2 >= 100) {
            b2.a(e);
            b2.f();
            for (ad ad2 : list) {
                ad2.a((net.minecraft.u.b.b)null);
                v2.a(ad2, ad2.aU, ad2.aV, ad2.aW, 6.0f, false);
                ad2.aa();
            }
        } else if (n2 >= 80) {
            v2.b(3001, new net.minecraft.u.b.b(0, 128, 0), 0);
        } else if (n2 == 0) {
            for (ad ad3 : list) {
                ad3.a(new net.minecraft.u.b.b(0, 128, 0));
            }
        } else if (n2 < 5) {
            v2.b(3001, new net.minecraft.u.b.b(0, 128, 0), 0);
        }
    }
}

