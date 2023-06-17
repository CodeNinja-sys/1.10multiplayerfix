/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dd;
import net.minecraft.o.j;
import net.minecraft.o.k;
import net.minecraft.w.a.b;

public class al
extends cg {
    @Override
    public boolean e(cu cu2) {
        return true;
    }

    @Override
    public boolean g(cu cu2) {
        return false;
    }

    @Override
    public dd f(cu cu2) {
        return this.h(cu2).c() ? super.f(cu2) : dd.b;
    }

    public q h(cu cu2) {
        e e2 = cu2.o();
        return e2 != null && e2.b("StoredEnchantments", 9) ? (q)e2.c("StoredEnchantments") : new q();
    }

    @Override
    public void a(cu cu2, b b2, List list, boolean bl2) {
        super.a(cu2, b2, list, bl2);
        q q2 = this.h(cu2);
        if (q2 != null) {
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                short s2 = q2.b(i2).g("id");
                short s3 = q2.b(i2).g("lvl");
                if (net.minecraft.o.j.c(s2) == null) continue;
                list.add(net.minecraft.o.j.c(s2).d(s3));
            }
        }
    }

    public void a(cu cu2, k k2) {
        q q2 = this.h(cu2);
        boolean bl2 = true;
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            e e2 = q2.b(i2);
            if (net.minecraft.o.j.c(e2.g("id")) != k2.a) continue;
            if (e2.g("lvl") < k2.b) {
                e2.a("lvl", (short)k2.b);
            }
            bl2 = false;
            break;
        }
        if (bl2) {
            e e3 = new e();
            e3.a("id", (short)net.minecraft.o.j.b(k2.a));
            e3.a("lvl", (short)k2.b);
            q2.a(e3);
        }
        if (!cu2.n()) {
            cu2.d(new e());
        }
        cu2.o().a("StoredEnchantments", q2);
    }

    public cu a(k k2) {
        cu cu2 = new cu(this);
        this.a(cu2, k2);
        return cu2;
    }

    public void a(j j2, List list) {
        for (int i2 = j2.d(); i2 <= j2.a(); ++i2) {
            list.add(this.a(new k(j2, i2)));
        }
    }
}

