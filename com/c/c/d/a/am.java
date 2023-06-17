/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.d;
import com.c.c.d.a.ai;
import com.c.c.e.s;
import net.minecraft.s.g;
import net.minecraft.s.n;
import net.minecraft.s.v;
import org.lwjgl.a.j;
import org.lwjgl.opengl.GL11;

class am
extends g {
    final /* synthetic */ ai a;

    public am(ai ai2) {
        this.a = ai2;
        super(ai2.r() + 50, ai2.s(), 32, ai2.s() - 40, 36);
    }

    @Override
    public int a() {
        return ai.a(this.a).size();
    }

    @Override
    public int b() {
        return this.a() * 36;
    }

    @Override
    public void d() {
        this.a.p();
    }

    @Override
    public void a(int n2, int n3, int n4, v v2) {
        int n5 = this.c() - 290;
        int n6 = this.c() - 10;
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.l(3553);
        v2.a(7, net.minecraft.s.j.i);
        v2.a((double)n5, (double)(n3 + n4 + 2), 0.0).a(0.0, 1.0).a(128, 128, 128, 255).c();
        v2.a((double)n6, (double)(n3 + n4 + 2), 0.0).a(1.0, 1.0).a(128, 128, 128, 255).c();
        v2.a((double)n6, (double)(n3 - 2), 0.0).a(1.0, 0.0).a(128, 128, 128, 255).c();
        v2.a((double)n5, (double)(n3 - 2), 0.0).a(0.0, 0.0).a(128, 128, 128, 255).c();
        v2.a((double)(n5 + 1), (double)(n3 + n4 + 1), 0.0).a(0.0, 1.0).a(0, 0, 0, 255).c();
        v2.a((double)(n6 - 1), (double)(n3 + n4 + 1), 0.0).a(1.0, 1.0).a(0, 0, 0, 255).c();
        v2.a((double)(n6 - 1), (double)(n3 - 1), 0.0).a(1.0, 0.0).a(0, 0, 0, 255).c();
        v2.a((double)(n5 + 1), (double)(n3 - 1), 0.0).a(0.0, 0.0).a(0, 0, 0, 255).c();
        v2.a();
        GL11.k(3553);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 < ai.a(this.a).size()) {
            this.b(n2, n3, n4, n5);
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        d d2 = (d)ai.a(this.a).get(n2);
        this.a.b(d2.b, n3 + 2, n4 + 1, 0xFFFFFF);
        this.a.b(d2.c, n3 + 2, n4 + 12, 0x6C6C6C);
        this.a.b(s.a(System.currentTimeMillis() - d2.e.getTime()), n3 + 2, n4 + 24, 0x6C6C6C);
        int n6 = this.c() - 50;
        this.c(n6, n4, this.g(), this.f());
        this.d(n6 + 20, n4, this.g(), this.f());
        n.b(d2.d, d2.c);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        n.a(n3 - 36, n4, 8.0f, 8.0f, 8, 8, 32, 32, 64.0f, 64.0f);
        n.a(n3 - 36, n4, 40.0f, 8.0f, 8, 8, 32, 32, 64.0f, 64.0f);
    }

    private void c(int n2, int n3, int n4, int n5) {
        boolean bl2 = false;
        if (n4 >= n2 && n4 <= n2 + 15 && n5 >= n3 && n5 <= n3 + 15 && n5 < this.a.s() - 40 && n5 > 32) {
            bl2 = true;
        }
        n.d("realms:textures/gui/realms/accept_icon.png");
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        n.a(n2, n3, bl2 ? 19.0f : 0.0f, 0.0f, 18, 18, 37.0f, 18.0f);
        GL11.k();
        if (bl2) {
            ai.a(this.a, n.f("mco.invites.button.accept"));
        }
    }

    private void d(int n2, int n3, int n4, int n5) {
        boolean bl2 = false;
        if (n4 >= n2 && n4 <= n2 + 15 && n5 >= n3 && n5 <= n3 + 15 && n5 < this.a.s() - 40 && n5 > 32) {
            bl2 = true;
        }
        n.d("realms:textures/gui/realms/reject_icon.png");
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        n.a(n2, n3, bl2 ? 19.0f : 0.0f, 0.0f, 18, 18, 37.0f, 18.0f);
        GL11.k();
        if (bl2) {
            ai.a(this.a, n.f("mco.invites.button.reject"));
        }
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.c() - 50;
        int n8 = n2 + 30 - this.i();
        if (n4 >= n7 && n4 <= n7 + 15 && n5 >= n8 && n5 <= n8 + 15) {
            ai.b(this.a, n3);
        } else if (n4 >= n7 + 20 && n4 <= n7 + 20 + 15 && n5 >= n8 && n5 <= n8 + 15) {
            ai.c(this.a, n3);
        }
    }

    @Override
    public void a(int n2, int n3, int n4, float f2, int n5) {
        if (j.a(0) && this.f() >= n2 && this.f() <= n3) {
            int n6 = this.e() / 2 - 92;
            int n7 = this.e();
            int n8 = this.f() - n2 - n4 + (int)f2 - 4;
            int n9 = n8 / n5;
            if (this.g() >= n6 && this.g() <= n7 && n9 >= 0 && n8 >= 0 && n9 < this.a()) {
                this.a(n8, n9, this.g(), this.f(), this.e());
            }
        }
    }
}

