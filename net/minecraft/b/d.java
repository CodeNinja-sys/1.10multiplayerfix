/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.b;

import java.util.ArrayList;
import net.minecraft.b.b;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.e.u;
import net.minecraft.m.cu;
import net.minecraft.x.a;

public class d
extends ArrayList {
    public d() {
    }

    public d(e e2) {
        this.a(e2);
    }

    public b a(cu cu2, cu cu3, int n2) {
        if (n2 > 0 && n2 < this.size()) {
            b b2 = (b)this.get(n2);
            return !this.a(cu2, b2.a()) || (cu3 != null || b2.c()) && (!b2.c() || !this.a(cu3, b2.b())) || cu2.b < b2.a().b || b2.c() && cu3.b < b2.b().b ? null : b2;
        }
        for (int i2 = 0; i2 < this.size(); ++i2) {
            b b3 = (b)this.get(i2);
            if (!this.a(cu2, b3.a()) || cu2.b < b3.a().b || (b3.c() || cu3 != null) && (!b3.c() || !this.a(cu3, b3.b()) || cu3.b < b3.b().b)) continue;
            return b3;
        }
        return null;
    }

    private boolean a(cu cu2, cu cu3) {
        return cu.c(cu2, cu3) && (!cu3.n() || cu2.n() && u.a(cu3.o(), cu2.o(), false));
    }

    public void a(a a2) {
        a2.B((byte)(this.size() & 0xFF));
        for (int i2 = 0; i2 < this.size(); ++i2) {
            b b2 = (b)this.get(i2);
            a2.a(b2.a());
            a2.a(b2.d());
            cu cu2 = b2.b();
            a2.a(cu2 != null);
            if (cu2 != null) {
                a2.a(cu2);
            }
            a2.a(b2.h());
            a2.E(b2.e());
            a2.E(b2.f());
        }
    }

    public static d b(a a2) {
        d d2 = new d();
        int n2 = a2.E() & 0xFF;
        for (int i2 = 0; i2 < n2; ++i2) {
            cu cu2 = a2.i();
            cu cu3 = a2.i();
            cu cu4 = null;
            if (a2.D()) {
                cu4 = a2.i();
            }
            boolean bl2 = a2.D();
            int n3 = a2.K();
            int n4 = a2.K();
            b b2 = new b(cu2, cu4, cu3, n3, n4);
            if (bl2) {
                b2.i();
            }
            d2.add(b2);
        }
        return d2;
    }

    public void a(e e2) {
        q q2 = e2.c("Recipes", 10);
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            e e3 = q2.b(i2);
            this.add(new b(e3));
        }
    }

    public e a() {
        e e2 = new e();
        q q2 = new q();
        for (int i2 = 0; i2 < this.size(); ++i2) {
            b b2 = (b)this.get(i2);
            q2.a(b2.k());
        }
        e2.a("Recipes", q2);
        return e2;
    }
}

