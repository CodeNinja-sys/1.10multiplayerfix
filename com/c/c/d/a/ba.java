/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.ac;
import com.c.c.d.a.ay;
import com.c.c.d.e;
import com.c.c.e.s;
import net.minecraft.s.g;
import net.minecraft.s.n;
import net.minecraft.s.q;
import net.minecraft.s.v;
import org.lwjgl.a.j;
import org.lwjgl.opengl.GL11;

class ba
extends g {
    final /* synthetic */ ay a;

    public ba(ay ay2) {
        this.a = ay2;
        super(ay2.r(), ay2.s(), ay.d(ay2) ? e.a(1) : 32, ay2.s() - 40, 46);
    }

    @Override
    public int a() {
        return ay.c(this.a).size();
    }

    @Override
    public void a(int n2, int n3, int n4, float f2, int n5) {
        if (j.a(0) && this.f() >= n2 && this.f() <= n3) {
            int n6 = this.e() / 2 - 150;
            int n7 = this.e();
            int n8 = this.f() - n2 - n4 + (int)f2 - 4;
            int n9 = n8 / n5;
            if (this.g() >= n6 && this.g() <= n7 && n9 >= 0 && n8 >= 0 && n9 < this.a()) {
                this.a(n8, n9, this.g(), this.f(), this.e());
                if (n9 >= ay.c(this.a).size()) {
                    return;
                }
                ay.e(this.a).b(true);
                ay.a(this.a, n9);
                ay.a(this.a, null);
                ay.b(this.a, ay.f(this.a) + (q.b / 3 + 1));
                if (ay.f(this.a) >= q.b / 2) {
                    ay.g(this.a);
                }
            }
        }
    }

    @Override
    public boolean a(int n2) {
        if (ay.c(this.a).size() == 0) {
            return false;
        }
        if (n2 >= ay.c(this.a).size()) {
            return false;
        }
        if (ay.h(this.a) != null) {
            boolean bl2 = ay.h((ay)this.a).b.equals(((ac)ay.c((ay)this.a).get((int)n2)).b);
            if (bl2) {
                ay.a(this.a, n2);
            }
            return bl2;
        }
        return n2 == ay.i(this.a);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6) {
        if (n3 >= ay.c(this.a).size()) {
            return;
        }
        if (ay.j(this.a) != null) {
            s.a(ay.j(this.a));
        }
    }

    @Override
    public int b() {
        return this.a() * 46;
    }

    @Override
    public void d() {
        this.a.p();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 < ay.c(this.a).size()) {
            this.b(n2, n3, n4, n5);
        }
    }

    @Override
    public int c() {
        return super.c() + 30;
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

    private void b(int n2, int n3, int n4, int n5) {
        ac ac2 = (ac)ay.c(this.a).get(n2);
        int n6 = n3 + 20;
        this.a.b(ac2.b, n6, n4 + 2, 0xFFFFFF);
        this.a.b(ac2.d, n6, n4 + 15, 0x6C6C6C);
        this.a.b(ac2.c, n6 + 227 - this.a.e(ac2.c), n4 + 1, 0x6C6C6C);
        if (!(ac2.e.equals("") && ac2.h.equals("") && ac2.i.equals(""))) {
            this.a(n6 - 1, n4 + 25, this.g(), this.f(), ac2.e, ac2.h, ac2.i);
        }
        this.a(n3 - 25, n4 + 1, this.g(), this.f(), ac2);
    }

    private void a(int n2, int n3, int n4, int n5, ac ac2) {
        com.c.c.e.q.a(ac2.a, ac2.g);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        n.a(n2 + 1, n3 + 1, 0.0f, 0.0f, 38, 38, 38.0f, 38.0f);
        n.d("realms:textures/gui/realms/slot_frame.png");
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        n.a(n2, n3, 0.0f, 0.0f, 40, 40, 40.0f, 40.0f);
    }

    private void a(int n2, int n3, int n4, int n5, String string, String string2, String string3) {
        int n6;
        boolean bl2 = false;
        boolean bl3 = false;
        if (!string3.equals("")) {
            this.a.b(string3, n2, n3 + 4, 0x4C4C4C);
        }
        int n7 = n6 = string3.equals("") ? 0 : this.a.e(string3) + 2;
        if (n4 >= n2 + n6 && n4 <= n2 + n6 + 32 && n5 >= n3 && n5 <= n3 + 15 && n5 < this.a.s() - 15 && n5 > 32) {
            if (n4 <= n2 + 15 + n6 && n4 > n6) {
                if (!string.equals("")) {
                    bl2 = true;
                } else {
                    bl3 = true;
                }
            } else if (!string.equals("")) {
                bl3 = true;
            }
        }
        if (!string.equals("")) {
            n.d("realms:textures/gui/realms/link_icons.png");
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.j();
            GL11.c(1.0f, 1.0f, 1.0f);
            n.a(n2 + n6, n3, bl2 ? 15.0f : 0.0f, 0.0f, 15, 15, 30.0f, 15.0f);
            GL11.k();
        }
        if (!string2.equals("")) {
            n.d("realms:textures/gui/realms/trailer_icons.png");
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.j();
            GL11.c(1.0f, 1.0f, 1.0f);
            n.a(n2 + n6 + (string.equals("") ? 0 : 17), n3, bl3 ? 15.0f : 0.0f, 0.0f, 15, 15, 30.0f, 15.0f);
            GL11.k();
        }
        if (bl2 && !string.equals("")) {
            ay.a(this.a, n.f("mco.template.info.tooltip"));
            ay.b(this.a, string);
        } else if (bl3 && !string2.equals("")) {
            ay.a(this.a, n.f("mco.template.trailer.tooltip"));
            ay.b(this.a, string2);
        }
    }
}

