/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengles.GLContext
 *  org.lwjgl.opengles.PixelFormat
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.event.FocusListener;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.AccessController;
import org.lwjgl.BufferUtils;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.LinuxDisplayPeerInfo;
import org.lwjgl.opengl.LinuxEvent;
import org.lwjgl.opengl.LinuxKeyboard;
import org.lwjgl.opengl.LinuxMouse;
import org.lwjgl.opengl.LinuxPbufferPeerInfo;
import org.lwjgl.opengl.LinuxPeerInfo;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dk;
import org.lwjgl.opengl.dl;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.eg;
import org.lwjgl.opengl.ej;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.gn;
import org.lwjgl.opengl.go;
import org.lwjgl.opengl.gp;
import org.lwjgl.opengl.gq;
import org.lwjgl.opengl.gr;
import org.lwjgl.opengl.ii;
import org.lwjgl.opengl.jh;
import org.lwjgl.opengl.ji;

final class LinuxDisplay
implements eg {
    public static final int a = 0;
    public static final int b = 0;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 4;
    private static final int j = 8;
    private static final int k = 0;
    private static final int l = 3;
    private static final int m = 5;
    private static final int n = 6;
    private static final int o = 7;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 1;
    private static final int s = 42;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static int w = 3;
    private static final int x = 10;
    private static final int y = 11;
    private static final int z = 12;
    private static long A;
    private static long B;
    private static long C;
    private static int D;
    private final LinuxEvent E = new LinuxEvent();
    private final LinuxEvent F = new LinuxEvent();
    private int G = 12;
    private long H;
    private ii I;
    private ByteBuffer J;
    private ByteBuffer K;
    private DisplayMode L;
    private DisplayMode M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long W;
    private boolean X = true;
    private boolean Y;
    private boolean Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private Canvas ae;
    private long af;
    private static boolean ag;
    private long ah;
    private boolean ai;
    private boolean aj;
    private long ak = 0L;
    private LinuxKeyboard al;
    private LinuxMouse am;
    private String an;
    private final FocusListener ao = new gn(this);

    LinuxDisplay() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ByteBuffer J() {
        LinuxDisplay.C();
        try {
            block8: {
                ByteBuffer byteBuffer;
                LinuxDisplay.E();
                try {
                    if (!LinuxDisplay.M()) break block8;
                    byteBuffer = LinuxDisplay.nGetCurrentGammaRamp(LinuxDisplay.G(), LinuxDisplay.H());
                }
                catch (Throwable throwable) {
                    LinuxDisplay.F();
                    throw throwable;
                }
                LinuxDisplay.F();
                return byteBuffer;
            }
            ByteBuffer byteBuffer = null;
            LinuxDisplay.F();
            return byteBuffer;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native ByteBuffer nGetCurrentGammaRamp(long var0, int var2);

    private static int K() {
        int n2;
        if (LinuxDisplay.L()) {
            org.lwjgl.d.a((CharSequence)"Using Xrandr for display mode switching");
            n2 = 10;
        } else if (LinuxDisplay.M()) {
            org.lwjgl.d.a((CharSequence)"Using XF86VidMode for display mode switching");
            n2 = 11;
        } else {
            org.lwjgl.d.a((CharSequence)"No display mode extensions available");
            n2 = 12;
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean L() {
        if (dx.b("LWJGL_DISABLE_XRANDR")) {
            return false;
        }
        LinuxDisplay.C();
        try {
            boolean bl2;
            LinuxDisplay.E();
            try {
                bl2 = LinuxDisplay.nIsXrandrSupported(LinuxDisplay.G());
            }
            catch (Throwable throwable) {
                try {
                    LinuxDisplay.F();
                    throw throwable;
                }
                catch (c c2) {
                    org.lwjgl.d.a((CharSequence)("Got exception while querying Xrandr support: " + c2));
                    boolean bl3 = false;
                    return bl3;
                }
            }
            LinuxDisplay.F();
            return bl2;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native boolean nIsXrandrSupported(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean M() {
        LinuxDisplay.C();
        try {
            boolean bl2;
            LinuxDisplay.E();
            try {
                bl2 = LinuxDisplay.nIsXF86VidModeSupported(LinuxDisplay.G());
            }
            catch (Throwable throwable) {
                try {
                    LinuxDisplay.F();
                    throw throwable;
                }
                catch (c c2) {
                    org.lwjgl.d.a((CharSequence)("Got exception while querying XF86VM support: " + c2));
                    boolean bl3 = false;
                    return bl3;
                }
            }
            LinuxDisplay.F();
            return bl2;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native boolean nIsXF86VidModeSupported(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean N() {
        if (dx.b("LWJGL_DISABLE_NETWM")) {
            return false;
        }
        LinuxDisplay.C();
        try {
            boolean bl2;
            LinuxDisplay.E();
            try {
                bl2 = LinuxDisplay.nIsNetWMFullscreenSupported(LinuxDisplay.G(), LinuxDisplay.H());
            }
            catch (Throwable throwable) {
                try {
                    LinuxDisplay.F();
                    throw throwable;
                }
                catch (c c2) {
                    org.lwjgl.d.a((CharSequence)("Got exception while querying NetWM support: " + c2));
                    boolean bl3 = false;
                    return bl3;
                }
            }
            LinuxDisplay.F();
            return bl2;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native boolean nIsNetWMFullscreenSupported(long var0, int var2);

    static void C() {
        try {
            LinuxDisplay.nLockAWT();
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Caught exception while locking AWT: " + c2));
        }
    }

    private static native void nLockAWT();

    static void D() {
        try {
            LinuxDisplay.nUnlockAWT();
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Caught exception while unlocking AWT: " + c2));
        }
    }

    private static native void nUnlockAWT();

    static void E() {
        if (D == 0) {
            try {
                GLContext.b();
                org.lwjgl.opengles.GLContext.loadOpenGLLibrary();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            C = LinuxDisplay.setErrorHandler();
            A = LinuxDisplay.openDisplay();
        }
        ++D;
    }

    private static native int callErrorHandler(long var0, long var2, long var4);

    private static native long setErrorHandler();

    private static native long resetErrorHandler(long var0);

    private static native void synchronize(long var0, boolean var2);

    private static int a(long l2, long l3, long l4, long l5, long l6, long l7, long l8) {
        if (ag && l7 == 42L) {
            return 0;
        }
        if (l2 == LinuxDisplay.G()) {
            String string = LinuxDisplay.getErrorText(l2, l6);
            throw new c("X Error - disp: 0x" + Long.toHexString(l4) + " serial: " + l5 + " error: " + string + " request_code: " + l7 + " minor_code: " + l8);
        }
        if (C != 0L) {
            return LinuxDisplay.callErrorHandler(C, l2, l3);
        }
        return 0;
    }

    private static native String getErrorText(long var0, long var2);

    static void F() {
    }

    static native long openDisplay();

    static native void closeDisplay(long var0);

    private int c(boolean bl2) {
        if (bl2) {
            if (this.G == 10 && LinuxDisplay.N()) {
                org.lwjgl.d.a((CharSequence)"Using NetWM for fullscreen window");
                return 2;
            }
            org.lwjgl.d.a((CharSequence)"Using legacy mode for fullscreen window");
            return 1;
        }
        return 3;
    }

    static long G() {
        if (D <= 0) {
            throw new InternalError("display_connection_usage_count = " + D);
        }
        return A;
    }

    static int H() {
        return LinuxDisplay.nGetDefaultScreen(LinuxDisplay.G());
    }

    static native int nGetDefaultScreen(long var0);

    static long I() {
        return B;
    }

    private void O() {
        if (this.N) {
            LinuxDisplay.nUngrabKeyboard(LinuxDisplay.G());
            this.N = false;
        }
    }

    static native int nUngrabKeyboard(long var0);

    private void P() {
        int n2;
        if (!this.N && (n2 = LinuxDisplay.nGrabKeyboard(LinuxDisplay.G(), LinuxDisplay.I())) == 0) {
            this.N = true;
        }
    }

    static native int nGrabKeyboard(long var0, long var2);

    private void Q() {
        int n2;
        if (!this.O && (n2 = LinuxDisplay.nGrabPointer(LinuxDisplay.G(), LinuxDisplay.I(), 0L)) == 0) {
            this.O = true;
            if (LinuxDisplay.W()) {
                LinuxDisplay.nSetViewPort(LinuxDisplay.G(), LinuxDisplay.I(), LinuxDisplay.H());
            }
        }
    }

    static native int nGrabPointer(long var0, long var2, long var4);

    private static native void nSetViewPort(long var0, long var2, int var4);

    private void R() {
        if (this.O) {
            this.O = false;
            LinuxDisplay.nUngrabPointer(LinuxDisplay.G());
        }
    }

    static native int nUngrabPointer(long var0);

    private static boolean S() {
        return w == 1 || w == 2;
    }

    private boolean T() {
        return !this.P && this.Q && this.am != null;
    }

    private void U() {
        if (LinuxDisplay.S() || this.T()) {
            this.Q();
        } else {
            this.R();
        }
        this.V();
    }

    private void V() {
        long l2 = this.T() ? this.W : this.V;
        LinuxDisplay.nDefineCursor(LinuxDisplay.G(), LinuxDisplay.I(), l2);
    }

    private static native void nDefineCursor(long var0, long var2, long var4);

    private static boolean W() {
        return w == 1;
    }

    private void X() {
        if (LinuxDisplay.W()) {
            this.P();
        } else {
            this.O();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ek ek2, DisplayMode displayMode, Canvas canvas, int n2, int n3) {
        LinuxDisplay.C();
        try {
            LinuxDisplay.E();
            try {
                if (ek2 instanceof ej) {
                    this.I = new LinuxDisplayPeerInfo();
                }
                ByteBuffer byteBuffer = this.I.g();
                try {
                    w = this.c(dx.g());
                    if (w != 3) {
                        gr.a(true);
                    }
                    boolean bl2 = dx.b("org.lwjgl.opengl.Window.undecorated") || w != 3 && dx.b("org.lwjgl.opengl.Window.undecorated_fs");
                    this.ae = canvas;
                    this.af = canvas != null ? LinuxDisplay.a(canvas) : LinuxDisplay.getRootWindow(LinuxDisplay.G(), LinuxDisplay.H());
                    this.Y = dx.y();
                    this.Z = false;
                    this.aa = n2;
                    this.ab = n3;
                    this.ac = displayMode.b();
                    this.ad = displayMode.c();
                    if (displayMode.a() && this.G == 10) {
                        ji ji2 = jh.a(dx.d());
                        n2 = ji2.e;
                        n3 = ji2.f;
                    }
                    B = LinuxDisplay.nCreateWindow(LinuxDisplay.G(), LinuxDisplay.H(), byteBuffer, displayMode, w, n2, n3, bl2, this.af, this.Y);
                    this.an = dx.c("LWJGL_WM_CLASS");
                    if (this.an == null) {
                        this.an = dx.e();
                    }
                    this.a(dx.e(), this.an);
                    LinuxDisplay.mapRaised(LinuxDisplay.G(), B);
                    ag = canvas != null && LinuxDisplay.a(this.af);
                    this.W = LinuxDisplay.af();
                    this.V = 0L;
                    this.R = false;
                    this.P = false;
                    this.O = false;
                    this.N = false;
                    this.U = false;
                    this.Q = false;
                    this.S = false;
                    this.T = true;
                    if (ek2 instanceof ej) {
                        ((ej)ek2).a(B, LinuxDisplay.G(), 4, (org.lwjgl.opengles.PixelFormat)ek2.b());
                    }
                    if (canvas != null) {
                        canvas.addFocusListener(this.ao);
                        this.ai = canvas.isFocusOwner();
                        this.aj = true;
                    }
                }
                finally {
                    this.I.f();
                }
            }
            catch (c c2) {
                LinuxDisplay.F();
                throw c2;
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native long nCreateWindow(long var0, int var2, ByteBuffer var3, DisplayMode var4, int var5, int var6, int var7, boolean var8, long var9, boolean var11);

    private static native long getRootWindow(long var0, int var2);

    private static native boolean hasProperty(long var0, long var2, long var4);

    private static native long getParentWindow(long var0, long var2);

    private static native int getChildCount(long var0, long var2);

    private static native void mapRaised(long var0, long var2);

    private static native void reparentWindow(long var0, long var2, long var4, int var6, int var7);

    private static native long nGetInputFocus(long var0);

    private static native void nSetInputFocus(long var0, long var2, long var4);

    private static native void nSetWindowSize(long var0, long var2, int var4, int var5, boolean var6);

    private static native int nGetX(long var0, long var2);

    private static native int nGetY(long var0, long var2);

    private static native int nGetWidth(long var0, long var2);

    private static native int nGetHeight(long var0, long var2);

    private static boolean a(long l2) {
        long l3 = LinuxDisplay.a("_XEMBED_INFO", true);
        if (l3 != 0L) {
            long l4 = l2;
            while (l4 != 0L) {
                if (LinuxDisplay.hasProperty(LinuxDisplay.G(), l4, l3)) {
                    return true;
                }
                l4 = LinuxDisplay.getParentWindow(LinuxDisplay.G(), l4);
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static long a(Canvas canvas) {
        dk dk2 = dl.a();
        LinuxPeerInfo linuxPeerInfo = (LinuxPeerInfo)dk2.a(canvas, null, null);
        ByteBuffer byteBuffer = linuxPeerInfo.g();
        try {
            long l2 = linuxPeerInfo.e();
            return l2;
        }
        finally {
            linuxPeerInfo.f();
        }
    }

    private void Y() {
        this.U();
        this.X();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        LinuxDisplay.C();
        try {
            if (this.ae != null) {
                this.ae.removeFocusListener(this.ao);
            }
            try {
                this.a((Object)null);
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Failed to reset cursor: " + c2.getMessage()));
            }
            LinuxDisplay.nDestroyCursor(LinuxDisplay.G(), this.W);
            this.W = 0L;
            this.O();
            LinuxDisplay.nDestroyWindow(LinuxDisplay.G(), LinuxDisplay.I());
            LinuxDisplay.F();
            if (w != 3) {
                gr.a(false);
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    static native void nDestroyWindow(long var0, long var2);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(DisplayMode displayMode) {
        LinuxDisplay.C();
        try {
            this.b(displayMode);
            this.M = displayMode;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b(DisplayMode displayMode) {
        if (this.G == 10) {
            jh.a(false, jh.a(displayMode));
        } else {
            LinuxDisplay.E();
            try {
                LinuxDisplay.nSwitchDisplayMode(LinuxDisplay.G(), LinuxDisplay.H(), this.G, displayMode);
            }
            finally {
                LinuxDisplay.F();
            }
        }
    }

    private static native void nSwitchDisplayMode(long var0, int var2, int var3, DisplayMode var4);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static long a(String string, boolean bl2) {
        LinuxDisplay.E();
        try {
            long l2 = LinuxDisplay.nInternAtom(LinuxDisplay.G(), string, bl2);
            return l2;
        }
        finally {
            LinuxDisplay.F();
        }
    }

    static native long nInternAtom(long var0, String var2, boolean var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        LinuxDisplay.C();
        try {
            if (this.G == 10) {
                AccessController.doPrivileged(new go(this));
            } else {
                this.a(this.L);
            }
            if (LinuxDisplay.M()) {
                this.d(this.J);
            }
            gr.a(false);
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Caught exception while resetting mode: " + c2));
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public int c() {
        if (!LinuxDisplay.M()) {
            return 0;
        }
        LinuxDisplay.C();
        try {
            int n2;
            LinuxDisplay.E();
            try {
                n2 = LinuxDisplay.nGetGammaRampLength(LinuxDisplay.G(), LinuxDisplay.H());
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Got exception while querying gamma length: " + c2));
                int n3 = 0;
                LinuxDisplay.F();
                LinuxDisplay.D();
                return n3;
                {
                    catch (Throwable throwable) {
                        try {
                            LinuxDisplay.F();
                            throw throwable;
                        }
                        catch (c c3) {
                            org.lwjgl.d.a((CharSequence)("Failed to get gamma ramp length: " + c3));
                            int n4 = 0;
                            return n4;
                        }
                    }
                }
            }
            LinuxDisplay.F();
            return n2;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native int nGetGammaRampLength(long var0, int var2);

    public void setGammaRamp(FloatBuffer floatBuffer) {
        if (!LinuxDisplay.M()) {
            throw new c("No gamma ramp support (Missing XF86VM extension)");
        }
        this.d(LinuxDisplay.a(floatBuffer));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d(ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            LinuxDisplay.e(byteBuffer);
            this.K = byteBuffer;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void e(ByteBuffer byteBuffer) {
        LinuxDisplay.E();
        try {
            LinuxDisplay.nSetGammaRamp(LinuxDisplay.G(), LinuxDisplay.H(), byteBuffer);
        }
        finally {
            LinuxDisplay.F();
        }
    }

    private static native void nSetGammaRamp(long var0, int var2, ByteBuffer var3);

    private static ByteBuffer a(FloatBuffer floatBuffer) {
        return LinuxDisplay.nConvertToNativeRamp(floatBuffer, floatBuffer.position(), floatBuffer.remaining());
    }

    private static native ByteBuffer nConvertToNativeRamp(FloatBuffer var0, int var1, int var2);

    public String d() {
        return null;
    }

    public String e() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public DisplayMode f() {
        LinuxDisplay.C();
        try {
            gr.a();
            this.H = LinuxDisplay.a("WM_DELETE_WINDOW", false);
            this.G = LinuxDisplay.K();
            if (this.G == 12) {
                throw new c("No display mode extension is available");
            }
            DisplayMode[] arrdisplayMode = this.getAvailableDisplayModes();
            if (arrdisplayMode == null || arrdisplayMode.length == 0) {
                throw new c("No modes available");
            }
            switch (this.G) {
                case 10: {
                    this.L = (DisplayMode)AccessController.doPrivileged(new gp(this));
                    break;
                }
                case 11: {
                    this.L = arrdisplayMode[0];
                    break;
                }
                default: {
                    throw new c("Unknown display mode extension: " + this.G);
                }
            }
            this.M = this.L;
            this.K = this.J = LinuxDisplay.J();
            DisplayMode displayMode = this.L;
            return displayMode;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static DisplayMode Z() {
        LinuxDisplay.C();
        try {
            DisplayMode displayMode;
            LinuxDisplay.E();
            try {
                displayMode = LinuxDisplay.nGetCurrentXRandrMode(LinuxDisplay.G(), LinuxDisplay.H());
            }
            catch (Throwable throwable) {
                LinuxDisplay.F();
                throw throwable;
            }
            LinuxDisplay.F();
            return displayMode;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native DisplayMode nGetCurrentXRandrMode(long var0, int var2);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string) {
        LinuxDisplay.C();
        try {
            ByteBuffer byteBuffer = org.lwjgl.o.b(string);
            LinuxDisplay.nSetTitle(LinuxDisplay.G(), LinuxDisplay.I(), org.lwjgl.o.a(byteBuffer), byteBuffer.remaining() - 1);
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void nSetTitle(long var0, long var2, long var4, int var6);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(String string, String string2) {
        LinuxDisplay.C();
        try {
            ByteBuffer byteBuffer = org.lwjgl.o.b(string);
            ByteBuffer byteBuffer2 = org.lwjgl.o.b(string2);
            LinuxDisplay.nSetClassHint(LinuxDisplay.G(), LinuxDisplay.I(), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2));
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void nSetClassHint(long var0, long var2, long var4, long var6);

    public boolean g() {
        boolean bl2 = this.U;
        this.U = false;
        return bl2;
    }

    public boolean h() {
        return !this.S;
    }

    public boolean i() {
        return this.R || LinuxDisplay.W();
    }

    public boolean j() {
        boolean bl2 = this.T;
        this.T = false;
        return bl2;
    }

    public ii a(PixelFormat pixelFormat, ds ds2) {
        this.I = new LinuxDisplayPeerInfo(pixelFormat);
        return this.I;
    }

    private void a(LinuxEvent linuxEvent, int n2) {
        this.F.a(linuxEvent);
        this.F.c(this.af);
        this.F.a(LinuxDisplay.G(), this.af, true, n2);
    }

    private void a(LinuxEvent linuxEvent) {
        if (this.ae == null) {
            return;
        }
        switch (linuxEvent.a()) {
            case 2: {
                this.a(linuxEvent, 1);
                break;
            }
            case 3: {
                this.a(linuxEvent, 1);
                break;
            }
            case 4: {
                if (!ag && this.R) break;
                this.a(linuxEvent, 1);
                break;
            }
            case 5: {
                if (!ag && this.R) break;
                this.a(linuxEvent, 1);
                break;
            }
        }
    }

    private void aa() {
        while (LinuxEvent.getPending(LinuxDisplay.G()) > 0) {
            this.E.b(LinuxDisplay.G());
            long l2 = this.E.b();
            this.a(this.E);
            if (l2 != LinuxDisplay.I() || this.E.a(l2) || this.am != null && this.am.a(this.Q, this.ae(), this.E) || this.al != null && this.al.a(this.E)) continue;
            switch (this.E.a()) {
                case 9: {
                    this.a(true, this.E.d());
                    break;
                }
                case 10: {
                    this.a(false, this.E.d());
                    break;
                }
                case 33: {
                    if (this.E.f() != 32 || (long)this.E.a(0) != this.H) break;
                    this.U = true;
                    break;
                }
                case 19: {
                    this.T = true;
                    this.S = false;
                    break;
                }
                case 18: {
                    this.T = true;
                    this.S = true;
                    break;
                }
                case 12: {
                    this.T = true;
                    break;
                }
                case 22: {
                    int n2 = LinuxDisplay.nGetX(LinuxDisplay.G(), LinuxDisplay.I());
                    int n3 = LinuxDisplay.nGetY(LinuxDisplay.G(), LinuxDisplay.I());
                    int n4 = LinuxDisplay.nGetWidth(LinuxDisplay.G(), LinuxDisplay.I());
                    int n5 = LinuxDisplay.nGetHeight(LinuxDisplay.G(), LinuxDisplay.I());
                    this.aa = n2;
                    this.ab = n3;
                    if (this.ac == n4 && this.ad == n5) break;
                    this.Z = true;
                    this.ac = n4;
                    this.ad = n5;
                    break;
                }
                case 7: {
                    this.X = true;
                    break;
                }
                case 8: {
                    this.X = false;
                    break;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void k() {
        LinuxDisplay.C();
        try {
            this.aa();
            this.ab();
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2, int n3, int n4, int n5) {
        LinuxDisplay.C();
        try {
            LinuxDisplay.nReshape(LinuxDisplay.G(), LinuxDisplay.I(), n2, n3, n4, n5);
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void nReshape(long var0, long var2, int var4, int var5, int var6, int var7);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public DisplayMode[] getAvailableDisplayModes() {
        LinuxDisplay.C();
        try {
            DisplayMode[] arrdisplayMode;
            LinuxDisplay.E();
            if (this.G == 10) {
                DisplayMode[] arrdisplayMode2 = LinuxDisplay.nGetAvailableDisplayModes(LinuxDisplay.G(), LinuxDisplay.H(), this.G);
                int n2 = 24;
                if (arrdisplayMode2.length > 0) {
                    n2 = arrdisplayMode2[0].d();
                }
                ji[] arrji = jh.a(jh.d()[0]);
                DisplayMode[] arrdisplayMode3 = new DisplayMode[arrji.length];
                for (int i2 = 0; i2 < arrdisplayMode3.length; ++i2) {
                    arrdisplayMode3[i2] = new DisplayMode(arrji[i2].b, arrji[i2].c, n2, arrji[i2].d);
                }
                DisplayMode[] arrdisplayMode4 = arrdisplayMode3;
                return arrdisplayMode4;
            }
            try {
                DisplayMode[] arrdisplayMode5;
                arrdisplayMode = arrdisplayMode5 = LinuxDisplay.nGetAvailableDisplayModes(LinuxDisplay.G(), LinuxDisplay.H(), this.G);
            }
            catch (Throwable throwable) {
                LinuxDisplay.F();
                throw throwable;
            }
            LinuxDisplay.F();
            return arrdisplayMode;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native DisplayMode[] nGetAvailableDisplayModes(long var0, int var2, int var3);

    public boolean s() {
        return true;
    }

    public int t() {
        return this.am.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void u() {
        LinuxDisplay.C();
        try {
            this.am = new LinuxMouse(LinuxDisplay.G(), LinuxDisplay.I(), LinuxDisplay.I());
        }
        finally {
            LinuxDisplay.D();
        }
    }

    public void v() {
        this.am = null;
        this.Y();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(IntBuffer intBuffer, ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            this.am.a(this.Q, intBuffer, byteBuffer);
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            this.am.a(byteBuffer);
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2, int n3) {
        LinuxDisplay.C();
        try {
            this.am.a(n2, n3);
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private void ab() {
        if (this.ae == null) {
            return;
        }
        if (ag) {
            long l2 = 0L;
            if (this.ak != l2 || this.ai != this.R) {
                if (this.c(l2)) {
                    if (this.ai) {
                        LinuxDisplay.nSetInputFocus(LinuxDisplay.G(), B, 0L);
                        this.ak = B;
                        this.R = true;
                    } else {
                        LinuxDisplay.nSetInputFocus(LinuxDisplay.G(), this.ah, 0L);
                        this.ak = this.ah;
                        this.R = false;
                    }
                } else {
                    this.ak = l2;
                    this.R = false;
                }
            }
        } else if (this.aj && this.ai) {
            this.b(LinuxDisplay.I());
            this.aj = false;
        }
    }

    private void b(long l2) {
        try {
            LinuxDisplay.nSetInputFocus(LinuxDisplay.G(), l2, 0L);
            LinuxDisplay.nSync(LinuxDisplay.G(), false);
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Got exception while trying to focus: " + c2));
        }
    }

    private static native void nSync(long var0, boolean var2);

    private boolean c(long l2) {
        try {
            if (l2 == B) {
                return true;
            }
            if (LinuxDisplay.getChildCount(LinuxDisplay.G(), l2) != 0) {
                return false;
            }
            long l3 = LinuxDisplay.getParentWindow(LinuxDisplay.G(), l2);
            if (l3 == 0L) {
                return false;
            }
            long l4 = B;
            while (l4 != 0L) {
                l4 = LinuxDisplay.getParentWindow(LinuxDisplay.G(), l4);
                if (l4 != l3) continue;
                this.ah = l2;
                return true;
            }
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Failed to detect if parent window is active: " + c2.getMessage()));
            return true;
        }
        return false;
    }

    private void a(boolean bl2, int n2) {
        if (this.R == bl2 || n2 == 7 || n2 == 5 || n2 == 6 || ag) {
            return;
        }
        this.R = bl2;
        if (this.R) {
            this.ad();
        } else {
            this.ac();
        }
    }

    private void ac() {
        if (LinuxDisplay.W() || this.P) {
            return;
        }
        if (this.al != null) {
            this.al.a();
        }
        this.P = true;
        this.Y();
        if (w == 2) {
            LinuxDisplay.nIconifyWindow(LinuxDisplay.G(), LinuxDisplay.I(), LinuxDisplay.H());
            try {
                if (this.G == 10) {
                    AccessController.doPrivileged(new gq(this));
                } else {
                    this.b(this.L);
                }
                LinuxDisplay.e(this.J);
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Failed to restore saved mode: " + c2.getMessage()));
            }
        }
    }

    private static native void nIconifyWindow(long var0, long var2, int var4);

    private void ad() {
        if (LinuxDisplay.W() || !this.P) {
            return;
        }
        this.P = false;
        this.Y();
        if (w == 2) {
            try {
                this.b(this.M);
                LinuxDisplay.e(this.K);
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Failed to restore mode: " + c2.getMessage()));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(boolean bl2) {
        LinuxDisplay.C();
        try {
            if (bl2 != this.Q) {
                this.Q = bl2;
                this.Y();
                this.am.a(this.Q, this.ae());
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private boolean ae() {
        return this.O && this.T();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int w() {
        LinuxDisplay.C();
        try {
            int n2;
            LinuxDisplay.E();
            try {
                n2 = LinuxDisplay.nGetNativeCursorCapabilities(LinuxDisplay.G());
            }
            catch (Throwable throwable) {
                try {
                    LinuxDisplay.F();
                    throw throwable;
                }
                catch (c c2) {
                    throw new RuntimeException(c2);
                }
            }
            LinuxDisplay.F();
            return n2;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native int nGetNativeCursorCapabilities(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Object object) {
        this.V = LinuxDisplay.c(object);
        LinuxDisplay.C();
        try {
            this.V();
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int x() {
        LinuxDisplay.C();
        try {
            int n2;
            LinuxDisplay.E();
            try {
                n2 = LinuxDisplay.nGetMinCursorSize(LinuxDisplay.G(), LinuxDisplay.I());
            }
            catch (Throwable throwable) {
                try {
                    LinuxDisplay.F();
                    throw throwable;
                }
                catch (c c2) {
                    org.lwjgl.d.a((CharSequence)("Exception occurred in getMinCursorSize: " + c2));
                    int n3 = 0;
                    return n3;
                }
            }
            LinuxDisplay.F();
            return n2;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native int nGetMinCursorSize(long var0, long var2);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int y() {
        LinuxDisplay.C();
        try {
            int n2;
            LinuxDisplay.E();
            try {
                n2 = LinuxDisplay.nGetMaxCursorSize(LinuxDisplay.G(), LinuxDisplay.I());
            }
            catch (Throwable throwable) {
                try {
                    LinuxDisplay.F();
                    throw throwable;
                }
                catch (c c2) {
                    org.lwjgl.d.a((CharSequence)("Exception occurred in getMaxCursorSize: " + c2));
                    int n3 = 0;
                    return n3;
                }
            }
            LinuxDisplay.F();
            return n2;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native int nGetMaxCursorSize(long var0, long var2);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void z() {
        LinuxDisplay.C();
        try {
            this.al = new LinuxKeyboard(LinuxDisplay.G(), LinuxDisplay.I());
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void A() {
        LinuxDisplay.C();
        try {
            this.al.a(LinuxDisplay.G());
            this.al = null;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            this.al.b(byteBuffer);
        }
        finally {
            LinuxDisplay.D();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(ByteBuffer byteBuffer) {
        LinuxDisplay.C();
        try {
            this.al.a(byteBuffer);
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native long nCreateCursor(long var0, int var2, int var3, int var4, int var5, int var6, IntBuffer var7, int var8, IntBuffer var9, int var10);

    private static long af() {
        return LinuxDisplay.nCreateBlankCursor(LinuxDisplay.G(), LinuxDisplay.I());
    }

    static native long nCreateBlankCursor(long var0, long var2);

    public Object a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer, IntBuffer intBuffer2) {
        LinuxDisplay.C();
        try {
            LinuxDisplay.E();
            try {
                long l2 = LinuxDisplay.nCreateCursor(LinuxDisplay.G(), n2, n3, n4, n5, n6, intBuffer, intBuffer.position(), intBuffer2, intBuffer2 != null ? intBuffer2.position() : -1);
                Long l3 = l2;
                return l3;
            }
            catch (c c2) {
                LinuxDisplay.F();
                throw c2;
            }
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static long c(Object object) {
        return object != null ? (Long)object : 0L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(Object object) {
        LinuxDisplay.C();
        try {
            LinuxDisplay.nDestroyCursor(LinuxDisplay.G(), LinuxDisplay.c(object));
            LinuxDisplay.F();
        }
        finally {
            LinuxDisplay.D();
        }
    }

    static native void nDestroyCursor(long var0, long var2);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int l() {
        LinuxDisplay.C();
        try {
            int n2;
            LinuxDisplay.E();
            try {
                n2 = LinuxDisplay.nGetPbufferCapabilities(LinuxDisplay.G(), LinuxDisplay.H());
            }
            catch (Throwable throwable) {
                try {
                    LinuxDisplay.F();
                    throw throwable;
                }
                catch (c c2) {
                    org.lwjgl.d.a((CharSequence)("Exception occurred in getPbufferCapabilities: " + c2));
                    int n3 = 0;
                    return n3;
                }
            }
            LinuxDisplay.F();
            return n2;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native int nGetPbufferCapabilities(long var0, int var2);

    public boolean a(ii ii2) {
        return false;
    }

    public ii a(int n2, int n3, PixelFormat pixelFormat, ds ds2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        return new LinuxPbufferPeerInfo(n2, n3, pixelFormat);
    }

    public void a(ii ii2, int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    public void a(ii ii2, int n2) {
        throw new UnsupportedOperationException();
    }

    public void b(ii ii2, int n2) {
        throw new UnsupportedOperationException();
    }

    private static ByteBuffer b(ByteBuffer[] arrbyteBuffer) {
        int n2;
        int n3 = 0;
        for (ByteBuffer byteBuffer : arrbyteBuffer) {
            int n4 = byteBuffer.limit() / 4;
            n2 = (int)Math.sqrt(n4);
            if (n2 <= 0) continue;
            n3 += 8;
            n3 += n2 * n2 * 4;
        }
        if (n3 == 0) {
            return null;
        }
        ByteBuffer byteBuffer = BufferUtils.a(n3);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        for (ByteBuffer byteBuffer2 : arrbyteBuffer) {
            n2 = byteBuffer2.limit() / 4;
            int n5 = (int)Math.sqrt(n2);
            byteBuffer.putInt(n5);
            byteBuffer.putInt(n5);
            for (int i2 = 0; i2 < n5; ++i2) {
                for (int i3 = 0; i3 < n5; ++i3) {
                    byte by2 = byteBuffer2.get(i3 * 4 + i2 * n5 * 4);
                    byte by3 = byteBuffer2.get(i3 * 4 + i2 * n5 * 4 + 1);
                    byte by4 = byteBuffer2.get(i3 * 4 + i2 * n5 * 4 + 2);
                    byte by5 = byteBuffer2.get(i3 * 4 + i2 * n5 * 4 + 3);
                    byteBuffer.put(by5);
                    byteBuffer.put(by2);
                    byteBuffer.put(by3);
                    byteBuffer.put(by4);
                }
            }
        }
        return byteBuffer;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int a(ByteBuffer[] arrbyteBuffer) {
        LinuxDisplay.C();
        try {
            ByteBuffer byteBuffer;
            block10: {
                int n2;
                LinuxDisplay.E();
                try {
                    byteBuffer = LinuxDisplay.b(arrbyteBuffer);
                    if (byteBuffer != null) break block10;
                    n2 = 0;
                }
                catch (Throwable throwable) {
                    try {
                        LinuxDisplay.F();
                        throw throwable;
                    }
                    catch (c c2) {
                        org.lwjgl.d.a((CharSequence)("Failed to set display icon: " + c2));
                        int n3 = 0;
                        return n3;
                    }
                }
                LinuxDisplay.F();
                return n2;
            }
            LinuxDisplay.nSetWindowIcon(LinuxDisplay.G(), LinuxDisplay.I(), byteBuffer, byteBuffer.capacity());
            int n4 = arrbyteBuffer.length;
            LinuxDisplay.F();
            return n4;
        }
        finally {
            LinuxDisplay.D();
        }
    }

    private static native void nSetWindowIcon(long var0, long var2, ByteBuffer var4, int var5);

    public int p() {
        return this.aa;
    }

    public int q() {
        return this.ab;
    }

    public int n() {
        return this.ac;
    }

    public int o() {
        return this.ad;
    }

    public boolean B() {
        return this.X;
    }

    public void a(boolean bl2) {
        if (this.Y == bl2) {
            return;
        }
        this.Y = bl2;
        LinuxDisplay.nSetWindowSize(LinuxDisplay.G(), LinuxDisplay.I(), this.ac, this.ad, bl2);
    }

    public boolean m() {
        if (this.Z) {
            this.Z = false;
            return true;
        }
        return false;
    }

    public float r() {
        return 1.0f;
    }

    static /* synthetic */ boolean a(LinuxDisplay linuxDisplay, boolean bl2) {
        linuxDisplay.ai = bl2;
        return linuxDisplay.ai;
    }

    static /* synthetic */ boolean b(LinuxDisplay linuxDisplay, boolean bl2) {
        linuxDisplay.aj = bl2;
        return linuxDisplay.aj;
    }
}

