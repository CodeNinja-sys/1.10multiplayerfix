/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.a.d.ov;
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ag;
import com.a.b.t;
import com.a.b.u;
import com.a.b.z;
import java.util.ArrayList;
import net.minecraft.o.j;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.g;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.w;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class m
extends w {
    public m() {
        super(new bp("enchant_randomly"), g.class);
    }

    public void a(z z2, g g2, ad ad2) {
        if (g.a(g2) != null && !g.a(g2).isEmpty()) {
            t t2 = new t();
            for (j j2 : g.a(g2)) {
                bp bp2 = (bp)j.b.b(j2);
                if (bp2 == null) {
                    throw new IllegalArgumentException("Don't know how to serialize enchantment " + j2);
                }
                t2.a(new ac(bp2.toString()));
            }
            z2.a("enchantments", t2);
        }
    }

    public g a(z z2, u u2, a[] arra) {
        ArrayList arrayList = null;
        if (z2.b("enchantments")) {
            arrayList = ov.a();
            for (com.a.b.w w2 : bc.l(z2, "enchantments")) {
                String string = bc.a(w2, "enchantment");
                j j2 = (j)j.b.a(new bp(string));
                if (j2 == null) {
                    throw new ag("Unknown enchantment '" + string + "'");
                }
                arrayList.add(j2);
            }
        }
        return new g(arra, arrayList);
    }

    @Override
    public /* synthetic */ o b(z z2, u u2, a[] arra) {
        return this.a(z2, u2, arra);
    }
}

