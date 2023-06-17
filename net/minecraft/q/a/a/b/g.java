/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.m.cu;
import net.minecraft.o.j;
import net.minecraft.o.k;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.m;
import net.minecraft.u.b.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class g
extends o {
    private static final d a = c.c();
    private final List b;

    public g(a[] arra, List list) {
        super(arra);
        this.b = list;
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        j j2;
        if (this.b != null && !this.b.isEmpty()) {
            j2 = (j)this.b.get(random.nextInt(this.b.size()));
        } else {
            ArrayList arrayList = ov.a();
            for (j j3 : j.b) {
                if (cu2.a() != w.aS && !j3.a(cu2)) continue;
                arrayList.add(j3);
            }
            if (arrayList.isEmpty()) {
                a.f("Couldn't find a compatible enchantment for {}", cu2);
                return cu2;
            }
            j2 = (j)arrayList.get(random.nextInt(arrayList.size()));
        }
        int n2 = n.a(random, j2.d(), j2.a());
        if (cu2.a() == w.aS) {
            cu2.a(w.cn);
            w.cn.a(cu2, new k(j2, n2));
        } else {
            cu2.a(j2, n2);
        }
        return cu2;
    }

    static /* synthetic */ List a(g g2) {
        return g2.b;
    }
}

