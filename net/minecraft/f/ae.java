/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import java.util.Random;
import net.minecraft.e.q;
import net.minecraft.f.i;
import net.minecraft.h.aq;
import net.minecraft.h.l;
import net.minecraft.h.v;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.u.a.c;
import net.minecraft.u.a.e;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class ae
extends i
implements y {
    private static final Random d = new Random();
    private cu[] e = new cu[9];
    protected String c;

    @Override
    public int e() {
        return 9;
    }

    @Override
    public cu a(int n2) {
        this.a((b)null);
        return this.e[n2];
    }

    @Override
    public cu a(int n2, int n3) {
        this.a((b)null);
        cu cu2 = v.a(this.e, n2, n3);
        if (cu2 != null) {
            this.C();
        }
        return cu2;
    }

    @Override
    public cu b(int n2) {
        this.a((b)null);
        return v.a(this.e, n2);
    }

    public int k() {
        this.a((b)null);
        int n2 = -1;
        int n3 = 1;
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            if (this.e[i2] == null || d.nextInt(n3++) != 0) continue;
            n2 = i2;
        }
        return n2;
    }

    @Override
    public void a(int n2, cu cu2) {
        this.a((b)null);
        this.e[n2] = cu2;
        if (cu2 != null && cu2.b > this.g()) {
            cu2.b = this.g();
        }
        this.C();
    }

    public int a(cu cu2) {
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            if (this.e[i2] != null && this.e[i2].a() != null) continue;
            this.a(i2, cu2);
            return i2;
        }
        return -1;
    }

    @Override
    public String X() {
        return this.bO_() ? this.c : "container.dispenser";
    }

    public void a(String string) {
        this.c = string;
    }

    @Override
    public boolean bO_() {
        return this.c != null;
    }

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.d, (e)new net.minecraft.u.a.b.e("Trap", new String[]{"Items"}));
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        if (!this.c(e2)) {
            q q2 = e2.c("Items", 10);
            this.e = new cu[this.e()];
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                net.minecraft.e.e e3 = q2.b(i2);
                int n2 = e3.f("Slot") & 0xFF;
                if (n2 < 0 || n2 >= this.e.length) continue;
                this.e[n2] = cu.a(e3);
            }
        }
        if (e2.b("CustomName", 8)) {
            this.c = e2.l("CustomName");
        }
    }

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        if (!this.d(e2)) {
            q q2 = new q();
            for (int i2 = 0; i2 < this.e.length; ++i2) {
                if (this.e[i2] == null) continue;
                net.minecraft.e.e e3 = new net.minecraft.e.e();
                e3.a("Slot", (byte)i2);
                this.e[i2].b(e3);
                q2.a(e3);
            }
            e2.a("Items", q2);
        }
        if (this.bO_()) {
            e2.a("CustomName", this.c);
        }
        return e2;
    }

    @Override
    public int g() {
        return 64;
    }

    @Override
    public boolean a_(b b2) {
        return this.k.q(this.l) != this ? false : b2.h((double)this.l.cy_() + 0.5, (double)this.l.k() + 0.5, (double)this.l.l() + 0.5) <= 64.0;
    }

    @Override
    public void b(b b2) {
    }

    @Override
    public void c(b b2) {
    }

    @Override
    public boolean b(int n2, cu cu2) {
        return true;
    }

    @Override
    public String h() {
        return "minecraft:dispenser";
    }

    @Override
    public aq a(a a2, b b2) {
        this.a(b2);
        return new l(a2, this);
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public void j() {
        this.a((b)null);
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            this.e[i2] = null;
        }
    }
}

