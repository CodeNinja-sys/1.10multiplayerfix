/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.yk;
import com.a.a.n.a.dl;
import com.a.a.n.a.dm;
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
import net.minecraft.client.a;
import net.minecraft.client.b;
import net.minecraft.client.c;
import net.minecraft.client.c.ac;
import net.minecraft.client.e;
import net.minecraft.client.f;
import net.minecraft.client.f.ak;
import net.minecraft.client.f.g;
import net.minecraft.client.f.v;
import net.minecraft.client.f.w;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bj;
import net.minecraft.client.g.bs;
import net.minecraft.client.h;
import net.minecraft.client.h.d;
import net.minecraft.client.i;
import net.minecraft.client.i.n;
import net.minecraft.client.j;
import net.minecraft.client.k;
import net.minecraft.client.k.ab;
import net.minecraft.client.k.af;
import net.minecraft.client.k.ai;
import net.minecraft.client.k.ar;
import net.minecraft.client.k.b.q;
import net.minecraft.client.k.bb;
import net.minecraft.client.k.bh;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.ci;
import net.minecraft.client.k.cv;
import net.minecraft.client.k.db;
import net.minecraft.client.k.z;
import net.minecraft.client.l;
import net.minecraft.client.m;
import net.minecraft.client.o;
import net.minecraft.client.p;
import net.minecraft.client.s;
import net.minecraft.client.t;
import net.minecraft.client.u;
import net.minecraft.e.y;
import net.minecraft.f.ap;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dk;
import net.minecraft.q.aj;
import net.minecraft.u.ah;
import net.minecraft.u.an;
import net.minecraft.u.av;
import net.minecraft.u.bk;
import net.minecraft.u.bm;
import net.minecraft.u.bo;
import net.minecraft.u.bp;
import net.minecraft.u.br;
import net.minecraft.u.by;
import net.minecraft.u.cb;
import net.minecraft.w.f.ad;
import net.minecraft.x.d.a.ae;
import net.minecraft.x.d.a.x;
import org.apache.commons.c.ao;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.ig;

public class r
implements net.minecraft.p.a,
av {
    public static final String a = "1.10 Multiplayer Fix";
    private static final org.apache.logging.log4j.d J = org.apache.logging.log4j.c.c();
    private static final bp K = new bp("textures/gui/title/mojang.png");
    public static final boolean b = cb.a() == net.minecraft.u.cc.d;
    public static byte[] c = new byte[0xA00000];
    private static final List L = ov.a(new DisplayMode(2560, 1600), new DisplayMode(2880, 1800));
    private final File M;
    private final com.c.a.d.b N;
    private final com.c.a.d.b O;
    private net.minecraft.client.i.a P;
    private net.minecraft.client.g.a.c Q;
    private static r R;
    private final net.minecraft.u.a.a S;
    public net.minecraft.client.i.l d;
    private boolean T;
    private final boolean U = true;
    private boolean V;
    private net.minecraft.k.a W;
    public int e;
    public int f;
    private boolean X;
    public final by g = new by(20.0f);
    private final net.minecraft.p.d Y = new net.minecraft.p.d("client", this, net.minecraft.c.a.aI());
    public net.minecraft.client.i.d h;
    public net.minecraft.client.g.ar i;
    private net.minecraft.client.g.i.f Z;
    private net.minecraft.client.g.t aa;
    private bs ab;
    public d j;
    private net.minecraft.w.n ac;
    public net.minecraft.w.n k;
    public net.minecraft.client.a.f l;
    private final net.minecraft.u.bs ad;
    private boolean ae;
    public ce m;
    public ce n;
    public cc o;
    public s p;
    public net.minecraft.client.g.cc q;
    public net.minecraft.client.g.f.b r;
    private int af;
    private final int ag;
    private final int ah;
    private net.minecraft.c.a.d ai;
    public net.minecraft.client.k.a.c s;
    public z t;
    public boolean u;
    public net.minecraft.u.b.o v;
    public net.minecraft.client.b.a w;
    public bk x;
    public final File y;
    private final File aj;
    private final String ak;
    private final String al;
    private final Proxy am;
    private net.minecraft.q.a.w an;
    private static int ao;
    private int ap;
    private String aq;
    private int ar;
    public boolean z;
    long A = net.minecraft.client.r.I();
    private int as;
    public final an B = new an();
    long C = System.nanoTime();
    private final boolean at;
    private final boolean au;
    private net.minecraft.x.ak av;
    private boolean aw;
    public final net.minecraft.p.b D = new net.minecraft.p.b();
    private long ax = -1L;
    private net.minecraft.client.f.l ay;
    private final net.minecraft.client.f.a.d az = new net.minecraft.client.f.a.d();
    private final List aA = ov.a();
    private final ak aB;
    private g aC;
    private net.minecraft.client.f.af aD;
    private net.minecraft.client.g.h.g aE;
    private net.minecraft.client.g.h.c aF;
    private net.minecraft.client.m.b aG;
    private net.minecraft.client.g.a.f aH;
    private net.minecraft.client.c.h aI;
    private net.minecraft.client.c.g aJ;
    private bp aK;
    private final com.c.a.c.i aL;
    private net.minecraft.client.f.e aM;
    private final Queue aN = yk.a();
    private final Thread aO = Thread.currentThread();
    private net.minecraft.client.g.b.a.g aP;
    private net.minecraft.client.g.j aQ;
    volatile boolean E = true;
    public String F = "";
    public boolean G = true;
    private long aR = net.minecraft.client.r.I();
    private int aS;
    private boolean aT;
    long H = -1L;
    private String aU = "root";
    public static net.minecraft.l.k I;

    public r(net.minecraft.client.main.b b2) {
        R = this;
        this.y = b2.c.a;
        this.aj = b2.c.c;
        this.M = b2.c.b;
        this.ak = b2.d.b;
        this.al = b2.d.c;
        this.N = b2.a.b;
        this.O = b2.a.c;
        this.aB = new ak(b2.c.a());
        this.am = b2.a.d == null ? Proxy.NO_PROXY : b2.a.d;
        this.aL = new com.c.a.e.c(this.am, UUID.randomUUID().toString()).a();
        this.ad = b2.a.a;
        J.d("Setting user: {}", this.ad.c());
        J.a("(Session ID is {})", this.ad.a());
        this.au = b2.d.a;
        this.e = b2.b.a > 0 ? b2.b.a : 1;
        this.f = b2.b.b > 0 ? b2.b.b : 1;
        this.ag = b2.b.a;
        this.ah = b2.b.b;
        this.T = b2.b.c;
        this.at = net.minecraft.client.r.at();
        this.ai = null;
        if (b2.e.a != null) {
            this.aq = b2.e.a;
            this.ar = b2.e.b;
        }
        ImageIO.setUseCache(false);
        net.minecraft.a.z.c();
        this.S = net.minecraft.u.a.b.a();
    }

    /*
     * Exception decompiling
     */
    public void a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:406)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:481)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private void ao() {
        this.w = new net.minecraft.client.b.a(this, this.y);
        this.aA.add(this.aB);
        this.au();
        if (this.w.D > 0 && this.w.C > 0) {
            this.e = this.w.C;
            this.f = this.w.D;
        }
        J.d("LWJGL Version: {}", org.lwjgl.ab.a());
        this.as();
        this.ar();
        this.aq();
        net.minecraft.client.g.ay.a();
        this.aG = new net.minecraft.client.m.b(this.e, this.f, true);
        this.aG.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.ap();
        this.aC = new g(this.M, new File(this.y, "server-resource-packs"), this.aB, this.az, this.w);
        this.ay = new v(this.az);
        this.aD = new net.minecraft.client.f.af(this.az, this.w.aE);
        this.ay.a(this.aD);
        this.f();
        this.Q = new net.minecraft.client.g.a.c(this.ay);
        this.ay.a(this.Q);
        this.a(this.Q);
        this.aM = new net.minecraft.client.f.e(this.Q, new File(this.aj, "skins"), this.aL);
        this.an = new net.minecraft.q.f.a.l(new File(this.y, "saves"), this.S);
        this.aI = new net.minecraft.client.c.h(this.ay, this.w);
        this.ay.a(this.aI);
        this.aJ = new net.minecraft.client.c.g(this);
        this.m = new ce(this.w, new bp("textures/font/ascii.png"), this.Q, false);
        if (this.w.aE != null) {
            this.m.a(this.e());
            this.m.b(this.aD.b());
        }
        this.n = new ce(this.w, new bp("textures/font/ascii_sga.png"), this.Q, false);
        this.ay.a(this.m);
        this.ay.a(this.n);
        this.ay.a(new w());
        this.ay.a(new net.minecraft.client.f.r());
        net.minecraft.r.j.f.a(new o(this));
        this.x = new bk();
        this.a("Pre startup");
        bd.v();
        bd.j(7425);
        bd.a(1.0);
        bd.j();
        bd.c(515);
        bd.d();
        bd.a(516, 0.1f);
        bd.a(bj.b);
        bd.l(5889);
        bd.C();
        bd.l(5888);
        this.a("Startup");
        this.aH = new net.minecraft.client.g.a.f("textures");
        this.aH.a(this.w.K);
        this.Q.a(net.minecraft.client.g.a.f.b, this.aH);
        this.Q.a(net.minecraft.client.g.a.f.b);
        this.aH.a(false, this.w.K > 0);
        this.aP = new net.minecraft.client.g.b.a.g(this.aH);
        this.ay.a(this.aP);
        this.aE = net.minecraft.client.g.h.g.a();
        this.aF = net.minecraft.client.g.h.c.a(this.aE);
        this.aa = new net.minecraft.client.g.t(this.Q, this.aP, this.aF);
        this.Z = new net.minecraft.client.g.i.f(this.Q, this.aa);
        this.ab = new bs(this);
        this.ay.a(this.aa);
        this.q = new net.minecraft.client.g.cc(this, this.ay);
        this.ay.a(this.q);
        this.aQ = new net.minecraft.client.g.j(this.aP.c(), this.aE);
        this.ay.a(this.aQ);
        this.i = new net.minecraft.client.g.ar(this);
        this.ay.a(this.i);
        this.s = new net.minecraft.client.k.a.c(this);
        bd.b(0, 0, this.e, this.f);
        this.l = new net.minecraft.client.a.f(this.h, this.Q);
        this.a("Post startup");
        this.t = new z(this);
        if (this.aq != null) {
            this.a(new n(new ci(), this, this.aq, this.ar));
        } else {
            this.a(new ci());
        }
        this.Q.c(this.aK);
        this.aK = null;
        this.p = new s(this);
        this.r = new net.minecraft.client.g.f.b(this);
        if (this.w.t && !this.T) {
            this.r();
        }
        try {
            dx.c(this.w.u);
        }
        catch (ig ig2) {
            this.w.u = false;
            this.w.b();
        }
        this.i.a();
    }

    private void ap() {
        this.az.a(new net.minecraft.client.f.a.b(), net.minecraft.client.f.a.h.class);
        this.az.a(new net.minecraft.client.f.a.p(), net.minecraft.client.f.a.l.class);
        this.az.a(new net.minecraft.client.f.a.o(), net.minecraft.client.f.a.k.class);
        this.az.a(new net.minecraft.client.f.a.c(), net.minecraft.client.f.a.g.class);
        this.az.a(new net.minecraft.client.f.a.i(), net.minecraft.client.f.a.j.class);
    }

    private void aq() {
        dx.d(true);
        dx.a("Minecraft 1.10");
        try {
            dx.a(new PixelFormat().c(24));
        }
        catch (org.lwjgl.c c2) {
            J.b("Couldn't set pixel format", (Throwable)c2);
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (this.T) {
                this.av();
            }
            dx.s();
        }
    }

    private void ar() {
        if (this.T) {
            dx.a(true);
            DisplayMode displayMode = dx.d();
            this.e = Math.max(1, displayMode.b());
            this.f = Math.max(1, displayMode.c());
        } else {
            dx.a(new DisplayMode(this.e, this.f));
        }
    }

    private void as() {
        block7: {
            net.minecraft.u.cc cc2 = cb.a();
            if (cc2 != net.minecraft.u.cc.d) {
                InputStream inputStream = null;
                InputStream inputStream2 = null;
                try {
                    try {
                        inputStream = this.aB.c(new bp("icons/icon_16x16.png"));
                        inputStream2 = this.aB.c(new bp("icons/icon_32x32.png"));
                        if (inputStream != null && inputStream2 != null) {
                            dx.a(new ByteBuffer[]{this.a(inputStream), this.a(inputStream2)});
                        }
                    }
                    catch (IOException iOException) {
                        J.b("Couldn't set icon", (Throwable)iOException);
                        org.apache.commons.b.t.a(inputStream);
                        org.apache.commons.b.t.a(inputStream2);
                        break block7;
                    }
                }
                catch (Throwable throwable) {
                    org.apache.commons.b.t.a(inputStream);
                    org.apache.commons.b.t.a(inputStream2);
                    throw throwable;
                }
                org.apache.commons.b.t.a(inputStream);
                org.apache.commons.b.t.a(inputStream2);
            }
        }
    }

    private static boolean at() {
        String[] arrstring;
        String[] arrstring2 = arrstring = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = arrstring2[i2];
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            return true;
        }
        return false;
    }

    public net.minecraft.client.m.b b() {
        return this.aG;
    }

    public String c() {
        return this.ak;
    }

    public String d() {
        return this.al;
    }

    private void au() {
        i i2 = new i(this, "Timer hack thread");
        i2.setDaemon(true);
        i2.start();
    }

    public void a(net.minecraft.k.a a2) {
        this.V = true;
        this.W = a2;
    }

    public void b(net.minecraft.k.a a2) {
        File file = new File(net.minecraft.client.r.z().y, "crash-reports");
        File file2 = new File(file, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
        net.minecraft.a.z.a(a2.d());
        if (a2.e() != null) {
            net.minecraft.a.z.a("#@!@# Game crashed! Crash report saved to: #@!@# " + a2.e());
            System.exit(-1);
        } else if (a2.a(file2)) {
            net.minecraft.a.z.a("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
            System.exit(-1);
        } else {
            net.minecraft.a.z.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }

    public boolean e() {
        return this.aD.a() || this.w.aF;
    }

    public void f() {
        ArrayList arrayList = ov.a((Iterable)this.aA);
        if (this.ai != null) {
            this.ai.b();
        }
        for (net.minecraft.client.f.i i2 : this.aC.e()) {
            arrayList.add(i2.c());
        }
        if (this.aC.g() != null) {
            arrayList.add(this.aC.g());
        }
        try {
            this.ay.a(arrayList);
        }
        catch (RuntimeException runtimeException) {
            J.d("Caught error stitching, removing all assigned resourcepacks", (Throwable)runtimeException);
            arrayList.clear();
            arrayList.addAll(this.aA);
            this.aC.a(Collections.emptyList());
            this.ay.a(arrayList);
            this.w.l.clear();
            this.w.m.clear();
            this.w.b();
        }
        this.aD.a(arrayList);
        if (this.i != null) {
            this.i.d();
        }
    }

    private ByteBuffer a(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        int[] arrn = bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null, 0, bufferedImage.getWidth());
        ByteBuffer byteBuffer = ByteBuffer.allocate(4 * arrn.length);
        int[] arrn2 = arrn;
        int n2 = arrn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrn2[i2];
            byteBuffer.putInt(n3 << 8 | n3 >> 24 & 0xFF);
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    private void av() {
        HashSet hashSet = aad.a();
        Collections.addAll(hashSet, dx.b());
        Object object = dx.c();
        if (!hashSet.contains(object) && cb.a() == net.minecraft.u.cc.d) {
            block0: for (DisplayMode displayMode : L) {
                Object object22;
                boolean bl2 = true;
                for (Object object22 : hashSet) {
                    if (((DisplayMode)object22).d() != 32 || ((DisplayMode)object22).b() != displayMode.b() || ((DisplayMode)object22).c() != displayMode.c()) continue;
                    bl2 = false;
                    break;
                }
                if (bl2) continue;
                object22 = hashSet.iterator();
                while (object22.hasNext()) {
                    DisplayMode displayMode2 = (DisplayMode)object22.next();
                    if (displayMode2.d() != 32 || displayMode2.b() != displayMode.b() / 2 || displayMode2.c() != displayMode.c() / 2) continue;
                    object = displayMode2;
                    continue block0;
                }
            }
        }
        dx.a((DisplayMode)object);
        this.e = ((DisplayMode)object).b();
        this.f = ((DisplayMode)object).c();
    }

    private void a(net.minecraft.client.g.a.c c2) {
        net.minecraft.client.m.b b2;
        int n2;
        cv cv2;
        block5: {
            cv2 = new cv(this);
            n2 = cv2.e();
            b2 = new net.minecraft.client.m.b(cv2.a() * n2, cv2.b() * n2, true);
            b2.a(false);
            bd.l(5889);
            bd.C();
            bd.a(0.0, cv2.a(), cv2.b(), 0.0, 1000.0, 3000.0);
            bd.l(5888);
            bd.C();
            bd.c(0.0f, 0.0f, -2000.0f);
            bd.f();
            bd.o();
            bd.i();
            bd.v();
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.aB.a(K);
                    this.aK = c2.a("logo", new net.minecraft.client.g.a.m(ImageIO.read(inputStream)));
                    c2.a(this.aK);
                }
                catch (IOException iOException) {
                    J.b("Unable to load logo: {}", K, iOException);
                    org.apache.commons.b.t.a(inputStream);
                    break block5;
                }
            }
            catch (Throwable throwable) {
                org.apache.commons.b.t.a(inputStream);
                throw throwable;
            }
            org.apache.commons.b.t.a(inputStream);
        }
        net.minecraft.client.g.ci ci2 = net.minecraft.client.g.ci.a();
        net.minecraft.client.g.g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.i);
        g2.b(0.0, (double)this.f, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        g2.b((double)this.e, (double)this.f, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        g2.b((double)this.e, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        g2.b(0.0, 0.0, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
        ci2.b();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = 256;
        int n4 = 256;
        this.a((cv2.a() - 256) / 2, (cv2.b() - 256) / 2, 0, 0, 256, 256, 255, 255, 255, 255);
        bd.f();
        bd.o();
        b2.e();
        b2.c(cv2.a() * n2, cv2.b() * n2);
        bd.d();
        bd.a(516, 0.1f);
        this.i();
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        net.minecraft.client.g.g g2 = net.minecraft.client.g.ci.a().c();
        g2.a(7, net.minecraft.client.g.d.b.i);
        float f2 = 0.00390625f;
        float f3 = 0.00390625f;
        g2.b((double)n2, (double)(n3 + n7), 0.0).a((float)n4 * 0.00390625f, (float)(n5 + n7) * 0.00390625f).b(n8, n9, n10, n11).d();
        g2.b((double)(n2 + n6), (double)(n3 + n7), 0.0).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).b(n8, n9, n10, n11).d();
        g2.b((double)(n2 + n6), (double)n3, 0.0).a((float)(n4 + n6) * 0.00390625f, (float)n5 * 0.00390625f).b(n8, n9, n10, n11).d();
        g2.b((double)n2, (double)n3, 0.0).a((float)n4 * 0.00390625f, (float)n5 * 0.00390625f).b(n8, n9, n10, n11).d();
        net.minecraft.client.g.ci.a().b();
    }

    public net.minecraft.q.a.w g() {
        return this.an;
    }

    public void a(cc cc2) {
        if (this.o != null) {
            this.o.cs_();
        }
        if (cc2 == null && this.h == null) {
            cc2 = new ci();
        } else if (cc2 == null && this.j.bo() <= 0.0f) {
            cc2 = new af(null);
        }
        if (cc2 instanceof ci || cc2 instanceof ai) {
            this.w.at = false;
            this.t.c().a();
        }
        this.o = cc2;
        if (cc2 != null) {
            this.p();
            net.minecraft.client.b.d.b();
            while (org.lwjgl.a.j.h()) {
            }
            while (org.lwjgl.a.g.f()) {
            }
            cv cv2 = new cv(this);
            int n2 = cv2.a();
            int n3 = cv2.b();
            cc2.a(this, n2, n3);
            this.u = false;
        } else {
            this.aI.e();
            this.o();
        }
    }

    private void a(String string) {
        int n2 = bd.I();
        if (n2 != 0) {
            String string2 = org.lwjgl.util.a.c.b(n2);
            J.b("########## GL ERROR ##########");
            J.b("@ {}", string);
            J.b("{}: {}", n2, string2);
        }
    }

    public void h() {
        try {
            J.d("Stopping!");
            try {
                this.a((net.minecraft.client.i.d)null);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.aI.d();
        }
        finally {
            dx.u();
            if (!this.V) {
                System.exit(0);
            }
        }
        System.gc();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void aw() {
        long l2 = System.nanoTime();
        this.D.a("root");
        if (dx.v() && dx.h()) {
            this.n();
        }
        if (this.ae && this.h != null) {
            float f2 = this.g.c;
            this.g.a();
            this.g.c = f2;
        } else {
            this.g.a();
        }
        this.D.a("scheduledExecutables");
        Queue queue = this.aN;
        synchronized (queue) {
            while (!this.aN.isEmpty()) {
                cb.a((FutureTask)this.aN.poll(), J);
            }
        }
        this.D.b();
        long l3 = System.nanoTime();
        this.D.a("tick");
        for (int i2 = 0; i2 < this.g.b; ++i2) {
            this.t();
        }
        this.D.c("preRenderErrors");
        long l4 = System.nanoTime() - l3;
        this.a("Pre render");
        this.D.c("sound");
        this.aI.a(this.j, this.g.c);
        this.D.b();
        this.D.a("render");
        bd.D();
        bd.k(16640);
        this.aG.a(true);
        this.D.a("display");
        bd.v();
        this.D.b();
        if (!this.u) {
            this.D.c("gameRenderer");
            this.q.a(this.g.c, l2);
            this.D.b();
        }
        this.D.b();
        if (this.w.at && this.w.au && !this.w.ar) {
            if (!this.D.a) {
                this.D.a();
            }
            this.D.a = true;
            this.a(l4);
        } else {
            this.D.a = false;
            this.H = System.nanoTime();
        }
        this.s.a();
        this.aG.e();
        bd.E();
        bd.D();
        this.aG.c(this.e, this.f);
        bd.E();
        bd.D();
        this.q.b(this.g.c);
        bd.E();
        this.D.a("root");
        this.i();
        Thread.yield();
        this.a("Post render");
        ++this.aS;
        this.ae = this.E() && this.o != null && this.o.cq_() && !this.ai.a();
        long l5 = System.nanoTime();
        this.B.a(l5 - this.C);
        this.C = l5;
        while (net.minecraft.client.r.I() >= this.aR + 1000L) {
            ao = this.aS;
            Object[] arrobject = new Object[8];
            arrobject[0] = ao;
            arrobject[1] = net.minecraft.client.g.e.q.a;
            arrobject[2] = net.minecraft.client.g.e.q.a == 1 ? "" : "s";
            arrobject[3] = (float)this.w.h == net.minecraft.client.b.e.i.f() ? "inf" : Integer.valueOf(this.w.h);
            arrobject[4] = this.w.u ? " vsync" : "";
            Object object = arrobject[5] = this.w.j ? "" : " fast";
            arrobject[6] = this.w.i == 0 ? "" : (this.w.i == 1 ? " fast-clouds" : " fancy-clouds");
            arrobject[7] = net.minecraft.client.g.ay.f() ? " vbo" : "";
            this.F = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", arrobject);
            net.minecraft.client.g.e.q.a = 0;
            this.aR += 1000L;
            this.aS = 0;
            this.Y.b();
            if (this.Y.d()) continue;
            this.Y.a();
        }
        if (this.l()) {
            this.D.a("fpslimit_wait");
            dx.a(this.k());
            this.D.b();
        }
        this.D.b();
    }

    public void i() {
        this.D.a("display_update");
        dx.n();
        this.D.b();
        this.j();
    }

    protected void j() {
        if (!this.T && dx.z()) {
            int n2 = this.e;
            int n3 = this.f;
            this.e = dx.C();
            this.f = dx.D();
            if (this.e != n2 || this.f != n3) {
                if (this.e <= 0) {
                    this.e = 1;
                }
                if (this.f <= 0) {
                    this.f = 1;
                }
                this.a(this.e, this.f);
            }
        }
    }

    public int k() {
        return this.h == null && this.o != null ? 30 : this.w.h;
    }

    public boolean l() {
        return (float)this.k() < net.minecraft.client.b.e.i.f();
    }

    public void m() {
        try {
            c = new byte[0];
            this.i.j();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            System.gc();
            this.a((net.minecraft.client.i.d)null);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    private void b(int n2) {
        List list = this.D.b(this.aU);
        if (list != null && !list.isEmpty()) {
            net.minecraft.p.c c2 = (net.minecraft.p.c)list.remove(0);
            if (n2 == 0) {
                int n3;
                if (!c2.c.isEmpty() && (n3 = this.aU.lastIndexOf(46)) >= 0) {
                    this.aU = this.aU.substring(0, n3);
                }
            } else if (--n2 < list.size() && !"unspecified".equals(((net.minecraft.p.c)list.get((int)n2)).c)) {
                if (!this.aU.isEmpty()) {
                    this.aU = String.valueOf(this.aU) + ".";
                }
                this.aU = String.valueOf(this.aU) + ((net.minecraft.p.c)list.get((int)n2)).c;
            }
        }
    }

    private void a(long l2) {
        if (this.D.a) {
            int n2;
            int n3;
            Object object;
            List list = this.D.b(this.aU);
            net.minecraft.p.c c2 = (net.minecraft.p.c)list.remove(0);
            bd.k(256);
            bd.l(5889);
            bd.g();
            bd.C();
            bd.a(0.0, this.e, this.f, 0.0, 1000.0, 3000.0);
            bd.l(5888);
            bd.C();
            bd.c(0.0f, 0.0f, -2000.0f);
            bd.d(1.0f);
            bd.w();
            net.minecraft.client.g.ci ci2 = net.minecraft.client.g.ci.a();
            net.minecraft.client.g.g g2 = ci2.c();
            int n4 = 160;
            int n5 = this.e - 160 - 10;
            int n6 = this.f - 320;
            bd.l();
            g2.a(7, net.minecraft.client.g.d.b.f);
            g2.b((double)((float)n5 - 176.0f), (double)((float)n6 - 96.0f - 16.0f), 0.0).b(200, 0, 0, 0).d();
            g2.b((double)((float)n5 - 176.0f), (double)(n6 + 320), 0.0).b(200, 0, 0, 0).d();
            g2.b((double)((float)n5 + 176.0f), (double)(n6 + 320), 0.0).b(200, 0, 0, 0).d();
            g2.b((double)((float)n5 + 176.0f), (double)((float)n6 - 96.0f - 16.0f), 0.0).b(200, 0, 0, 0).d();
            ci2.b();
            bd.k();
            double d2 = 0.0;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                float f2;
                float f3;
                float f4;
                int n7;
                object = (net.minecraft.p.c)list.get(i2);
                n3 = net.minecraft.u.b.n.c(((net.minecraft.p.c)object).a / 4.0) + 1;
                g2.a(6, net.minecraft.client.g.d.b.f);
                n2 = ((net.minecraft.p.c)object).a();
                int n8 = n2 >> 16 & 0xFF;
                int n9 = n2 >> 8 & 0xFF;
                int n10 = n2 & 0xFF;
                g2.b((double)n5, (double)n6, 0.0).b(n8, n9, n10, 255).d();
                for (n7 = n3; n7 >= 0; --n7) {
                    f4 = (float)((d2 + ((net.minecraft.p.c)object).a * (double)n7 / (double)n3) * (Math.PI * 2) / 100.0);
                    f3 = net.minecraft.u.b.n.a(f4) * 160.0f;
                    f2 = net.minecraft.u.b.n.b(f4) * 160.0f * 0.5f;
                    g2.b((double)((float)n5 + f3), (double)((float)n6 - f2), 0.0).b(n8, n9, n10, 255).d();
                }
                ci2.b();
                g2.a(5, net.minecraft.client.g.d.b.f);
                for (n7 = n3; n7 >= 0; --n7) {
                    f4 = (float)((d2 + ((net.minecraft.p.c)object).a * (double)n7 / (double)n3) * (Math.PI * 2) / 100.0);
                    f3 = net.minecraft.u.b.n.a(f4) * 160.0f;
                    f2 = net.minecraft.u.b.n.b(f4) * 160.0f * 0.5f;
                    g2.b((double)((float)n5 + f3), (double)((float)n6 - f2), 0.0).b(n8 >> 1, n9 >> 1, n10 >> 1, 255).d();
                    g2.b((double)((float)n5 + f3), (double)((float)n6 - f2 + 10.0f), 0.0).b(n8 >> 1, n9 >> 1, n10 >> 1, 255).d();
                }
                ci2.b();
                d2 += ((net.minecraft.p.c)object).a;
            }
            DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            bd.v();
            object = "";
            if (!"unspecified".equals(c2.c)) {
                object = String.valueOf(object) + "[0] ";
            }
            object = c2.c.isEmpty() ? String.valueOf(object) + "ROOT " : String.valueOf(object) + c2.c + ' ';
            n3 = 0xFFFFFF;
            this.m.a((String)object, (float)(n5 - 160), (float)(n6 - 80 - 16), 0xFFFFFF);
            object = String.valueOf(decimalFormat.format(c2.b)) + "%";
            this.m.a((String)object, (float)(n5 + 160 - this.m.a((String)object)), (float)(n6 - 80 - 16), 0xFFFFFF);
            for (n2 = 0; n2 < list.size(); ++n2) {
                net.minecraft.p.c c3 = (net.minecraft.p.c)list.get(n2);
                StringBuilder stringBuilder = new StringBuilder();
                if ("unspecified".equals(c3.c)) {
                    stringBuilder.append("[?] ");
                } else {
                    stringBuilder.append("[").append(n2 + 1).append("] ");
                }
                String string = stringBuilder.append(c3.c).toString();
                this.m.a(string, (float)(n5 - 160), (float)(n6 + 80 + n2 * 8 + 20), c3.a());
                string = String.valueOf(decimalFormat.format(c3.a)) + "%";
                this.m.a(string, (float)(n5 + 160 - 50 - this.m.a(string)), (float)(n6 + 80 + n2 * 8 + 20), c3.a());
                string = String.valueOf(decimalFormat.format(c3.b)) + "%";
                this.m.a(string, (float)(n5 + 160 - this.m.a(string)), (float)(n6 + 80 + n2 * 8 + 20), c3.a());
            }
        }
    }

    public void n() {
        if (!net.minecraft.l.k.e) {
            this.E = false;
        }
        if (net.minecraft.client.r.I.w != null && net.minecraft.client.r.I.w.b) {
            this.E = false;
        }
    }

    public void o() {
        if (dx.j() && !this.z) {
            if (!b) {
                net.minecraft.client.b.d.a();
            }
            this.z = true;
            this.x.a();
            this.a((cc)null);
            this.af = 10000;
        }
    }

    public void p() {
        if (this.z) {
            this.z = false;
            this.x.b();
        }
    }

    public void q() {
        if (net.minecraft.l.k.g) {
            return;
        }
        if (this.o == null) {
            this.a(new ar());
            if (this.E() && !this.ai.a()) {
                this.aI.b();
            }
        }
    }

    private void b(boolean bl2) {
        if (!bl2) {
            this.af = 0;
        }
        if (this.af <= 0 && !this.j.B()) {
            if (bl2 && this.v != null && this.v.a == net.minecraft.u.b.p.b) {
                net.minecraft.u.b.b b2 = this.v.a();
                if (this.h.n(b2).d() != net.minecraft.g.a.h.a && this.d.b(b2, this.v.b)) {
                    this.l.a(b2, this.v.b);
                    this.j.a(net.minecraft.u.ah.a);
                }
            } else {
                this.d.c();
            }
        }
    }

    private void ax() {
        if (this.af <= 0) {
            if (this.v == null) {
                J.b("Null returned as 'hitResult', this shouldn't happen!");
                if (this.d.g()) {
                    this.af = 10;
                }
            } else if (!this.j.K()) {
                switch (this.v.a) {
                    case c: {
                        this.d.a(this.j, this.v.d);
                        break;
                    }
                    case b: {
                        net.minecraft.u.b.b b2 = this.v.a();
                        if (this.h.n(b2).d() != net.minecraft.g.a.h.a) {
                            this.d.a(b2, this.v.b);
                            break;
                        }
                    }
                    case a: {
                        if (this.d.g()) {
                            this.af = 10;
                        }
                        this.j.aJ();
                    }
                }
                this.j.a(net.minecraft.u.ah.a);
            }
        }
    }

    private void ay() {
        if (!this.d.m()) {
            this.ap = 4;
            if (!this.j.K()) {
                for (ah ah2 : net.minecraft.u.ah.values()) {
                    Object object;
                    cu cu2 = this.j.c(ah2);
                    if (this.v == null) {
                        J.f("Null returned as 'hitResult', this shouldn't happen!");
                    } else {
                        switch (this.v.a) {
                            case c: {
                                if (this.d.a(this.j, this.v.d, this.v, this.j.c(ah2), ah2) == net.minecraft.u.ab.a) {
                                    return;
                                }
                                if (this.d.a((net.minecraft.w.a.b)this.j, this.v.d, this.j.c(ah2), ah2) != net.minecraft.u.ab.a) break;
                                return;
                            }
                            case b: {
                                object = this.v.a();
                                if (this.h.n((net.minecraft.u.b.b)object).d() == net.minecraft.g.a.h.a) break;
                                int n2 = cu2 != null ? cu2.b : 0;
                                net.minecraft.u.ab ab2 = this.d.a(this.j, this.h, cu2, (net.minecraft.u.b.b)object, this.v.b, this.v.c, ah2);
                                if (ab2 != net.minecraft.u.ab.a) break;
                                this.j.a(ah2);
                                if (cu2 != null) {
                                    if (cu2.b == 0) {
                                        this.j.a(ah2, null);
                                    } else if (cu2.b != n2 || this.d.h()) {
                                        this.q.c.a(ah2);
                                    }
                                }
                                return;
                            }
                        }
                    }
                    object = this.j.c(ah2);
                    if (object == null || this.d.a((net.minecraft.w.a.b)this.j, this.h, (cu)object, ah2) != net.minecraft.u.ab.a) continue;
                    this.q.c.a(ah2);
                    return;
                }
            }
        }
    }

    public void r() {
        try {
            this.w.t = this.T = !this.T;
            if (this.T) {
                this.av();
                this.e = dx.d().b();
                this.f = dx.d().c();
                if (this.e <= 0) {
                    this.e = 1;
                }
                if (this.f <= 0) {
                    this.f = 1;
                }
            } else {
                dx.a(new DisplayMode(this.ag, this.ah));
                this.e = this.ag;
                this.f = this.ah;
                if (this.e <= 0) {
                    this.e = 1;
                }
                if (this.f <= 0) {
                    this.f = 1;
                }
            }
            if (this.o != null) {
                this.a(this.e, this.f);
            } else {
                this.az();
            }
            dx.a(this.T);
            dx.c(this.w.u);
            this.i();
        }
        catch (Exception exception) {
            J.b("Couldn't toggle fullscreen", (Throwable)exception);
        }
    }

    private void a(int n2, int n3) {
        this.e = Math.max(1, n2);
        this.f = Math.max(1, n3);
        if (this.o != null) {
            cv cv2 = new cv(this);
            this.o.b(this, cv2.a(), cv2.b());
        }
        this.p = new s(this);
        this.az();
    }

    private void az() {
        this.aG.a(this.e, this.f);
        if (this.q != null) {
            this.q.a(this.e, this.f);
        }
    }

    public net.minecraft.client.c.g s() {
        return this.aJ;
    }

    public void t() {
        if (this.ap > 0) {
            --this.ap;
        }
        this.D.a("gui");
        if (!this.ae) {
            this.t.b();
        }
        if (this.z && I != null) {
            I.d();
        }
        this.D.b();
        this.q.a(1.0f);
        this.D.a("gameMode");
        if (!this.ae && this.h != null) {
            this.d.e();
        }
        this.D.c("textures");
        if (!this.ae) {
            this.Q.a();
        }
        if (this.o == null && this.j != null) {
            if (this.j.bo() <= 0.0f && !(this.o instanceof af)) {
                this.a((cc)null);
            } else if (this.j.ae() && this.h != null) {
                this.a(new bb());
            }
        } else if (this.o != null && this.o instanceof bb && !this.j.ae()) {
            this.a((cc)null);
        }
        if (this.o != null) {
            this.af = 10000;
        }
        if (this.o != null) {
            try {
                this.o.k();
            }
            catch (Throwable throwable) {
                net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Updating screen events");
                net.minecraft.k.i i2 = a2.a("Affected screen");
                i2.a("Screen name", new net.minecraft.client.d(this));
                throw new bo(a2);
            }
            if (this.o != null) {
                try {
                    this.o.bY_();
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a3 = net.minecraft.k.a.a(throwable, "Ticking screen");
                    net.minecraft.k.i i3 = a3.a("Affected screen");
                    i3.a("Screen name", new j(this));
                    throw new bo(a3);
                }
            }
        }
        if (this.o == null || this.o.t) {
            this.D.c("mouse");
            this.aC();
            if (this.af > 0) {
                --this.af;
            }
            this.D.c("keyboard");
            this.aA();
        }
        if (this.h != null) {
            if (this.j != null) {
                ++this.as;
                if (this.as == 30) {
                    this.as = 0;
                    this.h.h(this.j);
                }
            }
            this.D.c("gameRenderer");
            if (!this.ae) {
                this.q.d();
            }
            this.D.c("levelRenderer");
            if (!this.ae) {
                this.i.i();
            }
            this.D.c("level");
            if (!this.ae) {
                if (this.h.T() > 0) {
                    this.h.e(this.h.T() - 1);
                }
                this.h.q();
            }
        } else if (this.q.a()) {
            this.q.b();
        }
        if (!this.ae) {
            this.aJ.a();
            this.aI.a();
        }
        if (this.h != null) {
            if (!this.ae) {
                this.h.a(this.h.R() != net.minecraft.q.l.a, true);
                try {
                    this.h.a();
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a4 = net.minecraft.k.a.a(throwable, "Exception in world tick");
                    if (this.h == null) {
                        net.minecraft.k.i i4 = a4.a("Affected level");
                        i4.a("Problem", "Level is null!");
                    } else {
                        this.h.a(a4);
                    }
                    throw new bo(a4);
                }
            }
            this.D.c("animateTick");
            if (!this.ae && this.h != null) {
                this.h.a(net.minecraft.u.b.n.c(this.j.aU), net.minecraft.u.b.n.c(this.j.aV), net.minecraft.u.b.n.c(this.j.aW));
            }
            this.D.c("particles");
            if (!this.ae) {
                this.l.a();
            }
        } else if (this.av != null) {
            this.D.c("pendingConnection");
            this.av.a();
        }
        this.D.b();
        this.A = net.minecraft.client.r.I();
    }

    private void aA() {
        while (org.lwjgl.a.g.f()) {
            boolean bl2;
            int n2;
            int n3 = n2 = org.lwjgl.a.g.j() == 0 ? org.lwjgl.a.g.i() + 256 : org.lwjgl.a.g.j();
            if (this.ax > 0L) {
                if (net.minecraft.client.r.I() - this.ax >= 6000L) {
                    throw new bo(new net.minecraft.k.a("Manually triggered debug crash", new Throwable()));
                }
                if (!org.lwjgl.a.g.a(46) || !org.lwjgl.a.g.a(61)) {
                    this.ax = -1L;
                }
            } else if (org.lwjgl.a.g.a(46) && org.lwjgl.a.g.a(61)) {
                this.aT = true;
                this.ax = net.minecraft.client.r.I();
            }
            this.W();
            if (this.o != null) {
                this.o.l();
            }
            if (bl2 = org.lwjgl.a.g.k()) {
                if (n2 == 62 && this.q != null) {
                    this.q.c();
                }
                boolean bl3 = false;
                if (this.o == null) {
                    if (n2 == 1) {
                        this.q();
                    }
                    bl3 = org.lwjgl.a.g.a(61) && this.c(n2);
                    this.aT |= bl3;
                    if (n2 == 59) {
                        boolean bl4 = this.w.ar = !this.w.ar;
                    }
                }
                if (bl3) {
                    net.minecraft.client.b.d.a(n2, false);
                } else {
                    net.minecraft.client.b.d.a(n2, true);
                    net.minecraft.client.b.d.a(n2);
                }
                if (!this.w.au) continue;
                if (n2 == 11) {
                    this.b(0);
                }
                for (int i2 = 0; i2 < 9; ++i2) {
                    if (n2 != 2 + i2) continue;
                    this.b(i2 + 1);
                }
                continue;
            }
            net.minecraft.client.b.d.a(n2, false);
            if (n2 != 61) continue;
            if (this.aT) {
                this.aT = false;
                continue;
            }
            this.w.at = !this.w.at;
            this.w.au = this.w.at && cc.o();
            boolean bl5 = this.w.av = this.w.at && cc.p();
        }
        this.aB();
    }

    private boolean c(int n2) {
        if (n2 == 30) {
            this.i.d();
            this.a("Reloading all chunks", new Object[0]);
            return true;
        }
        if (n2 == 48) {
            boolean bl2 = !this.Z.b();
            this.Z.b(bl2);
            this.a("Hitboxes: {0}", bl2 ? "shown" : "hidden");
            return true;
        }
        if (n2 == 32) {
            if (this.t != null) {
                this.t.c().a();
            }
            return true;
        }
        if (n2 == 33) {
            this.w.a(net.minecraft.client.b.e.f, cc.o() ? -1 : 1);
            this.a("RenderDistance: {0}", this.w.d);
            return true;
        }
        if (n2 == 34) {
            boolean bl3 = this.r.b();
            this.a("Chunk borders: {0}", bl3 ? "shown" : "hidden");
            return true;
        }
        if (n2 == 35) {
            this.w.y = !this.w.y;
            this.a("Advanced tooltips: {0}", this.w.y ? "shown" : "hidden");
            this.w.b();
            return true;
        }
        if (n2 == 49) {
            if (!this.j.a(2, "")) {
                this.a("Unable to switch gamemode, no permission", new Object[0]);
            } else if (this.j.c()) {
                this.j.b("/gamemode spectator");
            } else if (this.j.a()) {
                this.j.b("/gamemode creative");
            }
            return true;
        }
        if (n2 == 25) {
            this.w.z = !this.w.z;
            this.w.b();
            this.a("PauseOnLostFocus: {0}", this.w.z ? "enabled" : "disabled");
            return true;
        }
        if (n2 == 16) {
            this.a("Keybindings:", new Object[0]);
            net.minecraft.client.k.g g2 = this.t.c();
            g2.a(new net.minecraft.u.d.k("F3 + A = Reload chunks"));
            g2.a(new net.minecraft.u.d.k("F3 + B = Show hitboxes"));
            g2.a(new net.minecraft.u.d.k("F3 + D = Clear chat"));
            g2.a(new net.minecraft.u.d.k("F3 + F = Cycle renderdistance (Shift to inverse)"));
            g2.a(new net.minecraft.u.d.k("F3 + G = Show chunk boundaries"));
            g2.a(new net.minecraft.u.d.k("F3 + H = Advanced tooltips"));
            g2.a(new net.minecraft.u.d.k("F3 + N = Cycle creative <-> spectator"));
            g2.a(new net.minecraft.u.d.k("F3 + P = Pause on lost focus"));
            g2.a(new net.minecraft.u.d.k("F3 + Q = Show this list"));
            g2.a(new net.minecraft.u.d.k("F3 + T = Reload resourcepacks"));
            return true;
        }
        if (n2 == 20) {
            this.f();
            this.a("Reloaded resourcepacks", new Object[0]);
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void aB() {
        block24: {
            while (this.w.aj.g()) {
                ++this.w.as;
                if (this.w.as > 2) {
                    this.w.as = 0;
                }
                if (this.w.as == 0) {
                    this.q.a(this.Z());
                } else if (this.w.as == 1) {
                    this.q.a((net.minecraft.w.n)null);
                }
                this.i.l();
            }
            while (this.w.ak.g()) {
                v0 = this.w.ax = this.w.ax == false;
            }
            for (var1_1 = 0; var1_1 < 9; ++var1_1) {
                if (!this.w.an[var1_1].g()) continue;
                if (this.j.a()) {
                    this.t.f().a(var1_1);
                    continue;
                }
                this.j.q.d = var1_1;
            }
            while (this.w.Z.g()) {
                this.v().a(new x(net.minecraft.x.d.a.ah.c));
                if (this.d.j()) {
                    this.j.w();
                    continue;
                }
                if (net.minecraft.l.k.g) {
                    return;
                }
                this.a(new q(this.j));
            }
            while (this.w.aa.g()) {
                if (this.j.a()) continue;
                this.v().a(new net.minecraft.x.d.a.ab(net.minecraft.x.d.a.ae.g, net.minecraft.u.b.b.c, net.minecraft.u.ad.a));
            }
            while (this.w.ab.g()) {
                if (this.j.a()) continue;
                this.j.a(cc.n());
            }
            v1 = var1_1 = this.w.n != net.minecraft.w.a.i.c ? 1 : 0;
            if (var1_1 != 0) {
                while (this.w.af.g()) {
                    this.a(new bh());
                }
                if (this.o == null && this.w.ah.g()) {
                    this.a(new bh("/"));
                }
            }
            if (!this.j.B()) ** GOTO lbl58
            if (!this.w.ac.e()) {
                this.d.c(this.j);
            }
            while (this.w.ad.g()) {
            }
            while (this.w.ac.g()) {
            }
            while (this.w.ae.g()) {
            }
            break block24;
lbl-1000:
            // 1 sources

            {
                this.ax();
lbl58:
                // 2 sources

                ** while (this.w.ad.g())
            }
lbl59:
            // 2 sources

            while (this.w.ac.g()) {
                this.ay();
            }
            while (this.w.ae.g()) {
                this.aD();
            }
        }
        if (this.w.ac.e() && this.ap == 0 && !this.j.B()) {
            this.ay();
        }
        this.b(this.o == null && this.w.ad.e() != false && this.z != false);
    }

    private void aC() {
        while (org.lwjgl.a.j.h()) {
            long l2;
            int n2 = org.lwjgl.a.j.i();
            net.minecraft.client.b.d.a(n2 - 100, org.lwjgl.a.j.j());
            if (org.lwjgl.a.j.j()) {
                if (this.j.a() && n2 == 2) {
                    this.t.f().b();
                } else {
                    net.minecraft.client.b.d.a(n2 - 100);
                }
            }
            if ((l2 = net.minecraft.client.r.I() - this.A) > 200L) continue;
            int n3 = org.lwjgl.a.j.o();
            if (n3 != 0) {
                if (this.j.a()) {
                    int n4 = n3 = n3 < 0 ? -1 : 1;
                    if (this.t.f().a()) {
                        this.t.f().b(-n3);
                    } else {
                        float f2 = net.minecraft.u.b.n.a(this.j.J.a() + (float)n3 * 0.005f, 0.0f, 0.2f);
                        this.j.J.a(f2);
                    }
                } else {
                    this.j.q.f(n3);
                }
            }
            if (this.o == null) {
                if (this.z || !org.lwjgl.a.j.j()) continue;
                this.o();
                continue;
            }
            if (this.o == null) continue;
            this.o.cp_();
        }
    }

    private void a(String string, Object ... arrobject) {
        this.t.c().a(new net.minecraft.u.d.k("").a(new net.minecraft.u.d.k("[Debug]: ").a(new net.minecraft.u.d.c().a(net.minecraft.u.d.o.o).a(true))).a(MessageFormat.format(string, arrobject)));
    }

    public void a(String string, String string2, aj aj2) {
        Object object;
        Object object2;
        this.a((net.minecraft.client.i.d)null);
        System.gc();
        net.minecraft.q.a.u u2 = this.an.a(string, false);
        net.minecraft.q.a.d d2 = u2.c();
        if (d2 == null && aj2 != null) {
            d2 = new net.minecraft.q.a.d(aj2, string);
            u2.a(d2);
        }
        if (aj2 == null) {
            aj2 = new aj(d2);
        }
        try {
            object2 = new com.c.a.e.c(this.am, UUID.randomUUID().toString());
            object = ((com.c.a.e.c)object2).a();
            com.c.a.f f2 = ((com.c.a.e.c)object2).b();
            net.minecraft.c.b.h h2 = new net.minecraft.c.b.h(f2, new File(this.y, net.minecraft.c.a.a.getName()));
            net.minecraft.f.f.a(h2);
            net.minecraft.f.f.a((com.c.a.c.i)object);
            net.minecraft.c.b.h.a(false);
            this.ai = new net.minecraft.c.a.d(this, string, string2, aj2, (com.c.a.e.c)object2, (com.c.a.c.i)object, f2, h2);
            this.ai.P();
            this.aw = true;
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Starting integrated server");
            net.minecraft.k.i i2 = a2.a("Starting integrated server");
            i2.a("Level ID", string);
            i2.a("Level Name", string2);
            throw new bo(a2);
        }
        this.p.a(net.minecraft.client.f.u.a("connect.connecting", new Object[0]));
        while (!this.ai.ax()) {
            object2 = this.ai.v();
            this.p.c("");
            if (object2 == null) {
                this.p.c("");
            }
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        this.a(new db());
        object2 = this.ai.aw().a();
        object = net.minecraft.x.ak.a((SocketAddress)object2);
        ((net.minecraft.x.ak)object).a(new net.minecraft.client.l.q((net.minecraft.x.ak)object, this, null));
        ((net.minecraft.x.ak)object).a(new net.minecraft.x.b.a.a(210, object2.toString(), 0, net.minecraft.x.q.d));
        ((net.minecraft.x.ak)object).a(new net.minecraft.x.e.a.b(this.K().e()));
        this.av = object;
    }

    public void a(net.minecraft.client.i.d d2) {
        this.a(d2, "");
    }

    public void a(net.minecraft.client.i.d d2, String string) {
        Object object;
        if (d2 == null) {
            object = this.v();
            if (object != null) {
                ((net.minecraft.client.l.g)object).a();
            }
            if (this.ai != null && this.ai.W()) {
                this.ai.H();
            }
            this.ai = null;
            this.s.b();
            this.q.i().a();
            this.d = null;
        }
        this.ac = null;
        this.av = null;
        if (this.p != null) {
            this.p.b(string);
            this.p.c("");
        }
        if (d2 == null && this.h != null) {
            this.aC.h();
            this.t.h();
            this.a((net.minecraft.client.i.a)null);
            this.aw = false;
        }
        this.aI.c();
        this.h = d2;
        if (this.i != null) {
            this.i.a(d2);
        }
        if (this.l != null) {
            this.l.a(d2);
        }
        net.minecraft.client.g.c.d.a.a(d2);
        if (d2 != null) {
            if (!this.aw) {
                object = new com.c.a.e.c(this.am, UUID.randomUUID().toString());
                com.c.a.c.i i2 = object.a();
                com.c.a.f f2 = object.b();
                net.minecraft.c.b.h h2 = new net.minecraft.c.b.h(f2, new File(this.y, net.minecraft.c.a.a.getName()));
                net.minecraft.f.f.a(h2);
                net.minecraft.f.f.a(i2);
                net.minecraft.c.b.h.a(false);
            }
            if (this.j == null) {
                this.j = this.d.a(d2, new net.minecraft.r.f());
                this.d.b(this.j);
            }
            this.j.U();
            d2.a(this.j);
            this.j.e = new bm(this.w);
            this.d.a(this.j);
            this.ac = this.j;
        } else {
            this.an.c();
            this.j = null;
        }
        System.gc();
        this.A = 0L;
    }

    public void a(int n2) {
        this.h.m();
        this.h.g();
        int n3 = 0;
        String string = null;
        if (this.j != null) {
            n3 = this.j.ca();
            this.h.b(this.j);
            string = this.j.x();
        }
        this.ac = null;
        d d2 = this.j;
        this.j = this.d.a(this.h, this.j == null ? new net.minecraft.r.f() : this.j.y());
        this.j.cc().a(d2.cc().c());
        this.j.bS = n2;
        this.ac = this.j;
        this.j.U();
        this.j.c(string);
        this.h.a(this.j);
        this.d.b(this.j);
        this.j.e = new bm(this.w);
        this.j.j(n3);
        this.d.a(this.j);
        this.j.d(d2.aG());
        if (this.o instanceof af) {
            this.a((cc)null);
        }
    }

    public final boolean u() {
        return this.au;
    }

    public net.minecraft.client.l.g v() {
        return this.j == null ? null : this.j.d;
    }

    public static boolean w() {
        return R == null || !net.minecraft.client.r.R.w.ar;
    }

    public static boolean x() {
        return R != null && net.minecraft.client.r.R.w.j;
    }

    public static boolean y() {
        return R != null && net.minecraft.client.r.R.w.k != 0;
    }

    private void aD() {
        if (this.v != null && this.v.a != net.minecraft.u.b.p.a) {
            cu cu2;
            Object object;
            Object object2;
            boolean bl2 = this.j.J.d;
            ap ap2 = null;
            if (this.v.a == net.minecraft.u.b.p.b) {
                object2 = this.v.a();
                object = this.h.n((net.minecraft.u.b.b)object2);
                cn cn2 = object.c();
                if (object.d() == net.minecraft.g.a.h.a) {
                    return;
                }
                cu2 = cn2.c(this.h, (net.minecraft.u.b.b)object2, (net.minecraft.g.c.b)object);
                if (cu2 == null) {
                    return;
                }
                if (bl2 && cc.n() && cn2.n()) {
                    ap2 = this.h.q((net.minecraft.u.b.b)object2);
                }
            } else {
                if (this.v.a != net.minecraft.u.b.p.c || this.v.d == null || !bl2) {
                    return;
                }
                if (this.v.d instanceof net.minecraft.w.f.q) {
                    cu2 = new cu(net.minecraft.a.w.ap);
                } else if (this.v.d instanceof net.minecraft.w.p) {
                    cu2 = new cu(net.minecraft.a.w.cx);
                } else if (this.v.d instanceof net.minecraft.w.f.l) {
                    object2 = (net.minecraft.w.f.l)this.v.d;
                    object = ((net.minecraft.w.f.l)object2).p();
                    cu2 = object == null ? new cu(net.minecraft.a.w.bZ) : cu.c((cu)object);
                } else if (this.v.d instanceof net.minecraft.w.f.f) {
                    object2 = (net.minecraft.w.f.f)this.v.d;
                    switch (((net.minecraft.w.f.f)object2).a()) {
                        case c: {
                            object = net.minecraft.a.w.aV;
                            break;
                        }
                        case b: {
                            object = net.minecraft.a.w.aU;
                            break;
                        }
                        case d: {
                            object = net.minecraft.a.w.cr;
                            break;
                        }
                        case f: {
                            object = net.minecraft.a.w.cs;
                            break;
                        }
                        case g: {
                            object = net.minecraft.a.w.cz;
                            break;
                        }
                        default: {
                            object = net.minecraft.a.w.aB;
                        }
                    }
                    cu2 = new cu((cg)object);
                } else if (this.v.d instanceof net.minecraft.w.f.ab) {
                    cu2 = new cu(((net.minecraft.w.f.ab)this.v.d).a());
                } else if (this.v.d instanceof net.minecraft.w.f.j) {
                    cu2 = new cu(net.minecraft.a.w.ct);
                } else if (this.v.d instanceof ad) {
                    cu2 = new cu(net.minecraft.a.w.cP);
                } else {
                    object2 = net.minecraft.w.h.b(this.v.d);
                    if (!net.minecraft.w.h.a.containsKey(object2)) {
                        return;
                    }
                    cu2 = new cu(net.minecraft.a.w.bT);
                    dk.a(cu2, (String)object2);
                }
            }
            if (cu2.a() == null) {
                object2 = "";
                if (this.v.a == net.minecraft.u.b.p.b) {
                    object2 = ((bp)cn.v.b(this.h.n(this.v.a()).c())).toString();
                } else if (this.v.a == net.minecraft.u.b.p.c) {
                    object2 = net.minecraft.w.h.b(this.v.d);
                }
                J.f("Picking on: [{}] {} gave null item", new Object[]{this.v.a, object2});
            } else {
                object2 = this.j.q;
                if (ap2 != null) {
                    this.a(cu2, ap2);
                }
                int n2 = ((net.minecraft.w.a.a)object2).b(cu2);
                if (bl2) {
                    ((net.minecraft.w.a.a)object2).a(cu2);
                    this.d.a(this.j.c(net.minecraft.u.ah.a), 36 + ((net.minecraft.w.a.a)object2).d);
                } else if (n2 != -1) {
                    if (net.minecraft.w.a.a.e(n2)) {
                        ((net.minecraft.w.a.a)object2).d = n2;
                    } else {
                        this.d.a(n2);
                    }
                }
            }
        }
    }

    private cu a(cu cu2, ap ap2) {
        net.minecraft.e.e e2 = ap2.a(new net.minecraft.e.e());
        if (cu2.a() == net.minecraft.a.w.ch && e2.e("Owner")) {
            net.minecraft.e.e e3 = e2.o("Owner");
            net.minecraft.e.e e4 = new net.minecraft.e.e();
            e4.a("SkullOwner", e3);
            cu2.d(e4);
            return cu2;
        }
        cu2.a("BlockEntityTag", e2);
        net.minecraft.e.e e5 = new net.minecraft.e.e();
        net.minecraft.e.q q2 = new net.minecraft.e.q();
        q2.a(new y("(+NBT)"));
        e5.a("Lore", q2);
        cu2.a("display", e5);
        return cu2;
    }

    public net.minecraft.k.a c(net.minecraft.k.a a2) {
        a2.f().a("Launched Version", new c(this));
        a2.f().a("LWJGL", new net.minecraft.client.q(this));
        a2.f().a("OpenGL", new f(this));
        a2.f().a("GL Caps", new b(this));
        a2.f().a("Using VBOs", new p(this));
        a2.f().a("Is Modded", new t(this));
        a2.f().a("Type", new a(this));
        a2.f().a("Resource Packs", new h(this));
        a2.f().a("Current Language", new l(this));
        a2.f().a("Profiler Position", new k(this));
        a2.f().a("CPU", new e(this));
        if (this.h != null) {
            this.h.a(a2);
        }
        return a2;
    }

    public static r z() {
        return R;
    }

    public dl A() {
        return this.a(new u(this));
    }

    @Override
    public void a(net.minecraft.p.d d2) {
        d2.a("fps", ao);
        d2.a("vsync_enabled", this.w.u);
        d2.a("display_frequency", dx.d().e());
        d2.a("display_type", this.T ? "fullscreen" : "windowed");
        d2.a("run_time", (net.minecraft.c.a.aI() - d2.g()) / 60L * 1000L);
        d2.a("current_action", this.aE());
        d2.a("language", this.w.aE == null ? "en_US" : this.w.aE);
        String string = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
        d2.a("endianness", string);
        d2.a("subtitles", this.w.P);
        d2.a("resource_packs", this.aC.e().size());
        int n2 = 0;
        for (net.minecraft.client.f.i i2 : this.aC.e()) {
            d2.a("resource_pack[" + n2++ + "]", i2.d());
        }
        if (this.ai != null && this.ai.aB() != null) {
            d2.a("snooper_partner", this.ai.aB().f());
        }
    }

    private String aE() {
        return this.ai != null ? (this.ai.a() ? "hosting_lan" : "singleplayer") : (this.P != null ? (this.P.d() ? "playing_lan" : "multiplayer") : "out_of_game");
    }

    @Override
    public void b(net.minecraft.p.d d2) {
        d2.b("opengl_version", bd.r(7938));
        d2.b("opengl_vendor", bd.r(7936));
        d2.b("client_brand", net.minecraft.client.m.a());
        d2.b("launched_version", this.ak);
        dt dt2 = GLContext.a();
        d2.b("gl_caps[ARB_arrays_of_arrays]", dt2.S);
        d2.b("gl_caps[ARB_base_instance]", dt2.T);
        d2.b("gl_caps[ARB_blend_func_extended]", dt2.V);
        d2.b("gl_caps[ARB_clear_buffer_object]", dt2.Y);
        d2.b("gl_caps[ARB_color_buffer_float]", dt2.ab);
        d2.b("gl_caps[ARB_compatibility]", dt2.ac);
        d2.b("gl_caps[ARB_compressed_texture_pixel_storage]", dt2.ad);
        d2.b("gl_caps[ARB_compute_shader]", dt2.ae);
        d2.b("gl_caps[ARB_copy_buffer]", dt2.ai);
        d2.b("gl_caps[ARB_copy_image]", dt2.aj);
        d2.b("gl_caps[ARB_depth_buffer_float]", dt2.am);
        d2.b("gl_caps[ARB_compute_shader]", dt2.ae);
        d2.b("gl_caps[ARB_copy_buffer]", dt2.ai);
        d2.b("gl_caps[ARB_copy_image]", dt2.aj);
        d2.b("gl_caps[ARB_depth_buffer_float]", dt2.am);
        d2.b("gl_caps[ARB_depth_clamp]", dt2.an);
        d2.b("gl_caps[ARB_depth_texture]", dt2.ao);
        d2.b("gl_caps[ARB_draw_buffers]", dt2.ar);
        d2.b("gl_caps[ARB_draw_buffers_blend]", dt2.as);
        d2.b("gl_caps[ARB_draw_elements_base_vertex]", dt2.at);
        d2.b("gl_caps[ARB_draw_indirect]", dt2.au);
        d2.b("gl_caps[ARB_draw_instanced]", dt2.av);
        d2.b("gl_caps[ARB_explicit_attrib_location]", dt2.ax);
        d2.b("gl_caps[ARB_explicit_uniform_location]", dt2.ay);
        d2.b("gl_caps[ARB_fragment_layer_viewport]", dt2.aA);
        d2.b("gl_caps[ARB_fragment_program]", dt2.aB);
        d2.b("gl_caps[ARB_fragment_shader]", dt2.aD);
        d2.b("gl_caps[ARB_fragment_program_shadow]", dt2.aC);
        d2.b("gl_caps[ARB_framebuffer_object]", dt2.aF);
        d2.b("gl_caps[ARB_framebuffer_sRGB]", dt2.aG);
        d2.b("gl_caps[ARB_geometry_shader4]", dt2.aH);
        d2.b("gl_caps[ARB_gpu_shader5]", dt2.aK);
        d2.b("gl_caps[ARB_half_float_pixel]", dt2.aM);
        d2.b("gl_caps[ARB_half_float_vertex]", dt2.aN);
        d2.b("gl_caps[ARB_instanced_arrays]", dt2.aQ);
        d2.b("gl_caps[ARB_map_buffer_alignment]", dt2.aU);
        d2.b("gl_caps[ARB_map_buffer_range]", dt2.aV);
        d2.b("gl_caps[ARB_multisample]", dt2.aZ);
        d2.b("gl_caps[ARB_multitexture]", dt2.ba);
        d2.b("gl_caps[ARB_occlusion_query2]", dt2.bc);
        d2.b("gl_caps[ARB_pixel_buffer_object]", dt2.be);
        d2.b("gl_caps[ARB_seamless_cube_map]", dt2.bp);
        d2.b("gl_caps[ARB_shader_objects]", dt2.by);
        d2.b("gl_caps[ARB_shader_stencil_export]", dt2.bA);
        d2.b("gl_caps[ARB_shader_texture_lod]", dt2.bE);
        d2.b("gl_caps[ARB_shadow]", dt2.bJ);
        d2.b("gl_caps[ARB_shadow_ambient]", dt2.bK);
        d2.b("gl_caps[ARB_stencil_texturing]", dt2.bN);
        d2.b("gl_caps[ARB_sync]", dt2.bO);
        d2.b("gl_caps[ARB_tessellation_shader]", dt2.bP);
        d2.b("gl_caps[ARB_texture_border_clamp]", dt2.bR);
        d2.b("gl_caps[ARB_texture_buffer_object]", dt2.bS);
        d2.b("gl_caps[ARB_texture_cube_map]", dt2.bY);
        d2.b("gl_caps[ARB_texture_cube_map_array]", dt2.bZ);
        d2.b("gl_caps[ARB_texture_non_power_of_two]", dt2.cj);
        d2.b("gl_caps[ARB_uniform_buffer_object]", dt2.cA);
        d2.b("gl_caps[ARB_vertex_blend]", dt2.cF);
        d2.b("gl_caps[ARB_vertex_buffer_object]", dt2.cG);
        d2.b("gl_caps[ARB_vertex_program]", dt2.cH);
        d2.b("gl_caps[ARB_vertex_shader]", dt2.cI);
        d2.b("gl_caps[EXT_bindable_uniform]", dt2.dh);
        d2.b("gl_caps[EXT_blend_equation_separate]", dt2.dj);
        d2.b("gl_caps[EXT_blend_func_separate]", dt2.dk);
        d2.b("gl_caps[EXT_blend_minmax]", dt2.dl);
        d2.b("gl_caps[EXT_blend_subtract]", dt2.dm);
        d2.b("gl_caps[EXT_draw_instanced]", dt2.dr);
        d2.b("gl_caps[EXT_framebuffer_multisample]", dt2.dv);
        d2.b("gl_caps[EXT_framebuffer_object]", dt2.dx);
        d2.b("gl_caps[EXT_framebuffer_sRGB]", dt2.dy);
        d2.b("gl_caps[EXT_geometry_shader4]", dt2.dz);
        d2.b("gl_caps[EXT_gpu_program_parameters]", dt2.dA);
        d2.b("gl_caps[EXT_gpu_shader4]", dt2.dB);
        d2.b("gl_caps[EXT_multi_draw_arrays]", dt2.dC);
        d2.b("gl_caps[EXT_packed_depth_stencil]", dt2.dD);
        d2.b("gl_caps[EXT_paletted_texture]", dt2.dG);
        d2.b("gl_caps[EXT_rescale_normal]", dt2.dK);
        d2.b("gl_caps[EXT_separate_shader_objects]", dt2.dM);
        d2.b("gl_caps[EXT_shader_image_load_store]", dt2.dO);
        d2.b("gl_caps[EXT_shadow_funcs]", dt2.dP);
        d2.b("gl_caps[EXT_shared_texture_palette]", dt2.dQ);
        d2.b("gl_caps[EXT_stencil_clear_tag]", dt2.dR);
        d2.b("gl_caps[EXT_stencil_two_side]", dt2.dS);
        d2.b("gl_caps[EXT_stencil_wrap]", dt2.dT);
        d2.b("gl_caps[EXT_texture_3d]", dt2.dU);
        d2.b("gl_caps[EXT_texture_array]", dt2.dV);
        d2.b("gl_caps[EXT_texture_buffer_object]", dt2.dW);
        d2.b("gl_caps[EXT_texture_integer]", dt2.ed);
        d2.b("gl_caps[EXT_texture_lod_bias]", dt2.ee);
        d2.b("gl_caps[EXT_texture_sRGB]", dt2.eh);
        d2.b("gl_caps[EXT_vertex_shader]", dt2.eq);
        d2.b("gl_caps[EXT_vertex_weighting]", dt2.er);
        d2.b("gl_caps[gl_max_vertex_uniforms]", bd.s(35658));
        bd.I();
        d2.b("gl_caps[gl_max_fragment_uniforms]", bd.s(35657));
        bd.I();
        d2.b("gl_caps[gl_max_vertex_attribs]", bd.s(34921));
        bd.I();
        d2.b("gl_caps[gl_max_vertex_texture_image_units]", bd.s(35660));
        bd.I();
        d2.b("gl_caps[gl_max_texture_image_units]", bd.s(34930));
        bd.I();
        d2.b("gl_caps[gl_max_array_texture_layers]", bd.s(35071));
        bd.I();
        d2.b("gl_max_texture_size", net.minecraft.client.r.B());
        com.c.a.e e2 = this.ad.e();
        if (e2 != null && e2.a() != null) {
            d2.b("uuid", com.a.a.g.ak.e().a(e2.a().toString().getBytes(org.apache.commons.b.b.a)).toString());
        }
    }

    public static int B() {
        for (int i2 = 16384; i2 > 0; i2 >>= 1) {
            bd.a(32868, 0, 6408, i2, i2, 0, 6408, 5121, null);
            int n2 = bd.c(32868, 0, 4096);
            if (n2 == 0) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public boolean aj() {
        return this.w.s;
    }

    public void a(net.minecraft.client.i.a a2) {
        this.P = a2;
    }

    public net.minecraft.client.i.a C() {
        return this.P;
    }

    public boolean D() {
        return this.aw;
    }

    public boolean E() {
        return this.aw && this.ai != null;
    }

    public net.minecraft.c.a.d F() {
        return this.ai;
    }

    public static void G() {
        net.minecraft.c.a.d d2;
        if (R != null && (d2 = R.F()) != null) {
            d2.F();
        }
    }

    public net.minecraft.p.d H() {
        return this.Y;
    }

    public static long I() {
        return org.lwjgl.ab.e() * 1000L / org.lwjgl.ab.d();
    }

    public boolean J() {
        return this.T;
    }

    public net.minecraft.u.bs K() {
        return this.ad;
    }

    public com.c.a.d.b L() {
        if (this.O.o()) {
            com.c.a.e e2 = this.X().b(this.ad.e(), false);
            this.O.a(e2.c());
        }
        return this.O;
    }

    public Proxy M() {
        return this.am;
    }

    public net.minecraft.client.g.a.c N() {
        return this.Q;
    }

    public net.minecraft.client.f.s O() {
        return this.ay;
    }

    public g P() {
        return this.aC;
    }

    public net.minecraft.client.f.af Q() {
        return this.aD;
    }

    public net.minecraft.client.g.a.f R() {
        return this.aH;
    }

    public boolean S() {
        return this.at;
    }

    public boolean T() {
        return this.ae;
    }

    public net.minecraft.client.c.h U() {
        return this.aI;
    }

    public ac V() {
        return this.j != null ? (this.j.aQ.q instanceof net.minecraft.q.af ? net.minecraft.client.c.ac.e : (this.j.aQ.q instanceof net.minecraft.q.m ? (this.t.i().c() ? net.minecraft.client.c.ac.f : net.minecraft.client.c.ac.g) : (this.j.J.d && this.j.J.c ? net.minecraft.client.c.ac.c : net.minecraft.client.c.ac.b))) : net.minecraft.client.c.ac.a;
    }

    public void W() {
        int n2;
        int n3 = n2 = org.lwjgl.a.g.j() == 0 ? org.lwjgl.a.g.i() + 256 : org.lwjgl.a.g.j();
        if (!(n2 == 0 || org.lwjgl.a.g.m() || this.o instanceof ab && ((ab)this.o).c > net.minecraft.client.r.I() - 20L || !org.lwjgl.a.g.k())) {
            if (n2 == this.w.al.j()) {
                this.r();
            } else if (n2 == this.w.ai.j()) {
                this.t.c().a(br.a(this.y, this.e, this.f, this.aG));
            }
        }
    }

    public com.c.a.c.i X() {
        return this.aL;
    }

    public net.minecraft.client.f.e Y() {
        return this.aM;
    }

    public net.minecraft.w.n Z() {
        return this.ac;
    }

    public void a(net.minecraft.w.n n2) {
        this.ac = n2;
        this.q.a(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dl a(Callable callable) {
        org.apache.commons.c.ao.a(callable);
        if (this.aU()) {
            try {
                return com.a.a.n.a.ci.a(callable.call());
            }
            catch (Exception exception) {
                return com.a.a.n.a.ci.a(exception);
            }
        }
        dm dm2 = dm.a(callable);
        Queue queue = this.aN;
        synchronized (queue) {
            this.aN.add(dm2);
            return dm2;
        }
    }

    @Override
    public dl a(Runnable runnable) {
        org.apache.commons.c.ao.a(runnable);
        return this.a(Executors.callable(runnable));
    }

    @Override
    public boolean aU() {
        return Thread.currentThread() == this.aO;
    }

    public net.minecraft.client.g.j aa() {
        return this.aQ;
    }

    public net.minecraft.client.g.i.f ab() {
        return this.Z;
    }

    public net.minecraft.client.g.t ac() {
        return this.aa;
    }

    public bs ad() {
        return this.ab;
    }

    public static int ae() {
        return ao;
    }

    public an af() {
        return this.B;
    }

    public boolean ag() {
        return this.X;
    }

    public void a(boolean bl2) {
        this.X = bl2;
    }

    public net.minecraft.u.a.a ah() {
        return this.S;
    }

    public float ai() {
        return this.g.c;
    }

    public net.minecraft.client.g.h.g ak() {
        return this.aE;
    }

    public boolean al() {
        return this.j != null && this.j.aG() || this.w.w;
    }

    static /* synthetic */ String a(r r2) {
        return r2.ak;
    }

    static /* synthetic */ net.minecraft.client.f.af b(r r2) {
        return r2.aD;
    }
}

