/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.util.ArrayList;
import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.l.g;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

public class h {
    public static ArrayList a(int n2, int n3, int n4, k k2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(h.a(p.a, k2, true, n2 - 3, n3 - 1, n4, n2 + 3, n3 + 5, n4 + 300));
        arrayList.addAll(h.a(p.h, k2, false, n2 - 1, n3, n4, n2 + 1, n3, n4 + 300));
        arrayList.addAll(h.a(p.h, k2, false, n2 - 4, n3 - 2, n4, n2 + 4, n3 - 2, n4 + 300));
        arrayList.addAll(h.a(p.h, k2, false, n2 - 4, n3 + 6, n4, n2 + 4, n3 + 6, n4 + 300));
        arrayList.addAll(h.a(p.h, k2, false, n2 - 4, n3 - 1, n4, n2 - 4, n3 + 5, n4 + 300));
        arrayList.addAll(h.a(p.h, k2, false, n2 + 4, n3 - 1, n4, n2 + 4, n3 + 5, n4 + 300));
        arrayList.addAll(h.a(p.l, k2, false, n2 - 3, n3 - 1, n4, n2 + 3, n3 - 1, n4 + 299));
        arrayList.addAll(h.a(p.h, k2, false, n2 - 4, n3 - 2, n4, n2 + 4, n3 + 6, n4));
        arrayList.addAll(h.a(p.a, k2, false, n2, n3 + 1, n4, n2, n3 + 2, n4));
        arrayList.addAll(h.a(p.h, k2, false, n2 - 4, n3 - 2, n4 + 300, n2 + 4, n3 + 6, n4 + 300));
        return arrayList;
    }

    public static ArrayList a(cn cn2, k k2, boolean bl2, int n2, int n3, int n4, int n5, int n6, int n7) {
        ArrayList<g> arrayList = new ArrayList<g>();
        for (int i2 = n2; i2 <= n5; ++i2) {
            for (int i3 = n3; i3 <= n6; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && k2.n(new b(i2, i3, i4)).c() == p.a) continue;
                    arrayList.add(new g(i2, i3, i4, cn2));
                }
            }
        }
        return arrayList;
    }
}

