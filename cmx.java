/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.dg;
import com.a.a.d.aad;
import com.a.a.d.lo;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.b.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.a.j;
import org.lwjgl.opengl.dx;

public class cmx {
    private static final d aG = org.apache.logging.log4j.c.c();
    private static final k aH = new k();
    private static final Type aI = new chc();
    public static final dg a = dg.a(':');
    private static final String[] aJ = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
    private static final String[] aK = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
    private static final String[] aL = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
    private static final String[] aM = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
    private static final String[] aN = new String[]{"options.off", "options.attack.crosshair", "options.attack.hotbar"};
    public float b = 0.5f;
    public boolean c;
    public int d = -1;
    public boolean e = true;
    public boolean f;
    public boolean g = true;
    public int h = 120;
    public int i = 2;
    public boolean j = true;
    public int k = 2;
    public List l = ov.a();
    public List m = ov.a();
    public bgi n = bgi.a;
    public boolean o = true;
    public boolean p = true;
    public boolean q = true;
    public float r = 1.0f;
    public boolean s = true;
    public boolean t;
    public boolean u = true;
    public boolean v = true;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z = true;
    private final Set aO = aad.a((Object[])bzk.values());
    public boolean A;
    public s B = s.b;
    public int C;
    public int D;
    public boolean E = true;
    public float F = 1.0f;
    public float G = 1.0f;
    public float H = 0.44366196f;
    public float I = 1.0f;
    public boolean J = true;
    public int K = 4;
    private final Map aP = sz.a(csg.class);
    public boolean L = true;
    public boolean M = true;
    public int N = 1;
    public boolean O;
    public boolean P;
    public boolean Q = true;
    public boolean R = true;
    public cke S = new cke("key.forward", 17, "key.categories.movement");
    public cke T = new cke("key.left", 30, "key.categories.movement");
    public cke U = new cke("key.back", 31, "key.categories.movement");
    public cke V = new cke("key.right", 32, "key.categories.movement");
    public cke W = new cke("key.jump", 57, "key.categories.movement");
    public cke X = new cke("key.sneak", 42, "key.categories.movement");
    public cke Y = new cke("key.sprint", 29, "key.categories.movement");
    public cke Z = new cke("key.inventory", 18, "key.categories.inventory");
    public cke aa = new cke("key.swapHands", 33, "key.categories.inventory");
    public cke ab = new cke("key.drop", 16, "key.categories.inventory");
    public cke ac = new cke("key.use", -99, "key.categories.gameplay");
    public cke ad = new cke("key.attack", -100, "key.categories.gameplay");
    public cke ae = new cke("key.pickItem", -98, "key.categories.gameplay");
    public cke af = new cke("key.chat", 20, "key.categories.multiplayer");
    public cke ag = new cke("key.playerlist", 15, "key.categories.multiplayer");
    public cke ah = new cke("key.command", 53, "key.categories.multiplayer");
    public cke ai = new cke("key.screenshot", 60, "key.categories.misc");
    public cke aj = new cke("key.togglePerspective", 63, "key.categories.misc");
    public cke ak = new cke("key.smoothCamera", 0, "key.categories.misc");
    public cke al = new cke("key.fullscreen", 87, "key.categories.misc");
    public cke am = new cke("key.spectatorOutlines", 0, "key.categories.misc");
    public cke[] an = new cke[]{new cke("key.hotbar.1", 2, "key.categories.inventory"), new cke("key.hotbar.2", 3, "key.categories.inventory"), new cke("key.hotbar.3", 4, "key.categories.inventory"), new cke("key.hotbar.4", 5, "key.categories.inventory"), new cke("key.hotbar.5", 6, "key.categories.inventory"), new cke("key.hotbar.6", 7, "key.categories.inventory"), new cke("key.hotbar.7", 8, "key.categories.inventory"), new cke("key.hotbar.8", 9, "key.categories.inventory"), new cke("key.hotbar.9", 10, "key.categories.inventory")};
    public cke[] ao = (cke[])org.apache.commons.c.c.b((Object[])new cke[]{this.ad, this.ac, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.ab, this.Z, this.af, this.ag, this.ae, this.ah, this.ai, this.aj, this.ak, this.al, this.am, this.aa}, (Object[])this.an);
    protected bxy ap;
    private File aQ;
    public ct aq = ct.c;
    public boolean ar;
    public int as;
    public boolean at;
    public boolean au;
    public boolean av;
    public String aw = "";
    public boolean ax;
    public boolean ay;
    public float az = 70.0f;
    public float aA;
    public float aB;
    public int aC;
    public int aD;
    public String aE = "en_US";
    public boolean aF;

    public cmx(bxy bxy2, File file) {
        this.ap = bxy2;
        this.aQ = new File(file, "options.txt");
        if (bxy2.U() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
            oi.f.a(32.0f);
        } else {
            oi.f.a(16.0f);
        }
        this.d = bxy2.U() ? 12 : 8;
        this.a();
    }

    public cmx() {
    }

    public static String a(int n2) {
        if (n2 < 0) {
            return bf.a("key.mouseButton", n2 + 101);
        }
        if (n2 < 256) {
            return org.lwjgl.a.g.b(n2);
        }
        return String.format("%c", Character.valueOf((char)(n2 - 256))).toUpperCase();
    }

    public static boolean a(cke cke2) {
        if (cke2.j() == 0) {
            return false;
        }
        if (cke2.j() < 0) {
            return org.lwjgl.a.j.a(cke2.j() + 100);
        }
        return org.lwjgl.a.g.a(cke2.j());
    }

    public void a(cke cke2, int n2) {
        cke2.b(n2);
        this.b();
    }

    public void a(oi oi2, float f2) {
        if (oi2 == oi.b) {
            this.b = f2;
        }
        if (oi2 == oi.c) {
            this.az = f2;
        }
        if (oi2 == oi.d) {
            this.aA = f2;
        }
        if (oi2 == oi.i) {
            this.h = (int)f2;
        }
        if (oi2 == oi.s) {
            this.r = f2;
            this.ap.r.c().b();
        }
        if (oi2 == oi.B) {
            this.I = f2;
            this.ap.r.c().b();
        }
        if (oi2 == oi.C) {
            this.H = f2;
            this.ap.r.c().b();
        }
        if (oi2 == oi.A) {
            this.G = f2;
            this.ap.r.c().b();
        }
        if (oi2 == oi.z) {
            this.F = f2;
            this.ap.r.c().b();
        }
        if (oi2 == oi.D) {
            int n2 = this.K;
            this.K = (int)f2;
            if ((float)n2 != f2) {
                this.ap.T().a(this.K);
                this.ap.P().a(dam.g);
                this.ap.T().a(false, this.K > 0);
                this.ap.C();
            }
        }
        if (oi2 == oi.f) {
            this.d = (int)f2;
            this.ap.g.l();
        }
    }

    public void a(oi oi2, int n2) {
        if (oi2 == oi.f) {
            this.a(oi2, cmk.a((float)(this.d + n2), oi2.e(), oi2.f()));
        }
        if (oi2 == oi.H) {
            this.B = this.B.a();
        }
        if (oi2 == oi.a) {
            boolean bl2 = this.c = !this.c;
        }
        if (oi2 == oi.n) {
            this.aC = this.aC + n2 & 3;
        }
        if (oi2 == oi.o) {
            this.aD = (this.aD + n2) % 3;
        }
        if (oi2 == oi.g) {
            boolean bl3 = this.e = !this.e;
        }
        if (oi2 == oi.k) {
            this.i = (this.i + n2) % 3;
        }
        if (oi2 == oi.E) {
            this.aF = !this.aF;
            this.ap.k.a(this.ap.S().a() || this.aF);
        }
        if (oi2 == oi.j) {
            boolean bl4 = this.g = !this.g;
        }
        if (oi2 == oi.h) {
            this.f = !this.f;
            this.ap.h();
        }
        if (oi2 == oi.l) {
            this.j = !this.j;
            this.ap.g.d();
        }
        if (oi2 == oi.m) {
            this.k = (this.k + n2) % 3;
            this.ap.g.d();
        }
        if (oi2 == oi.p) {
            this.n = bgi.a((this.n.a() + n2) % 3);
        }
        if (oi2 == oi.q) {
            boolean bl5 = this.o = !this.o;
        }
        if (oi2 == oi.r) {
            boolean bl6 = this.p = !this.p;
        }
        if (oi2 == oi.t) {
            boolean bl7 = this.q = !this.q;
        }
        if (oi2 == oi.u) {
            boolean bl8 = this.s = !this.s;
        }
        if (oi2 == oi.y) {
            boolean bl9 = this.A = !this.A;
        }
        if (oi2 == oi.v) {
            boolean bl10 = this.t = !this.t;
            if (this.ap.L() != this.t) {
                this.ap.t();
            }
        }
        if (oi2 == oi.w) {
            this.u = !this.u;
            dx.c(this.u);
        }
        if (oi2 == oi.x) {
            this.v = !this.v;
            this.ap.g.d();
        }
        if (oi2 == oi.F) {
            boolean bl11 = this.w = !this.w;
        }
        if (oi2 == oi.G) {
            boolean bl12 = this.M = !this.M;
        }
        if (oi2 == oi.I) {
            this.N = (this.N + n2) % 3;
        }
        if (oi2 == oi.K) {
            boolean bl13 = this.P = !this.P;
        }
        if (oi2 == oi.L) {
            boolean bl14 = this.Q = !this.Q;
        }
        if (oi2 == oi.M) {
            this.R = !this.R;
        }
        this.b();
    }

    public float a(oi oi2) {
        if (oi2 == oi.c) {
            return this.az;
        }
        if (oi2 == oi.d) {
            return this.aA;
        }
        if (oi2 == oi.e) {
            return this.aB;
        }
        if (oi2 == oi.b) {
            return this.b;
        }
        if (oi2 == oi.s) {
            return this.r;
        }
        if (oi2 == oi.B) {
            return this.I;
        }
        if (oi2 == oi.C) {
            return this.H;
        }
        if (oi2 == oi.z) {
            return this.F;
        }
        if (oi2 == oi.A) {
            return this.G;
        }
        if (oi2 == oi.i) {
            return this.h;
        }
        if (oi2 == oi.D) {
            return this.K;
        }
        if (oi2 == oi.f) {
            return this.d;
        }
        return 0.0f;
    }

    public boolean b(oi oi2) {
        switch (oi2) {
            case a: {
                return this.c;
            }
            case g: {
                return this.e;
            }
            case h: {
                return this.f;
            }
            case j: {
                return this.g;
            }
            case q: {
                return this.o;
            }
            case r: {
                return this.p;
            }
            case t: {
                return this.q;
            }
            case u: {
                return this.s;
            }
            case v: {
                return this.t;
            }
            case w: {
                return this.u;
            }
            case x: {
                return this.v;
            }
            case y: {
                return this.A;
            }
            case E: {
                return this.aF;
            }
            case F: {
                return this.w;
            }
            case G: {
                return this.M;
            }
            case K: {
                return this.P;
            }
            case L: {
                return this.Q;
            }
            case J: {
                return this.O;
            }
            case M: {
                return this.R;
            }
        }
        return false;
    }

    private static String a(String[] arrstring, int n2) {
        if (n2 < 0 || n2 >= arrstring.length) {
            n2 = 0;
        }
        return bf.a(arrstring[n2], new Object[0]);
    }

    public String c(oi oi2) {
        String string = bf.a(oi2.d(), new Object[0]) + ": ";
        if (oi2.a()) {
            float f2 = this.a(oi2);
            float f3 = oi2.b(f2);
            if (oi2 == oi.b) {
                if (f3 == 0.0f) {
                    return string + bf.a("options.sensitivity.min", new Object[0]);
                }
                if (f3 == 1.0f) {
                    return string + bf.a("options.sensitivity.max", new Object[0]);
                }
                return string + (int)(f3 * 200.0f) + "%";
            }
            if (oi2 == oi.c) {
                if (f2 == 70.0f) {
                    return string + bf.a("options.fov.min", new Object[0]);
                }
                if (f2 == 110.0f) {
                    return string + bf.a("options.fov.max", new Object[0]);
                }
                return string + (int)f2;
            }
            if (oi2 == oi.i) {
                if (f2 == oi.a(oi2)) {
                    return string + bf.a("options.framerateLimit.max", new Object[0]);
                }
                return string + (int)f2 + " fps";
            }
            if (oi2 == oi.k) {
                if (f2 == oi.b(oi2)) {
                    return string + bf.a("options.cloudHeight.min", new Object[0]);
                }
                return string + ((int)f2 + 128);
            }
            if (oi2 == oi.d) {
                if (f3 == 0.0f) {
                    return string + bf.a("options.gamma.min", new Object[0]);
                }
                if (f3 == 1.0f) {
                    return string + bf.a("options.gamma.max", new Object[0]);
                }
                return string + "+" + (int)(f3 * 100.0f) + "%";
            }
            if (oi2 == oi.e) {
                return string + (int)(f3 * 400.0f) + "%";
            }
            if (oi2 == oi.s) {
                return string + (int)(f3 * 90.0f + 10.0f) + "%";
            }
            if (oi2 == oi.C) {
                return string + crd.b(f3) + "px";
            }
            if (oi2 == oi.B) {
                return string + crd.b(f3) + "px";
            }
            if (oi2 == oi.A) {
                return string + crd.a(f3) + "px";
            }
            if (oi2 == oi.f) {
                return string + (int)f2 + " chunks";
            }
            if (oi2 == oi.D) {
                if (f2 == 0.0f) {
                    return string + bf.a("options.off", new Object[0]);
                }
                return string + (int)f2;
            }
            if (f3 == 0.0f) {
                return string + bf.a("options.off", new Object[0]);
            }
            return string + (int)(f3 * 100.0f) + "%";
        }
        if (oi2.b()) {
            boolean bl2 = this.b(oi2);
            if (bl2) {
                return string + bf.a("options.on", new Object[0]);
            }
            return string + bf.a("options.off", new Object[0]);
        }
        if (oi2 == oi.H) {
            return string + (Object)((Object)this.B);
        }
        if (oi2 == oi.n) {
            return string + cmx.a(aJ, this.aC);
        }
        if (oi2 == oi.p) {
            return string + bf.a(this.n.b(), new Object[0]);
        }
        if (oi2 == oi.o) {
            return string + cmx.a(aK, this.aD);
        }
        if (oi2 == oi.m) {
            return string + cmx.a(aL, this.k);
        }
        if (oi2 == oi.k) {
            return string + cmx.a(aM, this.i);
        }
        if (oi2 == oi.l) {
            if (this.j) {
                return string + bf.a("options.graphics.fancy", new Object[0]);
            }
            String string2 = "options.graphics.fast";
            return string + bf.a("options.graphics.fast", new Object[0]);
        }
        if (oi2 == oi.I) {
            return string + cmx.a(aN, this.N);
        }
        return string;
    }

    public void a() {
        try {
            Object object;
            if (!this.aQ.exists()) {
                return;
            }
            this.aP.clear();
            List list = org.apache.commons.b.t.f(new FileInputStream(this.aQ));
            bvp bvp2 = new bvp();
            for (String string : list) {
                try {
                    object = a.a().b(2).a(string).iterator();
                    bvp2.a((String)object.next(), (String)object.next());
                }
                catch (Exception exception) {
                    aG.f("Skipping bad option: {}", string);
                }
            }
            bvp2 = this.a(bvp2);
            for (String string : bvp2.b()) {
                object = bvp2.l(string);
                try {
                    if ("mouseSensitivity".equals(string)) {
                        this.b = this.a((String)object);
                    }
                    if ("fov".equals(string)) {
                        this.az = this.a((String)object) * 40.0f + 70.0f;
                    }
                    if ("gamma".equals(string)) {
                        this.aA = this.a((String)object);
                    }
                    if ("saturation".equals(string)) {
                        this.aB = this.a((String)object);
                    }
                    if ("invertYMouse".equals(string)) {
                        this.c = "true".equals(object);
                    }
                    if ("renderDistance".equals(string)) {
                        this.d = Integer.parseInt((String)object);
                    }
                    if ("guiScale".equals(string)) {
                        this.aC = Integer.parseInt((String)object);
                    }
                    if ("particles".equals(string)) {
                        this.aD = Integer.parseInt((String)object);
                    }
                    if ("bobView".equals(string)) {
                        this.e = "true".equals(object);
                    }
                    if ("anaglyph3d".equals(string)) {
                        this.f = "true".equals(object);
                    }
                    if ("maxFps".equals(string)) {
                        this.h = Integer.parseInt((String)object);
                    }
                    if ("fboEnable".equals(string)) {
                        this.g = "true".equals(object);
                    }
                    if ("difficulty".equals(string)) {
                        this.aq = ct.a(Integer.parseInt((String)object));
                    }
                    if ("fancyGraphics".equals(string)) {
                        this.j = "true".equals(object);
                    }
                    if ("ao".equals(string)) {
                        this.k = "true".equals(object) ? 2 : ("false".equals(object) ? 0 : Integer.parseInt((String)object));
                    }
                    if ("renderClouds".equals(string)) {
                        if ("true".equals(object)) {
                            this.i = 2;
                        } else if ("false".equals(object)) {
                            this.i = 0;
                        } else if ("fast".equals(object)) {
                            this.i = 1;
                        }
                    }
                    if ("attackIndicator".equals(string)) {
                        if ("0".equals(object)) {
                            this.N = 0;
                        } else if ("1".equals(object)) {
                            this.N = 1;
                        } else if ("2".equals(object)) {
                            this.N = 2;
                        }
                    }
                    if ("resourcePacks".equals(string)) {
                        this.l = (List)aH.a((String)object, aI);
                        if (this.l == null) {
                            this.l = ov.a();
                        }
                    }
                    if ("incompatibleResourcePacks".equals(string)) {
                        this.m = (List)aH.a((String)object, aI);
                        if (this.m == null) {
                            this.m = ov.a();
                        }
                    }
                    if ("lastServer".equals(string)) {
                        this.aw = object;
                    }
                    if ("lang".equals(string)) {
                        this.aE = object;
                    }
                    if ("chatVisibility".equals(string)) {
                        this.n = bgi.a(Integer.parseInt((String)object));
                    }
                    if ("chatColors".equals(string)) {
                        this.o = "true".equals(object);
                    }
                    if ("chatLinks".equals(string)) {
                        this.p = "true".equals(object);
                    }
                    if ("chatLinksPrompt".equals(string)) {
                        this.q = "true".equals(object);
                    }
                    if ("chatOpacity".equals(string)) {
                        this.r = this.a((String)object);
                    }
                    if ("snooperEnabled".equals(string)) {
                        this.s = "true".equals(object);
                    }
                    if ("fullscreen".equals(string)) {
                        this.t = "true".equals(object);
                    }
                    if ("enableVsync".equals(string)) {
                        this.u = "true".equals(object);
                    }
                    if ("useVbo".equals(string)) {
                        this.v = "true".equals(object);
                    }
                    if ("hideServerAddress".equals(string)) {
                        this.x = "true".equals(object);
                    }
                    if ("advancedItemTooltips".equals(string)) {
                        this.y = "true".equals(object);
                    }
                    if ("pauseOnLostFocus".equals(string)) {
                        this.z = "true".equals(object);
                    }
                    if ("touchscreen".equals(string)) {
                        this.A = "true".equals(object);
                    }
                    if ("overrideHeight".equals(string)) {
                        this.D = Integer.parseInt((String)object);
                    }
                    if ("overrideWidth".equals(string)) {
                        this.C = Integer.parseInt((String)object);
                    }
                    if ("heldItemTooltips".equals(string)) {
                        this.E = "true".equals(object);
                    }
                    if ("chatHeightFocused".equals(string)) {
                        this.I = this.a((String)object);
                    }
                    if ("chatHeightUnfocused".equals(string)) {
                        this.H = this.a((String)object);
                    }
                    if ("chatScale".equals(string)) {
                        this.F = this.a((String)object);
                    }
                    if ("chatWidth".equals(string)) {
                        this.G = this.a((String)object);
                    }
                    if ("showInventoryAchievementHint".equals(string)) {
                        this.J = "true".equals(object);
                    }
                    if ("mipmapLevels".equals(string)) {
                        this.K = Integer.parseInt((String)object);
                    }
                    if ("forceUnicodeFont".equals(string)) {
                        this.aF = "true".equals(object);
                    }
                    if ("reducedDebugInfo".equals(string)) {
                        this.w = "true".equals(object);
                    }
                    if ("useNativeTransport".equals(string)) {
                        this.L = "true".equals(object);
                    }
                    if ("entityShadows".equals(string)) {
                        this.M = "true".equals(object);
                    }
                    if ("mainHand".equals(string)) {
                        s s2 = this.B = "left".equals(object) ? s.a : s.b;
                    }
                    if ("showSubtitles".equals(string)) {
                        this.P = "true".equals(object);
                    }
                    if ("realmsNotifications".equals(string)) {
                        this.Q = "true".equals(object);
                    }
                    if ("enableWeakAttacks".equals(string)) {
                        this.O = "true".equals(object);
                    }
                    if ("autoJump".equals(string)) {
                        this.R = "true".equals(object);
                    }
                    for (cke cke2 : this.ao) {
                        if (!string.equals("key_" + cke2.h())) continue;
                        cke2.b(Integer.parseInt((String)object));
                    }
                    for (csg csg2 : csg.values()) {
                        if (!string.equals("soundCategory_" + csg2.a())) continue;
                        this.aP.put(csg2, Float.valueOf(this.a((String)object)));
                    }
                    for (bzk bzk2 : bzk.values()) {
                        if (!string.equals("modelPart_" + bzk2.c())) continue;
                        this.a(bzk2, "true".equals(object));
                    }
                }
                catch (Exception exception) {
                    aG.f("Skipping bad option: {}:{}", string, object);
                }
            }
            cke.c();
        }
        catch (Exception exception) {
            aG.b("Failed to load options", (Throwable)exception);
        }
    }

    private bvp a(bvp bvp2) {
        int n2 = 0;
        try {
            n2 = Integer.parseInt(bvp2.l("version"));
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        return this.ap.aj().a(bst.g, bvp2, n2);
    }

    private float a(String string) {
        if ("true".equals(string)) {
            return 1.0f;
        }
        if ("false".equals(string)) {
            return 0.0f;
        }
        return Float.parseFloat(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(this.aQ));
            printWriter.println("version:510");
            printWriter.println("invertYMouse:" + this.c);
            printWriter.println("mouseSensitivity:" + this.b);
            printWriter.println("fov:" + (this.az - 70.0f) / 40.0f);
            printWriter.println("gamma:" + this.aA);
            printWriter.println("saturation:" + this.aB);
            printWriter.println("renderDistance:" + this.d);
            printWriter.println("guiScale:" + this.aC);
            printWriter.println("particles:" + this.aD);
            printWriter.println("bobView:" + this.e);
            printWriter.println("anaglyph3d:" + this.f);
            printWriter.println("maxFps:" + this.h);
            printWriter.println("fboEnable:" + this.g);
            printWriter.println("difficulty:" + this.aq.a());
            printWriter.println("fancyGraphics:" + this.j);
            printWriter.println("ao:" + this.k);
            switch (this.i) {
                case 2: {
                    printWriter.println("renderClouds:true");
                    break;
                }
                case 1: {
                    printWriter.println("renderClouds:fast");
                    break;
                }
                case 0: {
                    printWriter.println("renderClouds:false");
                }
            }
            printWriter.println("resourcePacks:" + aH.b(this.l));
            printWriter.println("incompatibleResourcePacks:" + aH.b(this.m));
            printWriter.println("lastServer:" + this.aw);
            printWriter.println("lang:" + this.aE);
            printWriter.println("chatVisibility:" + this.n.a());
            printWriter.println("chatColors:" + this.o);
            printWriter.println("chatLinks:" + this.p);
            printWriter.println("chatLinksPrompt:" + this.q);
            printWriter.println("chatOpacity:" + this.r);
            printWriter.println("snooperEnabled:" + this.s);
            printWriter.println("fullscreen:" + this.t);
            printWriter.println("enableVsync:" + this.u);
            printWriter.println("useVbo:" + this.v);
            printWriter.println("hideServerAddress:" + this.x);
            printWriter.println("advancedItemTooltips:" + this.y);
            printWriter.println("pauseOnLostFocus:" + this.z);
            printWriter.println("touchscreen:" + this.A);
            printWriter.println("overrideWidth:" + this.C);
            printWriter.println("overrideHeight:" + this.D);
            printWriter.println("heldItemTooltips:" + this.E);
            printWriter.println("chatHeightFocused:" + this.I);
            printWriter.println("chatHeightUnfocused:" + this.H);
            printWriter.println("chatScale:" + this.F);
            printWriter.println("chatWidth:" + this.G);
            printWriter.println("showInventoryAchievementHint:" + this.J);
            printWriter.println("mipmapLevels:" + this.K);
            printWriter.println("forceUnicodeFont:" + this.aF);
            printWriter.println("reducedDebugInfo:" + this.w);
            printWriter.println("useNativeTransport:" + this.L);
            printWriter.println("entityShadows:" + this.M);
            printWriter.println("mainHand:" + (this.B == s.a ? "left" : "right"));
            printWriter.println("attackIndicator:" + this.N);
            printWriter.println("showSubtitles:" + this.P);
            printWriter.println("realmsNotifications:" + this.Q);
            printWriter.println("enableWeakAttacks:" + this.O);
            printWriter.println("autoJump:" + this.R);
            for (cke cke2 : this.ao) {
                printWriter.println("key_" + cke2.h() + ":" + cke2.j());
            }
            for (csg csg2 : csg.values()) {
                printWriter.println("soundCategory_" + csg2.a() + ":" + this.a(csg2));
            }
            for (bzk bzk2 : bzk.values()) {
                printWriter.println("modelPart_" + bzk2.c() + ":" + this.aO.contains((Object)bzk2));
            }
        }
        catch (Exception exception) {
            try {
                aG.b("Failed to save options", (Throwable)exception);
            }
            catch (Throwable throwable) {
                org.apache.commons.b.t.a(printWriter);
                throw throwable;
            }
            org.apache.commons.b.t.a(printWriter);
        }
        org.apache.commons.b.t.a(printWriter);
        this.c();
    }

    public float a(csg csg2) {
        if (this.aP.containsKey((Object)csg2)) {
            return ((Float)this.aP.get((Object)csg2)).floatValue();
        }
        return 1.0f;
    }

    public void a(csg csg2, float f2) {
        this.ap.W().a(csg2, f2);
        this.aP.put(csg2, Float.valueOf(f2));
    }

    public void c() {
        if (this.ap.h != null) {
            int n2 = 0;
            for (bzk bzk2 : this.aO) {
                n2 |= bzk2.a();
            }
            this.ap.h.a.a(new aoc(this.aE, this.d, this.n, this.o, n2, this.B));
        }
    }

    public Set d() {
        return lo.a(this.aO);
    }

    public void a(bzk bzk2, boolean bl2) {
        if (bl2) {
            this.aO.add(bzk2);
        } else {
            this.aO.remove((Object)bzk2);
        }
        this.c();
    }

    public void a(bzk bzk2) {
        if (this.d().contains((Object)bzk2)) {
            this.aO.remove((Object)bzk2);
        } else {
            this.aO.add(bzk2);
        }
        this.c();
    }

    public int e() {
        if (this.d >= 4) {
            return this.i;
        }
        return 0;
    }

    public boolean f() {
        return this.L;
    }
}

