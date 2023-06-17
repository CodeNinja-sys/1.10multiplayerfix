/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.cc;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.d.b.a;
import net.minecraft.w.a.b;
import net.minecraft.w.f.h;

public class w
extends cg {
    @Override
    public ab a(cu cu2, b b2, k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (!k2.C) {
            h h2 = new h(k2, (float)b3.cy_() + f2, (float)b3.k() + f3, (float)b3.l() + f4, cu2);
            k2.a(h2);
            if (!b2.J.d) {
                --cu2.b;
            }
        }
        return ab.a;
    }

    @Override
    public void a(cu cu2, b b2, List list, boolean bl2) {
        e e2;
        if (cu2.n() && (e2 = cu2.o().o("Fireworks")) != null) {
            q q2;
            if (e2.b("Flight", 99)) {
                list.add(String.valueOf(a.a("item.fireworks.flight")) + " " + e2.f("Flight"));
            }
            if ((q2 = e2.c("Explosions", 10)) != null && !q2.c()) {
                for (int i2 = 0; i2 < q2.e(); ++i2) {
                    e e3 = q2.b(i2);
                    ArrayList arrayList = ov.a();
                    cc.a(e3, arrayList);
                    if (arrayList.isEmpty()) continue;
                    for (int i3 = 1; i3 < arrayList.size(); ++i3) {
                        arrayList.set(i3, "  " + (String)arrayList.get(i3));
                    }
                    list.addAll(arrayList);
                }
            }
        }
    }
}

