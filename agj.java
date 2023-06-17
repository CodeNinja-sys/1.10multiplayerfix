/*
 * Decompiled with CFR 0.150.
 */
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
import org.apache.commons.b.b;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.a.j;

public class agj
extends cjn
implements awn {
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final d c = org.apache.logging.log4j.c.c();
    private static final Random d = new Random();
    private final float e;
    private String f;
    private cwv g;
    private int h;
    private cze i;
    private final boolean j = true;
    private final Object k;
    private String l;
    private String m;
    private String r;
    private static final bpx s = new bpx("texts/splashes.txt");
    private static final bpx t = new bpx("textures/gui/title/minecraft.png");
    private static final bpx[] C = new bpx[]{new bpx("textures/gui/title/background/panorama_0.png"), new bpx("textures/gui/title/background/panorama_1.png"), new bpx("textures/gui/title/background/panorama_2.png"), new bpx("textures/gui/title/background/panorama_3.png"), new bpx("textures/gui/title/background/panorama_4.png"), new bpx("textures/gui/title/background/panorama_5.png")};
    public static final String a = "Please click " + (Object)((Object)aug.t) + "here" + (Object)((Object)aug.v) + " for more information.";
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private bpx J;
    private cwv K;
    private boolean L;
    private cjn M;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public agj() {
        dbr dbr2;
        block6: {
            this.j = true;
            this.k = new Object();
            this.m = a;
            this.f = "missingno";
            dbr2 = null;
            try {
                String string;
                ArrayList arrayList = ov.a();
                dbr2 = bxy.B().Q().a(s);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dbr2.b(), org.apache.commons.b.b.f));
                while ((string = bufferedReader.readLine()) != null) {
                    if ((string = string.trim()).isEmpty()) continue;
                    arrayList.add(string);
                }
                if (arrayList.isEmpty()) break block6;
                do {
                    this.f = (String)arrayList.get(d.nextInt(arrayList.size()));
                } while (this.f.hashCode() == 125780783);
            }
            catch (IOException iOException) {
                org.apache.commons.b.t.a(dbr2);
                catch (Throwable throwable) {
                    org.apache.commons.b.t.a(dbr2);
                    throw throwable;
                }
            }
        }
        org.apache.commons.b.t.a(dbr2);
        this.e = d.nextFloat();
        this.l = "";
        if (GLContext.a().ex) return;
        if (cjg.b()) return;
        this.l = bf.a("title.oldgl1", new Object[0]);
        this.m = bf.a("title.oldgl2", new Object[0]);
        this.r = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
    }

    private boolean f() {
        return bxy.B().u.b(oi.L) && this.M != null;
    }

    @Override
    public void d() {
        ++this.h;
        if (this.f()) {
            this.M.d();
        }
    }

    @Override
    public boolean q_() {
        return false;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void cH_() {
        this.i = new cze(256, 256);
        this.J = this.u.P().a("background", this.i);
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
        int n3 = this.x / 4 + 48;
        if (this.u.w()) {
            this.c(n3, 24);
        } else {
            this.a(n3, 24);
        }
        this.y.add(new cwv(0, this.w / 2 - 100, n3 + 72 + 12, 98, 20, bf.a("menu.options", new Object[0])));
        this.y.add(new cwv(4, this.w / 2 + 2, n3 + 72 + 12, 98, 20, bf.a("menu.quit", new Object[0])));
        this.y.add(new cro(5, this.w / 2 - 124, n3 + 72 + 12));
        Object object = this.k;
        synchronized (object) {
            this.E = this.B.a(this.l);
            this.D = this.B.a(this.m);
            int n4 = Math.max(this.E, this.D);
            this.F = (this.w - n4) / 2;
            this.G = ((cwv)this.y.get((int)0)).h - 24;
            this.H = this.F + n4;
            this.I = this.G + 24;
        }
        this.u.a(false);
        if (bxy.B().u.b(oi.L) && !this.L) {
            object = new net.minecraft.s.d();
            this.M = object.getNotificationScreen((bft)((Object)this));
            this.L = true;
        }
        if (this.f()) {
            this.M.b(this.w, this.x);
            this.M.cH_();
        }
    }

    private void a(int n2, int n3) {
        this.y.add(new cwv(1, this.w / 2 - 100, n2, bf.a("menu.singleplayer", new Object[0])));
        this.y.add(new cwv(2, this.w / 2 - 100, n2 + n3 * 1, bf.a("menu.multiplayer", new Object[0])));
        this.K = this.b(new cwv(14, this.w / 2 - 100, n2 + n3 * 2, bf.a("menu.online", new Object[0])));
    }

    private void c(int n2, int n3) {
        this.y.add(new cwv(11, this.w / 2 - 100, n2, bf.a("menu.playdemo", new Object[0])));
        this.g = this.b(new cwv(12, this.w / 2 - 100, n2 + n3 * 1, bf.a("menu.resetdemo", new Object[0])));
        bxj bxj2 = this.u.i();
        cvn cvn2 = bxj2.a("Demo_World");
        if (cvn2 == null) {
            this.g.k = false;
        }
    }

    @Override
    protected void a(cwv cwv2) {
        bxj bxj2;
        cvn cvn2;
        if (cwv2.j == 0) {
            this.u.a(new ako(this, this.u.u));
        }
        if (cwv2.j == 5) {
            this.u.a(new car(this, this.u.u, this.u.S()));
        }
        if (cwv2.j == 1) {
            this.u.a(new bbb(this));
        }
        if (cwv2.j == 2) {
            this.u.a(new cuz(this));
        }
        if (cwv2.j == 14 && this.K.l) {
            this.h();
        }
        if (cwv2.j == 4) {
            this.u.p();
        }
        if (cwv2.j == 11) {
            this.u.a("Demo_World", "Demo_World", cj.a);
        }
        if (cwv2.j == 12 && (cvn2 = (bxj2 = this.u.i()).a("Demo_World")) != null) {
            this.u.a(new ayi(this, bf.a("selectWorld.deleteQuestion", new Object[0]), "'" + cvn2.i() + "' " + bf.a("selectWorld.deleteWarning", new Object[0]), bf.a("selectWorld.deleteButton", new Object[0]), bf.a("gui.cancel", new Object[0]), 12));
        }
    }

    private void h() {
        net.minecraft.s.d d2 = new net.minecraft.s.d();
        d2.switchToRealms((bft)((Object)this));
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2 && n2 == 12) {
            bxj bxj2 = this.u.i();
            bxj2.c();
            bxj2.c("Demo_World");
            this.u.a(this);
        } else if (n2 == 13) {
            if (bl2) {
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class_.getMethod("browse", URI.class).invoke(object, new URI(this.r));
                }
                catch (Throwable throwable) {
                    c.b("Couldn't open link", throwable);
                }
            }
            this.u.a(this);
        }
    }

    private void b(int n2, int n3, float f2) {
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.l(5889);
        cja.D();
        cja.C();
        org.lwjgl.util.a.j.a(120.0f, 1.0f, 0.05f, 10.0f);
        cja.l(5888);
        cja.D();
        cja.C();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.b(180.0f, 1.0f, 0.0f, 0.0f);
        cja.b(90.0f, 0.0f, 0.0f, 1.0f);
        cja.l();
        cja.c();
        cja.q();
        cja.a(false);
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        int n4 = 8;
        for (int i2 = 0; i2 < 64; ++i2) {
            cja.D();
            float f3 = ((float)(i2 % 8) / 8.0f - 0.5f) / 64.0f;
            float f4 = ((float)(i2 / 8) / 8.0f - 0.5f) / 64.0f;
            float f5 = 0.0f;
            cja.c(f3, f4, 0.0f);
            cja.b(cmk.a(((float)this.h + f2) / 400.0f) * 25.0f + 20.0f, 1.0f, 0.0f, 0.0f);
            cja.b(-((float)this.h + f2) * 0.1f, 0.0f, 1.0f, 0.0f);
            for (int i3 = 0; i3 < 6; ++i3) {
                cja.D();
                if (i3 == 1) {
                    cja.b(90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 2) {
                    cja.b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 3) {
                    cja.b(-90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (i3 == 4) {
                    cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (i3 == 5) {
                    cja.b(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                this.u.P().a(C[i3]);
                bix2.a(7, bxb.i);
                int n5 = 255 / (i2 + 1);
                float f6 = 0.0f;
                bix2.b(-1.0, -1.0, 1.0).a(0.0, 0.0).b(255, 255, 255, n5).d();
                bix2.b(1.0, -1.0, 1.0).a(1.0, 0.0).b(255, 255, 255, n5).d();
                bix2.b(1.0, 1.0, 1.0).a(1.0, 1.0).b(255, 255, 255, n5).d();
                bix2.b(-1.0, 1.0, 1.0).a(0.0, 1.0).b(255, 255, 255, n5).d();
                bha2.b();
                cja.E();
            }
            cja.E();
            cja.a(true, true, true, false);
        }
        bix2.c(0.0, 0.0, 0.0);
        cja.a(true, true, true, true);
        cja.l(5889);
        cja.E();
        cja.l(5888);
        cja.E();
        cja.a(true);
        cja.p();
        cja.j();
    }

    private void a(float f2) {
        this.u.P().a(this.J);
        cja.b(3553, 10241, 9729);
        cja.b(3553, 10240, 9729);
        cja.a(3553, 0, 0, 0, 0, 0, 256, 256);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.a(true, true, true, false);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.i);
        cja.c();
        int n2 = 3;
        for (int i2 = 0; i2 < 3; ++i2) {
            float f3 = 1.0f / (float)(i2 + 1);
            int n3 = this.w;
            int n4 = this.x;
            float f4 = (float)(i2 - 1) / 256.0f;
            bix2.b((double)n3, (double)n4, (double)this.q).a(0.0f + f4, 1.0).a(1.0f, 1.0f, 1.0f, f3).d();
            bix2.b((double)n3, 0.0, (double)this.q).a(1.0f + f4, 1.0).a(1.0f, 1.0f, 1.0f, f3).d();
            bix2.b(0.0, 0.0, (double)this.q).a(1.0f + f4, 0.0).a(1.0f, 1.0f, 1.0f, f3).d();
            bix2.b(0.0, (double)n4, (double)this.q).a(0.0f + f4, 0.0).a(1.0f, 1.0f, 1.0f, f3).d();
        }
        bha2.b();
        cja.d();
        cja.a(true, true, true, true);
    }

    private void c(int n2, int n3, float f2) {
        this.u.c().e();
        cja.b(0, 0, 256, 256);
        this.b(n2, n3, f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.a(f2);
        this.u.c().a(true);
        cja.b(0, 0, this.u.d, this.u.e);
        float f3 = 120.0f / (float)(this.w > this.x ? this.w : this.x);
        float f4 = (float)this.x * f3 / 256.0f;
        float f5 = (float)this.w * f3 / 256.0f;
        int n4 = this.w;
        int n5 = this.x;
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.i);
        bix2.b(0.0, (double)n5, (double)this.q).a(0.5f - f4, 0.5f + f5).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        bix2.b((double)n4, (double)n5, (double)this.q).a(0.5f - f4, 0.5f - f5).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        bix2.b((double)n4, 0.0, (double)this.q).a(0.5f + f4, 0.5f - f5).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        bix2.b(0.0, 0.0, (double)this.q).a(0.5f + f4, 0.5f + f5).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        bha2.b();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        cja.c();
        this.c(n2, n3, f2);
        cja.d();
        int n4 = 274;
        int n5 = this.w / 2 - 137;
        int n6 = 30;
        this.b(0, 0, this.w, this.x, -2130706433, 0xFFFFFF);
        this.b(0, 0, this.w, this.x, 0, Integer.MIN_VALUE);
        this.u.P().a(t);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        if ((double)this.e < 1.0E-4) {
            this.c(n5 + 0, 30, 0, 0, 99, 44);
            this.c(n5 + 99, 30, 129, 0, 27, 44);
            this.c(n5 + 99 + 26, 30, 126, 0, 3, 44);
            this.c(n5 + 99 + 26 + 3, 30, 99, 0, 26, 44);
            this.c(n5 + 155, 30, 0, 45, 155, 44);
        } else {
            this.c(n5 + 0, 30, 0, 0, 155, 44);
            this.c(n5 + 155, 30, 0, 45, 155, 44);
        }
        cja.D();
        cja.c((float)(this.w / 2 + 90), 70.0f, 0.0f);
        cja.b(-20.0f, 0.0f, 0.0f, 1.0f);
        float f3 = 1.8f - cmk.e(cmk.a((float)(bxy.K() % 1000L) / 1000.0f * ((float)Math.PI * 2)) * 0.1f);
        f3 = f3 * 100.0f / (float)(this.B.a(this.f) + 32);
        cja.b(f3, f3, f3);
        this.a(this.B, this.f, 0, -8, -256);
        cja.E();
        String string = "Minecraft 1.10";
        string = this.u.w() ? string + " Demo" : string + ("release".equalsIgnoreCase(this.u.f()) ? "" : "/" + this.u.f());
        this.b(this.B, string, 2, this.x - 10, -1);
        String string2 = "Copyright Mojang AB. Do not distribute!";
        this.b(this.B, "Copyright Mojang AB. Do not distribute!", this.w - this.B.a("Copyright Mojang AB. Do not distribute!") - 2, this.x - 10, -1);
        if (this.l != null && !this.l.isEmpty()) {
            agj.a(this.F - 2, this.G - 2, this.H + 2, this.I - 1, 0x55200000);
            this.b(this.B, this.l, this.F, this.G, -1);
            this.b(this.B, this.m, (this.w - this.D) / 2, ((cwv)this.y.get((int)0)).h - 12, -1);
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
                cdr cdr2 = new cdr((awn)this, this.r, 13, true);
                cdr2.h();
                this.u.a(cdr2);
            }
        }
        if (this.f()) {
            this.M.a(n2, n3, n4);
        }
    }

    @Override
    public void aG_() {
        if (this.M != null) {
            this.M.aG_();
        }
    }
}

