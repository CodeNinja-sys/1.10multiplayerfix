/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.b.e;
import net.minecraft.client.f.an;
import net.minecraft.client.f.u;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.g;
import net.minecraft.client.k.ai;
import net.minecraft.client.k.as;
import net.minecraft.client.k.at;
import net.minecraft.client.k.bj;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.di;
import net.minecraft.client.k.m;
import net.minecraft.client.r;
import net.minecraft.l.k;
import net.minecraft.q.a.w;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import org.apache.commons.b.b;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.a.j;

public class ci
extends cc
implements bu {
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final d c = org.apache.logging.log4j.c.c();
    private static final Random d = new Random();
    private final float e;
    private String f;
    private ch g;
    private int h;
    private net.minecraft.client.g.a.m i;
    private final boolean j = true;
    private final Object k;
    private String l;
    private String m;
    private String v;
    private static final bp w = new bp("texts/splashes.txt");
    private static final bp x = new bp("textures/gui/title/minecraft.png");
    private static final bp[] C = new bp[]{new bp("textures/gui/title/background/panorama_0.png"), new bp("textures/gui/title/background/panorama_1.png"), new bp("textures/gui/title/background/panorama_2.png"), new bp("textures/gui/title/background/panorama_3.png"), new bp("textures/gui/title/background/panorama_4.png"), new bp("textures/gui/title/background/panorama_5.png")};
    public static final String a = "Please click " + (Object)((Object)net.minecraft.u.d.o.t) + "here" + (Object)((Object)net.minecraft.u.d.o.v) + " for more information.";
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private bp J;
    private ch K;
    private boolean L;
    private cc M;

    public ci() {
        block10: {
            this.j = true;
            this.k = new Object();
            this.m = a;
            this.f = "missingno";
            an an2 = null;
            try {
                try {
                    String string;
                    ArrayList arrayList = ov.a();
                    an2 = net.minecraft.client.r.z().O().a(w);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(an2.b(), org.apache.commons.b.b.f));
                    while ((string = bufferedReader.readLine()) != null) {
                        if ((string = string.trim()).isEmpty()) continue;
                        arrayList.add(string);
                    }
                    if (!arrayList.isEmpty()) {
                        do {
                            this.f = (String)arrayList.get(d.nextInt(arrayList.size()));
                        } while (this.f.hashCode() == 125780783);
                    }
                }
                catch (IOException iOException) {
                    org.apache.commons.b.t.a(an2);
                    break block10;
                }
            }
            catch (Throwable throwable) {
                org.apache.commons.b.t.a(an2);
                throw throwable;
            }
            org.apache.commons.b.t.a(an2);
        }
        this.e = d.nextFloat();
        this.l = "";
        if (!GLContext.a().ex && !ay.b()) {
            this.l = net.minecraft.client.f.u.a("title.oldgl1", new Object[0]);
            this.m = net.minecraft.client.f.u.a("title.oldgl2", new Object[0]);
            this.v = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
        }
        if (net.minecraft.l.k.e) {
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.a, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.b, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.c, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.d, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.e, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.f, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.g, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.h, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.i, 0.0f);
            net.minecraft.client.r.z().w.a(net.minecraft.u.bu.j, 0.0f);
        }
    }

    private boolean f() {
        return net.minecraft.client.r.z().w.b(net.minecraft.client.b.e.L) && this.M != null;
    }

    @Override
    public void bY_() {
        ++this.h;
        if (this.f()) {
            this.M.bY_();
        }
    }

    @Override
    public boolean cq_() {
        return false;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void ct_() {
        this.i = new net.minecraft.client.g.a.m(256, 256);
        this.J = this.n.N().a("background", this.i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
            this.f = "Merry X-mas!";
        } else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
            this.f = "Happy new year!";
        } else if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31) {
            this.f = "OOoooOOOoooo! Spooky!";
        }
        int n2 = 24;
        int n3 = this.q / 4 + 48;
        if (this.n.u()) {
            this.c(n3, 24);
        } else {
            this.b(n3, 24);
        }
        this.r.add(new ch(0, this.p / 2 - 100, n3 + 72 + 12, 98, 20, net.minecraft.client.f.u.a("menu.options", new Object[0])));
        this.r.add(new ch(4, this.p / 2 + 2, n3 + 72 + 12, 98, 20, net.minecraft.client.f.u.a("menu.quit", new Object[0])));
        this.r.add(new di(5, this.p / 2 - 124, n3 + 72 + 12));
        Object object = this.k;
        synchronized (object) {
            this.E = this.u.a(this.l);
            this.D = this.u.a(this.m);
            int n4 = Math.max(this.E, this.D);
            this.F = (this.p - n4) / 2;
            this.G = ((ch)this.r.get((int)0)).h - 24;
            this.H = this.F + n4;
            this.I = this.G + 24;
        }
        this.n.a(false);
        if (net.minecraft.client.r.z().w.b(net.minecraft.client.b.e.L) && !this.L) {
            object = new net.minecraft.s.d();
            this.M = ((net.minecraft.s.d)object).b(this);
            this.L = true;
        }
        if (this.f()) {
            this.M.a(this.p, this.q);
            this.M.ct_();
        }
        if (!this.n.w.aE.equals("en_US")) {
            this.n.a(new as(this, this.n.w, this.n.Q()));
        }
    }

    private void b(int n2, int n3) {
        this.r.add(new ch(1, this.p / 2 - 100, n2, net.minecraft.client.f.u.a("menu.singleplayer", new Object[0])));
        this.r.add(new ch(2, this.p / 2 - 100, n2 + n3 * 1, net.minecraft.client.f.u.a("menu.multiplayer", new Object[0])));
        this.K = this.b(new ch(14, this.p / 2 - 100, n2 + n3 * 2, net.minecraft.client.f.u.a("menu.online", new Object[0])));
    }

    private void c(int n2, int n3) {
        this.r.add(new ch(11, this.p / 2 - 100, n2, net.minecraft.client.f.u.a("menu.playdemo", new Object[0])));
        this.g = this.b(new ch(12, this.p / 2 - 100, n2 + n3 * 1, net.minecraft.client.f.u.a("menu.resetdemo", new Object[0])));
        w w2 = this.n.g();
        net.minecraft.q.a.d d2 = w2.a("Demo_World");
        if (d2 == null) {
            this.g.k = false;
        }
    }

    @Override
    protected void a(ch ch2) {
        w w2;
        net.minecraft.q.a.d d2;
        if (ch2.j == 0) {
            this.n.a(new m(this, this.n.w));
        }
        if (ch2.j == 5) {
            net.minecraft.l.k.b();
        }
        if (ch2.j == 1) {
            net.minecraft.l.k.b();
        }
        if (ch2.j == 2) {
            this.n.a(new ai(this));
            if (net.minecraft.l.k.e) {
                net.minecraft.client.r.I.h();
            }
        }
        if (ch2.j == 14 && this.K.l) {
            this.g();
        }
        if (ch2.j == 4) {
            this.n.n();
        }
        if (ch2.j == 11) {
            this.n.a("Demo_World", "Demo_World", net.minecraft.q.e.b.H);
        }
        if (ch2.j == 12 && (d2 = (w2 = this.n.g()).a("Demo_World")) != null) {
            this.n.a(new at(this, net.minecraft.client.f.u.a("selectWorld.deleteQuestion", new Object[0]), "'" + d2.i() + "' " + net.minecraft.client.f.u.a("selectWorld.deleteWarning", new Object[0]), net.minecraft.client.f.u.a("selectWorld.deleteButton", new Object[0]), net.minecraft.client.f.u.a("gui.cancel", new Object[0]), 12));
        }
    }

    private void g() {
        net.minecraft.s.d d2 = new net.minecraft.s.d();
        d2.a(this);
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2 && n2 == 12) {
            w w2 = this.n.g();
            w2.c();
            w2.c("Demo_World");
            this.n.a(this);
        } else if (n2 == 13) {
            if (bl2) {
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class_.getMethod("browse", URI.class).invoke(object, new URI(this.v));
                }
                catch (Throwable throwable) {
                    c.b("Couldn't open link", throwable);
                }
            }
            this.n.a(this);
        }
    }

    private void b(int n2, int n3, float f2) {
        net.minecraft.client.g.ci ci2 = net.minecraft.client.g.ci.a();
        g g2 = ci2.c();
        bd.l(5889);
        bd.D();
        bd.C();
        org.lwjgl.util.a.j.a(120.0f, 1.0f, 0.05f, 10.0f);
        bd.l(5888);
        bd.D();
        bd.C();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.b(180.0f, 1.0f, 0.0f, 0.0f);
        bd.b(90.0f, 0.0f, 0.0f, 1.0f);
        bd.l();
        bd.c();
        bd.q();
        bd.a(false);
        bd.a(ad.l, bc.j, ad.e, bc.n);
        int n4 = 8;
        for (int i2 = 0; i2 < 64; ++i2) {
            bd.D();
            float f3 = ((float)(i2 % 8) / 8.0f - 0.5f) / 64.0f;
            float f4 = ((float)(i2 / 8) / 8.0f - 0.5f) / 64.0f;
            float f5 = 0.0f;
            bd.c(f3, f4, 0.0f);
            bd.b(net.minecraft.u.b.n.a(((float)this.h + f2) / 400.0f) * 25.0f + 20.0f, 1.0f, 0.0f, 0.0f);
            bd.b(-((float)this.h + f2) * 0.1f, 0.0f, 1.0f, 0.0f);
            for (int i3 = 0; i3 < 6; ++i3) {
                bd.D();
                if (i3 == 1) {
                    bd.b(90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 2) {
                    bd.b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 3) {
                    bd.b(-90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 4) {
                    bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i3 == 5) {
                    bd.b(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                this.n.N().a(C[i3]);
                g2.a(7, net.minecraft.client.g.d.b.i);
                int n5 = 255 / (i2 + 1);
                float f6 = 0.0f;
                g2.b(-1.0, -1.0, 1.0).a(0.0, 0.0).b(255, 255, 255, n5).d();
                g2.b(1.0, -1.0, 1.0).a(1.0, 0.0).b(255, 255, 255, n5).d();
                g2.b(1.0, 1.0, 1.0).a(1.0, 1.0).b(255, 255, 255, n5).d();
                g2.b(-1.0, 1.0, 1.0).a(0.0, 1.0).b(255, 255, 255, n5).d();
                ci2.b();
                bd.E();
            }
            bd.E();
            bd.a(true, true, true, false);
        }
        g2.c(0.0, 0.0, 0.0);
        bd.a(true, true, true, true);
        bd.l(5889);
        bd.E();
        bd.l(5888);
        bd.E();
        bd.a(true);
        bd.p();
        bd.j();
    }

    private void a(float f2) {
        this.n.N().a(this.J);
        bd.b(3553, 10241, 9729);
        bd.b(3553, 10240, 9729);
        bd.a(3553, 0, 0, 0, 0, 0, 256, 256);
        bd.l();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.a(true, true, true, false);
        net.minecraft.client.g.ci ci2 = net.minecraft.client.g.ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.i);
        bd.c();
        int n2 = 3;
        for (int i2 = 0; i2 < 3; ++i2) {
            float f3 = 1.0f / (float)(i2 + 1);
            int n3 = this.p;
            int n4 = this.q;
            float f4 = (float)(i2 - 1) / 256.0f;
            g2.b((double)n3, (double)n4, (double)this.B).a(0.0f + f4, 1.0).a(1.0f, 1.0f, 1.0f, f3).d();
            g2.b((double)n3, 0.0, (double)this.B).a(1.0f + f4, 1.0).a(1.0f, 1.0f, 1.0f, f3).d();
            g2.b(0.0, 0.0, (double)this.B).a(1.0f + f4, 0.0).a(1.0f, 1.0f, 1.0f, f3).d();
            g2.b(0.0, (double)n4, (double)this.B).a(0.0f + f4, 0.0).a(1.0f, 1.0f, 1.0f, f3).d();
        }
        ci2.b();
        bd.d();
        bd.a(true, true, true, true);
    }

    private void c(int n2, int n3, float f2) {
        this.n.b().e();
        bd.b(0, 0, 256, 256);
        this.b(n2, n3, f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.n.b().a(true);
        bd.b(0, 0, this.n.e, this.n.f);
        float f3 = 120.0f / (float)(this.p > this.q ? this.p : this.q);
        float f4 = (float)this.q * f3 / 256.0f;
        float f5 = (float)this.p * f3 / 256.0f;
        int n4 = this.p;
        int n5 = this.q;
        net.minecraft.client.g.ci ci2 = net.minecraft.client.g.ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.i);
        g2.b(0.0, (double)n5, (double)this.B).a(0.5f - f4, 0.5f + f5).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        g2.b((double)n4, (double)n5, (double)this.B).a(0.5f - f4, 0.5f - f5).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        g2.b((double)n4, 0.0, (double)this.B).a(0.5f + f4, 0.5f - f5).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        g2.b(0.0, 0.0, (double)this.B).a(0.5f + f4, 0.5f + f5).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        ci2.b();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        bd.c();
        this.c(n2, n3, f2);
        bd.d();
        int n4 = 274;
        int n5 = this.p / 2 - 137;
        int n6 = 30;
        this.b(0, 0, this.p, this.q, -2130706433, 0xFFFFFF);
        this.b(0, 0, this.p, this.q, 0, Integer.MIN_VALUE);
        this.n.N().a(x);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        if ((double)this.e < 1.0E-4) {
            this.a_(n5 + 0, 30, 0, 0, 99, 44);
            this.a_(n5 + 99, 30, 129, 0, 27, 44);
            this.a_(n5 + 99 + 26, 30, 126, 0, 3, 44);
            this.a_(n5 + 99 + 26 + 3, 30, 99, 0, 26, 44);
            this.a_(n5 + 155, 30, 0, 45, 155, 44);
        } else {
            this.a_(n5 + 0, 30, 0, 0, 155, 44);
            this.a_(n5 + 155, 30, 0, 45, 155, 44);
        }
        bd.D();
        bd.c((float)(this.p / 2 + 90), 70.0f, 0.0f);
        bd.b(-20.0f, 0.0f, 0.0f, 1.0f);
        float f3 = 1.8f - net.minecraft.u.b.n.e(net.minecraft.u.b.n.a((float)(net.minecraft.client.r.I() % 1000L) / 1000.0f * ((float)Math.PI * 2)) * 0.1f);
        f3 = f3 * 100.0f / (float)(this.u.a(this.f) + 32);
        bd.b(f3, f3, f3);
        this.a(this.u, this.f, 0, -8, -256);
        bd.E();
        String string = "Minecraft 1.10 Multiplayer Fix";
        string = this.n.u() ? String.valueOf(string) + " Demo" : String.valueOf(string) + ("release".equalsIgnoreCase(this.n.d()) ? "" : "/" + this.n.d());
        this.b(this.u, string, 2, this.q - 10, -1);
        String string2 = "Copyright Mojang AB. Do not distribute!";
        this.b(this.u, "Copyright Mojang AB. Do not distribute!", this.p - this.u.a("Copyright Mojang AB. Do not distribute!") - 2, this.q - 10, -1);
        if (this.l != null && !this.l.isEmpty()) {
            ci.a(this.F - 2, this.G - 2, this.H + 2, this.I - 1, 0x55200000);
            this.b(this.u, this.l, this.F, this.G, -1);
            this.b(this.u, this.m, (this.p - this.D) / 2, ((ch)this.r.get((int)0)).h - 12, -1);
        }
        super.a(n2, n3, f2);
        if (this.f()) {
            this.M.a(n2, n3, f2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        Object object = this.k;
        synchronized (object) {
            if (!this.l.isEmpty() && n2 >= this.F && n2 <= this.H && n3 >= this.G && n3 <= this.I) {
                bj bj2 = new bj((bu)this, this.v, 13, true);
                bj2.g();
                this.n.a(bj2);
            }
        }
        if (this.f()) {
            this.M.a(n2, n3, n4);
        }
    }

    @Override
    public void cs_() {
        if (this.M != null) {
            this.M.cs_();
        }
    }
}

