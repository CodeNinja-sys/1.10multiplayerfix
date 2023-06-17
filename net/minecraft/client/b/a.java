/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

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
import net.minecraft.client.b.b;
import net.minecraft.client.b.d;
import net.minecraft.client.b.e;
import net.minecraft.client.f.u;
import net.minecraft.client.g.a.f;
import net.minecraft.client.k.g;
import net.minecraft.client.r;
import net.minecraft.q.l;
import net.minecraft.u.ai;
import net.minecraft.u.b.n;
import net.minecraft.u.bu;
import net.minecraft.w.a.i;
import net.minecraft.w.a.j;
import net.minecraft.x.d.a.ad;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.lwjgl.opengl.dx;

public class a {
    private static final org.apache.logging.log4j.d aG = org.apache.logging.log4j.c.c();
    private static final k aH = new k();
    private static final Type aI = new b();
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
    public i n = net.minecraft.w.a.i.a;
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
    private final Set aO = aad.a((Object[])net.minecraft.w.a.j.values());
    public boolean A;
    public ai B = net.minecraft.u.ai.b;
    public int C;
    public int D;
    public boolean E = true;
    public float F = 1.0f;
    public float G = 1.0f;
    public float H = 0.44366196f;
    public float I = 1.0f;
    public boolean J = true;
    public int K = 4;
    private final Map aP = sz.a(bu.class);
    public boolean L = true;
    public boolean M = true;
    public int N = 1;
    public boolean O;
    public boolean P;
    public boolean Q = true;
    public boolean R = true;
    public d S = new d("key.forward", 17, "key.categories.movement");
    public d T = new d("key.left", 30, "key.categories.movement");
    public d U = new d("key.back", 31, "key.categories.movement");
    public d V = new d("key.right", 32, "key.categories.movement");
    public d W = new d("key.jump", 57, "key.categories.movement");
    public d X = new d("key.sneak", 42, "key.categories.movement");
    public d Y = new d("key.sprint", 29, "key.categories.movement");
    public d Z = new d("key.inventory", 18, "key.categories.inventory");
    public d aa = new d("key.swapHands", 33, "key.categories.inventory");
    public d ab = new d("key.drop", 16, "key.categories.inventory");
    public d ac = new d("key.use", -99, "key.categories.gameplay");
    public d ad = new d("key.attack", -100, "key.categories.gameplay");
    public d ae = new d("key.pickItem", -98, "key.categories.gameplay");
    public d af = new d("key.chat", 20, "key.categories.multiplayer");
    public d ag = new d("key.playerlist", 15, "key.categories.multiplayer");
    public d ah = new d("key.command", 53, "key.categories.multiplayer");
    public d ai = new d("key.screenshot", 60, "key.categories.misc");
    public d aj = new d("key.togglePerspective", 63, "key.categories.misc");
    public d ak = new d("key.smoothCamera", 0, "key.categories.misc");
    public d al = new d("key.fullscreen", 87, "key.categories.misc");
    public d am = new d("key.spectatorOutlines", 0, "key.categories.misc");
    public d[] an = new d[]{new d("key.hotbar.1", 2, "key.categories.inventory"), new d("key.hotbar.2", 3, "key.categories.inventory"), new d("key.hotbar.3", 4, "key.categories.inventory"), new d("key.hotbar.4", 5, "key.categories.inventory"), new d("key.hotbar.5", 6, "key.categories.inventory"), new d("key.hotbar.6", 7, "key.categories.inventory"), new d("key.hotbar.7", 8, "key.categories.inventory"), new d("key.hotbar.8", 9, "key.categories.inventory"), new d("key.hotbar.9", 10, "key.categories.inventory")};
    public d[] ao = (d[])org.apache.commons.c.c.b((Object[])new d[]{this.ad, this.ac, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.ab, this.Z, this.af, this.ag, this.ae, this.ah, this.ai, this.aj, this.ak, this.al, this.am, this.aa}, (Object[])this.an);
    protected r ap;
    private File aQ;
    public l aq = net.minecraft.q.l.c;
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

    public a(r r2, File file) {
        this.ap = r2;
        this.aQ = new File(file, "options.txt");
        if (r2.S() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
            net.minecraft.client.b.e.f.a(32.0f);
        } else {
            net.minecraft.client.b.e.f.a(16.0f);
        }
        this.d = r2.S() ? 12 : 8;
        this.a();
    }

    public a() {
    }

    public static String a(int n2) {
        return n2 < 0 ? net.minecraft.client.f.u.a("key.mouseButton", n2 + 101) : (n2 < 256 ? org.lwjgl.a.g.b(n2) : String.format("%c", Character.valueOf((char)(n2 - 256))).toUpperCase());
    }

    public static boolean a(d d2) {
        return d2.j() == 0 ? false : (d2.j() < 0 ? org.lwjgl.a.j.a(d2.j() + 100) : org.lwjgl.a.g.a(d2.j()));
    }

    public void a(d d2, int n2) {
        d2.b(n2);
        this.b();
    }

    public void a(e e2, float f2) {
        if (e2 == net.minecraft.client.b.e.b) {
            this.b = f2;
        }
        if (e2 == net.minecraft.client.b.e.c) {
            this.az = f2;
        }
        if (e2 == net.minecraft.client.b.e.d) {
            this.aA = f2;
        }
        if (e2 == net.minecraft.client.b.e.i) {
            this.h = (int)f2;
        }
        if (e2 == net.minecraft.client.b.e.s) {
            this.r = f2;
            this.ap.t.c().b();
        }
        if (e2 == net.minecraft.client.b.e.B) {
            this.I = f2;
            this.ap.t.c().b();
        }
        if (e2 == net.minecraft.client.b.e.C) {
            this.H = f2;
            this.ap.t.c().b();
        }
        if (e2 == net.minecraft.client.b.e.A) {
            this.G = f2;
            this.ap.t.c().b();
        }
        if (e2 == net.minecraft.client.b.e.z) {
            this.F = f2;
            this.ap.t.c().b();
        }
        if (e2 == net.minecraft.client.b.e.D) {
            int n2 = this.K;
            this.K = (int)f2;
            if ((float)n2 != f2) {
                this.ap.R().a(this.K);
                this.ap.N().a(net.minecraft.client.g.a.f.b);
                this.ap.R().a(false, this.K > 0);
                this.ap.A();
            }
        }
        if (e2 == net.minecraft.client.b.e.f) {
            this.d = (int)f2;
            this.ap.i.l();
        }
    }

    public void a(e e2, int n2) {
        if (e2 == net.minecraft.client.b.e.f) {
            this.a(e2, net.minecraft.u.b.n.a((float)(this.d + n2), e2.e(), e2.f()));
        }
        if (e2 == net.minecraft.client.b.e.H) {
            this.B = this.B.a();
        }
        if (e2 == net.minecraft.client.b.e.a) {
            boolean bl2 = this.c = !this.c;
        }
        if (e2 == net.minecraft.client.b.e.n) {
            this.aC = this.aC + n2 & 3;
        }
        if (e2 == net.minecraft.client.b.e.o) {
            this.aD = (this.aD + n2) % 3;
        }
        if (e2 == net.minecraft.client.b.e.g) {
            boolean bl3 = this.e = !this.e;
        }
        if (e2 == net.minecraft.client.b.e.k) {
            this.i = (this.i + n2) % 3;
        }
        if (e2 == net.minecraft.client.b.e.E) {
            this.aF = !this.aF;
            this.ap.m.a(this.ap.Q().a() || this.aF);
        }
        if (e2 == net.minecraft.client.b.e.j) {
            boolean bl4 = this.g = !this.g;
        }
        if (e2 == net.minecraft.client.b.e.h) {
            this.f = !this.f;
            this.ap.f();
        }
        if (e2 == net.minecraft.client.b.e.l) {
            this.j = !this.j;
            this.ap.i.d();
        }
        if (e2 == net.minecraft.client.b.e.m) {
            this.k = (this.k + n2) % 3;
            this.ap.i.d();
        }
        if (e2 == net.minecraft.client.b.e.p) {
            this.n = net.minecraft.w.a.i.a((this.n.a() + n2) % 3);
        }
        if (e2 == net.minecraft.client.b.e.q) {
            boolean bl5 = this.o = !this.o;
        }
        if (e2 == net.minecraft.client.b.e.r) {
            boolean bl6 = this.p = !this.p;
        }
        if (e2 == net.minecraft.client.b.e.t) {
            boolean bl7 = this.q = !this.q;
        }
        if (e2 == net.minecraft.client.b.e.u) {
            boolean bl8 = this.s = !this.s;
        }
        if (e2 == net.minecraft.client.b.e.y) {
            boolean bl9 = this.A = !this.A;
        }
        if (e2 == net.minecraft.client.b.e.v) {
            boolean bl10 = this.t = !this.t;
            if (this.ap.J() != this.t) {
                this.ap.r();
            }
        }
        if (e2 == net.minecraft.client.b.e.w) {
            this.u = !this.u;
            dx.c(this.u);
        }
        if (e2 == net.minecraft.client.b.e.x) {
            this.v = !this.v;
            this.ap.i.d();
        }
        if (e2 == net.minecraft.client.b.e.F) {
            boolean bl11 = this.w = !this.w;
        }
        if (e2 == net.minecraft.client.b.e.G) {
            boolean bl12 = this.M = !this.M;
        }
        if (e2 == net.minecraft.client.b.e.I) {
            this.N = (this.N + n2) % 3;
        }
        if (e2 == net.minecraft.client.b.e.K) {
            boolean bl13 = this.P = !this.P;
        }
        if (e2 == net.minecraft.client.b.e.L) {
            boolean bl14 = this.Q = !this.Q;
        }
        if (e2 == net.minecraft.client.b.e.M) {
            this.R = !this.R;
        }
        this.b();
    }

    public float a(e e2) {
        return e2 == net.minecraft.client.b.e.c ? this.az : (e2 == net.minecraft.client.b.e.d ? this.aA : (e2 == net.minecraft.client.b.e.e ? this.aB : (e2 == net.minecraft.client.b.e.b ? this.b : (e2 == net.minecraft.client.b.e.s ? this.r : (e2 == net.minecraft.client.b.e.B ? this.I : (e2 == net.minecraft.client.b.e.C ? this.H : (e2 == net.minecraft.client.b.e.z ? this.F : (e2 == net.minecraft.client.b.e.A ? this.G : (e2 == net.minecraft.client.b.e.i ? (float)this.h : (e2 == net.minecraft.client.b.e.D ? (float)this.K : (e2 == net.minecraft.client.b.e.f ? (float)this.d : 0.0f)))))))))));
    }

    public boolean b(e e2) {
        switch (e2) {
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
        return net.minecraft.client.f.u.a(arrstring[n2], new Object[0]);
    }

    public String c(e e2) {
        String string = String.valueOf(net.minecraft.client.f.u.a(e2.d(), new Object[0])) + ": ";
        if (e2.a()) {
            float f2 = this.a(e2);
            float f3 = e2.b(f2);
            return e2 == net.minecraft.client.b.e.b ? (f3 == 0.0f ? String.valueOf(string) + net.minecraft.client.f.u.a("options.sensitivity.min", new Object[0]) : (f3 == 1.0f ? String.valueOf(string) + net.minecraft.client.f.u.a("options.sensitivity.max", new Object[0]) : String.valueOf(string) + (int)(f3 * 200.0f) + "%")) : (e2 == net.minecraft.client.b.e.c ? (f2 == 70.0f ? String.valueOf(string) + net.minecraft.client.f.u.a("options.fov.min", new Object[0]) : (f2 == 110.0f ? String.valueOf(string) + net.minecraft.client.f.u.a("options.fov.max", new Object[0]) : String.valueOf(string) + (int)f2)) : (e2 == net.minecraft.client.b.e.i ? (f2 == net.minecraft.client.b.e.a(e2) ? String.valueOf(string) + net.minecraft.client.f.u.a("options.framerateLimit.max", new Object[0]) : String.valueOf(string) + (int)f2 + " fps") : (e2 == net.minecraft.client.b.e.k ? (f2 == net.minecraft.client.b.e.b(e2) ? String.valueOf(string) + net.minecraft.client.f.u.a("options.cloudHeight.min", new Object[0]) : String.valueOf(string) + ((int)f2 + 128)) : (e2 == net.minecraft.client.b.e.d ? (f3 == 0.0f ? String.valueOf(string) + net.minecraft.client.f.u.a("options.gamma.min", new Object[0]) : (f3 == 1.0f ? String.valueOf(string) + net.minecraft.client.f.u.a("options.gamma.max", new Object[0]) : String.valueOf(string) + "+" + (int)(f3 * 100.0f) + "%")) : (e2 == net.minecraft.client.b.e.e ? String.valueOf(string) + (int)(f3 * 400.0f) + "%" : (e2 == net.minecraft.client.b.e.s ? String.valueOf(string) + (int)(f3 * 90.0f + 10.0f) + "%" : (e2 == net.minecraft.client.b.e.C ? String.valueOf(string) + net.minecraft.client.k.g.b(f3) + "px" : (e2 == net.minecraft.client.b.e.B ? String.valueOf(string) + net.minecraft.client.k.g.b(f3) + "px" : (e2 == net.minecraft.client.b.e.A ? String.valueOf(string) + net.minecraft.client.k.g.a(f3) + "px" : (e2 == net.minecraft.client.b.e.f ? String.valueOf(string) + (int)f2 + " chunks" : (e2 == net.minecraft.client.b.e.D ? (f2 == 0.0f ? String.valueOf(string) + net.minecraft.client.f.u.a("options.off", new Object[0]) : String.valueOf(string) + (int)f2) : (f3 == 0.0f ? String.valueOf(string) + net.minecraft.client.f.u.a("options.off", new Object[0]) : String.valueOf(string) + (int)(f3 * 100.0f) + "%"))))))))))));
        }
        if (e2.b()) {
            boolean bl2 = this.b(e2);
            return bl2 ? String.valueOf(string) + net.minecraft.client.f.u.a("options.on", new Object[0]) : String.valueOf(string) + net.minecraft.client.f.u.a("options.off", new Object[0]);
        }
        if (e2 == net.minecraft.client.b.e.H) {
            return String.valueOf(string) + (Object)((Object)this.B);
        }
        if (e2 == net.minecraft.client.b.e.n) {
            return String.valueOf(string) + net.minecraft.client.b.a.a(aJ, this.aC);
        }
        if (e2 == net.minecraft.client.b.e.p) {
            return String.valueOf(string) + net.minecraft.client.f.u.a(this.n.b(), new Object[0]);
        }
        if (e2 == net.minecraft.client.b.e.o) {
            return String.valueOf(string) + net.minecraft.client.b.a.a(aK, this.aD);
        }
        if (e2 == net.minecraft.client.b.e.m) {
            return String.valueOf(string) + net.minecraft.client.b.a.a(aL, this.k);
        }
        if (e2 == net.minecraft.client.b.e.k) {
            return String.valueOf(string) + net.minecraft.client.b.a.a(aM, this.i);
        }
        if (e2 == net.minecraft.client.b.e.l) {
            if (this.j) {
                return String.valueOf(string) + net.minecraft.client.f.u.a("options.graphics.fancy", new Object[0]);
            }
            String string2 = "options.graphics.fast";
            return String.valueOf(string) + net.minecraft.client.f.u.a("options.graphics.fast", new Object[0]);
        }
        return e2 == net.minecraft.client.b.e.I ? String.valueOf(string) + net.minecraft.client.b.a.a(aN, this.N) : string;
    }

    public void a() {
        try {
            Object object;
            if (!this.aQ.exists()) {
                return;
            }
            this.aP.clear();
            List list = org.apache.commons.b.t.f(new FileInputStream(this.aQ));
            net.minecraft.e.e e2 = new net.minecraft.e.e();
            for (String string : list) {
                try {
                    object = a.a().b(2).a(string).iterator();
                    e2.a((String)object.next(), (String)object.next());
                }
                catch (Exception exception) {
                    aG.f("Skipping bad option: {}", string);
                }
            }
            e2 = this.a(e2);
            for (String string : e2.e()) {
                object = e2.l(string);
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
                        this.aq = net.minecraft.q.l.a(Integer.parseInt((String)object));
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
                        this.n = net.minecraft.w.a.i.a(Integer.parseInt((String)object));
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
                        ai ai2 = this.B = "left".equals(object) ? net.minecraft.u.ai.a : net.minecraft.u.ai.b;
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
                    d[] arrd = this.ao;
                    int n2 = this.ao.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        d exception = arrd[i2];
                        if (!string.equals("key_" + exception.h())) continue;
                        exception.b(Integer.parseInt((String)object));
                    }
                    for (bu bu2 : bu.values()) {
                        if (!string.equals("soundCategory_" + bu2.a())) continue;
                        this.aP.put(bu2, Float.valueOf(this.a((String)object)));
                    }
                    for (j j2 : net.minecraft.w.a.j.values()) {
                        if (!string.equals("modelPart_" + j2.c())) continue;
                        this.a(j2, "true".equals(object));
                    }
                }
                catch (Exception exception) {
                    aG.f("Skipping bad option: {}:{}", string, object);
                }
            }
            net.minecraft.client.b.d.c();
        }
        catch (Exception exception) {
            aG.b("Failed to load options", (Throwable)exception);
        }
    }

    private net.minecraft.e.e a(net.minecraft.e.e e2) {
        int n2 = 0;
        try {
            n2 = Integer.parseInt(e2.l("version"));
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        return this.ap.ah().a(net.minecraft.u.a.c.g, e2, n2);
    }

    private float a(String string) {
        return "true".equals(string) ? 1.0f : ("false".equals(string) ? 0.0f : Float.parseFloat(string));
    }

    public void b() {
        block13: {
            PrintWriter printWriter = null;
            try {
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
                        case 0: {
                            printWriter.println("renderClouds:false");
                            break;
                        }
                        case 1: {
                            printWriter.println("renderClouds:fast");
                            break;
                        }
                        case 2: {
                            printWriter.println("renderClouds:true");
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
                    printWriter.println("mainHand:" + (this.B == net.minecraft.u.ai.a ? "left" : "right"));
                    printWriter.println("attackIndicator:" + this.N);
                    printWriter.println("showSubtitles:" + this.P);
                    printWriter.println("realmsNotifications:" + this.Q);
                    printWriter.println("enableWeakAttacks:" + this.O);
                    printWriter.println("autoJump:" + this.R);
                    d[] arrobject = this.ao;
                    int n2 = this.ao.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        d d2 = arrobject[i2];
                        printWriter.println("key_" + d2.h() + ":" + d2.j());
                    }
                    for (bu bu2 : bu.values()) {
                        printWriter.println("soundCategory_" + bu2.a() + ":" + this.a(bu2));
                    }
                    for (j j2 : net.minecraft.w.a.j.values()) {
                        printWriter.println("modelPart_" + j2.c() + ":" + this.aO.contains((Object)j2));
                    }
                }
                catch (Exception exception) {
                    aG.b("Failed to save options", (Throwable)exception);
                    org.apache.commons.b.t.a(printWriter);
                    break block13;
                }
            }
            catch (Throwable throwable) {
                org.apache.commons.b.t.a(printWriter);
                throw throwable;
            }
            org.apache.commons.b.t.a(printWriter);
        }
        this.c();
    }

    public float a(bu bu2) {
        return this.aP.containsKey((Object)bu2) ? ((Float)this.aP.get((Object)bu2)).floatValue() : 1.0f;
    }

    public void a(bu bu2, float f2) {
        this.ap.U().a(bu2, f2);
        this.aP.put(bu2, Float.valueOf(f2));
    }

    public void c() {
        if (this.ap.j != null) {
            int n2 = 0;
            for (j j2 : this.aO) {
                n2 |= j2.a();
            }
            this.ap.j.d.a(new ad(this.aE, this.d, this.n, this.o, n2, this.B));
        }
    }

    public Set d() {
        return lo.a(this.aO);
    }

    public void a(j j2, boolean bl2) {
        if (bl2) {
            this.aO.add(j2);
        } else {
            this.aO.remove((Object)j2);
        }
        this.c();
    }

    public void a(j j2) {
        if (this.d().contains((Object)j2)) {
            this.aO.remove((Object)j2);
        } else {
            this.aO.add(j2);
        }
        this.c();
    }

    public int e() {
        return this.d >= 4 ? this.i : 0;
    }

    public boolean f() {
        return this.L;
    }
}

