/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.a;
import com.c.c.b.ab;
import com.c.c.d.a.ac;
import com.c.c.d.a.ad;
import com.c.c.d.a.y;
import com.c.c.d.a.z;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.j;
import net.minecraft.s.n;
import net.minecraft.s.q;
import net.minecraft.s.v;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.opengl.GL11;

public class x
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private final n b;
    private final ab c;
    private f d;
    private final String e;
    private final z s;
    private volatile String t = null;
    private volatile String u = null;
    private volatile String v = null;
    private volatile boolean w = false;
    private volatile boolean x = true;
    private volatile boolean y = false;
    private volatile boolean z = false;
    private Long A = null;
    private Long B = null;
    private long C = 0L;
    private int D = 0;
    private static final String[] E = new String[]{"", ".", ". .", ". . ."};
    private int F = 0;
    private final int G = 100;
    private int H = -1;
    private boolean I = false;
    private static final ReentrantLock J = new ReentrantLock();

    public x(n n2, ab ab2, String string) {
        this.b = n2;
        this.e = string;
        this.c = ab2;
        this.s = new z(this);
    }

    public void a(int n2) {
        this.H = n2;
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        this.d = com.c.c.d.a.x.a(0, this.r() / 2 - 100, this.s() - 42, 200, 20, com.c.c.d.a.x.f("gui.cancel"));
        this.b(this.d);
        this.e();
    }

    private void e() {
        if (this.y) {
            return;
        }
        if (!this.I && this.a(this.c.a) >= 0x40000000L) {
            String string = com.c.c.d.a.x.a("mco.download.confirmation.line1", com.c.c.d.a.x.b(0x40000000L));
            String string2 = com.c.c.d.a.x.f("mco.download.confirmation.line2");
            net.minecraft.s.b.a(new ac(this, ad.a, string, string2, false, 100));
        } else {
            this.l();
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        this.I = true;
        net.minecraft.s.b.a(this);
        this.l();
    }

    private long a(String string) {
        a a2 = new a();
        return a2.a(string);
    }

    @Override
    public void g() {
        super.g();
        ++this.D;
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        if (f2.c() == 0) {
            this.w = true;
            this.f();
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            this.w = true;
            this.f();
        }
    }

    private void f() {
        if (this.y && this.H != -1 && this.t == null) {
            this.b.a(true, this.H);
        }
        net.minecraft.s.b.a(this.b);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        if (this.z && !this.y) {
            this.u = com.c.c.d.a.x.f("mco.download.extracting");
        }
        this.a(com.c.c.d.a.x.f("mco.download.title"), this.r() / 2, 20, 0xFFFFFF);
        this.a(this.u, this.r() / 2, 50, 0xFFFFFF);
        if (this.x) {
            this.i();
        }
        if (this.s.a != 0L && !this.w) {
            this.j();
            this.k();
        }
        if (this.t != null) {
            this.a(this.t, this.r() / 2, 110, 0xFF0000);
        }
        super.a(n2, n3, f2);
    }

    private void i() {
        int n2 = this.e(this.u);
        if (this.D % 10 == 0) {
            ++this.F;
        }
        this.b(E[this.F % E.length], this.r() / 2 + n2 / 2 + 5, 50, 0xFFFFFF);
    }

    private void j() {
        double d2 = this.s.a.doubleValue() / this.s.b.doubleValue() * 100.0;
        this.v = String.format("%.1f", d2);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.l(3553);
        v v2 = net.minecraft.s.v.b;
        v2.a(7, net.minecraft.s.j.f);
        double d3 = this.r() / 2 - 100;
        double d4 = 0.5;
        v2.a(d3 - 0.5, 95.5, 0.0).a(217, 210, 210, 255).c();
        v2.a(d3 + 200.0 * d2 / 100.0 + 0.5, 95.5, 0.0).a(217, 210, 210, 255).c();
        v2.a(d3 + 200.0 * d2 / 100.0 + 0.5, 79.5, 0.0).a(217, 210, 210, 255).c();
        v2.a(d3 - 0.5, 79.5, 0.0).a(217, 210, 210, 255).c();
        v2.a(d3, 95.0, 0.0).a(128, 128, 128, 255).c();
        v2.a(d3 + 200.0 * d2 / 100.0, 95.0, 0.0).a(128, 128, 128, 255).c();
        v2.a(d3 + 200.0 * d2 / 100.0, 80.0, 0.0).a(128, 128, 128, 255).c();
        v2.a(d3, 80.0, 0.0).a(128, 128, 128, 255).c();
        v2.a();
        GL11.k(3553);
        this.a(this.v + " %", this.r() / 2, 84, 0xFFFFFF);
    }

    private void k() {
        if (this.D % net.minecraft.s.q.b == 0) {
            if (this.A != null) {
                long l2 = System.currentTimeMillis() - this.B;
                if (l2 == 0L) {
                    l2 = 1L;
                }
                this.C = 1000L * (this.s.a - this.A) / l2;
                this.c(this.C);
            }
            this.A = this.s.a;
            this.B = System.currentTimeMillis();
        } else {
            this.c(this.C);
        }
    }

    private void c(long l2) {
        if (l2 > 0L) {
            int n2 = this.e(this.v);
            String string = "(" + com.c.c.d.a.x.a(l2) + ")";
            this.b(string, this.r() / 2 + n2 / 2 + 15, 84, 0xFFFFFF);
        }
    }

    public static String a(long l2) {
        int n2 = 1024;
        if (l2 < (long)n2) {
            return l2 + " B";
        }
        int n3 = (int)(Math.log(l2) / Math.log(n2));
        String string = "KMGTPE".charAt(n3 - 1) + "";
        return String.format("%.1f %sB/s", (double)l2 / Math.pow(n2, n3), string);
    }

    public static String b(long l2) {
        int n2 = 1024;
        if (l2 < (long)n2) {
            return l2 + " B";
        }
        int n3 = (int)(Math.log(l2) / Math.log(n2));
        String string = "KMGTPE".charAt(n3 - 1) + "";
        return String.format("%.0f %sB", (double)l2 / Math.pow(n2, n3), string);
    }

    @Override
    public void a() {
        super.a();
    }

    private void l() {
        new y(this).start();
    }

    private void m() {
        this.u = com.c.c.d.a.x.f("mco.download.cancelled");
    }

    static /* synthetic */ ReentrantLock b() {
        return J;
    }

    static /* synthetic */ String a(x x2, String string) {
        x2.u = string;
        return x2.u;
    }

    static /* synthetic */ boolean a(x x2) {
        return x2.w;
    }

    static /* synthetic */ void b(x x2) {
        x2.m();
    }

    static /* synthetic */ String c(x x2) {
        return x2.e;
    }

    static /* synthetic */ ab d(x x2) {
        return x2.c;
    }

    static /* synthetic */ z e(x x2) {
        return x2.s;
    }

    static /* synthetic */ String b(x x2, String string) {
        x2.t = string;
        return x2.t;
    }

    static /* synthetic */ f f(x x2) {
        return x2.d;
    }

    static /* synthetic */ boolean a(x x2, boolean bl2) {
        x2.z = bl2;
        return x2.z;
    }

    static /* synthetic */ d c() {
        return a;
    }

    static /* synthetic */ boolean b(x x2, boolean bl2) {
        x2.y = bl2;
        return x2.y;
    }

    static /* synthetic */ boolean c(x x2, boolean bl2) {
        x2.x = bl2;
        return x2.x;
    }
}

