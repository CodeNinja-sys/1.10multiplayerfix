/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.e.q;
import net.minecraft.f.ak;
import net.minecraft.h.e;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;

public class p
extends e {
    private ak a;

    public p() {
        super("container.enderchest", false, 27);
    }

    public void a(ak ak2) {
        this.a = ak2;
    }

    public void a(q q2) {
        int n2;
        for (n2 = 0; n2 < this.e(); ++n2) {
            this.a(n2, null);
        }
        for (n2 = 0; n2 < q2.e(); ++n2) {
            net.minecraft.e.e e2 = q2.b(n2);
            int n3 = e2.f("Slot") & 0xFF;
            if (n3 < 0 || n3 >= this.e()) continue;
            this.a(n3, cu.a(e2));
        }
    }

    public q a() {
        q q2 = new q();
        for (int i2 = 0; i2 < this.e(); ++i2) {
            cu cu2 = this.a(i2);
            if (cu2 == null) continue;
            net.minecraft.e.e e2 = new net.minecraft.e.e();
            e2.a("Slot", (byte)i2);
            cu2.b(e2);
            q2.a(e2);
        }
        return q2;
    }

    @Override
    public boolean a_(b b2) {
        return this.a != null && !this.a.a(b2) ? false : super.a_(b2);
    }

    @Override
    public void b(b b2) {
        if (this.a != null) {
            this.a.b();
        }
        super.b(b2);
    }

    @Override
    public void c(b b2) {
        if (this.a != null) {
            this.a.g();
        }
        super.c(b2);
        this.a = null;
    }
}

