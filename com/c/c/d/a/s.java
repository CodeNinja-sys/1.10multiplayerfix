/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a;
import com.c.c.b.i;
import com.c.c.b.l;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import com.c.c.d.a.ac;
import com.c.c.d.a.ad;
import com.c.c.d.a.ae;
import com.c.c.d.a.an;
import com.c.c.d.a.aq;
import com.c.c.d.a.av;
import com.c.c.d.a.ay;
import com.c.c.d.a.bb;
import com.c.c.d.a.bc;
import com.c.c.d.a.be;
import com.c.c.d.a.k;
import com.c.c.d.a.t;
import com.c.c.d.e;
import com.c.c.d.m;
import com.c.c.e.g;
import com.c.c.e.h;
import com.c.c.e.n;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import net.minecraft.s.f;
import net.minecraft.s.q;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.opengl.GL11;

public class s
extends av {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final String b = "realms:textures/gui/realms/on_icon.png";
    private static final String c = "realms:textures/gui/realms/off_icon.png";
    private static final String d = "realms:textures/gui/realms/expired_icon.png";
    private static final String e = "realms:textures/gui/realms/expires_soon_icon.png";
    private static final String s = "realms:textures/gui/realms/slot_frame.png";
    private static final String t = "realms:textures/gui/realms/empty_frame.png";
    private String u;
    private final net.minecraft.s.n v;
    private i w;
    private volatile long x;
    private int y;
    private int z;
    private int A = 80;
    private int B = 5;
    private static final int C = 0;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 4;
    private static final int G = 5;
    private static final int H = 6;
    private static final int I = 7;
    private static final int J = 8;
    private static final int K = 9;
    private static final int L = 10;
    private static final int M = 11;
    private f N;
    private f O;
    private f P;
    private m Q;
    private m R;
    private m S;
    private m T;
    private boolean U;
    private int V = -1;
    private int W;
    private int X = 0;
    private boolean Y = false;

    public s(net.minecraft.s.n n2, long l2) {
        this.v = n2;
        this.x = l2;
    }

    @Override
    public void a() {
        super.a();
    }

    @Override
    public void d() {
        if (this.w == null) {
            this.a(this.x);
        }
        this.y = this.r() / 2 - 187;
        this.z = this.r() / 2 + 190;
        org.lwjgl.a.g.a(true);
        this.u();
        this.N = com.c.c.d.a.s.a(2, this.a(0, 3), com.c.c.d.e.a(0), this.A + 20, 20, com.c.c.d.a.s.f("mco.configure.world.buttons.players"));
        this.b(this.N);
        this.O = com.c.c.d.a.s.a(3, this.a(1, 3), com.c.c.d.e.a(0), this.A + 20, 20, com.c.c.d.a.s.f("mco.configure.world.buttons.settings"));
        this.b(this.O);
        this.P = com.c.c.d.a.s.a(4, this.a(2, 3), com.c.c.d.e.a(0), this.A + 20, 20, com.c.c.d.a.s.f("mco.configure.world.buttons.subscription"));
        this.b(this.P);
        this.Q = new m(5, this.a(0), com.c.c.d.e.a(13) - 5, this.A + 10, 20, com.c.c.d.a.s.f("mco.configure.world.buttons.options"));
        this.b(this.Q);
        this.R = new m(6, this.a(1), com.c.c.d.e.a(13) - 5, this.A + 10, 20, com.c.c.d.a.s.f("mco.configure.world.backup"));
        this.b(this.R);
        this.S = new m(7, this.a(2), com.c.c.d.e.a(13) - 5, this.A + 10, 20, com.c.c.d.a.s.f("mco.configure.world.buttons.resetworld"));
        this.b(this.S);
        this.T = new m(8, this.a(0), com.c.c.d.e.a(13) - 5, this.A + 20, 20, com.c.c.d.a.s.f("mco.configure.world.buttons.switchminigame"));
        this.b(this.T);
        this.b(com.c.c.d.a.s.a(0, this.z - this.A + 8, com.c.c.d.e.a(13) - 5, this.A - 10, 20, com.c.c.d.a.s.f("gui.back")));
        this.R.b(true);
        if (this.w == null) {
            this.l();
            this.k();
            this.N.b(false);
            this.O.b(false);
            this.P.b(false);
        } else {
            this.i();
            if (this.j()) {
                this.k();
            } else {
                this.l();
            }
        }
    }

    private int a(int n2) {
        return this.y + n2 * (this.A + 10 + this.B);
    }

    private int a(int n2, int n3) {
        return this.r() / 2 - (n3 * (this.A + 20 + this.B) - this.B) / 2 + n2 * (this.A + 20 + this.B);
    }

    @Override
    public void g() {
        ++this.W;
        --this.X;
        if (this.X < 0) {
            this.X = 0;
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.u = null;
        this.Y = false;
        this.V = -1;
        this.p();
        this.a(com.c.c.d.a.s.f("mco.configure.worlds.title"), this.r() / 2, com.c.c.d.e.a(4), 0xFFFFFF);
        super.a(n2, n3, f2);
        if (this.w == null) {
            this.a(com.c.c.d.a.s.f("mco.configure.world.title"), this.r() / 2, 17, 0xFFFFFF);
            return;
        }
        String string = this.w.b();
        int n4 = this.e(string);
        int n5 = this.w.e == com.c.c.b.l.a ? 0xA0A0A0 : 0x7FFF7F;
        int n6 = this.e(com.c.c.d.a.s.f("mco.configure.world.title"));
        this.a(com.c.c.d.a.s.f("mco.configure.world.title"), this.r() / 2, 12, 0xFFFFFF);
        this.a(string, this.r() / 2, 24, n5);
        int n7 = Math.min(this.a(2, 3) + this.A - 11, this.r() / 2 + n4 / 2 + n6 / 2 + 10);
        this.a(n7, 7, n2, n3);
        for (Map.Entry entry : this.w.i.entrySet()) {
            if (((com.c.c.b.s)entry.getValue()).l != null && ((com.c.c.b.s)entry.getValue()).k != -1L) {
                this.a(this.b((Integer)entry.getKey()), com.c.c.d.e.a(5) + 5, n2, n3, this.w.o == (Integer)entry.getKey() && !this.j(), ((com.c.c.b.s)entry.getValue()).a((Integer)entry.getKey()), (Integer)entry.getKey(), ((com.c.c.b.s)entry.getValue()).k, ((com.c.c.b.s)entry.getValue()).l, ((com.c.c.b.s)entry.getValue()).o);
                continue;
            }
            this.a(this.b((Integer)entry.getKey()), com.c.c.d.e.a(5) + 5, n2, n3, this.w.o == (Integer)entry.getKey() && !this.j(), ((com.c.c.b.s)entry.getValue()).a((Integer)entry.getKey()), (Integer)entry.getKey(), -1L, null, ((com.c.c.b.s)entry.getValue()).o);
        }
        this.a(this.b(4), com.c.c.d.e.a(5) + 5, n2, n3, this.j(), "Minigame", 4, -1L, null, false);
        if (this.j()) {
            this.b(com.c.c.d.a.s.f("mco.configure.current.minigame") + ": " + this.w.c(), this.y + this.A + 20 + this.B * 2, com.c.c.d.e.a(13), 0xFFFFFF);
        }
        if (this.u != null) {
            this.a(this.u, n2, n3);
        }
    }

    private int b(int n2) {
        return this.y + (n2 - 1) * 98;
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
        if (f2 instanceof m && !((m)f2).a()) {
            return;
        }
        switch (f2.c()) {
            case 2: {
                net.minecraft.s.b.a(new an(this, this.w));
                break;
            }
            case 3: {
                net.minecraft.s.b.a(new bb(this, this.w.d()));
                break;
            }
            case 4: {
                net.minecraft.s.b.a(new be(this, this.w.d(), this.v));
                break;
            }
            case 0: {
                this.f();
                break;
            }
            case 8: {
                net.minecraft.s.b.a(new ay(this, null, com.c.c.b.m.b));
                break;
            }
            case 6: {
                net.minecraft.s.b.a(new k(this, this.w.d(), this.w.o));
                break;
            }
            case 5: {
                net.minecraft.s.b.a(new bc(this, ((com.c.c.b.s)this.w.i.get(this.w.o)).d(), this.w.n, this.w.o));
                break;
            }
            case 7: {
                net.minecraft.s.b.a(new aq(this, this.w.d(), this.c()));
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
            this.f();
        }
    }

    private void f() {
        if (this.U) {
            ((a)this.v).i();
        }
        net.minecraft.s.b.a(this.v);
    }

    private void a(long l2) {
        new t(this, l2).start();
    }

    private void i() {
        this.N.b(!this.w.k);
        this.O.b(!this.w.k);
        this.P.b(true);
        this.T.b(!this.w.k);
        this.Q.b(!this.w.k);
        this.S.b(!this.w.k);
    }

    @Override
    public void a(boolean bl2, int n2) {
        switch (n2) {
            case 9: {
                if (bl2) {
                    this.y();
                    break;
                }
                net.minecraft.s.b.a(this);
                break;
            }
            case 10: {
                if (bl2) {
                    aq aq2 = new aq(this, this.w, this.c(), com.c.c.d.a.s.f("mco.configure.world.switch.slot"), com.c.c.d.a.s.f("mco.configure.world.switch.slot.subtitle"), 0xA0A0A0, com.c.c.d.a.s.f("gui.cancel"));
                    aq2.b(this.V);
                    aq2.a(com.c.c.d.a.s.f("mco.create.world.reset.title"));
                    net.minecraft.s.b.a(aq2);
                    break;
                }
                net.minecraft.s.b.a(this);
                break;
            }
            case 11: {
                net.minecraft.s.b.a(this);
            }
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        if (n4 == 0) {
            this.X += net.minecraft.s.q.b / 3 + 1;
        } else {
            return;
        }
        if (this.V != -1) {
            if (this.V < 4) {
                String string = com.c.c.d.a.s.f("mco.configure.world.slot.switch.question.line1");
                String string2 = com.c.c.d.a.s.f("mco.configure.world.slot.switch.question.line2");
                if (((com.c.c.b.s)this.w.i.get((Object)Integer.valueOf((int)this.V))).o) {
                    net.minecraft.s.b.a(new ac(this, ad.b, string, string2, true, 10));
                } else {
                    net.minecraft.s.b.a(new ac(this, ad.b, string, string2, true, 9));
                }
            } else if (!this.j() && !this.w.k) {
                ay ay2 = new ay(this, null, com.c.c.b.m.b);
                ay2.b(com.c.c.d.a.s.f("mco.minigame.world.info.line1") + "\\n" + com.c.c.d.a.s.f("mco.minigame.world.info.line2"));
                net.minecraft.s.b.a(ay2);
            }
        } else if (this.X >= net.minecraft.s.q.b / 2 && this.Y && (this.w.e == com.c.c.b.l.b || this.w.e == com.c.c.b.l.a)) {
            if (this.w.e == com.c.c.b.l.b) {
                ((a)this.v).a(this.w);
            } else {
                this.a(true, this);
            }
        }
        super.a(n2, n3, n4);
    }

    protected void a(String string, int n2, int n3) {
        if (string == null) {
            return;
        }
        int n4 = n2 + 12;
        int n5 = n3 - 12;
        int n6 = this.e(string);
        if (n4 + n6 + 3 > this.z) {
            n4 = n4 - n6 - 20;
        }
        this.b(n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
        this.c(string, n4, n5, 0xFFFFFF);
    }

    private void a(int n2, int n3, int n4, int n5) {
        if (this.w.k) {
            this.b(n2, n3, n4, n5);
        } else if (this.w.e == com.c.c.b.l.a) {
            this.d(n2, n3, n4, n5);
        } else if (this.w.e == com.c.c.b.l.b) {
            if (this.w.m < 7) {
                this.b(n2, n3, n4, n5, this.w.m);
            } else {
                this.c(n2, n3, n4, n5);
            }
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        net.minecraft.s.n.d(d);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 10, 28, 10.0f, 28.0f);
        GL11.k();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 27) {
            this.u = com.c.c.d.a.s.f("mco.selectServer.expired");
        }
    }

    private void b(int n2, int n3, int n4, int n5, int n6) {
        net.minecraft.s.n.d(e);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        if (this.W % 20 < 10) {
            net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 10, 28, 20.0f, 28.0f);
        } else {
            net.minecraft.s.n.a(n2, n3, 10.0f, 0.0f, 10, 28, 20.0f, 28.0f);
        }
        GL11.k();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 27) {
            this.u = n6 <= 0 ? com.c.c.d.a.s.f("mco.selectServer.expires.soon") : (n6 == 1 ? com.c.c.d.a.s.f("mco.selectServer.expires.day") : com.c.c.d.a.s.a("mco.selectServer.expires.days", n6));
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        net.minecraft.s.n.d(b);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 10, 28, 10.0f, 28.0f);
        GL11.k();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 27) {
            this.u = com.c.c.d.a.s.f("mco.selectServer.open");
        }
    }

    private void d(int n2, int n3, int n4, int n5) {
        net.minecraft.s.n.d(c);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 10, 28, 10.0f, 28.0f);
        GL11.k();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 27) {
            this.u = com.c.c.d.a.s.f("mco.selectServer.closed");
        }
    }

    private boolean j() {
        return this.w != null && this.w.n.equals((Object)com.c.c.b.m.b);
    }

    private void a(int n2, int n3, int n4, int n5, boolean bl2, String string, int n6, long l2, String string2, boolean bl3) {
        if (n4 >= n2 && n4 <= n2 + 80 && n5 >= n3 && n5 <= n3 + 80 && (!this.j() && this.w.o != n6 || this.j() && n6 != 4) && (n6 != 4 || !this.w.k)) {
            this.V = n6;
            String string3 = this.u = n6 == 4 ? com.c.c.d.a.s.f("mco.configure.world.slot.tooltip.minigame") : com.c.c.d.a.s.f("mco.configure.world.slot.tooltip");
        }
        if (n4 >= n2 && n4 <= n2 + 80 && n5 >= n3 && n5 <= n3 + 80 && (!this.j() && this.w.o == n6 || this.j() && n6 == 4) && !this.w.k && (this.w.e == com.c.c.b.l.b || this.w.e == com.c.c.b.l.a)) {
            this.Y = true;
            this.u = com.c.c.d.a.s.f("mco.configure.world.slot.tooltip.active");
        }
        if (bl3) {
            com.c.c.d.a.s.d(t);
        } else if (string2 != null && l2 != -1L) {
            com.c.c.e.q.a(String.valueOf(l2), string2);
        } else if (n6 == 1) {
            com.c.c.d.a.s.d("textures/gui/title/background/panorama_0.png");
        } else if (n6 == 2) {
            com.c.c.d.a.s.d("textures/gui/title/background/panorama_2.png");
        } else if (n6 == 3) {
            com.c.c.d.a.s.d("textures/gui/title/background/panorama_3.png");
        } else {
            com.c.c.e.q.a(String.valueOf(this.w.q), this.w.r);
        }
        if (!bl2) {
            GL11.c(0.56f, 0.56f, 0.56f, 1.0f);
        } else if (bl2) {
            float f2 = 0.9f + 0.1f * net.minecraft.s.m.e((float)this.W * 0.2f);
            GL11.c(f2, f2, f2, 1.0f);
        }
        net.minecraft.s.n.a(n2 + 3, n3 + 3, 0.0f, 0.0f, 74, 74, 74.0f, 74.0f);
        com.c.c.d.a.s.d(s);
        if (this.V == n6) {
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        } else if (!bl2) {
            GL11.c(0.56f, 0.56f, 0.56f, 1.0f);
        } else {
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 80, 80, 80.0f, 80.0f);
        this.a(string, n2 + 40, n3 + 66, 0xFFFFFF);
    }

    private void k() {
        this.Q.a(false);
        this.R.a(false);
        this.S.a(false);
    }

    private void l() {
        this.T.a(false);
    }

    private void m() {
        this.Q.a(true);
        this.R.a(true);
        this.S.a(true);
    }

    private void n() {
        this.T.a(true);
    }

    public void a(com.c.c.b.s s2) {
        com.c.c.b.s s3 = (com.c.c.b.s)this.w.i.get(this.w.o);
        s2.k = s3.k;
        s2.l = s3.l;
        com.c.c.a.m m2 = com.c.c.a.m.a();
        try {
            m2.a(this.w.a, this.w.o, s2);
            this.w.i.put(this.w.o, s2);
        }
        catch (b b2) {
            a.b("Couldn't save slot settings");
            net.minecraft.s.b.a(new aa(b2, (net.minecraft.s.n)this));
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            a.b("Couldn't save slot settings");
        }
        net.minecraft.s.b.a(this);
    }

    public void a(String string, String string2) {
        String string3 = string2 == null || string2.trim().equals("") ? null : string2;
        com.c.c.a.m m2 = com.c.c.a.m.a();
        try {
            m2.b(this.w.a, string, string3);
            this.w.a(string);
            this.w.b(string3);
        }
        catch (b b2) {
            a.b("Couldn't save settings");
            net.minecraft.s.b.a(new aa(b2, (net.minecraft.s.n)this));
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            a.b("Couldn't save settings");
        }
        net.minecraft.s.b.a(this);
    }

    public void a(boolean bl2, net.minecraft.s.n n2) {
        h h2 = new h(this.w, this, this.v, bl2);
        ae ae2 = new ae(n2, h2);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    public void a(net.minecraft.s.n n2) {
        g g2 = new g(this.w, this);
        ae ae2 = new ae(n2, g2);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    public void b() {
        this.U = true;
    }

    void a(com.c.c.b.ac ac2) {
        if (ac2 == null) {
            return;
        }
        if (ac2.f) {
            this.b(ac2);
        }
    }

    private void y() {
        n n2 = new n(this.w.a, this.V, this.c(), 11);
        ae ae2 = new ae(this.v, n2);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    private void b(com.c.c.b.ac ac2) {
        com.c.c.e.m m2 = new com.c.c.e.m(this.w.a, ac2, this.c());
        ae ae2 = new ae(this.v, m2);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    public s c() {
        return new s(this.v, this.x);
    }

    static /* synthetic */ i a(s s2, i i2) {
        s2.w = i2;
        return s2.w;
    }

    static /* synthetic */ i a(s s2) {
        return s2.w;
    }

    static /* synthetic */ net.minecraft.s.n b(s s2) {
        return s2.v;
    }

    static /* synthetic */ void c(s s2) {
        s2.i();
    }

    static /* synthetic */ boolean d(s s2) {
        return s2.j();
    }

    static /* synthetic */ void e(s s2) {
        s2.n();
    }

    static /* synthetic */ void f(s s2) {
        s2.m();
    }

    static /* synthetic */ d e() {
        return a;
    }
}

