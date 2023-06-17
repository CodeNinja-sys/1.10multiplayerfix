/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.yk;
import com.a.a.g.ak;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import com.a.a.n.a.dm;
import com.c.a.c.i;
import com.c.a.e;
import com.c.a.f;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import net.minecraft.client.m;
import org.apache.commons.b.b;
import org.apache.commons.b.t;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.a.j;
import org.lwjgl.ab;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.ig;

public class bxy
implements aie,
wk {
    private static final d G = org.apache.logging.log4j.c.c();
    private static final bpx H = new bpx("textures/gui/title/mojang.png");
    public static final boolean a = asj.a() == bsj.d;
    public static byte[] b = new byte[0xA00000];
    private static final List I = ov.a(new DisplayMode(2560, 1600), new DisplayMode(2880, 1800));
    private final File J;
    private final com.c.a.d.b K;
    private final com.c.a.d.b L;
    private cyq M;
    private bnm N;
    private static bxy O;
    private final cgy P;
    public pz c;
    private boolean Q;
    private final boolean R = true;
    private boolean S;
    private cet T;
    public int d;
    public int e;
    private boolean U;
    private final boj V = new boj(20.0f);
    private final et W = new et("client", this, net.minecraft.c.a.av());
    public ym f;
    public fr g;
    private bid X;
    private bth Y;
    private ddx Z;
    public ob h;
    private cpk aa;
    public cpk i;
    public atx j;
    private final alw ab;
    private boolean ac;
    public deb k;
    public deb l;
    public cjn m;
    public bri n;
    public cwz o;
    public bqw p;
    private int ad;
    private final int ae;
    private final int af;
    private bil ag;
    public dev q;
    public bdt r;
    public boolean s;
    public auu t;
    public cmx u;
    public re v;
    public final File w;
    private final File ah;
    private final String ai;
    private final String aj;
    private final Proxy ak;
    private bxj al;
    private static int am;
    private int an;
    private String ao;
    private int ap;
    public boolean x;
    long y = bxy.K();
    private int aq;
    public final dgv z = new dgv();
    long A = System.nanoTime();
    private final boolean ar;
    private final boolean as;
    private sz at;
    private boolean au;
    public final cfe B = new cfe();
    private long av = -1L;
    private are aw;
    private final a ax = new a();
    private final List ay = ov.a();
    private final oy az;
    private hh aA;
    private vm aB;
    private gt aC;
    private bkr aD;
    private btr aE;
    private dam aF;
    private bro aG;
    private agn aH;
    private bpx aI;
    private final i aJ;
    private jm aK;
    private final Queue aL = yk.a();
    private final Thread aM = Thread.currentThread();
    private wm aN;
    private dfp aO;
    volatile boolean C = true;
    public String D = "";
    public boolean E = true;
    private long aP = bxy.K();
    private int aQ;
    private boolean aR;
    long F = -1L;
    private String aS = "root";

    public bxy(blo blo2) {
        O = this;
        this.w = blo2.c.a;
        this.ah = blo2.c.c;
        this.J = blo2.c.b;
        this.ai = blo2.d.b;
        this.aj = blo2.d.c;
        this.K = blo2.a.b;
        this.L = blo2.a.c;
        this.az = new oy(blo2.c.a());
        this.ak = blo2.a.d == null ? Proxy.NO_PROXY : blo2.a.d;
        this.aJ = new com.c.a.e.c(this.ak, UUID.randomUUID().toString()).a();
        this.ab = blo2.a.a;
        G.d("Setting user: {}", this.ab.c());
        G.a("(Session ID is {})", this.ab.a());
        this.as = blo2.d.a;
        this.d = blo2.b.a > 0 ? blo2.b.a : 1;
        this.e = blo2.b.b > 0 ? blo2.b.b : 1;
        this.ae = blo2.b.a;
        this.af = blo2.b.b;
        this.Q = blo2.b.c;
        this.ar = bxy.as();
        this.ag = null;
        if (blo2.e.a != null) {
            this.ao = blo2.e.a;
            this.ap = blo2.e.b;
        }
        ImageIO.setUseCache(false);
        bht.c();
        this.P = ccz.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        this.C = true;
        try {
            this.an();
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Initializing game");
            cet2.a("Initialization");
            this.b(this.c(cet2));
            return;
        }
        try {
            while (this.C) {
                if (this.S && this.T != null) {
                    this.b(this.T);
                    return;
                }
                try {
                    this.av();
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    this.o();
                    this.a(new dal());
                    System.gc();
                }
            }
        }
        catch (cbx cbx2) {
        }
        catch (oz oz2) {
            this.c(oz2.a());
            this.o();
            G.c("Reported exception thrown!", (Throwable)oz2);
            this.b(oz2.a());
        }
        catch (Throwable throwable) {
            cet cet3 = this.c(new cet("Unexpected error", throwable));
            this.o();
            G.c("Unreported exception thrown!", throwable);
            this.b(cet3);
        }
        finally {
            this.j();
        }
    }

    private void an() {
        this.u = new cmx(this, this.w);
        this.ay.add(this.az);
        this.at();
        if (this.u.D > 0 && this.u.C > 0) {
            this.d = this.u.C;
            this.e = this.u.D;
        }
        G.d("LWJGL Version: {}", org.lwjgl.ab.a());
        this.ar();
        this.aq();
        this.ap();
        cjg.a();
        this.aE = new btr(this.d, this.e, true);
        this.aE.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.ao();
        this.aA = new hh(this.J, new File(this.w, "server-resource-packs"), this.az, this.ax, this.u);
        this.aw = new cry(this.ax);
        this.aB = new vm(this.ax, this.u.aE);
        this.aw.a(this.aB);
        this.h();
        this.N = new bnm(this.aw);
        this.aw.a(this.N);
        this.a(this.N);
        this.aK = new jm(this.N, new File(this.ah, "skins"), this.aJ);
        this.al = new avn(new File(this.w, "saves"), this.P);
        this.aG = new bro(this.aw, this.u);
        this.aw.a(this.aG);
        this.aH = new agn(this);
        this.k = new deb(this.u, new bpx("textures/font/ascii.png"), this.N, false);
        if (this.u.aE != null) {
            this.k.a(this.g());
            this.k.b(this.aB.b());
        }
        this.l = new deb(this.u, new bpx("textures/font/ascii_sga.png"), this.N, false);
        this.aw.a(this.k);
        this.aw.a(this.l);
        this.aw.a(new xj());
        this.aw.a(new sd());
        bpa.f.a(new y(this));
        this.v = new re();
        this.a("Pre startup");
        cja.v();
        cja.j(7425);
        cja.a(1.0);
        cja.j();
        cja.c(515);
        cja.d();
        cja.a(516, 0.1f);
        cja.a(csw.b);
        cja.l(5889);
        cja.C();
        cja.l(5888);
        this.a("Startup");
        this.aF = new dam("textures");
        this.aF.a(this.u.K);
        this.N.a(dam.g, this.aF);
        this.N.a(dam.g);
        this.aF.a(false, this.u.K > 0);
        this.aN = new wm(this.aF);
        this.aw.a(this.aN);
        this.aC = gt.a();
        this.aD = bkr.a(this.aC);
        this.Y = new bth(this.N, this.aN, this.aD);
        this.X = new bid(this.N, this.Y);
        this.Z = new ddx(this);
        this.aw.a(this.Y);
        this.o = new cwz(this, this.aw);
        this.aw.a(this.o);
        this.aO = new dfp(this.aN.c(), this.aC);
        this.aw.a(this.aO);
        this.g = new fr(this);
        this.aw.a(this.g);
        this.q = new dev(this);
        cja.b(0, 0, this.d, this.e);
        this.j = new atx(this.f, this.N);
        this.a("Post startup");
        this.r = new bdt(this);
        if (this.ao != null) {
            this.a(new bqn(new agj(), this, this.ao, this.ap));
        } else {
            this.a(new agj());
        }
        this.N.c(this.aI);
        this.aI = null;
        this.n = new bri(this);
        this.p = new bqw(this);
        if (this.u.t && !this.Q) {
            this.t();
        }
        try {
            dx.c(this.u.u);
        }
        catch (ig ig2) {
            this.u.u = false;
            this.u.b();
        }
        this.g.a();
    }

    private void ao() {
        this.ax.a(new cpw(), crs.class);
        this.ax.a(new acq(), day.class);
        this.ax.a(new bpj(), gf.class);
        this.ax.a(new lf(), cqx.class);
        this.ax.a(new uc(), cep.class);
    }

    private void ap() {
        dx.d(true);
        dx.a("Minecraft 1.10");
        try {
            dx.a(new PixelFormat().c(24));
        }
        catch (org.lwjgl.c c2) {
            G.b("Couldn't set pixel format", (Throwable)c2);
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (this.Q) {
                this.au();
            }
            dx.s();
        }
    }

    private void aq() {
        if (this.Q) {
            dx.a(true);
            DisplayMode displayMode = dx.d();
            this.d = Math.max(1, displayMode.b());
            this.e = Math.max(1, displayMode.c());
        } else {
            dx.a(new DisplayMode(this.d, this.e));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ar() {
        bsj bsj2 = asj.a();
        if (bsj2 != bsj.d) {
            InputStream inputStream;
            InputStream inputStream2;
            block5: {
                inputStream2 = null;
                inputStream = null;
                try {
                    inputStream2 = this.az.c(new bpx("icons/icon_16x16.png"));
                    inputStream = this.az.c(new bpx("icons/icon_32x32.png"));
                    if (inputStream2 == null || inputStream == null) break block5;
                    dx.a(new ByteBuffer[]{this.a(inputStream2), this.a(inputStream)});
                }
                catch (IOException iOException) {
                    try {
                        G.b("Couldn't set icon", (Throwable)iOException);
                    }
                    catch (Throwable throwable) {
                        org.apache.commons.b.t.a(inputStream2);
                        org.apache.commons.b.t.a(inputStream);
                        throw throwable;
                    }
                    org.apache.commons.b.t.a(inputStream2);
                    org.apache.commons.b.t.a(inputStream);
                }
            }
            org.apache.commons.b.t.a(inputStream2);
            org.apache.commons.b.t.a(inputStream);
        }
    }

    private static boolean as() {
        String[] arrstring;
        for (String string : arrstring = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"}) {
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            return true;
        }
        return false;
    }

    public btr c() {
        return this.aE;
    }

    public String e() {
        return this.ai;
    }

    public String f() {
        return this.aj;
    }

    private void at() {
        yl yl2 = new yl(this, "Timer hack thread");
        yl2.setDaemon(true);
        yl2.start();
    }

    public void a(cet cet2) {
        this.S = true;
        this.T = cet2;
    }

    public void b(cet cet2) {
        File file = new File(bxy.B().w, "crash-reports");
        File file2 = new File(file, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
        bht.a(cet2.d());
        if (cet2.e() != null) {
            bht.a("#@!@# Game crashed! Crash report saved to: #@!@# " + cet2.e());
            System.exit(-1);
        } else if (cet2.a(file2)) {
            bht.a("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
            System.exit(-1);
        } else {
            bht.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }

    public boolean g() {
        return this.aB.a() || this.u.aF;
    }

    public void h() {
        ArrayList arrayList = ov.a((Iterable)this.ay);
        if (this.ag != null) {
            this.ag.s();
        }
        for (cdg cdg2 : this.aA.e()) {
            arrayList.add(cdg2.c());
        }
        if (this.aA.g() != null) {
            arrayList.add(this.aA.g());
        }
        try {
            this.aw.a(arrayList);
        }
        catch (RuntimeException runtimeException) {
            G.d("Caught error stitching, removing all assigned resourcepacks", (Throwable)runtimeException);
            arrayList.clear();
            arrayList.addAll(this.ay);
            this.aA.a(Collections.emptyList());
            this.aw.a(arrayList);
            this.u.l.clear();
            this.u.m.clear();
            this.u.b();
        }
        this.aB.a(arrayList);
        if (this.g != null) {
            this.g.d();
        }
    }

    private ByteBuffer a(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        int[] arrn = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * arrn.length);
        for (int n2 : arrn) {
            byteBuffer.putInt(n2 << 8 | n2 >> 24 & 0xFF);
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    private void au() {
        HashSet hashSet = aad.a();
        Collections.addAll(hashSet, dx.b());
        DisplayMode displayMode = dx.c();
        if (!hashSet.contains(displayMode) && asj.a() == bsj.d) {
            block0: for (DisplayMode displayMode2 : I) {
                boolean bl2 = true;
                for (DisplayMode displayMode3 : hashSet) {
                    if (displayMode3.d() != 32 || displayMode3.b() != displayMode2.b() || displayMode3.c() != displayMode2.c()) continue;
                    bl2 = false;
                    break;
                }
                if (bl2) continue;
                for (DisplayMode displayMode3 : hashSet) {
                    if (displayMode3.d() != 32 || displayMode3.b() != displayMode2.b() / 2 || displayMode3.c() != displayMode2.c() / 2) continue;
                    displayMode = displayMode3;
                    continue block0;
                }
            }
        }
        dx.a(displayMode);
        this.d = displayMode.b();
        this.e = displayMode.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(bnm bnm2) {
        cnt cnt2 = new cnt(this);
        int n2 = cnt2.e();
        btr btr2 = new btr(cnt2.a() * n2, cnt2.b() * n2, true);
        btr2.a(false);
        cja.l(5889);
        cja.C();
        cja.a(0.0, cnt2.a(), cnt2.b(), 0.0, 1000.0, 3000.0);
        cja.l(5888);
        cja.C();
        cja.c(0.0f, 0.0f, -2000.0f);
        cja.f();
        cja.o();
        cja.i();
        cja.v();
        InputStream inputStream = null;
        try {
            inputStream = this.az.a(H);
            this.aI = bnm2.a("logo", new cze(ImageIO.read(inputStream)));
            bnm2.a(this.aI);
        }
        catch (IOException iOException) {
            try {
                G.b("Unable to load logo: {}", H, iOException);
            }
            catch (Throwable throwable) {
                org.apache.commons.b.t.a(inputStream);
                throw throwable;
            }
            org.apache.commons.b.t.a(inputStream);
        }
        org.apache.commons.b.t.a(inputStream);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.i);
        bix2.b(0.0, (double)this.e, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        bix2.b((double)this.d, (double)this.e, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        bix2.b((double)this.d, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        bix2.b(0.0, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        bha2.b();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = 256;
        int n4 = 256;
        this.a((cnt2.a() - 256) / 2, (cnt2.b() - 256) / 2, 0, 0, 256, 256, 255, 255, 255, 255);
        cja.f();
        cja.o();
        btr2.e();
        btr2.c(cnt2.a() * n2, cnt2.b() * n2);
        cja.d();
        cja.a(516, 0.1f);
        this.k();
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        bix bix2 = bha.a().c();
        bix2.a(7, bxb.i);
        float f2 = 0.00390625f;
        float f3 = 0.00390625f;
        bix2.b((double)n2, (double)(n3 + n7), 0.0).a((float)n4 * 0.00390625f, (float)(n5 + n7) * 0.00390625f).b(n8, n9, n10, n11).d();
        bix2.b((double)(n2 + n6), (double)(n3 + n7), 0.0).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).b(n8, n9, n10, n11).d();
        bix2.b((double)(n2 + n6), (double)n3, 0.0).a((float)(n4 + n6) * 0.00390625f, (float)n5 * 0.00390625f).b(n8, n9, n10, n11).d();
        bix2.b((double)n2, (double)n3, 0.0).a((float)n4 * 0.00390625f, (float)n5 * 0.00390625f).b(n8, n9, n10, n11).d();
        bha.a().b();
    }

    public bxj i() {
        return this.al;
    }

    public void a(cjn cjn2) {
        if (this.m != null) {
            this.m.aG_();
        }
        if (cjn2 == null && this.f == null) {
            cjn2 = new agj();
        } else if (cjn2 == null && this.h.bh() <= 0.0f) {
            cjn2 = new cxv(null);
        }
        if (cjn2 instanceof agj || cjn2 instanceof cuz) {
            this.u.at = false;
            this.r.c().a();
        }
        this.m = cjn2;
        if (cjn2 != null) {
            this.r();
            cke.b();
            while (org.lwjgl.a.j.h()) {
            }
            while (org.lwjgl.a.g.f()) {
            }
            cnt cnt2 = new cnt(this);
            int n2 = cnt2.a();
            int n3 = cnt2.b();
            cjn2.a(this, n2, n3);
            this.s = false;
        } else {
            this.aG.e();
            this.q();
        }
    }

    private void a(String string) {
        int n2 = cja.I();
        if (n2 != 0) {
            String string2 = org.lwjgl.util.a.c.b(n2);
            G.b("########## GL ERROR ##########");
            G.b("@ {}", string);
            G.b("{}: {}", n2, string2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j() {
        try {
            G.d("Stopping!");
            try {
                this.a((ym)null);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.aG.d();
        }
        finally {
            dx.u();
            if (!this.S) {
                System.exit(0);
            }
        }
        System.gc();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void av() {
        long l2 = System.nanoTime();
        this.B.a("root");
        if (dx.v() && dx.h()) {
            this.p();
        }
        if (this.ac && this.f != null) {
            float f2 = this.V.c;
            this.V.a();
            this.V.c = f2;
        } else {
            this.V.a();
        }
        this.B.a("scheduledExecutables");
        Queue queue = this.aL;
        synchronized (queue) {
            while (!this.aL.isEmpty()) {
                asj.a((FutureTask)this.aL.poll(), G);
            }
        }
        this.B.b();
        long l3 = System.nanoTime();
        this.B.a("tick");
        for (int i2 = 0; i2 < this.V.b; ++i2) {
            this.v();
        }
        this.B.c("preRenderErrors");
        long l4 = System.nanoTime() - l3;
        this.a("Pre render");
        this.B.c("sound");
        this.aG.a(this.h, this.V.c);
        this.B.b();
        this.B.a("render");
        cja.D();
        cja.k(16640);
        this.aE.a(true);
        this.B.a("display");
        cja.v();
        this.B.b();
        if (!this.s) {
            this.B.c("gameRenderer");
            this.o.a(this.V.c, l2);
            this.B.b();
        }
        this.B.b();
        if (this.u.at && this.u.au && !this.u.ar) {
            if (!this.B.a) {
                this.B.a();
            }
            this.B.a = true;
            this.a(l4);
        } else {
            this.B.a = false;
            this.F = System.nanoTime();
        }
        this.q.a();
        this.aE.e();
        cja.E();
        cja.D();
        this.aE.c(this.d, this.e);
        cja.E();
        cja.D();
        this.o.b(this.V.c);
        cja.E();
        this.B.a("root");
        this.k();
        Thread.yield();
        this.a("Post render");
        ++this.aQ;
        this.ac = this.G() && this.m != null && this.m.q_() && !this.ag.p();
        long l5 = System.nanoTime();
        this.z.a(l5 - this.A);
        this.A = l5;
        while (bxy.K() >= this.aP + 1000L) {
            am = this.aQ;
            Object[] arrobject = new Object[8];
            arrobject[0] = am;
            arrobject[1] = adr.a;
            arrobject[2] = adr.a == 1 ? "" : "s";
            arrobject[3] = (float)this.u.h == oi.i.f() ? "inf" : Integer.valueOf(this.u.h);
            arrobject[4] = this.u.u ? " vsync" : "";
            Object object = arrobject[5] = this.u.j ? "" : " fast";
            arrobject[6] = this.u.i == 0 ? "" : (this.u.i == 1 ? " fast-clouds" : " fancy-clouds");
            arrobject[7] = cjg.f() ? " vbo" : "";
            this.D = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", arrobject);
            adr.a = 0;
            this.aP += 1000L;
            this.aQ = 0;
            this.W.b();
            if (this.W.d()) continue;
            this.W.a();
        }
        if (this.n()) {
            this.B.a("fpslimit_wait");
            dx.a(this.m());
            this.B.b();
        }
        this.B.b();
    }

    public void k() {
        this.B.a("display_update");
        dx.n();
        this.B.b();
        this.l();
    }

    protected void l() {
        if (!this.Q && dx.z()) {
            int n2 = this.d;
            int n3 = this.e;
            this.d = dx.C();
            this.e = dx.D();
            if (this.d != n2 || this.e != n3) {
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
                this.a(this.d, this.e);
            }
        }
    }

    public int m() {
        if (this.f == null && this.m != null) {
            return 30;
        }
        return this.u.h;
    }

    public boolean n() {
        return (float)this.m() < oi.i.f();
    }

    public void o() {
        try {
            b = new byte[0];
            this.g.j();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            this.a((ym)null);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    private void b(int n2) {
        List list = this.B.b(this.aS);
        if (list == null || list.isEmpty()) {
            return;
        }
        tg tg2 = (tg)list.remove(0);
        if (n2 == 0) {
            int n3;
            if (!tg2.c.isEmpty() && (n3 = this.aS.lastIndexOf(46)) >= 0) {
                this.aS = this.aS.substring(0, n3);
            }
        } else if (--n2 < list.size() && !"unspecified".equals(((tg)list.get((int)n2)).c)) {
            if (!this.aS.isEmpty()) {
                this.aS = this.aS + ".";
            }
            this.aS = this.aS + ((tg)list.get((int)n2)).c;
        }
    }

    private void a(long l2) {
        int n2;
        Object object;
        if (!this.B.a) {
            return;
        }
        List list = this.B.b(this.aS);
        tg tg2 = (tg)list.remove(0);
        cja.k(256);
        cja.l(5889);
        cja.g();
        cja.C();
        cja.a(0.0, this.d, this.e, 0.0, 1000.0, 3000.0);
        cja.l(5888);
        cja.C();
        cja.c(0.0f, 0.0f, -2000.0f);
        cja.d(1.0f);
        cja.w();
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        int n3 = 160;
        int n4 = this.d - 160 - 10;
        int n5 = this.e - 320;
        cja.l();
        bix2.a(7, bxb.f);
        bix2.b((double)((float)n4 - 176.0f), (double)((float)n5 - 96.0f - 16.0f), 0.0).b(200, 0, 0, 0).d();
        bix2.b((double)((float)n4 - 176.0f), (double)(n5 + 320), 0.0).b(200, 0, 0, 0).d();
        bix2.b((double)((float)n4 + 176.0f), (double)(n5 + 320), 0.0).b(200, 0, 0, 0).d();
        bix2.b((double)((float)n4 + 176.0f), (double)((float)n5 - 96.0f - 16.0f), 0.0).b(200, 0, 0, 0).d();
        bha2.b();
        cja.k();
        double d2 = 0.0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            float f2;
            float f3;
            float f4;
            int n6;
            object = (tg)list.get(i2);
            n2 = cmk.c(((tg)object).a / 4.0) + 1;
            bix2.a(6, bxb.f);
            int n7 = ((tg)object).a();
            int n8 = n7 >> 16 & 0xFF;
            int n9 = n7 >> 8 & 0xFF;
            int n10 = n7 & 0xFF;
            bix2.b((double)n4, (double)n5, 0.0).b(n8, n9, n10, 255).d();
            for (n6 = n2; n6 >= 0; --n6) {
                f4 = (float)((d2 + ((tg)object).a * (double)n6 / (double)n2) * 6.2831854820251465 / 100.0);
                f3 = cmk.a(f4) * 160.0f;
                f2 = cmk.b(f4) * 160.0f * 0.5f;
                bix2.b((double)((float)n4 + f3), (double)((float)n5 - f2), 0.0).b(n8, n9, n10, 255).d();
            }
            bha2.b();
            bix2.a(5, bxb.f);
            for (n6 = n2; n6 >= 0; --n6) {
                f4 = (float)((d2 + ((tg)object).a * (double)n6 / (double)n2) * 6.2831854820251465 / 100.0);
                f3 = cmk.a(f4) * 160.0f;
                f2 = cmk.b(f4) * 160.0f * 0.5f;
                bix2.b((double)((float)n4 + f3), (double)((float)n5 - f2), 0.0).b(n8 >> 1, n9 >> 1, n10 >> 1, 255).d();
                bix2.b((double)((float)n4 + f3), (double)((float)n5 - f2 + 10.0f), 0.0).b(n8 >> 1, n9 >> 1, n10 >> 1, 255).d();
            }
            bha2.b();
            d2 += ((tg)object).a;
        }
        DecimalFormat decimalFormat = new DecimalFormat("##0.00");
        cja.v();
        object = "";
        if (!"unspecified".equals(tg2.c)) {
            object = (String)object + "[0] ";
        }
        object = tg2.c.isEmpty() ? (String)object + "ROOT " : (String)object + tg2.c + ' ';
        n2 = 0xFFFFFF;
        this.k.a((String)object, (float)(n4 - 160), (float)(n5 - 80 - 16), 0xFFFFFF);
        object = decimalFormat.format(tg2.b) + "%";
        this.k.a((String)object, (float)(n4 + 160 - this.k.a((String)object)), (float)(n5 - 80 - 16), 0xFFFFFF);
        for (int i3 = 0; i3 < list.size(); ++i3) {
            tg tg3 = (tg)list.get(i3);
            StringBuilder stringBuilder = new StringBuilder();
            if ("unspecified".equals(tg3.c)) {
                stringBuilder.append("[?] ");
            } else {
                stringBuilder.append("[").append(i3 + 1).append("] ");
            }
            String string = stringBuilder.append(tg3.c).toString();
            this.k.a(string, (float)(n4 - 160), (float)(n5 + 80 + i3 * 8 + 20), tg3.a());
            string = decimalFormat.format(tg3.a) + "%";
            this.k.a(string, (float)(n4 + 160 - 50 - this.k.a(string)), (float)(n5 + 80 + i3 * 8 + 20), tg3.a());
            string = decimalFormat.format(tg3.b) + "%";
            this.k.a(string, (float)(n4 + 160 - this.k.a(string)), (float)(n5 + 80 + i3 * 8 + 20), tg3.a());
        }
    }

    public void p() {
        this.C = false;
    }

    public void q() {
        if (!dx.j()) {
            return;
        }
        if (this.x) {
            return;
        }
        if (!a) {
            cke.a();
        }
        this.x = true;
        this.v.a();
        this.a((cjn)null);
        this.ad = 10000;
    }

    public void r() {
        if (!this.x) {
            return;
        }
        this.x = false;
        this.v.b();
    }

    public void s() {
        if (this.m != null) {
            return;
        }
        this.a(new bxh());
        if (this.G() && !this.ag.p()) {
            this.aG.b();
        }
    }

    private void b(boolean bl2) {
        if (!bl2) {
            this.ad = 0;
        }
        if (this.ad > 0 || this.h.ag_()) {
            return;
        }
        if (bl2 && this.t != null && this.t.a == bmw.b) {
            cmz cmz2 = this.t.a();
            if (this.f.n(cmz2).a() != ahk.a && this.c.b(cmz2, this.t.b)) {
                this.j.a(cmz2, this.t.b);
                this.h.a(bqp.a);
            }
            return;
        }
        this.c.c();
    }

    private void aw() {
        if (this.ad > 0) {
            return;
        }
        if (this.t == null) {
            G.b("Null returned as 'hitResult', this shouldn't happen!");
            if (this.c.g()) {
                this.ad = 10;
            }
            return;
        }
        if (this.h.S()) {
            return;
        }
        switch (this.t.a) {
            case c: {
                this.c.a(this.h, this.t.d);
                break;
            }
            case b: {
                cmz cmz2 = this.t.a();
                if (this.f.n(cmz2).a() != ahk.a) {
                    this.c.a(cmz2, this.t.b);
                    break;
                }
            }
            case a: {
                if (this.c.g()) {
                    this.ad = 10;
                }
                this.h.aR();
            }
        }
        this.h.a(bqp.a);
    }

    private void ax() {
        if (this.c.m()) {
            return;
        }
        this.an = 4;
        if (this.h.S()) {
            return;
        }
        for (bqp bqp2 : bqp.values()) {
            Object object;
            bhl bhl2 = this.h.c(bqp2);
            if (this.t == null) {
                G.f("Null returned as 'hitResult', this shouldn't happen!");
            } else {
                switch (this.t.a) {
                    case c: {
                        if (this.c.a(this.h, this.t.d, this.t, this.h.c(bqp2), bqp2) == cey.a) {
                            return;
                        }
                        if (this.c.a((bdl)this.h, this.t.d, this.h.c(bqp2), bqp2) != cey.a) break;
                        return;
                    }
                    case b: {
                        object = this.t.a();
                        if (this.f.n((cmz)object).a() == ahk.a) break;
                        int n2 = bhl2 != null ? bhl2.b : 0;
                        cey cey2 = this.c.a(this.h, this.f, bhl2, (cmz)object, this.t.b, this.t.c, bqp2);
                        if (cey2 != cey.a) break;
                        this.h.a(bqp2);
                        if (bhl2 != null) {
                            if (bhl2.b == 0) {
                                this.h.a(bqp2, null);
                            } else if (bhl2.b != n2 || this.c.h()) {
                                this.o.c.a(bqp2);
                            }
                        }
                        return;
                    }
                }
            }
            object = this.h.c(bqp2);
            if (object == null || this.c.a((bdl)this.h, this.f, (bhl)object, bqp2) != cey.a) continue;
            this.o.c.a(bqp2);
            return;
        }
    }

    public void t() {
        try {
            this.u.t = this.Q = !this.Q;
            if (this.Q) {
                this.au();
                this.d = dx.d().b();
                this.e = dx.d().c();
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
            } else {
                dx.a(new DisplayMode(this.ae, this.af));
                this.d = this.ae;
                this.e = this.af;
                if (this.d <= 0) {
                    this.d = 1;
                }
                if (this.e <= 0) {
                    this.e = 1;
                }
            }
            if (this.m != null) {
                this.a(this.d, this.e);
            } else {
                this.ay();
            }
            dx.a(this.Q);
            dx.c(this.u.u);
            this.k();
        }
        catch (Exception exception) {
            G.b("Couldn't toggle fullscreen", (Throwable)exception);
        }
    }

    private void a(int n2, int n3) {
        this.d = Math.max(1, n2);
        this.e = Math.max(1, n3);
        if (this.m != null) {
            cnt cnt2 = new cnt(this);
            this.m.b(this, cnt2.a(), cnt2.b());
        }
        this.n = new bri(this);
        this.ay();
    }

    private void ay() {
        this.aE.a(this.d, this.e);
        if (this.o != null) {
            this.o.a(this.d, this.e);
        }
    }

    public agn u() {
        return this.aH;
    }

    public void v() {
        if (this.an > 0) {
            --this.an;
        }
        this.B.a("gui");
        if (!this.ac) {
            this.r.b();
        }
        this.B.b();
        this.o.a(1.0f);
        this.B.a("gameMode");
        if (!this.ac && this.f != null) {
            this.c.e();
        }
        this.B.c("textures");
        if (!this.ac) {
            this.N.a();
        }
        if (this.m == null && this.h != null) {
            if (this.h.bh() <= 0.0f && !(this.m instanceof cxv)) {
                this.a((cjn)null);
            } else if (this.h.H_() && this.f != null) {
                this.a(new wy());
            }
        } else if (this.m != null && this.m instanceof wy && !this.h.H_()) {
            this.a((cjn)null);
        }
        if (this.m != null) {
            this.ad = 10000;
        }
        if (this.m != null) {
            try {
                this.m.m();
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Updating screen events");
                sx sx2 = cet2.a("Affected screen");
                sx2.a("Screen name", new czq(this));
                throw new oz(cet2);
            }
            if (this.m != null) {
                try {
                    this.m.d();
                }
                catch (Throwable throwable) {
                    cet cet3 = cet.a(throwable, "Ticking screen");
                    sx sx3 = cet3.a("Affected screen");
                    sx3.a("Screen name", new cmc(this));
                    throw new oz(cet3);
                }
            }
        }
        if (this.m == null || this.m.A) {
            this.B.c("mouse");
            this.aB();
            if (this.ad > 0) {
                --this.ad;
            }
            this.B.c("keyboard");
            this.az();
        }
        if (this.f != null) {
            if (this.h != null) {
                ++this.aq;
                if (this.aq == 30) {
                    this.aq = 0;
                    this.f.h(this.h);
                }
            }
            this.B.c("gameRenderer");
            if (!this.ac) {
                this.o.d();
            }
            this.B.c("levelRenderer");
            if (!this.ac) {
                this.g.i();
            }
            this.B.c("level");
            if (!this.ac) {
                if (this.f.S() > 0) {
                    this.f.d(this.f.S() - 1);
                }
                this.f.k();
            }
        } else if (this.o.a()) {
            this.o.b();
        }
        if (!this.ac) {
            this.aH.a();
            this.aG.a();
        }
        if (this.f != null) {
            if (!this.ac) {
                this.f.a(this.f.Q() != ct.a, true);
                try {
                    this.f.p();
                }
                catch (Throwable throwable) {
                    cet cet4 = cet.a(throwable, "Exception in world tick");
                    if (this.f == null) {
                        sx sx4 = cet4.a("Affected level");
                        sx4.a("Problem", "Level is null!");
                    } else {
                        this.f.a(cet4);
                    }
                    throw new oz(cet4);
                }
            }
            this.B.c("animateTick");
            if (!this.ac && this.f != null) {
                this.f.b(cmk.c(this.h.aU), cmk.c(this.h.aV), cmk.c(this.h.aW));
            }
            this.B.c("particles");
            if (!this.ac) {
                this.j.a();
            }
        } else if (this.at != null) {
            this.B.c("pendingConnection");
            this.at.a();
        }
        this.B.b();
        this.y = bxy.K();
    }

    private void az() {
        while (org.lwjgl.a.g.f()) {
            boolean bl2;
            int n2;
            int n3 = n2 = org.lwjgl.a.g.j() == 0 ? org.lwjgl.a.g.i() + 256 : org.lwjgl.a.g.j();
            if (this.av > 0L) {
                if (bxy.K() - this.av >= 6000L) {
                    throw new oz(new cet("Manually triggered debug crash", new Throwable()));
                }
                if (!org.lwjgl.a.g.a(46) || !org.lwjgl.a.g.a(61)) {
                    this.av = -1L;
                }
            } else if (org.lwjgl.a.g.a(46) && org.lwjgl.a.g.a(61)) {
                this.aR = true;
                this.av = bxy.K();
            }
            this.Y();
            if (this.m != null) {
                this.m.k();
            }
            if (bl2 = org.lwjgl.a.g.k()) {
                if (n2 == 62 && this.o != null) {
                    this.o.c();
                }
                boolean bl3 = false;
                if (this.m == null) {
                    if (n2 == 1) {
                        this.s();
                    }
                    bl3 = org.lwjgl.a.g.a(61) && this.c(n2);
                    this.aR |= bl3;
                    if (n2 == 59) {
                        boolean bl4 = this.u.ar = !this.u.ar;
                    }
                }
                if (bl3) {
                    cke.a(n2, false);
                } else {
                    cke.a(n2, true);
                    cke.a(n2);
                }
                if (!this.u.au) continue;
                if (n2 == 11) {
                    this.b(0);
                }
                for (int i2 = 0; i2 < 9; ++i2) {
                    if (n2 != 2 + i2) continue;
                    this.b(i2 + 1);
                }
                continue;
            }
            cke.a(n2, false);
            if (n2 != 61) continue;
            if (this.aR) {
                this.aR = false;
                continue;
            }
            this.u.at = !this.u.at;
            this.u.au = this.u.at && cjn.o();
            this.u.av = this.u.at && cjn.p();
        }
        this.aA();
    }

    private boolean c(int n2) {
        if (n2 == 30) {
            this.g.d();
            this.a("Reloading all chunks", new Object[0]);
            return true;
        }
        if (n2 == 48) {
            boolean bl2 = !this.X.b();
            this.X.b(bl2);
            this.a("Hitboxes: {0}", bl2 ? "shown" : "hidden");
            return true;
        }
        if (n2 == 32) {
            if (this.r != null) {
                this.r.c().a();
            }
            return true;
        }
        if (n2 == 33) {
            this.u.a(oi.f, cjn.o() ? -1 : 1);
            this.a("RenderDistance: {0}", this.u.d);
            return true;
        }
        if (n2 == 34) {
            boolean bl3 = this.p.b();
            this.a("Chunk borders: {0}", bl3 ? "shown" : "hidden");
            return true;
        }
        if (n2 == 35) {
            this.u.y = !this.u.y;
            this.a("Advanced tooltips: {0}", this.u.y ? "shown" : "hidden");
            this.u.b();
            return true;
        }
        if (n2 == 49) {
            if (!this.h.a(2, "")) {
                this.a("Unable to switch gamemode, no permission", new Object[0]);
            } else if (this.h.aM()) {
                this.h.a("/gamemode spectator");
            } else if (this.h.aL()) {
                this.h.a("/gamemode creative");
            }
            return true;
        }
        if (n2 == 25) {
            this.u.z = !this.u.z;
            this.u.b();
            this.a("PauseOnLostFocus: {0}", this.u.z ? "enabled" : "disabled");
            return true;
        }
        if (n2 == 16) {
            this.a("Keybindings:", new Object[0]);
            crd crd2 = this.r.c();
            crd2.a(new aym("F3 + A = Reload chunks"));
            crd2.a(new aym("F3 + B = Show hitboxes"));
            crd2.a(new aym("F3 + D = Clear chat"));
            crd2.a(new aym("F3 + F = Cycle renderdistance (Shift to inverse)"));
            crd2.a(new aym("F3 + G = Show chunk boundaries"));
            crd2.a(new aym("F3 + H = Advanced tooltips"));
            crd2.a(new aym("F3 + N = Cycle creative <-> spectator"));
            crd2.a(new aym("F3 + P = Pause on lost focus"));
            crd2.a(new aym("F3 + Q = Show this list"));
            crd2.a(new aym("F3 + T = Reload resourcepacks"));
            return true;
        }
        if (n2 == 20) {
            this.h();
            this.a("Reloaded resourcepacks", new Object[0]);
            return true;
        }
        return false;
    }

    private void aA() {
        int n2;
        while (this.u.aj.g()) {
            ++this.u.as;
            if (this.u.as > 2) {
                this.u.as = 0;
            }
            if (this.u.as == 0) {
                this.o.a(this.ab());
            } else if (this.u.as == 1) {
                this.o.a((cpk)null);
            }
            this.g.l();
        }
        while (this.u.ak.g()) {
            this.u.ax = !this.u.ax;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            if (!this.u.an[n2].g()) continue;
            if (this.h.aL()) {
                this.r.f().a(n2);
                continue;
            }
            this.h.n.d = n2;
        }
        while (this.u.Z.g()) {
            this.x().a(new daq(cpl.c));
            if (this.c.j()) {
                this.h.C();
                continue;
            }
            this.a(new nv(this.h));
        }
        while (this.u.aa.g()) {
            if (this.h.aL()) continue;
            this.x().a(new cco(bpk.g, cmz.e, bqk.a));
        }
        while (this.u.ab.g()) {
            if (this.h.aL()) continue;
            this.h.a(cjn.n());
        }
        int n3 = n2 = this.u.n != bgi.c ? 1 : 0;
        if (n2 != 0) {
            while (this.u.af.g()) {
                this.a(new bmz());
            }
            if (this.m == null && this.u.ah.g()) {
                this.a(new bmz("/"));
            }
        }
        if (this.h.ag_()) {
            if (!this.u.ac.e()) {
                this.c.c(this.h);
            }
            while (this.u.ad.g()) {
            }
            while (this.u.ac.g()) {
            }
            while (this.u.ae.g()) {
            }
        } else {
            while (this.u.ad.g()) {
                this.aw();
            }
            while (this.u.ac.g()) {
                this.ax();
            }
            while (this.u.ae.g()) {
                this.aC();
            }
        }
        if (this.u.ac.e() && this.an == 0 && !this.h.ag_()) {
            this.ax();
        }
        this.b(this.m == null && this.u.ad.e() && this.x);
    }

    private void aB() {
        while (org.lwjgl.a.j.h()) {
            long l2;
            int n2 = org.lwjgl.a.j.i();
            cke.a(n2 - 100, org.lwjgl.a.j.j());
            if (org.lwjgl.a.j.j()) {
                if (this.h.aL() && n2 == 2) {
                    this.r.f().b();
                } else {
                    cke.a(n2 - 100);
                }
            }
            if ((l2 = bxy.K() - this.y) > 200L) continue;
            int n3 = org.lwjgl.a.j.o();
            if (n3 != 0) {
                if (this.h.aL()) {
                    int n4 = n3 = n3 < 0 ? -1 : 1;
                    if (this.r.f().a()) {
                        this.r.f().b(-n3);
                    } else {
                        float f2 = cmk.a(this.h.G.a() + (float)n3 * 0.005f, 0.0f, 0.2f);
                        this.h.G.a(f2);
                    }
                } else {
                    this.h.n.f(n3);
                }
            }
            if (this.m == null) {
                if (this.x || !org.lwjgl.a.j.j()) continue;
                this.q();
                continue;
            }
            if (this.m == null) continue;
            this.m.p_();
        }
    }

    private void a(String string, Object ... arrobject) {
        this.r.c().a(new aym("").a(new aym("[Debug]: ").a(new bcc().a(aug.o).a(true))).b(MessageFormat.format(string, arrobject)));
    }

    public void a(String string, String string2, atd atd2) {
        Object object;
        Object object2;
        this.a((ym)null);
        System.gc();
        ajq ajq2 = this.al.a(string, false);
        cvn cvn2 = ajq2.c();
        if (cvn2 == null && atd2 != null) {
            cvn2 = new cvn(atd2, string);
            ajq2.a(cvn2);
        }
        if (atd2 == null) {
            atd2 = new atd(cvn2);
        }
        try {
            object2 = new com.c.a.e.c(this.ak, UUID.randomUUID().toString());
            object = ((com.c.a.e.c)object2).a();
            f f2 = ((com.c.a.e.c)object2).b();
            bas bas2 = new bas(f2, new File(this.w, net.minecraft.c.a.a.getName()));
            tr.a(bas2);
            tr.a((i)object);
            bas.a(false);
            this.ag = new bil(this, string, string2, atd2, (com.c.a.e.c)object2, (i)object, f2, bas2);
            this.ag.F();
            this.au = true;
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Starting integrated server");
            sx sx2 = cet2.a("Starting integrated server");
            sx2.a("Level ID", string);
            sx2.a("Level Name", string2);
            throw new oz(cet2);
        }
        this.n.a(bf.a("menu.loadingLevel", new Object[0]));
        while (!this.ag.an()) {
            object2 = this.ag.k();
            if (object2 != null) {
                this.n.c(bf.a((String)object2, new Object[0]));
            } else {
                this.n.c("");
            }
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {}
        }
        this.a(new cil());
        object2 = ((afx)((Object)this.ag.am())).a();
        object = sz.a((SocketAddress)object2);
        ((sz)object).a(new afm((sz)object, this, null));
        ((sz)object).a(new atm(210, object2.toString(), 0, dfj.d));
        ((sz)object).a(new aza(this.M().e()));
        this.at = object;
    }

    public void a(ym ym2) {
        this.a(ym2, "");
    }

    public void a(ym ym2, String string) {
        Object object;
        if (ym2 == null) {
            object = this.x();
            if (object != null) {
                ((ut)object).a();
            }
            if (this.ag != null && this.ag.M()) {
                this.ag.o();
            }
            this.ag = null;
            this.q.b();
            this.o.i().a();
            this.c = null;
        }
        this.aa = null;
        this.at = null;
        if (this.n != null) {
            this.n.b(string);
            this.n.c("");
        }
        if (ym2 == null && this.f != null) {
            this.aA.h();
            this.r.h();
            this.a((cyq)null);
            this.au = false;
        }
        this.aG.c();
        this.f = ym2;
        if (this.g != null) {
            this.g.a(ym2);
        }
        if (this.j != null) {
            this.j.a(ym2);
        }
        ccg.a.a(ym2);
        if (ym2 != null) {
            if (!this.au) {
                object = new com.c.a.e.c(this.ak, UUID.randomUUID().toString());
                i i2 = object.a();
                f f2 = object.b();
                bas bas2 = new bas(f2, new File(this.w, net.minecraft.c.a.a.getName()));
                tr.a(bas2);
                tr.a(i2);
                bas.a(false);
            }
            if (this.h == null) {
                this.h = this.c.a(ym2, new cwj());
                this.c.b(this.h);
            }
            this.h.aj_();
            ym2.b(this.h);
            this.h.b = new gh(this.u);
            this.c.a(this.h);
            this.aa = this.h;
        } else {
            this.al.c();
            this.h = null;
        }
        System.gc();
        this.y = 0L;
    }

    public void a(int n2) {
        this.f.g();
        this.f.c();
        int n3 = 0;
        String string = null;
        if (this.h != null) {
            n3 = this.h.bW();
            this.f.e(this.h);
            string = this.h.D();
        }
        this.aa = null;
        ob ob2 = this.h;
        this.h = this.c.a(this.f, this.h == null ? new cwj() : this.h.E());
        this.h.bY().a(ob2.bY().c());
        this.h.bS = n2;
        this.aa = this.h;
        this.h.aj_();
        this.h.b(string);
        this.f.b(this.h);
        this.c.b(this.h);
        this.h.b = new gh(this.u);
        this.h.l(n3);
        this.c.a(this.h);
        this.h.e(ob2.aP());
        if (this.m instanceof cxv) {
            this.a((cjn)null);
        }
    }

    public final boolean w() {
        return this.as;
    }

    public ut x() {
        return this.h == null ? null : this.h.a;
    }

    public static boolean y() {
        return O == null || !bxy.O.u.ar;
    }

    public static boolean z() {
        return O != null && bxy.O.u.j;
    }

    public static boolean A() {
        return O != null && bxy.O.u.k != 0;
    }

    private void aC() {
        bhl bhl2;
        Object object;
        Object object2;
        if (this.t == null || this.t.a == bmw.a) {
            return;
        }
        boolean bl2 = this.h.G.d;
        bql bql2 = null;
        if (this.t.a == bmw.b) {
            object2 = this.t.a();
            object = this.f.n((cmz)object2);
            bfa bfa2 = object.t();
            if (object.a() == ahk.a) {
                return;
            }
            bhl2 = bfa2.c(this.f, (cmz)object2, (dbk)object);
            if (bhl2 == null) {
                return;
            }
            if (bl2 && cjn.n() && bfa2.l()) {
                bql2 = this.f.q((cmz)object2);
            }
        } else if (this.t.a == bmw.c && this.t.d != null && bl2) {
            if (this.t.d instanceof cbk) {
                bhl2 = new bhl(hp.ap);
            } else if (this.t.d instanceof ahe) {
                bhl2 = new bhl(hp.cx);
            } else if (this.t.d instanceof cvr) {
                object2 = (cvr)this.t.d;
                object = ((cvr)object2).w();
                bhl2 = object == null ? new bhl(hp.bZ) : bhl.c((bhl)object);
            } else if (this.t.d instanceof cef) {
                object2 = (cef)this.t.d;
                switch (((cef)object2).bd_()) {
                    case c: {
                        object = hp.aV;
                        break;
                    }
                    case b: {
                        object = hp.aU;
                        break;
                    }
                    case d: {
                        object = hp.cr;
                        break;
                    }
                    case f: {
                        object = hp.cs;
                        break;
                    }
                    case g: {
                        object = hp.cz;
                        break;
                    }
                    default: {
                        object = hp.aB;
                    }
                }
                bhl2 = new bhl((azg)object);
            } else if (this.t.d instanceof cor) {
                bhl2 = new bhl(((cor)this.t.d).n());
            } else if (this.t.d instanceof bdi) {
                bhl2 = new bhl(hp.ct);
            } else if (this.t.d instanceof abi) {
                bhl2 = new bhl(hp.cP);
            } else {
                object2 = vb.b(this.t.d);
                if (!vb.a.containsKey(object2)) {
                    return;
                }
                bhl2 = new bhl(hp.bT);
                clx.a(bhl2, (String)object2);
            }
        } else {
            return;
        }
        if (bhl2.a() == null) {
            object2 = "";
            if (this.t.a == bmw.b) {
                object2 = ((bpx)bfa.v.b(this.f.n(this.t.a()).t())).toString();
            } else if (this.t.a == bmw.c) {
                object2 = vb.b(this.t.d);
            }
            G.f("Picking on: [{}] {} gave null item", new Object[]{this.t.a, object2});
            return;
        }
        object2 = this.h.n;
        if (bql2 != null) {
            this.a(bhl2, bql2);
        }
        int n2 = ((cps)object2).b(bhl2);
        if (bl2) {
            ((cps)object2).a(bhl2);
            this.c.a(this.h.c(bqp.a), 36 + ((cps)object2).d);
        } else if (n2 != -1) {
            if (cps.e(n2)) {
                ((cps)object2).d = n2;
            } else {
                this.c.a(n2);
            }
        }
    }

    private bhl a(bhl bhl2, bql bql2) {
        bvp bvp2 = bql2.b(new bvp());
        if (bhl2.a() == hp.ch && bvp2.e("Owner")) {
            bvp bvp3 = bvp2.o("Owner");
            bvp bvp4 = new bvp();
            bvp4.a("SkullOwner", bvp3);
            bhl2.d(bvp4);
            return bhl2;
        }
        bhl2.a("BlockEntityTag", bvp2);
        bvp bvp5 = new bvp();
        bmh bmh2 = new bmh();
        bmh2.a(new byh("(+NBT)"));
        bvp5.a("Lore", bmh2);
        bhl2.a("display", bvp5);
        return bhl2;
    }

    public cet c(cet cet2) {
        cet2.f().a("Launched Version", new ys(this));
        cet2.f().a("LWJGL", new bmd(this));
        cet2.f().a("OpenGL", new bdw(this));
        cet2.f().a("GL Caps", new ded(this));
        cet2.f().a("Using VBOs", new buw(this));
        cet2.f().a("Is Modded", new cfu(this));
        cet2.f().a("Type", new anc(this));
        cet2.f().a("Resource Packs", new cio(this));
        cet2.f().a("Current Language", new bhz(this));
        cet2.f().a("Profiler Position", new ia(this));
        cet2.f().a("CPU", new crp(this));
        if (this.f != null) {
            this.f.a(cet2);
        }
        return cet2;
    }

    public static bxy B() {
        return O;
    }

    public dl C() {
        return this.a(new byo(this));
    }

    @Override
    public void a(et et2) {
        et2.a("fps", am);
        et2.a("vsync_enabled", this.u.u);
        et2.a("display_frequency", dx.d().e());
        et2.a("display_type", this.Q ? "fullscreen" : "windowed");
        et2.a("run_time", (net.minecraft.c.a.av() - et2.g()) / 60L * 1000L);
        et2.a("current_action", this.aD());
        et2.a("language", this.u.aE == null ? "en_US" : this.u.aE);
        String string = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
        et2.a("endianness", string);
        et2.a("subtitles", this.u.P);
        et2.a("resource_packs", this.aA.e().size());
        int n2 = 0;
        for (cdg cdg2 : this.aA.e()) {
            et2.a("resource_pack[" + n2++ + "]", cdg2.d());
        }
        if (this.ag != null && this.ag.ar() != null) {
            et2.a("snooper_partner", ((et)((Object)this.ag.ar())).f());
        }
    }

    private String aD() {
        if (this.ag != null) {
            if (this.ag.p()) {
                return "hosting_lan";
            }
            return "singleplayer";
        }
        if (this.M != null) {
            if (this.M.d()) {
                return "playing_lan";
            }
            return "multiplayer";
        }
        return "out_of_game";
    }

    @Override
    public void b(et et2) {
        et2.b("opengl_version", cja.r(7938));
        et2.b("opengl_vendor", cja.r(7936));
        et2.b("client_brand", net.minecraft.client.m.a());
        et2.b("launched_version", this.ai);
        dt dt2 = GLContext.a();
        et2.b("gl_caps[ARB_arrays_of_arrays]", dt2.S);
        et2.b("gl_caps[ARB_base_instance]", dt2.T);
        et2.b("gl_caps[ARB_blend_func_extended]", dt2.V);
        et2.b("gl_caps[ARB_clear_buffer_object]", dt2.Y);
        et2.b("gl_caps[ARB_color_buffer_float]", dt2.ab);
        et2.b("gl_caps[ARB_compatibility]", dt2.ac);
        et2.b("gl_caps[ARB_compressed_texture_pixel_storage]", dt2.ad);
        et2.b("gl_caps[ARB_compute_shader]", dt2.ae);
        et2.b("gl_caps[ARB_copy_buffer]", dt2.ai);
        et2.b("gl_caps[ARB_copy_image]", dt2.aj);
        et2.b("gl_caps[ARB_depth_buffer_float]", dt2.am);
        et2.b("gl_caps[ARB_compute_shader]", dt2.ae);
        et2.b("gl_caps[ARB_copy_buffer]", dt2.ai);
        et2.b("gl_caps[ARB_copy_image]", dt2.aj);
        et2.b("gl_caps[ARB_depth_buffer_float]", dt2.am);
        et2.b("gl_caps[ARB_depth_clamp]", dt2.an);
        et2.b("gl_caps[ARB_depth_texture]", dt2.ao);
        et2.b("gl_caps[ARB_draw_buffers]", dt2.ar);
        et2.b("gl_caps[ARB_draw_buffers_blend]", dt2.as);
        et2.b("gl_caps[ARB_draw_elements_base_vertex]", dt2.at);
        et2.b("gl_caps[ARB_draw_indirect]", dt2.au);
        et2.b("gl_caps[ARB_draw_instanced]", dt2.av);
        et2.b("gl_caps[ARB_explicit_attrib_location]", dt2.ax);
        et2.b("gl_caps[ARB_explicit_uniform_location]", dt2.ay);
        et2.b("gl_caps[ARB_fragment_layer_viewport]", dt2.aA);
        et2.b("gl_caps[ARB_fragment_program]", dt2.aB);
        et2.b("gl_caps[ARB_fragment_shader]", dt2.aD);
        et2.b("gl_caps[ARB_fragment_program_shadow]", dt2.aC);
        et2.b("gl_caps[ARB_framebuffer_object]", dt2.aF);
        et2.b("gl_caps[ARB_framebuffer_sRGB]", dt2.aG);
        et2.b("gl_caps[ARB_geometry_shader4]", dt2.aH);
        et2.b("gl_caps[ARB_gpu_shader5]", dt2.aK);
        et2.b("gl_caps[ARB_half_float_pixel]", dt2.aM);
        et2.b("gl_caps[ARB_half_float_vertex]", dt2.aN);
        et2.b("gl_caps[ARB_instanced_arrays]", dt2.aQ);
        et2.b("gl_caps[ARB_map_buffer_alignment]", dt2.aU);
        et2.b("gl_caps[ARB_map_buffer_range]", dt2.aV);
        et2.b("gl_caps[ARB_multisample]", dt2.aZ);
        et2.b("gl_caps[ARB_multitexture]", dt2.ba);
        et2.b("gl_caps[ARB_occlusion_query2]", dt2.bc);
        et2.b("gl_caps[ARB_pixel_buffer_object]", dt2.be);
        et2.b("gl_caps[ARB_seamless_cube_map]", dt2.bp);
        et2.b("gl_caps[ARB_shader_objects]", dt2.by);
        et2.b("gl_caps[ARB_shader_stencil_export]", dt2.bA);
        et2.b("gl_caps[ARB_shader_texture_lod]", dt2.bE);
        et2.b("gl_caps[ARB_shadow]", dt2.bJ);
        et2.b("gl_caps[ARB_shadow_ambient]", dt2.bK);
        et2.b("gl_caps[ARB_stencil_texturing]", dt2.bN);
        et2.b("gl_caps[ARB_sync]", dt2.bO);
        et2.b("gl_caps[ARB_tessellation_shader]", dt2.bP);
        et2.b("gl_caps[ARB_texture_border_clamp]", dt2.bR);
        et2.b("gl_caps[ARB_texture_buffer_object]", dt2.bS);
        et2.b("gl_caps[ARB_texture_cube_map]", dt2.bY);
        et2.b("gl_caps[ARB_texture_cube_map_array]", dt2.bZ);
        et2.b("gl_caps[ARB_texture_non_power_of_two]", dt2.cj);
        et2.b("gl_caps[ARB_uniform_buffer_object]", dt2.cA);
        et2.b("gl_caps[ARB_vertex_blend]", dt2.cF);
        et2.b("gl_caps[ARB_vertex_buffer_object]", dt2.cG);
        et2.b("gl_caps[ARB_vertex_program]", dt2.cH);
        et2.b("gl_caps[ARB_vertex_shader]", dt2.cI);
        et2.b("gl_caps[EXT_bindable_uniform]", dt2.dh);
        et2.b("gl_caps[EXT_blend_equation_separate]", dt2.dj);
        et2.b("gl_caps[EXT_blend_func_separate]", dt2.dk);
        et2.b("gl_caps[EXT_blend_minmax]", dt2.dl);
        et2.b("gl_caps[EXT_blend_subtract]", dt2.dm);
        et2.b("gl_caps[EXT_draw_instanced]", dt2.dr);
        et2.b("gl_caps[EXT_framebuffer_multisample]", dt2.dv);
        et2.b("gl_caps[EXT_framebuffer_object]", dt2.dx);
        et2.b("gl_caps[EXT_framebuffer_sRGB]", dt2.dy);
        et2.b("gl_caps[EXT_geometry_shader4]", dt2.dz);
        et2.b("gl_caps[EXT_gpu_program_parameters]", dt2.dA);
        et2.b("gl_caps[EXT_gpu_shader4]", dt2.dB);
        et2.b("gl_caps[EXT_multi_draw_arrays]", dt2.dC);
        et2.b("gl_caps[EXT_packed_depth_stencil]", dt2.dD);
        et2.b("gl_caps[EXT_paletted_texture]", dt2.dG);
        et2.b("gl_caps[EXT_rescale_normal]", dt2.dK);
        et2.b("gl_caps[EXT_separate_shader_objects]", dt2.dM);
        et2.b("gl_caps[EXT_shader_image_load_store]", dt2.dO);
        et2.b("gl_caps[EXT_shadow_funcs]", dt2.dP);
        et2.b("gl_caps[EXT_shared_texture_palette]", dt2.dQ);
        et2.b("gl_caps[EXT_stencil_clear_tag]", dt2.dR);
        et2.b("gl_caps[EXT_stencil_two_side]", dt2.dS);
        et2.b("gl_caps[EXT_stencil_wrap]", dt2.dT);
        et2.b("gl_caps[EXT_texture_3d]", dt2.dU);
        et2.b("gl_caps[EXT_texture_array]", dt2.dV);
        et2.b("gl_caps[EXT_texture_buffer_object]", dt2.dW);
        et2.b("gl_caps[EXT_texture_integer]", dt2.ed);
        et2.b("gl_caps[EXT_texture_lod_bias]", dt2.ee);
        et2.b("gl_caps[EXT_texture_sRGB]", dt2.eh);
        et2.b("gl_caps[EXT_vertex_shader]", dt2.eq);
        et2.b("gl_caps[EXT_vertex_weighting]", dt2.er);
        et2.b("gl_caps[gl_max_vertex_uniforms]", cja.s(35658));
        cja.I();
        et2.b("gl_caps[gl_max_fragment_uniforms]", cja.s(35657));
        cja.I();
        et2.b("gl_caps[gl_max_vertex_attribs]", cja.s(34921));
        cja.I();
        et2.b("gl_caps[gl_max_vertex_texture_image_units]", cja.s(35660));
        cja.I();
        et2.b("gl_caps[gl_max_texture_image_units]", cja.s(34930));
        cja.I();
        et2.b("gl_caps[gl_max_array_texture_layers]", cja.s(35071));
        cja.I();
        et2.b("gl_max_texture_size", bxy.D());
        e e2 = this.ab.e();
        if (e2 != null && e2.a() != null) {
            et2.b("uuid", com.a.a.g.ak.e().a(e2.a().toString().getBytes(org.apache.commons.b.b.a)).toString());
        }
    }

    public static int D() {
        for (int i2 = 16384; i2 > 0; i2 >>= 1) {
            cja.a(32868, 0, 6408, i2, i2, 0, 6408, 5121, null);
            int n2 = cja.c(32868, 0, 4096);
            if (n2 == 0) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public boolean a() {
        return this.u.s;
    }

    public void a(cyq cyq2) {
        this.M = cyq2;
    }

    public cyq E() {
        return this.M;
    }

    public boolean F() {
        return this.au;
    }

    public boolean G() {
        return this.au && this.ag != null;
    }

    public bil H() {
        return this.ag;
    }

    public static void I() {
        if (O == null) {
            return;
        }
        bil bil2 = O.H();
        if (bil2 != null) {
            bil2.n();
        }
    }

    public et J() {
        return this.W;
    }

    public static long K() {
        return org.lwjgl.ab.e() * 1000L / org.lwjgl.ab.d();
    }

    public boolean L() {
        return this.Q;
    }

    public alw M() {
        return this.ab;
    }

    public com.c.a.d.b N() {
        if (this.L.o()) {
            e e2 = this.Z().b(this.ab.e(), false);
            this.L.a(e2.c());
        }
        return this.L;
    }

    public Proxy O() {
        return this.ak;
    }

    public bnm P() {
        return this.N;
    }

    public akx Q() {
        return this.aw;
    }

    public hh R() {
        return this.aA;
    }

    public vm S() {
        return this.aB;
    }

    public dam T() {
        return this.aF;
    }

    public boolean U() {
        return this.ar;
    }

    public boolean V() {
        return this.ac;
    }

    public bro W() {
        return this.aG;
    }

    public aii X() {
        if (this.h != null) {
            if (this.h.aQ.q instanceof cer) {
                return aii.e;
            }
            if (this.h.aQ.q instanceof cup) {
                if (this.r.i().c()) {
                    return aii.f;
                }
                return aii.g;
            }
            if (this.h.G.d && this.h.G.c) {
                return aii.c;
            }
            return aii.b;
        }
        return aii.a;
    }

    public void Y() {
        int n2;
        int n3 = n2 = org.lwjgl.a.g.j() == 0 ? org.lwjgl.a.g.i() + 256 : org.lwjgl.a.g.j();
        if (n2 == 0 || org.lwjgl.a.g.m()) {
            return;
        }
        if (this.m instanceof btk && ((btk)this.m).c > bxy.K() - 20L) {
            return;
        }
        if (org.lwjgl.a.g.k()) {
            if (n2 == this.u.al.j()) {
                this.t();
            } else if (n2 == this.u.ai.j()) {
                this.r.c().a(fj.a(this.w, this.d, this.e, this.aE));
            }
        }
    }

    public i Z() {
        return this.aJ;
    }

    public jm aa() {
        return this.aK;
    }

    public cpk ab() {
        return this.aa;
    }

    public void a(cpk cpk2) {
        this.aa = cpk2;
        this.o.a(cpk2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dl a(Callable callable) {
        org.apache.commons.c.ao.a(callable);
        if (this.d()) {
            try {
                return ci.a(callable.call());
            }
            catch (Exception exception) {
                return ci.a(exception);
            }
        }
        dm dm2 = dm.a(callable);
        Queue queue = this.aL;
        synchronized (queue) {
            this.aL.add(dm2);
        }
        return dm2;
    }

    @Override
    public dl a(Runnable runnable) {
        org.apache.commons.c.ao.a(runnable);
        return this.a(Executors.callable(runnable));
    }

    @Override
    public boolean d() {
        return Thread.currentThread() == this.aM;
    }

    public dfp ac() {
        return this.aO;
    }

    public bid ad() {
        return this.X;
    }

    public bth ae() {
        return this.Y;
    }

    public ddx af() {
        return this.Z;
    }

    public static int ag() {
        return am;
    }

    public dgv ah() {
        return this.z;
    }

    public boolean ai() {
        return this.U;
    }

    public void a(boolean bl2) {
        this.U = bl2;
    }

    public cgy aj() {
        return this.P;
    }

    public float ak() {
        return this.V.c;
    }

    public gt al() {
        return this.aC;
    }

    public boolean am() {
        return this.h != null && this.h.aP() || this.u.w;
    }

    static /* synthetic */ String a(bxy bxy2) {
        return bxy2.ai;
    }

    static /* synthetic */ vm b(bxy bxy2) {
        return bxy2.aB;
    }
}

