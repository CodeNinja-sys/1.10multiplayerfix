/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.b.g;
import com.c.c.b.i;
import com.c.c.c.b;
import com.c.c.d.a.a;
import com.c.c.d.a.ab;
import com.c.c.d.a.ao;
import com.c.c.d.a.s;
import com.c.c.d.a.u;
import com.c.c.d.e;
import net.minecraft.s.f;
import net.minecraft.s.j;
import net.minecraft.s.n;
import net.minecraft.s.v;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.opengl.GL11;

public class an
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final String b = "realms:textures/gui/realms/op_icon.png";
    private static final String c = "realms:textures/gui/realms/user_icon.png";
    private static final String d = "realms:textures/gui/realms/cross_player_icon.png";
    private String e;
    private final s s;
    private i t;
    private ao u;
    private int v;
    private int w;
    private int x;
    private static final int y = 0;
    private static final int z = 1;
    private static final int A = 2;
    private static final int B = 3;
    private f C;
    private f D;
    private int E = -1;
    private String F;
    private boolean G;

    public an(s s2, i i2) {
        this.s = s2;
        this.t = i2;
    }

    @Override
    public void a() {
        super.a();
        if (this.u != null) {
            this.u.h();
        }
    }

    @Override
    public void g() {
        super.g();
    }

    @Override
    public void d() {
        this.v = this.r() / 2 - 160;
        this.w = 150;
        this.x = this.r() / 2 + 12;
        org.lwjgl.a.g.a(true);
        this.u();
        this.C = an.a(1, this.x, com.c.c.d.e.a(1), this.w + 10, 20, an.f("mco.configure.world.buttons.invite"));
        this.b(this.C);
        this.D = an.a(3, this.x, com.c.c.d.e.a(3), this.w + 10, 20, an.f("mco.configure.world.buttons.activity"));
        this.b(this.D);
        this.b(an.a(0, this.x + this.w / 2 + 2, com.c.c.d.e.a(12), this.w / 2 + 10 - 2, 20, an.f("gui.back")));
        this.u = new ao(this);
        this.u.c(this.v);
        this.C.b(false);
    }

    @Override
    public void h() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        switch (f2.c()) {
            case 0: {
                this.b();
                break;
            }
            case 1: {
                net.minecraft.s.b.a(new ab(this.s, this, this.t));
                break;
            }
            case 3: {
                net.minecraft.s.b.a(new a(this, this.t));
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            this.b();
        }
    }

    private void b() {
        if (this.G) {
            net.minecraft.s.b.a(this.s.c());
        } else {
            net.minecraft.s.b.a(this.s);
        }
    }

    private void a(int n2) {
        m m2 = com.c.c.a.m.a();
        String string = ((g)this.t.h.get(n2)).b();
        try {
            this.a(m2.e(this.t.a, string));
        }
        catch (b b2) {
            a.b("Couldn't op the user");
        }
    }

    private void b(int n2) {
        m m2 = com.c.c.a.m.a();
        String string = ((g)this.t.h.get(n2)).b();
        try {
            this.a(m2.f(this.t.a, string));
        }
        catch (b b2) {
            a.b("Couldn't deop the user");
        }
    }

    private void a(com.c.c.b.c c2) {
        for (g g2 : this.t.h) {
            g2.a(c2.a.contains(g2.a()));
        }
    }

    private void d(int n2) {
        if (n2 >= 0 && n2 < this.t.h.size()) {
            g g2 = (g)this.t.h.get(n2);
            this.F = g2.b();
            this.E = n2;
            u u2 = new u(this, "Question", an.f("mco.configure.world.uninvite.question") + " '" + g2.a() + "' ?", 2);
            net.minecraft.s.b.a(u2);
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 2) {
            if (bl2) {
                m m2 = com.c.c.a.m.a();
                try {
                    m2.a(this.t.a, this.F);
                }
                catch (b b2) {
                    a.b("Couldn't uninvite user");
                }
                this.e(this.E);
            }
            this.G = true;
            net.minecraft.s.b.a(this);
        }
    }

    private void e(int n2) {
        this.t.h.remove(n2);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.e = null;
        this.p();
        if (this.u != null) {
            this.u.a(n2, n3, f2);
        }
        int n4 = com.c.c.d.e.a(12) + 20;
        GL11.l(2896);
        GL11.l(2912);
        v v2 = net.minecraft.s.v.b;
        an.d("textures/gui/options_background.png");
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        float f3 = 32.0f;
        v2.a(7, net.minecraft.s.j.i);
        v2.a(0.0, (double)this.s(), 0.0).a(0.0, (float)(this.s() - n4) / 32.0f + 0.0f).a(64, 64, 64, 255).c();
        v2.a((double)this.r(), (double)this.s(), 0.0).a((float)this.r() / 32.0f, (float)(this.s() - n4) / 32.0f + 0.0f).a(64, 64, 64, 255).c();
        v2.a((double)this.r(), (double)n4, 0.0).a((float)this.r() / 32.0f, 0.0).a(64, 64, 64, 255).c();
        v2.a(0.0, (double)n4, 0.0).a(0.0, 0.0).a(64, 64, 64, 255).c();
        v2.a();
        this.a(an.f("mco.configure.world.players.title"), this.r() / 2, 17, 0xFFFFFF);
        if (this.t != null && this.t.h != null) {
            this.b(an.f("mco.configure.world.invited") + " (" + this.t.h.size() + ")", this.v, com.c.c.d.e.a(0), 0xA0A0A0);
            this.C.b(this.t.h.size() < 200);
        } else {
            this.b(an.f("mco.configure.world.invited"), this.v, com.c.c.d.e.a(0), 0xA0A0A0);
            this.C.b(false);
        }
        super.a(n2, n3, f2);
        if (this.t == null) {
            return;
        }
        if (this.e != null) {
            this.a(this.e, n2, n3);
        }
    }

    protected void a(String string, int n2, int n3) {
        if (string == null) {
            return;
        }
        int n4 = n2 + 12;
        int n5 = n3 - 12;
        int n6 = this.e(string);
        this.b(n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
        this.c(string, n4, n5, 0xFFFFFF);
    }

    private void a(int n2, int n3, int n4, int n5) {
        boolean bl2 = n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 9 && n5 < com.c.c.d.e.a(12) + 20 && n5 > com.c.c.d.e.a(1);
        an.d(d);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, bl2 ? 7.0f : 0.0f, 8, 7, 8.0f, 14.0f);
        GL11.k();
        if (bl2) {
            this.e = an.f("mco.configure.world.invites.remove.tooltip");
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        boolean bl2 = n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 9 && n5 < com.c.c.d.e.a(12) + 20 && n5 > com.c.c.d.e.a(1);
        an.d(b);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, bl2 ? 8.0f : 0.0f, 8, 8, 8.0f, 16.0f);
        GL11.k();
        if (bl2) {
            this.e = an.f("mco.configure.world.invites.ops.tooltip");
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        boolean bl2 = n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 9 && n5 < com.c.c.d.e.a(12) + 20 && n5 > com.c.c.d.e.a(1);
        an.d(c);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, bl2 ? 8.0f : 0.0f, 8, 8, 8.0f, 16.0f);
        GL11.k();
        if (bl2) {
            this.e = an.f("mco.configure.world.invites.normal.tooltip");
        }
    }

    static /* synthetic */ int a(an an2) {
        return an2.w;
    }

    static /* synthetic */ int b(an an2) {
        return an2.v;
    }

    static /* synthetic */ i c(an an2) {
        return an2.t;
    }

    static /* synthetic */ String d(an an2) {
        return an2.e;
    }

    static /* synthetic */ void a(an an2, int n2) {
        an2.b(n2);
    }

    static /* synthetic */ void b(an an2, int n2) {
        an2.a(n2);
    }

    static /* synthetic */ void c(an an2, int n2) {
        an2.d(n2);
    }

    static /* synthetic */ void a(an an2, int n2, int n3, int n4, int n5) {
        an2.b(n2, n3, n4, n5);
    }

    static /* synthetic */ void b(an an2, int n2, int n3, int n4, int n5) {
        an2.c(n2, n3, n4, n5);
    }

    static /* synthetic */ void c(an an2, int n2, int n3, int n4, int n5) {
        an2.a(n2, n3, n4, n5);
    }
}

