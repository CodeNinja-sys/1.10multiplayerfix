/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import com.a.a.b.aj;
import com.a.a.d.ov;
import com.a.a.d.yk;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import com.a.a.n.a.dm;
import com.c.a.c.i;
import com.c.a.f;
import io.netty.b.bi;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import net.minecraft.c.b;
import net.minecraft.c.b.h;
import net.minecraft.c.b.p;
import net.minecraft.c.d;
import net.minecraft.c.e;
import net.minecraft.n.ae;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.m;
import net.minecraft.q.a.u;
import net.minecraft.q.a.w;
import net.minecraft.q.ab;
import net.minecraft.q.am;
import net.minecraft.q.aq;
import net.minecraft.q.k;
import net.minecraft.q.l;
import net.minecraft.q.v;
import net.minecraft.u.aw;
import net.minecraft.u.b.s;
import net.minecraft.u.bo;
import net.minecraft.u.cb;
import net.minecraft.w.a.g;
import net.minecraft.w.n;
import net.minecraft.x.aa;
import net.minecraft.x.av;
import net.minecraft.x.d.b.bn;
import net.minecraft.x.r;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;

public abstract class a
implements Runnable,
az,
net.minecraft.p.a,
net.minecraft.u.av {
    private static final org.apache.logging.log4j.d k = org.apache.logging.log4j.c.c();
    public static final File a = new File("usercache.json");
    private final w l;
    private final net.minecraft.p.d m = new net.minecraft.p.d("server", this, net.minecraft.c.a.aI());
    private final File n;
    private final List o = ov.a();
    public final ae b;
    public final net.minecraft.p.b c = new net.minecraft.p.b();
    private final av p;
    private final net.minecraft.x.v q = new net.minecraft.x.v();
    private final Random r = new Random();
    private final net.minecraft.u.a.a s;
    private int t = -1;
    public v[] d;
    private p u;
    private boolean v = true;
    private boolean w;
    private int x;
    protected final Proxy e;
    public String f;
    public int g;
    private boolean y;
    private boolean z;
    private boolean A;
    private boolean B;
    private boolean C;
    private String D;
    private int E;
    private int F;
    public final long[] h = new long[100];
    public long[][] i;
    private KeyPair G;
    private String H;
    private String I;
    private String J;
    private boolean K;
    private boolean L;
    private String M = "";
    private String N = "";
    private boolean O;
    private long P;
    private String Q;
    private boolean R;
    private boolean S;
    private final com.c.a.e.c T;
    private final i U;
    private final f V;
    private final h W;
    private long X;
    public final Queue j = yk.a();
    private Thread Y;
    private long Z = net.minecraft.c.a.aI();
    private boolean aa;

    public a(File file, Proxy proxy, net.minecraft.u.a.a a2, com.c.a.e.c c2, i i2, f f2, h h2) {
        this.e = proxy;
        this.T = c2;
        this.U = i2;
        this.V = f2;
        this.W = h2;
        this.n = file;
        this.p = new av(this);
        this.b = this.t();
        this.l = new net.minecraft.q.f.a.l(file, a2);
        this.s = a2;
    }

    public m t() {
        return new m(this);
    }

    public abstract boolean u();

    public void a(String string) {
        if (this.ag().e(string)) {
            k.d("Converting map!");
            this.b("menu.convertingLevel");
            this.ag().a(string, new b(this));
        }
    }

    protected synchronized void b(String string) {
        this.Q = string;
    }

    public synchronized String v() {
        return this.Q;
    }

    public void a(String string, String string2, long l2, ab ab2, String string3) {
        net.minecraft.q.aj aj2;
        this.a(string);
        this.b("menu.loadingLevel");
        this.d = new v[3];
        this.i = new long[this.d.length][100];
        u u2 = this.l.a(string, true);
        this.a(this.ac(), u2);
        net.minecraft.q.a.d d2 = u2.c();
        if (d2 == null) {
            if (this.af()) {
                aj2 = net.minecraft.q.e.b.H;
            } else {
                aj2 = new net.minecraft.q.aj(l2, this.y(), this.x(), this.A(), ab2);
                aj2.a(string3);
                if (this.L) {
                    aj2.a();
                }
            }
            d2 = new net.minecraft.q.a.d(aj2, string2);
        } else {
            d2.a(string2);
            aj2 = new net.minecraft.q.aj(d2);
        }
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            int n2 = 0;
            if (i2 == 1) {
                n2 = -1;
            }
            if (i2 == 2) {
                n2 = 1;
            }
            if (i2 == 0) {
                this.d[i2] = this.af() ? (v)new net.minecraft.q.e.b(this, u2, d2, n2, this.c).j() : (v)new v(this, u2, d2, n2, this.c).j();
                this.d[i2].a(aj2);
            } else {
                this.d[i2] = (v)new net.minecraft.q.aw(this, u2, n2, this.d[0], this.c).j();
            }
            this.d[i2].a(new net.minecraft.q.ao(this, this.d[i2]));
            if (this.ab()) continue;
            this.d[i2].F().a(this.y());
        }
        this.u.a(this.d);
        this.a(this.z());
        this.w();
    }

    public void w() {
        int n2 = 16;
        int n3 = 4;
        int n4 = 192;
        int n5 = 625;
        int n6 = 0;
        this.b("menu.generatingTerrain");
        boolean bl2 = false;
        k.d("Preparing start region for level 0");
        v v2 = this.d[0];
        net.minecraft.u.b.b b2 = v2.D();
        long l2 = net.minecraft.c.a.aI();
        for (int i2 = -192; i2 <= 192 && this.G(); i2 += 16) {
            for (int i3 = -192; i3 <= 192 && this.G(); i3 += 16) {
                long l3 = net.minecraft.c.a.aI();
                if (l3 - l2 > 1000L) {
                    this.a("Preparing spawn area", n6 * 100 / 625);
                    l2 = l3;
                }
                ++n6;
                v2.ac().d(b2.cy_() + i2 >> 4, b2.l() + i3 >> 4);
            }
        }
        this.E();
    }

    public void a(String string, u u2) {
        File file = new File(u2.a(), "resources.zip");
        if (file.isFile()) {
            this.a("level://" + string + "/" + "resources.zip", "");
        }
    }

    public abstract boolean x();

    public abstract am y();

    public abstract l z();

    public abstract boolean A();

    public abstract int B();

    public abstract boolean C();

    public abstract boolean D();

    protected void a(String string, int n2) {
        this.f = string;
        this.g = n2;
        k.d("{}: {}%", string, n2);
    }

    protected void E() {
        this.f = null;
        this.g = 0;
    }

    public void b(boolean bl2) {
        v[] arrv = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            v v2 = arrv[i2];
            if (v2 == null) continue;
            if (!bl2) {
                k.d("Saving chunks for level '{}'/{}", v2.F().i(), v2.q.a().b());
            }
            try {
                v2.a(true, null);
                continue;
            }
            catch (aq aq2) {
                k.f(aq2.getMessage());
            }
        }
    }

    public void F() {
        k.d("Stopping server");
        if (this.aw() != null) {
            this.aw().b();
        }
        if (this.u != null) {
            k.d("Saving players");
            this.u.j();
            this.u.t();
        }
        if (this.d != null) {
            v v2;
            int n2;
            k.d("Saving worlds");
            v[] arrv = this.d;
            int n3 = this.d.length;
            for (n2 = 0; n2 < n3; ++n2) {
                v2 = arrv[n2];
                if (v2 == null) continue;
                v2.a = false;
            }
            this.b(false);
            arrv = this.d;
            n3 = this.d.length;
            for (n2 = 0; n2 < n3; ++n2) {
                v2 = arrv[n2];
                if (v2 == null) continue;
                v2.ad();
            }
        }
        if (this.m.d()) {
            this.m.e();
        }
    }

    public boolean G() {
        return this.v;
    }

    public void H() {
        this.v = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        try {
            if (!this.u()) {
                this.a((net.minecraft.k.a)null);
                return;
            }
            this.Z = net.minecraft.c.a.aI();
            var1_1 = 0L;
            this.q.a(new net.minecraft.u.d.k(this.D));
            this.q.a(new aa("1.10 Multiplayer Fix", 210));
            this.a(this.q);
            ** GOTO lbl72
        }
        catch (Throwable var1_2) {
            net.minecraft.c.a.k.b("Encountered an unexpected exception", var1_2);
            var2_6 = null;
            var2_6 = var1_2 instanceof bo != false ? this.b(((bo)var1_2).a()) : this.b(new net.minecraft.k.a("Exception in server tick loop", var1_2));
            var3_4 = new File(new File(this.K(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
            if (var2_6.a(var3_4)) {
                net.minecraft.c.a.k.b("This crash report has been saved to: {}", new Object[]{var3_4.getAbsolutePath()});
            } else {
                net.minecraft.c.a.k.b("We were unable to save this crash report to disk.");
            }
            this.a(var2_6);
            try {
                try {
                    this.w = true;
                    this.F();
                    return;
                }
                catch (Throwable var8_7) {
                    net.minecraft.c.a.k.b("Exception stopping the server", var8_7);
                    this.L();
                    return;
                }
            }
            finally {
                this.L();
            }
        }
        finally {
            block26: {
                try {
                    try {
                        this.w = true;
                        this.F();
                    }
                    catch (Throwable var8_9) {
                        net.minecraft.c.a.k.b("Exception stopping the server", var8_9);
                        this.L();
                        break block26;
                    }
                }
                catch (Throwable var9_12) {
                    this.L();
                    throw var9_12;
                }
                this.L();
            }
        }
lbl-1000:
        // 1 sources

        {
            block27: {
                var3_3 = net.minecraft.c.a.aI();
                var5_5 = var3_3 - this.Z;
                if (var5_5 > 2000L && this.Z - this.P >= 15000L) {
                    net.minecraft.c.a.k.f("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[]{var5_5, var5_5 / 50L});
                    var5_5 = 2000L;
                    this.P = this.Z;
                }
                if (var5_5 < 0L) {
                    net.minecraft.c.a.k.f("Time ran backwards! Did the system time change?");
                    var5_5 = 0L;
                }
                var1_1 += var5_5;
                this.Z = var3_3;
                if (!this.d[0].g()) ** GOTO lbl68
                this.M();
                var1_1 = 0L;
                break block27;
lbl-1000:
                // 1 sources

                {
                    var1_1 -= 50L;
                    this.M();
lbl68:
                    // 2 sources

                    ** while (var1_1 > 50L)
                }
            }
            Thread.sleep(Math.max(1L, 50L - var1_1));
            this.O = true;
lbl72:
            // 2 sources

            ** while (this.v)
        }
lbl73:
        // 1 sources

    }

    public void a(net.minecraft.x.v v2) {
        File file = this.c("server-icon.png");
        if (!file.exists()) {
            file = this.ag().b(this.ac(), "icon.png");
        }
        if (file.isFile()) {
            io.netty.b.g g2 = bi.a();
            try {
                try {
                    BufferedImage bufferedImage = ImageIO.read(file);
                    ao.b(bufferedImage.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
                    ao.b(bufferedImage.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
                    ImageIO.write((RenderedImage)bufferedImage, "PNG", new io.netty.b.k(g2));
                    io.netty.b.g g3 = io.netty.c.a.a.a.a(g2);
                    v2.a("data:image/png;base64," + g3.a(aj.c));
                }
                catch (Exception exception) {
                    k.b("Couldn't load server icon", (Throwable)exception);
                    g2.ad();
                }
            }
            finally {
                g2.ad();
            }
        }
    }

    public boolean I() {
        this.aa = this.aa || this.J().isFile();
        return this.aa;
    }

    public File J() {
        return this.ag().b(this.ac(), "icon.png");
    }

    public File K() {
        return new File(".");
    }

    public void a(net.minecraft.k.a a2) {
    }

    public void L() {
    }

    public void M() {
        long l2 = System.nanoTime();
        ++this.x;
        if (this.R) {
            this.R = false;
            this.c.a = true;
            this.c.a();
        }
        this.c.a("root");
        this.N();
        if (l2 - this.X >= 5000000000L) {
            this.X = l2;
            this.q.a(new r(this.S(), this.R()));
            com.c.a.e[] arre = new com.c.a.e[Math.min(this.R(), 12)];
            int n2 = net.minecraft.u.b.n.a(this.r, 0, this.R() - arre.length);
            for (int i2 = 0; i2 < arre.length; ++i2) {
                arre[i2] = ((g)this.u.u().get(n2 + i2)).ac();
            }
            Collections.shuffle(Arrays.asList(arre));
            this.q.b().a(arre);
        }
        if (this.x % 900 == 0) {
            this.c.a("save");
            this.u.j();
            this.b(true);
            this.c.b();
        }
        this.c.a("tallying");
        this.h[this.x % 100] = System.nanoTime() - l2;
        this.c.b();
        this.c.a("snooper");
        if (!this.m.d() && this.x > 100) {
            this.m.a();
        }
        if (this.x % 6000 == 0) {
            this.m.b();
        }
        this.c.b();
        this.c.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N() {
        int n2;
        this.c.a("jobs");
        Queue queue = this.j;
        synchronized (queue) {
            while (!this.j.isEmpty()) {
                cb.a((FutureTask)this.j.poll(), k);
            }
        }
        this.c.c("levels");
        for (n2 = 0; n2 < this.d.length; ++n2) {
            long l2 = System.nanoTime();
            if (n2 == 0 || this.O()) {
                v v2 = this.d[n2];
                this.c.a(v2.F().i());
                if (this.x % 20 == 0) {
                    this.c.a("timeSync");
                    this.u.a(new bn(v2.B(), v2.C(), v2.G().b("doDaylightCycle")), v2.q.a().a());
                    this.c.b();
                }
                this.c.a("tick");
                try {
                    v2.a();
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Exception ticking world");
                    v2.a(a2);
                    throw new bo(a2);
                }
                try {
                    v2.q();
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a3 = net.minecraft.k.a.a(throwable, "Exception ticking world entities");
                    v2.a(a3);
                    throw new bo(a3);
                }
                this.c.b();
                this.c.a("tracker");
                v2.ae().a();
                this.c.b();
                this.c.b();
            }
            this.i[n2][this.x % 100] = System.nanoTime() - l2;
        }
        this.c.c("connection");
        this.aw().c();
        this.c.c("players");
        this.u.e();
        this.c.c("tickables");
        for (n2 = 0; n2 < this.o.size(); ++n2) {
            ((aw)this.o.get(n2)).a();
        }
        this.c.b();
    }

    public boolean O() {
        return true;
    }

    public void P() {
        this.Y = new Thread((Runnable)this, "Server thread");
        this.Y.start();
    }

    public File c(String string) {
        return new File(this.K(), string);
    }

    public void d(String string) {
        k.f(string);
    }

    public v a(int n2) {
        return n2 == -1 ? this.d[1] : (n2 == 1 ? this.d[2] : this.d[0]);
    }

    public String Q() {
        return "1.10 Multiplayer Fix";
    }

    public int R() {
        return this.u.p();
    }

    public int S() {
        return this.u.q();
    }

    public String[] T() {
        return this.u.f();
    }

    public com.c.a.e[] U() {
        return this.u.g();
    }

    public String V() {
        return "vanilla";
    }

    public net.minecraft.k.a b(net.minecraft.k.a a2) {
        a2.f().a("Profiler Position", new e(this));
        if (this.u != null) {
            a2.f().a("Player Count", new d(this));
        }
        return a2;
    }

    public List a(az az2, String string, net.minecraft.u.b.b b2, boolean bl2) {
        ArrayList arrayList = ov.a();
        boolean bl3 = string.startsWith("/");
        if (bl3) {
            string = string.substring(1);
        }
        if (!bl3 && !bl2) {
            String[] arrstring = string.split(" ", -1);
            String string2 = arrstring[arrstring.length - 1];
            for (String string3 : this.u.f()) {
                if (!net.minecraft.n.aa.a(string2, string3)) continue;
                arrayList.add(string3);
            }
            return arrayList;
        }
        boolean bl4 = !string.contains(" ");
        List list = this.b.a(az2, string, b2);
        if (!list.isEmpty()) {
            for (String string4 : list) {
                if (bl4) {
                    arrayList.add("/" + string4);
                    continue;
                }
                arrayList.add(string4);
            }
        }
        return arrayList;
    }

    public boolean W() {
        return this.n != null;
    }

    @Override
    public String X() {
        return "Server";
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        k.d(a2.c());
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    public ae Y() {
        return this.b;
    }

    public KeyPair Z() {
        return this.G;
    }

    public String aa() {
        return this.H;
    }

    public void e(String string) {
        this.H = string;
    }

    public boolean ab() {
        return this.H != null;
    }

    public String ac() {
        return this.I;
    }

    public void f(String string) {
        this.I = string;
    }

    public void g(String string) {
        this.J = string;
    }

    public String ad() {
        return this.J;
    }

    public void a(KeyPair keyPair) {
        this.G = keyPair;
    }

    public void a(l l2) {
        v[] arrv = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            v v2 = arrv[i2];
            if (v2 == null) continue;
            if (v2.F().s()) {
                v2.F().a(net.minecraft.q.l.d);
                v2.a(true, true);
                continue;
            }
            if (this.ab()) {
                v2.F().a(l2);
                v2.a(v2.R() != net.minecraft.q.l.a, true);
                continue;
            }
            v2.F().a(l2);
            v2.a(this.ae(), this.z);
        }
    }

    public boolean ae() {
        return true;
    }

    public boolean af() {
        return this.K;
    }

    public void c(boolean bl2) {
        this.K = bl2;
    }

    public void d(boolean bl2) {
        this.L = bl2;
    }

    public w ag() {
        return this.l;
    }

    public String ah() {
        return this.M;
    }

    public String ai() {
        return this.N;
    }

    public void a(String string, String string2) {
        this.M = string;
        this.N = string2;
    }

    @Override
    public void a(net.minecraft.p.d d2) {
        d2.a("whitelist_enabled", false);
        d2.a("whitelist_count", 0);
        if (this.u != null) {
            d2.a("players_current", this.R());
            d2.a("players_max", this.S());
            d2.a("players_seen", this.u.r().length);
        }
        d2.a("uses_auth", this.y);
        d2.a("gui_state", this.ay() ? "enabled" : "disabled");
        d2.a("run_time", (net.minecraft.c.a.aI() - d2.g()) / 60L * 1000L);
        d2.a("avg_tick_ms", (int)(net.minecraft.u.b.n.a(this.h) * 1.0E-6));
        int n2 = 0;
        if (this.d != null) {
            v[] arrv = this.d;
            int n3 = this.d.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                v v2 = arrv[i2];
                if (v2 == null) continue;
                net.minecraft.q.a.d d3 = v2.F();
                d2.a("world[" + n2 + "][dimension]", v2.q.a().a());
                d2.a("world[" + n2 + "][mode]", (Object)d3.q());
                d2.a("world[" + n2 + "][difficulty]", (Object)v2.R());
                d2.a("world[" + n2 + "][hardcore]", d3.s());
                d2.a("world[" + n2 + "][generator_name]", d3.t().a());
                d2.a("world[" + n2 + "][generator_version]", d3.t().d());
                d2.a("world[" + n2 + "][height]", this.E);
                d2.a("world[" + n2 + "][chunks_loaded]", v2.ac().g());
                ++n2;
            }
        }
        d2.a("worlds", n2);
    }

    @Override
    public void b(net.minecraft.p.d d2) {
        d2.b("singleplayer", this.ab());
        d2.b("server_brand", this.V());
        d2.b("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
        d2.b("dedicated", this.ak());
    }

    @Override
    public boolean aj() {
        return true;
    }

    public abstract boolean ak();

    public boolean al() {
        return this.y;
    }

    public void e(boolean bl2) {
        this.y = bl2;
    }

    public boolean am() {
        return this.z;
    }

    public void f(boolean bl2) {
        this.z = bl2;
    }

    public boolean an() {
        return this.A;
    }

    public abstract boolean ao();

    public void g(boolean bl2) {
        this.A = bl2;
    }

    public boolean ap() {
        return this.B;
    }

    public void h(boolean bl2) {
        this.B = bl2;
    }

    public boolean aq() {
        return this.C;
    }

    public void i(boolean bl2) {
        this.C = bl2;
    }

    public abstract boolean ar();

    public String as() {
        return this.D;
    }

    public void h(String string) {
        this.D = string;
    }

    public int at() {
        return this.E;
    }

    public void b(int n2) {
        this.E = n2;
    }

    public boolean au() {
        return this.w;
    }

    public p av() {
        return this.u;
    }

    public void a(p p2) {
        this.u = p2;
    }

    public void a(am am2) {
        v[] arrv = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            v v2 = arrv[i2];
            v2.F().a(am2);
        }
    }

    public av aw() {
        return this.p;
    }

    public boolean ax() {
        return this.O;
    }

    public boolean ay() {
        return false;
    }

    public abstract String a(am var1, boolean var2);

    public int az() {
        return this.x;
    }

    public void aA() {
        this.R = true;
    }

    public net.minecraft.p.d aB() {
        return this.m;
    }

    @Override
    public net.minecraft.u.b.b aC() {
        return net.minecraft.u.b.b.c;
    }

    @Override
    public s aD() {
        return net.minecraft.u.b.s.a;
    }

    @Override
    public k aE() {
        return this.d[0];
    }

    @Override
    public n aF() {
        return null;
    }

    public boolean a(k k2, net.minecraft.u.b.b b2, net.minecraft.w.a.b b3) {
        return false;
    }

    public boolean aG() {
        return this.S;
    }

    public Proxy aH() {
        return this.e;
    }

    public static long aI() {
        return System.currentTimeMillis();
    }

    public int aJ() {
        return this.F;
    }

    public void c(int n2) {
        this.F = n2;
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return new net.minecraft.u.d.k(this.X());
    }

    public boolean aL() {
        return true;
    }

    public i aM() {
        return this.U;
    }

    public f aN() {
        return this.V;
    }

    public h aO() {
        return this.W;
    }

    public net.minecraft.x.v aP() {
        return this.q;
    }

    public void aQ() {
        this.X = 0L;
    }

    public n a(UUID uUID) {
        v[] arrv = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            n n3;
            v v2 = arrv[i2];
            if (v2 == null || (n3 = v2.b(uUID)) == null) continue;
            return n3;
        }
        return null;
    }

    @Override
    public boolean aR() {
        return this.d[0].G().b("sendCommandFeedback");
    }

    @Override
    public void a(br br2, int n2) {
    }

    @Override
    public a aS() {
        return this;
    }

    public int aT() {
        return 29999984;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dl a(Callable callable) {
        ao.a(callable);
        if (!this.aU() && !this.au()) {
            dm dm2 = dm.a(callable);
            Queue queue = this.j;
            synchronized (queue) {
                this.j.add(dm2);
                return dm2;
            }
        }
        try {
            return ci.a(callable.call());
        }
        catch (Exception exception) {
            return ci.a(exception);
        }
    }

    @Override
    public dl a(Runnable runnable) {
        ao.a(runnable);
        return this.a(Executors.callable(runnable));
    }

    @Override
    public boolean aU() {
        return Thread.currentThread() == this.Y;
    }

    public int aV() {
        return 256;
    }

    public net.minecraft.u.a.a aW() {
        return this.s;
    }

    public int a(v v2) {
        return v2 != null ? v2.G().c("spawnRadius") : 10;
    }

    static /* synthetic */ org.apache.logging.log4j.d aX() {
        return k;
    }

    static /* synthetic */ p a(a a2) {
        return a2.u;
    }
}

