/*
 * Decompiled with CFR 0.150.
 */
package com.c.c;

import com.a.a.d.ov;
import com.c.c.a.o;
import com.c.c.b;
import com.c.c.b.i;
import com.c.c.b.l;
import com.c.c.b.m;
import com.c.c.b.q;
import com.c.c.b.r;
import com.c.c.c;
import com.c.c.d;
import com.c.c.d.a.ac;
import com.c.c.d.a.ad;
import com.c.c.d.a.ae;
import com.c.c.d.a.ai;
import com.c.c.d.a.s;
import com.c.c.d.a.w;
import com.c.c.d.f;
import com.c.c.d.k;
import com.c.c.e;
import com.c.c.e.j;
import com.c.c.g;
import com.c.c.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.s.n;
import org.lwjgl.opengl.GL11;

public class a
extends n {
    private static final org.apache.logging.log4j.d e = org.apache.logging.log4j.c.c();
    private static boolean s = false;
    private boolean t = false;
    protected static final int a = 0;
    protected static final int b = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = 4;
    protected static final int c = 100;
    private i x;
    private static final String y = "realms:textures/gui/realms/on_icon.png";
    private static final String z = "realms:textures/gui/realms/off_icon.png";
    private static final String A = "realms:textures/gui/realms/expired_icon.png";
    private static final String B = "realms:textures/gui/realms/expires_soon_icon.png";
    private static final String C = "realms:textures/gui/realms/leave_icon.png";
    private static final String D = "realms:textures/gui/realms/invitation_icons.png";
    private static final String E = "realms:textures/gui/realms/invite_icon.png";
    private static final String F = "realms:textures/gui/realms/world_icon.png";
    private static final String G = "realms:textures/gui/title/realms.png";
    private static final String H = "realms:textures/gui/realms/configure_icon.png";
    private static final String I = "realms:textures/gui/realms/questionmark.png";
    private static final String J = "realms:textures/gui/realms/popup.png";
    private static final String K = "realms:textures/gui/realms/darken.png";
    private static final String L = "realms:textures/gui/realms/cross_icon.png";
    private static final String M = "realms:textures/gui/realms/trial_icon.png";
    private static final String N = "minecraft:textures/gui/widgets.png";
    private static final String[] O = new String[]{"realms:textures/gui/realms/images/one.png", "realms:textures/gui/realms/images/two.png", "realms:textures/gui/realms/images/three.png", "realms:textures/gui/realms/images/four.png", "realms:textures/gui/realms/images/five.png"};
    private static f P = new f();
    private static int Q = -1;
    private n R;
    private volatile h S;
    private long T = -1L;
    private net.minecraft.s.f U;
    private net.minecraft.s.f V;
    private String W;
    private List X = ov.a();
    private volatile int Y = 0;
    private int Z;
    private static volatile boolean aa = false;
    private static volatile boolean ab = false;
    private static volatile boolean ac = false;
    private boolean ad = false;
    private boolean ae = false;
    private boolean af = false;
    private volatile boolean ag;
    private volatile boolean ah = false;
    private volatile boolean ai = false;
    private int aj = 0;
    private int ak = 0;
    boolean d = false;
    private static n al = null;
    private static boolean am = false;
    private int an = 0;
    private char[] ao = new char[]{'3', '2', '1', '4', '5', '6'};
    private int ap = 0;
    private char[] aq = new char[]{'9', '8', '7', '1', '2', '3'};
    private int ar = 0;
    private int as = 0;
    private char[] at = new char[]{'9', '8', '7', '4', '5', '6'};
    private static ReentrantLock au = new ReentrantLock();
    private boolean av = false;
    private boolean aw = false;

    public a(n n2) {
        this.R = n2;
    }

    @Override
    public void a() {
        super.a();
        if (!this.c()) {
            this.S.h();
        }
    }

    public boolean b() {
        if (!this.y() || !this.ad) {
            return false;
        }
        if (this.ag && !this.ah) {
            return true;
        }
        for (i i2 : this.X) {
            if (!i2.g.equals(net.minecraft.s.b.g())) continue;
            return false;
        }
        return true;
    }

    public boolean c() {
        if (!this.y() || !this.ad) {
            return false;
        }
        if (this.ae) {
            return true;
        }
        if (this.ag && !this.ah && this.X.isEmpty()) {
            return true;
        }
        return this.X.isEmpty();
    }

    @Override
    public void d() {
        if (al != null) {
            net.minecraft.s.b.a(al);
            return;
        }
        au = new ReentrantLock();
        if (ac && !this.y()) {
            this.D();
        }
        this.C();
        if (!this.t) {
            net.minecraft.s.b.a(false);
        }
        org.lwjgl.a.g.a(true);
        this.u();
        if (this.y()) {
            P.d();
        }
        this.ai = false;
        this.f();
    }

    private boolean y() {
        return ab && aa;
    }

    public void e() {
        this.U = com.c.c.a.a(1, this.r() / 2 - 98, this.s() - 32, 98, 20, com.c.c.a.f("mco.selectServer.play"));
        this.b(this.U);
        this.V = com.c.c.a.a(0, this.r() / 2 + 6, this.s() - 32, 98, 20, com.c.c.a.f("gui.back"));
        this.b(this.V);
        i i2 = this.a(this.T);
        this.U.b(this.b(i2));
    }

    private boolean b(i i2) {
        return i2 != null && !i2.k && (!com.c.c.e.s.a(i2) || this.g(i2)) && (i2.e == com.c.c.b.l.b || i2.e == com.c.c.b.l.a && com.c.c.e.s.a(i2) && this.g(i2));
    }

    public void f() {
        if (this.y() && this.ad) {
            this.e();
        }
        this.S = new h(this);
        this.S.c(-15);
        if (Q != -1) {
            this.S.b(Q);
        }
    }

    @Override
    public void g() {
        Object object;
        this.af = false;
        ++this.Z;
        --this.ar;
        if (this.ar < 0) {
            this.ar = 0;
        }
        if (!this.y()) {
            return;
        }
        P.b();
        if (P.a(com.c.c.d.k.a)) {
            object = P.e();
            if (object != null) {
                boolean bl2 = false;
                Object object2 = object.iterator();
                while (object2.hasNext()) {
                    i i2 = (i)object2.next();
                    if (!this.h(i2)) continue;
                    bl2 = true;
                }
                this.X = object;
                if (!am && bl2) {
                    am = true;
                    this.z();
                }
            }
            if (!this.ad) {
                this.ad = true;
                this.e();
            }
        }
        if (P.a(com.c.c.d.k.b)) {
            this.Y = P.f();
        }
        if (P.a(com.c.c.d.k.c) && !this.ah) {
            boolean bl3 = P.g();
            if (bl3 != this.ag && this.c()) {
                this.ag = bl3;
                this.ai = false;
            } else {
                this.ag = bl3;
            }
        }
        if (P.a(com.c.c.d.k.d)) {
            object = P.h();
            block1: for (Object object2 : ((r)object).a) {
                for (i i3 : this.X) {
                    if (i3.a != ((q)object2).a) continue;
                    i3.a((q)object2);
                    continue block1;
                }
            }
        }
        P.c();
        if (this.c()) {
            ++this.ak;
        }
    }

    private void z() {
        new b(this).start();
    }

    private List A() {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        for (i i2 : this.X) {
            if (!this.h(i2)) continue;
            arrayList.add(i2.a);
        }
        return arrayList;
    }

    @Override
    public void h() {
        org.lwjgl.a.g.a(false);
        this.H();
    }

    public void a(boolean bl2) {
        this.ah = bl2;
    }

    @Override
    public void a(net.minecraft.s.f f2) {
        if (!f2.d()) {
            return;
        }
        switch (f2.c()) {
            case 1: {
                i i2 = this.a(this.T);
                if (i2 == null) {
                    return;
                }
                if (this.g(i2) && com.c.c.e.s.a(i2)) {
                    this.c(i2);
                    break;
                }
                this.a(i2);
                break;
            }
            case 0: {
                if (this.af) break;
                net.minecraft.s.b.a(this.R);
                break;
            }
            case 4: {
                this.B();
                break;
            }
            case 3: {
                com.c.c.e.s.a("https://minecraft.net/realms");
                break;
            }
            default: {
                return;
            }
        }
    }

    private void B() {
        if (!this.ag || this.ah) {
            return;
        }
        net.minecraft.s.b.a(new w(this));
    }

    private void C() {
        if (!ac) {
            ac = true;
            new c(this, "MCO Compatability Checker #1").start();
        }
    }

    private void D() {
        new d(this, "MCO Compatability Checker #1").start();
    }

    private void E() {
        if (!com.c.c.a.m.a.equals((Object)com.c.c.a.o.b)) {
            new e(this, "MCO Stage Availability Checker #1").start();
        }
    }

    private void F() {
        if (!com.c.c.a.m.a.equals((Object)com.c.c.a.o.c)) {
            new com.c.c.f(this, "MCO Local Availability Checker #1").start();
        }
    }

    private void G() {
        com.c.c.a.m.c();
        P.d();
    }

    private void H() {
        P.i();
    }

    private void c(i i2) {
        com.c.c.d.a.o o2 = new com.c.c.d.a.o(this, i2.a);
        if (i2.n.equals((Object)com.c.c.b.m.b)) {
            o2.a(com.c.c.a.f("mco.brokenworld.minigame.title"));
        }
        net.minecraft.s.b.a(o2);
    }

    private void d(i i2) {
        if (net.minecraft.s.b.g().equals(i2.g) || s) {
            this.I();
            if (com.c.c.e.s.a(i2) && !i2.k) {
                this.c(i2);
            } else {
                net.minecraft.s.b.a(new s(this, i2.a));
            }
        }
    }

    private void e(i i2) {
        if (!net.minecraft.s.b.g().equals(i2.g)) {
            this.I();
            String string = com.c.c.a.f("mco.configure.world.leave.question.line1");
            String string2 = com.c.c.a.f("mco.configure.world.leave.question.line2");
            net.minecraft.s.b.a(new ac(this, com.c.c.d.a.ad.b, string, string2, true, 2));
        }
    }

    private void I() {
        Q = this.S.i();
    }

    private i a(long l2) {
        for (i i2 : this.X) {
            if (i2.a != l2) continue;
            return i2;
        }
        return null;
    }

    private int b(long l2) {
        for (int i2 = 0; i2 < this.X.size(); ++i2) {
            if (((i)this.X.get((int)i2)).a != l2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 2) {
            if (bl2) {
                new g(this, "Realms-leave-server").start();
            }
            net.minecraft.s.b.a(this);
        } else if (n2 == 100) {
            if (!bl2) {
                if (au.isHeldByCurrentThread()) {
                    au.unlock();
                }
                net.minecraft.s.b.a(this);
            } else {
                this.f(this.x);
            }
        }
    }

    public void i() {
        this.T = -1L;
    }

    @Override
    public void a(char c2, int n2) {
        switch (n2) {
            case 28: 
            case 156: {
                this.an = 0;
                this.ap = 0;
                this.as = 0;
                if (this.c()) {
                    return;
                }
                if (org.lwjgl.a.g.a(42) || org.lwjgl.a.g.a(54)) {
                    i i2 = this.a(this.T);
                    if (i2 == null) break;
                    this.d(i2);
                    break;
                }
                this.a(this.U);
                break;
            }
            case 1: {
                this.an = 0;
                this.ap = 0;
                this.as = 0;
                if (this.c() && this.ae) {
                    this.ae = false;
                    break;
                }
                net.minecraft.s.b.a(this.R);
                break;
            }
            case 200: {
                if (this.T != -1L && !this.c()) {
                    int n3;
                    i i3;
                    i i4 = this.a(this.T);
                    int n4 = this.X.indexOf(i4);
                    if (n4 == 0) {
                        this.S.b(0 - this.S.i());
                        return;
                    }
                    if (i4 != null && n4 > 0 && (i3 = (i)this.X.get(n3 = n4 - 1)) != null) {
                        this.T = i3.a;
                        int n5 = Math.max(0, this.S.b() - (this.s() - 40 - 32 - 4));
                        int n6 = (int)Math.floor((this.s() - 40 - 32) / 36);
                        int n7 = this.S.i();
                        int n8 = (int)Math.ceil((float)n7 / 36.0f);
                        int n9 = n5 / this.X.size();
                        int n10 = n9 * n3;
                        int n11 = n10 - this.S.i();
                        if (n3 < n8 || n3 > n8 + n6) {
                            this.S.b(n11);
                        }
                        return;
                    }
                }
                if (this.c() || this.X.isEmpty()) break;
                this.T = ((i)this.X.get((int)0)).a;
                this.S.b(0 - this.S.i());
                break;
            }
            case 208: {
                if (this.T != -1L && !this.c()) {
                    i i5 = this.a(this.T);
                    int n12 = this.X.indexOf(i5);
                    int n13 = Math.max(0, this.S.b() - (this.s() - 40 - 32));
                    if (n12 == this.X.size() - 1) {
                        this.S.b(n13 - this.S.i() + 36);
                        return;
                    }
                    if (i5 != null && n12 > -1 && n12 < this.X.size() - 1) {
                        int n14 = n12 + 1;
                        i i6 = (i)this.X.get(n14);
                        if (n14 == this.X.size() - 1) {
                            this.T = i6.a;
                            this.S.b(n13 - this.S.i() + 36);
                            return;
                        }
                        if (i6 != null) {
                            this.T = i6.a;
                            int n15 = (int)Math.floor((this.s() - 40 - 32) / 36);
                            int n16 = this.S.i();
                            int n17 = (int)Math.ceil((float)n16 / 36.0f);
                            int n18 = n13 / this.X.size();
                            int n19 = n18 * n14;
                            int n20 = n19 - this.S.i();
                            if (n20 > 0) {
                                n20 += n18;
                            }
                            if (n14 < n17 || n14 >= n17 + n15) {
                                this.S.b(n20);
                            }
                            return;
                        }
                    }
                }
                if (this.c() || this.X.isEmpty()) break;
                this.T = ((i)this.X.get((int)0)).a;
                this.S.b(-(this.S.a() * 36));
                break;
            }
            default: {
                if (this.ao[this.an] == c2) {
                    ++this.an;
                    if (this.an == this.ao.length) {
                        this.an = 0;
                        s = !s;
                    }
                } else {
                    this.an = 0;
                }
                if (this.aq[this.ap] == c2) {
                    ++this.ap;
                    if (this.ap == this.aq.length) {
                        this.ap = 0;
                        if (!com.c.c.a.m.a.equals((Object)com.c.c.a.o.b)) {
                            this.E();
                        } else {
                            this.G();
                        }
                    }
                } else {
                    this.ap = 0;
                }
                if (this.at[this.as] == c2) {
                    ++this.as;
                    if (this.as != this.at.length) break;
                    this.as = 0;
                    if (!com.c.c.a.m.a.equals((Object)com.c.c.a.o.c)) {
                        this.F();
                        break;
                    }
                    this.G();
                    break;
                }
                this.as = 0;
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.av = false;
        this.aw = false;
        this.W = null;
        this.p();
        this.S.a(n2, n3, f2);
        this.a(this.r() / 2 - 50, 7);
        if ((!this.c() || this.ae) && this.y() && this.ad) {
            this.f(n2, n3);
        }
        this.d(n2, n3);
        if (com.c.c.a.m.a.equals((Object)com.c.c.a.o.b)) {
            this.K();
        }
        if (com.c.c.a.m.a.equals((Object)com.c.c.a.o.c)) {
            this.J();
        }
        if (this.c()) {
            this.c(n2, n3);
        } else {
            if (this.ai) {
                this.u();
                this.b(this.U);
                this.b(this.V);
                i i2 = this.a(this.T);
                this.U.b(this.b(i2));
            }
            this.ai = false;
        }
        if (this.W != null) {
            this.a(this.W, n2, n3);
        }
        super.a(n2, n3, f2);
        if (this.ag && !this.ah && this.c()) {
            net.minecraft.s.n.d(M);
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.j();
            int n4 = 0;
            if ((System.currentTimeMillis() / 800L & 1L) == 1L) {
                n4 = 8;
            }
            int n5 = this.s() / 2 - 83 - 3;
            int n6 = n5 + 147 - 20;
            net.minecraft.s.n.a(this.r() / 2 + 52 + 83, n6 - 4, 0.0f, n4, 8, 8, 8.0f, 16.0f);
            GL11.k();
        }
    }

    private void a(int n2, int n3) {
        net.minecraft.s.n.d(G);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        GL11.c(0.5f, 0.5f, 0.5f);
        net.minecraft.s.n.a(n2 * 2, n3 * 2 - 5, 0.0f, 0.0f, 200, 50, 200.0f, 50.0f);
        GL11.k();
    }

    @Override
    public void a(int n2, int n3, int n4) {
        if (this.e(n2, n3)) {
            ai ai2 = new ai(this.R);
            net.minecraft.s.b.a(ai2);
        } else if (this.W != null && this.W.equals(com.c.c.a.f("mco.selectServer.info"))) {
            this.ae = !this.ae;
        } else if (this.W != null && this.W.equals(com.c.c.a.f("mco.selectServer.close"))) {
            this.ae = false;
        } else if (this.b(n2, n3) && this.ae) {
            this.ae = false;
            this.af = true;
        }
    }

    private boolean b(int n2, int n3) {
        int n4 = (this.r() - 310) / 2;
        int n5 = this.s() / 2 - 83 - 3;
        return n2 < n4 - 5 || n2 > n4 + 315 || n3 < n5 - 5 || n3 > n5 + 171;
    }

    private void c(int n2, int n3) {
        int n4;
        int n5 = (this.r() - 310) / 2;
        int n6 = this.s() / 2 - 83 - 3;
        int n7 = n6 + 147 - 20;
        if (!this.ai) {
            this.aj = 0;
            this.ak = 0;
            this.d = true;
            if (this.ad && this.X.isEmpty()) {
                this.u();
                this.b(com.c.c.a.a(0, this.r() / 2 - 49, this.s() - 32, 98, 20, com.c.c.a.f("gui.back")));
            }
            if (this.ag && !this.ah) {
                this.b(com.c.c.a.a(4, this.r() / 2 + 52, n7 -= 10, 98, 20, com.c.c.a.f("mco.selectServer.trial")));
                n7 = n6 + 170 - 20 - 10;
            }
            this.b(com.c.c.a.a(3, this.r() / 2 + 52, n7, 98, 20, com.c.c.a.f("mco.selectServer.buy")));
            this.U.b(false);
        }
        if (this.ad) {
            this.ai = true;
        }
        GL11.c(1.0f, 1.0f, 1.0f, 0.7f);
        GL11.k(3042);
        net.minecraft.s.n.d(K);
        GL11.j();
        int n8 = 0;
        int n9 = 32;
        net.minecraft.s.n.a(n8, n9, 0.0f, 0.0f, this.r(), this.s() - 40 - 32, 310.0f, 166.0f);
        GL11.k();
        GL11.l(3042);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.s.n.d(J);
        GL11.j();
        net.minecraft.s.n.a(n5, n6, 0.0f, 0.0f, 310, 166, 310.0f, 166.0f);
        GL11.k();
        net.minecraft.s.n.d(O[this.aj]);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n5 + 7, n6 + 7, 0.0f, 0.0f, 195, 152, 195.0f, 152.0f);
        GL11.k();
        if (this.ak % 100 < 5) {
            if (!this.d) {
                this.aj = this.aj == O.length - 1 ? 0 : ++this.aj;
                this.d = true;
            }
        } else {
            this.d = false;
        }
        if (this.ae) {
            boolean bl2 = false;
            n4 = n5 + 4;
            int n10 = n6 + 4;
            if (n2 >= n4 && n2 <= n4 + 12 && n3 >= n10 && n3 <= n10 + 12) {
                this.W = com.c.c.a.f("mco.selectServer.close");
                bl2 = true;
            }
            net.minecraft.s.n.d(L);
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.j();
            net.minecraft.s.n.a(n4, n10, 0.0f, bl2 ? 12.0f : 0.0f, 12, 12, 12.0f, 24.0f);
            GL11.k();
            if (bl2) {
                this.W = com.c.c.a.f("mco.selectServer.close");
            }
        }
        List list = this.a(com.c.c.a.f("mco.selectServer.popup"), 100);
        n4 = 0;
        for (String string : list) {
            this.a(string, this.r() / 2 + 52, n6 + 10 * ++n4 - 3, 0x4C4C4C, false);
        }
    }

    private void d(int n2, int n3) {
        int n4;
        int n5 = this.Y;
        boolean bl2 = this.e(n2, n3);
        int n6 = this.r() / 2 + 50;
        int n7 = 8;
        if (n5 != 0) {
            float f2 = 0.25f + (1.0f + net.minecraft.s.m.a((float)this.Z * 0.5f)) * 0.25f;
            n4 = 0xFF000000 | (int)(f2 * 64.0f) << 16 | (int)(f2 * 64.0f) << 8 | (int)(f2 * 64.0f) << 0;
            this.b(n6 - 2, 6, n6 + 18, 26, n4, n4);
            n4 = 0xFF000000 | (int)(f2 * 255.0f) << 16 | (int)(f2 * 255.0f) << 8 | (int)(f2 * 255.0f) << 0;
            this.b(n6 - 2, 6, n6 + 18, 7, n4, n4);
            this.b(n6 - 2, 6, n6 - 1, 26, n4, n4);
            this.b(n6 + 17, 6, n6 + 18, 26, n4, n4);
            this.b(n6 - 2, 25, n6 + 18, 26, n4, n4);
        }
        net.minecraft.s.n.d(E);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n6, 2, bl2 ? 16.0f : 0.0f, 0.0f, 15, 25, 31.0f, 25.0f);
        GL11.k();
        if (n5 != 0) {
            int n8 = (Math.min(n5, 6) - 1) * 8;
            n4 = (int)(Math.max(0.0f, Math.max(net.minecraft.s.m.a((float)(10 + this.Z) * 0.57f), net.minecraft.s.m.e((float)this.Z * 0.35f))) * -6.0f);
            net.minecraft.s.n.d(D);
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.j();
            net.minecraft.s.n.a(n6 + 4, 12 + n4, n8, bl2 ? 8.0f : 0.0f, 8, 8, 48.0f, 16.0f);
            GL11.k();
        }
        if (bl2) {
            int n9 = n2 + 12;
            n4 = n3;
            String string = n5 == 0 ? com.c.c.a.f("mco.invites.nopending") : com.c.c.a.f("mco.invites.pending");
            int n10 = this.e(string);
            this.b(n9 - 3, n4 - 3, n9 + n10 + 3, n4 + 8 + 3, -1073741824, -1073741824);
            this.c(string, n9, n4, -1);
        }
    }

    private boolean e(int n2, int n3) {
        int n4 = this.r() / 2 + 50;
        int n5 = this.r() / 2 + 66;
        int n6 = 11;
        int n7 = 23;
        if (this.Y != 0) {
            n4 -= 3;
            n5 += 3;
            n6 -= 5;
            n7 += 5;
        }
        return n4 <= n2 && n2 <= n5 && n6 <= n3 && n3 <= n7;
    }

    public void a(i i2) {
        if (i2 != null) {
            try {
                if (!au.tryLock(1L, TimeUnit.SECONDS)) {
                    return;
                }
                if (au.getHoldCount() > 1) {
                    return;
                }
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            this.t = true;
            if (i2.s != null && i2.t != null) {
                this.x = i2;
                this.I();
                String string = com.c.c.a.f("mco.configure.world.resourcepack.question.line1");
                String string2 = com.c.c.a.f("mco.configure.world.resourcepack.question.line2");
                net.minecraft.s.b.a(new ac(this, com.c.c.d.a.ad.b, string, string2, true, 100));
            } else {
                this.f(i2);
            }
        }
    }

    private void f(i i2) {
        ae ae2 = new ae(this, new j(this, i2));
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    private boolean g(i i2) {
        return i2.g != null && i2.g.equals(net.minecraft.s.b.g());
    }

    private boolean h(i i2) {
        return i2.g != null && i2.g.equals(net.minecraft.s.b.g()) && !i2.k;
    }

    private void a(int n2, int n3, int n4, int n5) {
        net.minecraft.s.n.d(A);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 10, 28, 10.0f, 28.0f);
        GL11.k();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 27 && n5 < this.s() - 40 && n5 > 32 && !this.c()) {
            this.W = com.c.c.a.f("mco.selectServer.expired");
        }
    }

    private void b(int n2, int n3, int n4, int n5, int n6) {
        net.minecraft.s.n.d(B);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        if (this.Z % 20 < 10) {
            net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 10, 28, 20.0f, 28.0f);
        } else {
            net.minecraft.s.n.a(n2, n3, 10.0f, 0.0f, 10, 28, 20.0f, 28.0f);
        }
        GL11.k();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 27 && n5 < this.s() - 40 && n5 > 32 && !this.c()) {
            this.W = n6 <= 0 ? com.c.c.a.f("mco.selectServer.expires.soon") : (n6 == 1 ? com.c.c.a.f("mco.selectServer.expires.day") : com.c.c.a.a("mco.selectServer.expires.days", n6));
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        net.minecraft.s.n.d(y);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 10, 28, 10.0f, 28.0f);
        GL11.k();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 27 && n5 < this.s() - 40 && n5 > 32 && !this.c()) {
            this.W = com.c.c.a.f("mco.selectServer.open");
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        net.minecraft.s.n.d(z);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 10, 28, 10.0f, 28.0f);
        GL11.k();
        if (n4 >= n2 && n4 <= n2 + 9 && n5 >= n3 && n5 <= n3 + 27 && n5 < this.s() - 40 && n5 > 32 && !this.c()) {
            this.W = com.c.c.a.f("mco.selectServer.closed");
        }
    }

    private void d(int n2, int n3, int n4, int n5) {
        boolean bl2 = false;
        if (n4 >= n2 && n4 <= n2 + 28 && n5 >= n3 && n5 <= n3 + 28 && n5 < this.s() - 40 && n5 > 32 && !this.c()) {
            bl2 = true;
        }
        net.minecraft.s.n.d(C);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, bl2 ? 28.0f : 0.0f, 0.0f, 28, 28, 56.0f, 28.0f);
        GL11.k();
        if (bl2) {
            this.W = com.c.c.a.f("mco.selectServer.leave");
        }
    }

    private void e(int n2, int n3, int n4, int n5) {
        boolean bl2 = false;
        if (n4 >= n2 && n4 <= n2 + 28 && n5 >= n3 && n5 <= n3 + 28 && n5 < this.s() - 40 && n5 > 32 && !this.c()) {
            bl2 = true;
        }
        net.minecraft.s.n.d(H);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n2, n3, bl2 ? 28.0f : 0.0f, 0.0f, 28, 28, 56.0f, 28.0f);
        GL11.k();
        if (bl2) {
            this.W = com.c.c.a.f("mco.selectServer.configure");
        }
    }

    protected void a(String string, int n2, int n3) {
        if (string == null) {
            return;
        }
        int n4 = 0;
        int n5 = 0;
        for (String string2 : string.split("\n")) {
            int n6 = this.e(string2);
            if (n6 <= n5) continue;
            n5 = n6;
        }
        int n7 = n2 - n5 - 5;
        int n8 = n3;
        if (n7 < 0) {
            n7 = n2 + 12;
        }
        for (String string3 : string.split("\n")) {
            this.b(n7 - 3, n8 - (n4 == 0 ? 3 : 0) + n4, n7 + n5 + 3, n8 + 8 + 3 + n4, -1073741824, -1073741824);
            this.c(string3, n7, n8 + n4, 0xFFFFFF);
            n4 += 10;
        }
    }

    private void f(int n2, int n3) {
        int n4 = this.r() - 17 - 20;
        int n5 = 6;
        boolean bl2 = false;
        if (n2 >= n4 && n2 <= n4 + 20 && n3 >= 6 && n3 <= 26) {
            bl2 = true;
        }
        net.minecraft.s.n.d(I);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        net.minecraft.s.n.a(n4, 6, bl2 ? 20.0f : 0.0f, 0.0f, 20, 20, 40.0f, 20.0f);
        GL11.k();
        if (bl2) {
            this.W = com.c.c.a.f("mco.selectServer.info");
        }
    }

    private void J() {
        String string = "LOCAL!";
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        GL11.f((float)(this.r() / 2 - 25), 20.0f, 0.0f);
        GL11.d(-20.0f, 0.0f, 0.0f, 1.0f);
        GL11.c(1.5f, 1.5f, 1.5f);
        this.b(string, 0, 0, 0x7FFF7F);
        GL11.k();
    }

    private void K() {
        String string = "STAGE!";
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        GL11.f((float)(this.r() / 2 - 25), 20.0f, 0.0f);
        GL11.d(-20.0f, 0.0f, 0.0f, 1.0f);
        GL11.c(1.5f, 1.5f, 1.5f);
        this.b(string, 0, 0, -256);
        GL11.k();
    }

    public n j() {
        return new a(this.R);
    }

    public void k() {
        if (this.c() && this.ae) {
            this.ae = false;
        }
    }

    static /* synthetic */ List a(a a2) {
        return a2.A();
    }

    static /* synthetic */ org.apache.logging.log4j.d l() {
        return e;
    }

    static /* synthetic */ n a(n n2) {
        al = n2;
        return al;
    }

    static /* synthetic */ n b(a a2) {
        return a2.R;
    }

    static /* synthetic */ void c(a a2) {
        a2.D();
    }

    static /* synthetic */ boolean b(boolean bl2) {
        ac = bl2;
        return ac;
    }

    static /* synthetic */ boolean c(boolean bl2) {
        aa = bl2;
        return aa;
    }

    static /* synthetic */ boolean d(boolean bl2) {
        ab = bl2;
        return ab;
    }

    static /* synthetic */ f m() {
        return P;
    }

    static /* synthetic */ long d(a a2) {
        return a2.T;
    }

    static /* synthetic */ i a(a a2, long l2) {
        return a2.a(l2);
    }

    static /* synthetic */ List e(a a2) {
        return a2.X;
    }

    static /* synthetic */ long b(a a2, long l2) {
        a2.T = l2;
        return a2.T;
    }

    static /* synthetic */ net.minecraft.s.f f(a a2) {
        return a2.U;
    }

    static /* synthetic */ boolean a(a a2, boolean bl2) {
        a2.ae = bl2;
        return a2.ae;
    }

    static /* synthetic */ boolean a(a a2, i i2) {
        return a2.b(i2);
    }

    static /* synthetic */ boolean b(a a2, i i2) {
        return a2.g(i2);
    }

    static /* synthetic */ void c(a a2, i i2) {
        a2.c(i2);
    }

    static /* synthetic */ int c(a a2, long l2) {
        return a2.b(l2);
    }

    static /* synthetic */ boolean g(a a2) {
        return a2.aw;
    }

    static /* synthetic */ String h(a a2) {
        return a2.W;
    }

    static /* synthetic */ void d(a a2, i i2) {
        a2.d(i2);
    }

    static /* synthetic */ void e(a a2, i i2) {
        a2.e(i2);
    }

    static /* synthetic */ boolean i(a a2) {
        return a2.av;
    }

    static /* synthetic */ int j(a a2) {
        return a2.ar;
    }

    static /* synthetic */ int a(a a2, int n2) {
        a2.ar = n2;
        return a2.ar;
    }

    static /* synthetic */ int k(a a2) {
        return a2.Z;
    }

    static /* synthetic */ void a(a a2, int n2, int n3, int n4, int n5) {
        a2.a(n2, n3, n4, n5);
    }

    static /* synthetic */ void b(a a2, int n2, int n3, int n4, int n5) {
        a2.c(n2, n3, n4, n5);
    }

    static /* synthetic */ void a(a a2, int n2, int n3, int n4, int n5, int n6) {
        a2.b(n2, n3, n4, n5, n6);
    }

    static /* synthetic */ void c(a a2, int n2, int n3, int n4, int n5) {
        a2.b(n2, n3, n4, n5);
    }

    static /* synthetic */ boolean n() {
        return s;
    }

    static /* synthetic */ void d(a a2, int n2, int n3, int n4, int n5) {
        a2.d(n2, n3, n4, n5);
    }

    static /* synthetic */ void e(a a2, int n2, int n3, int n4, int n5) {
        a2.e(n2, n3, n4, n5);
    }

    static /* synthetic */ String a(a a2, String string) {
        a2.W = string;
        return a2.W;
    }

    static /* synthetic */ boolean b(a a2, boolean bl2) {
        a2.av = bl2;
        return a2.av;
    }

    static /* synthetic */ boolean c(a a2, boolean bl2) {
        a2.aw = bl2;
        return a2.aw;
    }

    static {
        String string = com.c.c.i.a();
        if (string != null) {
            e.d("Realms library version == " + string);
        }
    }
}

