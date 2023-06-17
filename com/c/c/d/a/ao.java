/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.g;
import com.c.c.d.a.an;
import com.c.c.d.e;
import net.minecraft.s.n;
import net.minecraft.s.v;
import org.lwjgl.a.j;
import org.lwjgl.opengl.GL11;

class ao
extends net.minecraft.s.g {
    final /* synthetic */ an a;

    public ao(an an2) {
        this.a = an2;
        super(an.a(an2) + 10, e.a(12) + 20, e.a(1), e.a(12) + 20, 13);
    }

    @Override
    public void a(int n2, int n3, int n4, float f2, int n5) {
        if (j.a(0) && this.f() >= n2 && this.f() <= n3) {
            int n6 = an.b(this.a);
            int n7 = an.b(this.a) + an.a(this.a);
            int n8 = this.f() - n2 - n4 + (int)f2 - 4;
            int n9 = n8 / n5;
            if (this.g() >= n6 && this.g() <= n7 && n9 >= 0 && n8 >= 0 && n9 < this.a()) {
                this.a(n8, n9, this.g(), this.f(), this.e());
            }
        }
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6) {
        if (n3 < 0 || n3 > an.c((an)this.a).h.size() || an.d(this.a) == null) {
            return;
        }
        if (an.d(this.a).equals(n.f("mco.configure.world.invites.ops.tooltip")) || an.d(this.a).equals(n.f("mco.configure.world.invites.normal.tooltip"))) {
            if (((g)an.c((an)this.a).h.get(n3)).c()) {
                an.a(this.a, n3);
            } else {
                an.b(this.a, n3);
            }
        } else if (an.d(this.a).equals(n.f("mco.configure.world.invites.remove.tooltip"))) {
            an.c(this.a, n3);
        }
    }

    @Override
    public void d() {
        this.a.p();
    }

    @Override
    public int c() {
        return an.b(this.a) + this.e() - 5;
    }

    @Override
    public int a() {
        return an.c(this.a) == null ? 1 : an.c((an)this.a).h.size();
    }

    @Override
    public int b() {
        return this.a() * 13;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, v v2, int n6, int n7) {
        if (an.c(this.a) == null) {
            return;
        }
        if (n2 < an.c((an)this.a).h.size()) {
            this.b(n2, n3, n4, n5);
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        g g2 = (g)an.c((an)this.a).h.get(n2);
        this.a.b(g2.a(), an.b(this.a) + 3 + 12, n4 + 1, g2.d() ? 0xFFFFFF : 0xA0A0A0);
        if (g2.c()) {
            an.a(this.a, an.b(this.a) + an.a(this.a) - 10, n4 + 1, this.g(), this.f());
        } else {
            an.b(this.a, an.b(this.a) + an.a(this.a) - 10, n4 + 1, this.g(), this.f());
        }
        an.c(this.a, an.b(this.a) + an.a(this.a) - 22, n4 + 2, this.g(), this.f());
        n.b(g2.b(), g2.a());
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        n.a(an.b(this.a) + 2 + 2, n4 + 1, 8.0f, 8.0f, 8, 8, 8, 8, 64.0f, 64.0f);
        n.a(an.b(this.a) + 2 + 2, n4 + 1, 40.0f, 8.0f, 8, 8, 8, 8, 64.0f, 64.0f);
    }
}

