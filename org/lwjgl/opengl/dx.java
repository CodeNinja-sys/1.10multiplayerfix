/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.event.ComponentListener;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.security.AccessController;
import java.util.Arrays;
import java.util.HashSet;
import org.lwjgl.BufferUtils;
import org.lwjgl.a.g;
import org.lwjgl.a.j;
import org.lwjgl.ab;
import org.lwjgl.b.a;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.LinuxDisplay;
import org.lwjgl.opengl.MacOSXDisplay;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.WindowsDisplay;
import org.lwjgl.opengl.dr;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.du;
import org.lwjgl.opengl.dy;
import org.lwjgl.opengl.dz;
import org.lwjgl.opengl.ea;
import org.lwjgl.opengl.eb;
import org.lwjgl.opengl.ec;
import org.lwjgl.opengl.ed;
import org.lwjgl.opengl.ee;
import org.lwjgl.opengl.ef;
import org.lwjgl.opengl.eg;
import org.lwjgl.opengl.eh;
import org.lwjgl.opengl.ei;
import org.lwjgl.opengl.ej;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.fz;
import org.lwjgl.opengl.ig;
import org.lwjgl.opengl.ij;
import org.lwjgl.opengl.iv;

public final class dx {
    private static final Thread a = new dy();
    private static final eg b;
    private static final DisplayMode c;
    private static Canvas d;
    private static DisplayMode e;
    private static int f;
    private static ByteBuffer[] g;
    private static int h;
    private static int i;
    private static int j;
    private static String k;
    private static boolean l;
    private static int m;
    private static ek n;
    private static boolean o;
    private static boolean p;
    private static boolean q;
    private static boolean r;
    private static float s;
    private static float t;
    private static float u;
    private static final ComponentListener v;

    public static eh a() {
        return n;
    }

    private static eg K() {
        switch (org.lwjgl.d.a()) {
            case 1: {
                return new LinuxDisplay();
            }
            case 3: {
                return new WindowsDisplay();
            }
            case 2: {
                return new MacOSXDisplay();
            }
        }
        throw new IllegalStateException("Unsupported platform");
    }

    private dx() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DisplayMode[] b() {
        Object object = fz.a;
        synchronized (object) {
            DisplayMode[] arrdisplayMode = b.getAvailableDisplayModes();
            if (arrdisplayMode == null) {
                return new DisplayMode[0];
            }
            HashSet<DisplayMode> hashSet = new HashSet<DisplayMode>(arrdisplayMode.length);
            hashSet.addAll(Arrays.asList(arrdisplayMode));
            DisplayMode[] arrdisplayMode2 = new DisplayMode[hashSet.size()];
            hashSet.toArray(arrdisplayMode2);
            org.lwjgl.d.a((CharSequence)("Removed " + (arrdisplayMode.length - arrdisplayMode2.length) + " duplicate displaymodes"));
            return arrdisplayMode2;
        }
    }

    public static DisplayMode c() {
        return c;
    }

    public static DisplayMode d() {
        return e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(DisplayMode displayMode) {
        Object object = fz.a;
        synchronized (object) {
            if (displayMode == null) {
                throw new NullPointerException("mode must be non-null");
            }
            boolean bl2 = dx.g();
            e = displayMode;
            if (dx.v()) {
                dx.Q();
                try {
                    if (bl2 && !dx.g()) {
                        b.b();
                    } else if (dx.g()) {
                        dx.R();
                    }
                    dx.O();
                    dx.U();
                }
                catch (c c2) {
                    n.j();
                    b.b();
                    throw c2;
                }
            }
        }
    }

    private static DisplayMode L() {
        return !dx.g() && d != null ? new DisplayMode(d.getWidth(), d.getHeight()) : e;
    }

    private static int M() {
        if (!dx.g() && d == null) {
            if (f == -1) {
                return Math.max(0, (c.b() - e.b()) / 2);
            }
            return f;
        }
        return 0;
    }

    private static int N() {
        if (!dx.g() && d == null) {
            if (h == -1) {
                return Math.max(0, (c.c() - e.c()) / 2);
            }
            return h;
        }
        return 0;
    }

    private static void O() {
        Canvas canvas;
        if (o) {
            return;
        }
        Canvas canvas2 = canvas = dx.g() ? null : d;
        if (canvas != null && !canvas.isDisplayable()) {
            throw new c("Parent.isDisplayable() must be true");
        }
        if (canvas != null) {
            canvas.addComponentListener(v);
        }
        DisplayMode displayMode = dx.L();
        b.a(n, displayMode, canvas, dx.M(), dx.N());
        o = true;
        i = dx.d().b();
        j = dx.d().c();
        dx.a(k);
        dx.W();
        if (g != null) {
            dx.a(g);
        } else {
            dx.a(new ByteBuffer[]{org.lwjgl.d.h, org.lwjgl.d.g});
        }
    }

    private static void P() {
        try {
            dr dr2 = n.n();
            if (dr2 != null && dr2.a()) {
                dr2.c();
                dr2.d();
            }
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Exception occurred while trying to release context: " + c2));
        }
    }

    private static void Q() {
        if (!o) {
            return;
        }
        if (d != null) {
            d.removeComponentListener(v);
        }
        dx.P();
        if (org.lwjgl.a.j.e()) {
            org.lwjgl.a.j.f();
        }
        if (org.lwjgl.a.g.b()) {
            org.lwjgl.a.g.c();
        }
        b.a();
        o = false;
    }

    private static void R() {
        if (!e.a()) {
            throw new IllegalStateException("Only modes acquired from getAvailableDisplayModes() can be used for fullscreen display");
        }
        b.a(e);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(float f2, float f3, float f4) {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new c("Display not yet created.");
            }
            if (f3 < -1.0f || f3 > 1.0f) {
                throw new IllegalArgumentException("Invalid brightness value");
            }
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Invalid contrast value");
            }
            int n2 = b.c();
            if (n2 == 0) {
                throw new c("Display configuration not supported");
            }
            FloatBuffer floatBuffer = BufferUtils.f(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                float f5 = (float)i2 / (float)(n2 - 1);
                float f6 = (float)Math.pow(f5, f2);
                f6 += f3;
                if ((f6 = (f6 - 0.5f) * f4 + 0.5f) > 1.0f) {
                    f6 = 1.0f;
                } else if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                floatBuffer.put(i2, f6);
            }
            b.setGammaRamp(floatBuffer);
            org.lwjgl.d.a((CharSequence)("Gamma set, gamma = " + f2 + ", brightness = " + f3 + ", contrast = " + f4));
        }
    }

    public static void a(int n2) {
        iv.a(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String e() {
        Object object = fz.a;
        synchronized (object) {
            return k;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Canvas f() {
        Object object = fz.a;
        synchronized (object) {
            return d;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(Canvas canvas) {
        Object object = fz.a;
        synchronized (object) {
            if (d != canvas) {
                d = canvas;
                if (!dx.v()) {
                    return;
                }
                dx.Q();
                try {
                    if (dx.g()) {
                        dx.R();
                    } else {
                        b.b();
                    }
                    dx.O();
                    dx.U();
                }
                catch (c c2) {
                    n.j();
                    b.b();
                    throw c2;
                }
            }
        }
    }

    public static void a(boolean bl2) {
        dx.a(bl2, e);
    }

    public static void b(DisplayMode displayMode) {
        dx.a(displayMode.a(), displayMode);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(boolean bl2, DisplayMode displayMode) {
        Object object = fz.a;
        synchronized (object) {
            if (displayMode == null) {
                throw new NullPointerException("mode must be non-null");
            }
            DisplayMode displayMode2 = e;
            e = displayMode;
            boolean bl3 = dx.g();
            l = bl2;
            if (bl3 != dx.g() || !displayMode.equals(displayMode2)) {
                if (!dx.v()) {
                    return;
                }
                dx.Q();
                try {
                    if (dx.g()) {
                        dx.R();
                    } else {
                        b.b();
                    }
                    dx.O();
                    dx.U();
                }
                catch (c c2) {
                    n.j();
                    b.b();
                    throw c2;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean g() {
        Object object = fz.a;
        synchronized (object) {
            return l && e.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(String string) {
        Object object = fz.a;
        synchronized (object) {
            if (string == null) {
                string = "";
            }
            k = string;
            if (dx.v()) {
                b.a(k);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean h() {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Cannot determine close requested state of uncreated window");
            }
            return b.g();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean i() {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Cannot determine minimized state of uncreated window");
            }
            return b.h();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean j() {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Cannot determine focused state of uncreated window");
            }
            return b.i();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean k() {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Cannot determine dirty state of uncreated window");
            }
            return b.j();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void l() {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Display not created");
            }
            b.k();
        }
        dx.o();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void m() {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Display not created");
            }
            if (org.lwjgl.d.i) {
                n.e();
            }
            n.f();
        }
    }

    public static void n() {
        dx.b(true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(boolean bl2) {
        Object object = fz.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Display not created");
            }
            if (b.h() || b.j()) {
                try {
                    dx.m();
                }
                catch (c c2) {
                    throw new RuntimeException(c2);
                }
            }
            boolean bl3 = q = !dx.g() && d == null && b.m();
            if (q) {
                i = b.n();
                j = b.o();
            }
            if (p) {
                dx.Y();
                p = false;
                q = true;
            }
            if (bl2) {
                dx.l();
            }
        }
    }

    static void o() {
        if (org.lwjgl.a.j.e()) {
            org.lwjgl.a.j.g();
            org.lwjgl.a.j.y();
        }
        if (org.lwjgl.a.g.b()) {
            org.lwjgl.a.g.d();
        }
        if (org.lwjgl.a.c.f()) {
            org.lwjgl.a.c.c();
        }
    }

    public static void p() {
        n.i();
    }

    public static boolean q() {
        return n.g();
    }

    public static void r() {
        n.h();
    }

    private static void S() {
        AccessController.doPrivileged(new ea());
    }

    private static void T() {
        AccessController.doPrivileged(new eb());
    }

    public static void s() {
        dx.a(new PixelFormat());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(PixelFormat pixelFormat) {
        Object object = fz.a;
        synchronized (object) {
            dx.a(pixelFormat, null, (ds)null);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(PixelFormat pixelFormat, eh eh2) {
        Object object = fz.a;
        synchronized (object) {
            dx.a(pixelFormat, eh2, (ds)null);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(PixelFormat pixelFormat, ds ds2) {
        Object object = fz.a;
        synchronized (object) {
            dx.a(pixelFormat, null, ds2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(PixelFormat pixelFormat, eh eh2, ds ds2) {
        Object object = fz.a;
        synchronized (object) {
            if (dx.v()) {
                throw new IllegalStateException("Only one LWJGL context may be instantiated at any one time.");
            }
            if (pixelFormat == null) {
                throw new NullPointerException("pixel_format cannot be null");
            }
            dx.S();
            dx.T();
            if (dx.g()) {
                dx.R();
            }
            ec ec2 = new ec();
            n = ec2;
            try {
                ec2.a(pixelFormat, ds2);
                try {
                    dx.O();
                    try {
                        ec2.c = new du(ec2.b, ds2, eh2 != null ? ((ei)eh2).a() : null);
                        try {
                            dx.U();
                            dx.V();
                        }
                        catch (c c2) {
                            ((ei)ec2).j();
                            throw c2;
                        }
                    }
                    catch (c c3) {
                        dx.Q();
                        throw c3;
                    }
                }
                catch (c c4) {
                    ((ei)ec2).j();
                    throw c4;
                }
            }
            catch (c c5) {
                b.b();
                throw c5;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(ij ij2) {
        Object object = fz.a;
        synchronized (object) {
            dx.a(ij2, null, null);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(ij ij2, eh eh2) {
        Object object = fz.a;
        synchronized (object) {
            dx.a(ij2, eh2, null);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(ij ij2, a a2) {
        Object object = fz.a;
        synchronized (object) {
            dx.a(ij2, null, a2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(ij ij2, eh eh2, a a2) {
        Object object = fz.a;
        synchronized (object) {
            if (dx.v()) {
                throw new IllegalStateException("Only one LWJGL context may be instantiated at any one time.");
            }
            if (ij2 == null) {
                throw new NullPointerException("pixel_format cannot be null");
            }
            dx.S();
            dx.T();
            if (dx.g()) {
                dx.R();
            }
            ed ed2 = new ed();
            n = ed2;
            try {
                ed2.a(ij2);
                try {
                    dx.O();
                    try {
                        ed2.a(a2, eh2);
                        try {
                            dx.U();
                            dx.V();
                        }
                        catch (c c2) {
                            ((ej)ed2).j();
                            throw c2;
                        }
                    }
                    catch (c c3) {
                        dx.Q();
                        throw c3;
                    }
                }
                catch (c c4) {
                    ((ej)ed2).j();
                    throw c4;
                }
            }
            catch (c c5) {
                b.b();
                throw c5;
            }
        }
    }

    public static void b(float f2, float f3, float f4) {
        s = f2;
        t = f3;
        u = f4;
    }

    private static void U() {
        dx.r();
        try {
            n.e();
        }
        catch (ig ig2) {
            org.lwjgl.d.a((CharSequence)("OpenGL error during context creation: " + ig2.getMessage()));
        }
        dx.b(m);
    }

    private static void V() {
        n.a(s, t, u);
        dx.n();
    }

    static eg t() {
        return b;
    }

    static boolean b(String string) {
        return (Boolean)AccessController.doPrivileged(new ee(string));
    }

    static String c(String string) {
        return (String)AccessController.doPrivileged(new ef(string));
    }

    private static void W() {
        if (!dx.b("org.lwjgl.opengl.Display.noinput")) {
            if (!org.lwjgl.a.j.e() && !dx.b("org.lwjgl.opengl.Display.nomouse")) {
                try {
                    org.lwjgl.a.j.d();
                }
                catch (c c2) {
                    if (org.lwjgl.d.i) {
                        c2.printStackTrace(System.err);
                    }
                    org.lwjgl.d.a((CharSequence)("Failed to create Mouse: " + c2));
                }
            }
            if (!org.lwjgl.a.g.b() && !dx.b("org.lwjgl.opengl.Display.nokeyboard")) {
                try {
                    org.lwjgl.a.g.a();
                }
                catch (c c3) {
                    if (org.lwjgl.d.i) {
                        c3.printStackTrace(System.err);
                    }
                    org.lwjgl.d.a((CharSequence)("Failed to create Keyboard: " + c3));
                }
            }
        }
    }

    public static void u() {
        if (dx.v()) {
            n.j();
        }
    }

    private static void X() {
        b.b();
        e = c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean v() {
        Object object = fz.a;
        synchronized (object) {
            return o;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(int n2) {
        Object object = fz.a;
        synchronized (object) {
            m = n2;
            if (dx.v()) {
                n.a(m);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void c(boolean bl2) {
        Object object = fz.a;
        synchronized (object) {
            dx.b(bl2 ? 1 : 0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(int n2, int n3) {
        Object object = fz.a;
        synchronized (object) {
            f = n2;
            h = n3;
            if (dx.v() && !dx.g()) {
                dx.Y();
            }
        }
    }

    private static void Y() {
        DisplayMode displayMode = dx.L();
        b.a(dx.M(), dx.N(), displayMode.b(), displayMode.c());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String w() {
        Object object = fz.a;
        synchronized (object) {
            return b.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String x() {
        Object object = fz.a;
        synchronized (object) {
            return b.e();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ByteBuffer[] arrbyteBuffer) {
        Object object = fz.a;
        synchronized (object) {
            if (g != arrbyteBuffer) {
                g = new ByteBuffer[arrbyteBuffer.length];
                for (int i2 = 0; i2 < arrbyteBuffer.length; ++i2) {
                    dx.g[i2] = BufferUtils.a(arrbyteBuffer[i2].capacity());
                    int n2 = arrbyteBuffer[i2].position();
                    g[i2].put(arrbyteBuffer[i2]);
                    arrbyteBuffer[i2].position(n2);
                    g[i2].flip();
                }
            }
            if (dx.v() && d == null) {
                return b.a(g);
            }
            return 0;
        }
    }

    public static void d(boolean bl2) {
        r = bl2;
        if (dx.v()) {
            b.a(bl2);
        }
    }

    public static boolean y() {
        return r;
    }

    public static boolean z() {
        return q;
    }

    public static int A() {
        if (dx.g()) {
            return 0;
        }
        if (d != null) {
            return d.getX();
        }
        return b.p();
    }

    public static int B() {
        if (dx.g()) {
            return 0;
        }
        if (d != null) {
            return d.getY();
        }
        return b.q();
    }

    public static int C() {
        if (dx.g()) {
            return dx.d().b();
        }
        if (d != null) {
            return d.getWidth();
        }
        return i;
    }

    public static int D() {
        if (dx.g()) {
            return dx.d().c();
        }
        if (d != null) {
            return d.getHeight();
        }
        return j;
    }

    public static float E() {
        return b.r();
    }

    static /* synthetic */ void F() {
        dx.X();
    }

    static /* synthetic */ boolean e(boolean bl2) {
        p = bl2;
        return p;
    }

    static /* synthetic */ Thread G() {
        return a;
    }

    static /* synthetic */ void H() {
        dx.P();
    }

    static /* synthetic */ void I() {
        dx.Q();
    }

    static /* synthetic */ int c(int n2) {
        f = n2;
        return f;
    }

    static /* synthetic */ int d(int n2) {
        h = n2;
        return h;
    }

    static /* synthetic */ ByteBuffer[] b(ByteBuffer[] arrbyteBuffer) {
        g = arrbyteBuffer;
        return arrbyteBuffer;
    }

    static /* synthetic */ void J() {
        dx.S();
    }

    static {
        f = -1;
        h = -1;
        i = 0;
        j = 0;
        k = "Game";
        v = new dz();
        ab.b();
        b = dx.K();
        try {
            e = c = b.f();
            org.lwjgl.d.a((CharSequence)("Initial mode: " + c));
        }
        catch (c c2) {
            throw new RuntimeException(c2);
        }
    }
}

