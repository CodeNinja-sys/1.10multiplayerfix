/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengles.PixelFormat
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.KeyboardFocusManager;
import java.awt.event.FocusAdapter;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.SwingUtilities;
import org.lwjgl.BufferUtils;
import org.lwjgl.a.j;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.WindowsDisplayPeerInfo;
import org.lwjgl.opengl.WindowsFileVersion;
import org.lwjgl.opengl.WindowsKeyboard;
import org.lwjgl.opengl.WindowsPbufferPeerInfo;
import org.lwjgl.opengl.WindowsPeerInfo;
import org.lwjgl.opengl.WindowsRegistry;
import org.lwjgl.opengl.dk;
import org.lwjgl.opengl.dl;
import org.lwjgl.opengl.dr;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.eg;
import org.lwjgl.opengl.ei;
import org.lwjgl.opengl.ej;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.ii;
import org.lwjgl.opengl.jb;
import org.lwjgl.opengl.jc;
import org.lwjgl.opengl.jd;
import org.lwjgl.opengl.je;
import org.lwjgl.opengl.jg;
import org.lwjgl.opengles.PixelFormat;

final class WindowsDisplay
implements eg {
    private static final int e = 256;
    private static final int f = 71;
    private static final int g = 3;
    private static final int h = 31;
    private static final int i = 512;
    private static final int j = 513;
    private static final int k = 514;
    private static final int l = 515;
    private static final int m = 516;
    private static final int n = 517;
    private static final int o = 518;
    private static final int p = 519;
    private static final int q = 520;
    private static final int r = 521;
    private static final int s = 523;
    private static final int t = 524;
    private static final int u = 525;
    private static final int v = 522;
    private static final int w = 533;
    private static final int x = 675;
    private static final int y = 561;
    private static final int z = 562;
    private static final int A = 532;
    private static final int B = 256;
    private static final int C = 257;
    private static final int D = 261;
    private static final int E = 260;
    private static final int F = 262;
    private static final int G = 258;
    private static final int H = 127;
    private static final int I = 128;
    private static final int J = 32;
    private static final int K = 33;
    private static final int L = 18;
    private static final int M = 274;
    private static final int N = 15;
    private static final int O = 8;
    private static final int P = 7;
    private static final int Q = 61440;
    private static final int R = 61456;
    private static final int S = 61472;
    private static final int T = 61488;
    private static final int U = 61504;
    private static final int V = 61520;
    private static final int W = 61536;
    private static final int X = 61552;
    private static final int Y = 61568;
    private static final int Z = 61584;
    private static final int aa = 61696;
    private static final int ab = 61712;
    private static final int ac = 61728;
    private static final int ad = 61744;
    private static final int ae = 61760;
    private static final int af = 61776;
    private static final int ag = 61792;
    private static final int ah = 61808;
    private static final int ai = 61824;
    private static final int aj = 61455;
    static final int a = 13;
    static final int b = 14;
    static final int c = 43;
    static final int d = 75;
    private static final int ak = 0;
    private static final int al = 1;
    private static final int am = 2;
    private static final int an = 5;
    private static final int ao = 6;
    private static final int ap = 0;
    private static final int aq = 1;
    private static final int ar = 2;
    private static final int as = 1;
    private static final int at = 7;
    private static final int au = 10;
    private static final int av = 9;
    private static final int aw = 3;
    private static final int ax = 0;
    private static final int ay = 1;
    private static final IntBuffer az = BufferUtils.d(4);
    private static final je aA = new je(null);
    private static final long aB = 0L;
    private static final long aC = 1L;
    private static final long aD = -1L;
    private static final long aE = -2L;
    private static final int aF = 1;
    private static final int aG = 2;
    private static final int aH = 4;
    private static final int aI = 32;
    private static final int aJ = -16;
    private static final int aK = -20;
    private static final int aL = 262144;
    private static final int aM = 65536;
    private static final int aN = 1;
    private static final int aO = 32;
    private static final int aP = 64;
    private static final int aQ = 1;
    private static final int aR = 2;
    private static WindowsDisplay aS;
    private static boolean aT;
    private WindowsDisplayPeerInfo aU;
    private Object aV;
    private static boolean aW;
    private Canvas aX;
    private long aY;
    private FocusAdapter aZ;
    private AtomicBoolean ba;
    private WindowsKeyboard bb;
    private jg bc;
    private boolean bd;
    private boolean be;
    private ByteBuffer bf;
    private ByteBuffer bg;
    private DisplayMode bh;
    private boolean bi;
    private boolean bj;
    private boolean bk;
    private boolean bl;
    private boolean bm;
    private boolean bn;
    private boolean bo;
    private int bp;
    private int bq;
    private int br;
    private int bs;
    private long bt;
    private long bu;
    private long bv;
    private long bw;
    private boolean bx;
    private int by = -1;
    private boolean bz;

    WindowsDisplay() {
        aS = this;
    }

    public void a(ek ek2, DisplayMode displayMode, Canvas canvas, int n2, int n3) {
        this.aX = canvas;
        aW = canvas != null;
        this.aY = canvas != null ? WindowsDisplay.a(canvas) : 0L;
        this.bt = WindowsDisplay.nCreateWindow(n2, n3, displayMode.b(), displayMode.c(), dx.g() || WindowsDisplay.E(), canvas != null, this.aY);
        if (dx.y() && canvas == null) {
            this.a(true);
        }
        if (this.bt == 0L) {
            throw new c("Failed to create window");
        }
        this.bu = WindowsDisplay.getDC(this.bt);
        if (this.bu == 0L) {
            WindowsDisplay.nDestroyWindow(this.bt);
            throw new c("Failed to get dc");
        }
        try {
            if (ek2 instanceof ei) {
                int n4 = WindowsPeerInfo.a(this.K(), 0, 0, (org.lwjgl.opengl.PixelFormat)ek2.b(), null, true, true, false, true);
                WindowsPeerInfo.setPixelFormat(this.K(), n4);
            } else {
                this.aU = new WindowsDisplayPeerInfo(true);
                ((ej)ek2).a(this.bt, this.bu, 4, (PixelFormat)ek2.b());
            }
            this.aU.a(this.J(), this.K());
            WindowsDisplay.showWindow(this.J(), 10);
            this.D();
            if (canvas == null) {
                WindowsDisplay.setForegroundWindow(this.J());
            } else {
                this.ba = new AtomicBoolean(false);
                this.aZ = new jb(this);
                canvas.addFocusListener(this.aZ);
                SwingUtilities.invokeLater(new jc(this));
            }
            this.G();
        }
        catch (c c2) {
            WindowsDisplay.nReleaseDC(this.bt, this.bu);
            WindowsDisplay.nDestroyWindow(this.bt);
            throw c2;
        }
    }

    private void D() {
        WindowsDisplay.getClientRect(this.bt, az);
        aA.b(az);
        this.br = WindowsDisplay.aA.c - WindowsDisplay.aA.a;
        this.bs = WindowsDisplay.aA.d - WindowsDisplay.aA.b;
    }

    private static native long nCreateWindow(int var0, int var1, int var2, int var3, boolean var4, boolean var5, long var6);

    private static boolean E() {
        return dx.b("org.lwjgl.opengl.Window.undecorated");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static long a(Canvas canvas) {
        dk dk2 = dl.a();
        WindowsPeerInfo windowsPeerInfo = (WindowsPeerInfo)dk2.a(canvas, null, null);
        ByteBuffer byteBuffer = windowsPeerInfo.g();
        try {
            long l2 = windowsPeerInfo.i();
            return l2;
        }
        finally {
            windowsPeerInfo.f();
        }
    }

    public void a() {
        if (this.aX != null) {
            this.aX.removeFocusListener(this.aZ);
            this.aZ = null;
        }
        WindowsDisplay.nReleaseDC(this.bt, this.bu);
        WindowsDisplay.nDestroyWindow(this.bt);
        this.M();
        this.L();
        WindowsDisplay.C();
        this.bd = false;
        this.be = false;
        this.bj = false;
        this.bk = false;
        this.bl = false;
        this.bz = false;
    }

    private static native void nReleaseDC(long var0, long var2);

    private static native void nDestroyWindow(long var0);

    static void C() {
        if (aT) {
            try {
                WindowsDisplay.clipCursor(null);
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Failed to reset cursor clipping: " + c2));
            }
            aT = false;
        }
    }

    private static void a(long l2, je je2) {
        az.put(0, 0).put(1, 0);
        WindowsDisplay.clientToScreen(l2, az);
        int n2 = az.get(0);
        int n3 = az.get(1);
        WindowsDisplay.getClientRect(l2, az);
        je2.b(az);
        je2.a(n2, n3);
    }

    static void a(long l2) {
        aT = true;
        WindowsDisplay.a(l2, aA);
        aA.a(az);
        WindowsDisplay.clipCursor(az);
    }

    private static native void clipCursor(IntBuffer var0);

    public void a(DisplayMode displayMode) {
        WindowsDisplay.nSwitchDisplayMode(displayMode);
        this.bh = displayMode;
        this.bi = true;
    }

    private static native void nSwitchDisplayMode(DisplayMode var0);

    private void a(boolean bl2, long l2) {
        if (this.bm) {
            return;
        }
        this.bm = true;
        this.bk = bl2;
        if (bl2) {
            if (dx.g()) {
                this.H();
            }
            if (this.aX == null) {
                WindowsDisplay.setForegroundWindow(this.J());
            }
            WindowsDisplay.setFocus(this.J());
            this.bl = true;
        } else {
            if (this.bb != null) {
                this.bb.a(l2);
            }
            if (dx.g()) {
                WindowsDisplay.showWindow(this.J(), 7);
                this.b();
            }
        }
        this.I();
        this.bm = false;
    }

    private static native void showWindow(long var0, int var2);

    private static native void setForegroundWindow(long var0);

    private static native void setFocus(long var0);

    private void F() {
        this.aX.setFocusable(false);
        this.aX.setFocusable(true);
        KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();
    }

    private void G() {
        if (this.aX == null) {
            WindowsDisplay.setFocus(this.J());
        } else {
            SwingUtilities.invokeLater(new jd(this));
        }
    }

    private void H() {
        try {
            this.d(this.bf);
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Failed to restore gamma: " + c2.getMessage()));
        }
        if (!this.bi) {
            this.bi = true;
            try {
                WindowsDisplay.nSwitchDisplayMode(this.bh);
            }
            catch (c c3) {
                org.lwjgl.d.a((CharSequence)("Failed to restore display mode: " + c3.getMessage()));
            }
        }
    }

    public void b() {
        try {
            this.d(this.bg);
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Failed to reset gamma ramp: " + c2.getMessage()));
        }
        this.bf = this.bg;
        if (this.bi) {
            this.bi = false;
            WindowsDisplay.nResetDisplayMode();
        }
        WindowsDisplay.C();
    }

    private static native void nResetDisplayMode();

    public int c() {
        return 256;
    }

    public void setGammaRamp(FloatBuffer floatBuffer) {
        this.d(WindowsDisplay.convertToNativeRamp(floatBuffer));
    }

    private static native ByteBuffer convertToNativeRamp(FloatBuffer var0);

    private static native ByteBuffer getCurrentGammaRamp();

    private void d(ByteBuffer byteBuffer) {
        WindowsDisplay.nSetGammaRamp(byteBuffer);
        this.bf = byteBuffer;
    }

    private static native void nSetGammaRamp(ByteBuffer var0);

    public String d() {
        try {
            String string = WindowsRegistry.a(3, "HARDWARE\\DeviceMap\\Video", "MaxObjectNumber");
            int n2 = string.charAt(0);
            String string2 = "";
            for (int i2 = 0; i2 < n2; ++i2) {
                String string3 = WindowsRegistry.a(3, "HARDWARE\\DeviceMap\\Video", "\\Device\\Video" + i2);
                String string4 = "\\registry\\machine\\";
                if (!string3.toLowerCase().startsWith(string4)) continue;
                String string5 = WindowsRegistry.a(3, string3.substring(string4.length()), "InstalledDisplayDrivers");
                if (string5.toUpperCase().startsWith("VGA")) {
                    string2 = string5;
                    continue;
                }
                if (string5.toUpperCase().startsWith("RDP") || string5.toUpperCase().startsWith("NMNDD")) continue;
                return string5;
            }
            if (!string2.equals("")) {
                return string2;
            }
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Exception occurred while querying registry: " + c2));
        }
        return null;
    }

    public String e() {
        WindowsFileVersion windowsFileVersion;
        String[] arrstring;
        String string = this.d();
        if (string != null && (arrstring = string.split(",")).length > 0 && (windowsFileVersion = this.nGetVersion(arrstring[0] + ".dll")) != null) {
            return windowsFileVersion.toString();
        }
        return null;
    }

    private native WindowsFileVersion nGetVersion(String var1);

    public DisplayMode f() {
        this.bf = this.bg = WindowsDisplay.getCurrentGammaRamp();
        this.bh = WindowsDisplay.getCurrentDisplayMode();
        return this.bh;
    }

    private static native DisplayMode getCurrentDisplayMode();

    public void a(String string) {
        ByteBuffer byteBuffer = org.lwjgl.o.c(string);
        WindowsDisplay.nSetTitle(this.bt, org.lwjgl.o.a((Buffer)byteBuffer));
    }

    private static native void nSetTitle(long var0, long var2);

    public boolean g() {
        boolean bl2 = this.bd;
        this.bd = false;
        return bl2;
    }

    public boolean h() {
        return !this.bj;
    }

    public boolean i() {
        return this.bk;
    }

    public boolean j() {
        boolean bl2 = this.be;
        this.be = false;
        return bl2;
    }

    public ii a(org.lwjgl.opengl.PixelFormat pixelFormat, ds ds2) {
        this.aU = new WindowsDisplayPeerInfo(false);
        return this.aU;
    }

    public void k() {
        WindowsDisplay.nUpdate();
        if (!this.bk && this.aX != null && this.ba.compareAndSet(true, false)) {
            WindowsDisplay.setFocus(this.J());
        }
        if (this.bl) {
            this.bl = false;
            try {
                dr dr2 = ((ek)dx.a()).n();
                if (dr2 != null && dr2.a()) {
                    dr2.b();
                }
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Exception occurred while trying to make context current: " + c2));
            }
        }
    }

    private static native void nUpdate();

    public void a(int n2, int n3, int n4, int n5) {
        WindowsDisplay.nReshape(this.J(), n2, n3, n4, n5, dx.g() || WindowsDisplay.E(), this.aX != null);
    }

    private static native void nReshape(long var0, int var2, int var3, int var4, int var5, boolean var6, boolean var7);

    public native DisplayMode[] getAvailableDisplayModes();

    public boolean s() {
        return this.bc.b();
    }

    public int t() {
        return this.bc.c();
    }

    public void u() {
        this.bc = new jg(this.J());
    }

    public void v() {
        if (this.bc != null) {
            this.bc.e();
        }
        this.bc = null;
    }

    public void a(IntBuffer intBuffer, ByteBuffer byteBuffer) {
        this.bc.a(intBuffer, byteBuffer, this);
    }

    public void a(ByteBuffer byteBuffer) {
        this.bc.a(byteBuffer);
    }

    public void b(boolean bl2) {
        this.bc.a(bl2);
        this.I();
    }

    public int w() {
        return 1;
    }

    public void a(int n2, int n3) {
        WindowsDisplay.a(this.J(), aA);
        int n4 = WindowsDisplay.aA.a + n2;
        int n5 = WindowsDisplay.aA.d - 1 - n3;
        WindowsDisplay.nSetCursorPosition(n4, n5);
        this.b(n2, n3);
    }

    private static native void nSetCursorPosition(int var0, int var1);

    public void a(Object object) {
        this.aV = object;
        this.I();
    }

    private void I() {
        try {
            if (this.bc != null && this.N()) {
                WindowsDisplay.b(this.bt);
                WindowsDisplay.nSetNativeCursor(this.J(), this.bc.d());
            } else {
                WindowsDisplay.nSetNativeCursor(this.J(), this.aV);
            }
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Failed to update cursor: " + c2));
        }
        this.O();
    }

    static native void nSetNativeCursor(long var0, Object var2);

    public int x() {
        return WindowsDisplay.getSystemMetrics(13);
    }

    public int y() {
        return WindowsDisplay.getSystemMetrics(13);
    }

    static native int getSystemMetrics(int var0);

    private static native long getDllInstance();

    private long J() {
        return this.bt;
    }

    private long K() {
        return this.bu;
    }

    private static native long getDC(long var0);

    private static native long getDesktopWindow();

    private static native long getForegroundWindow();

    static void b(long l2) {
        if (WindowsDisplay.getForegroundWindow() != l2 && !aW) {
            return;
        }
        WindowsDisplay.a(l2, aA);
        int n2 = WindowsDisplay.aA.a;
        int n3 = WindowsDisplay.aA.b;
        int n4 = (WindowsDisplay.aA.a + WindowsDisplay.aA.c) / 2;
        int n5 = (WindowsDisplay.aA.b + WindowsDisplay.aA.d) / 2;
        WindowsDisplay.nSetCursorPosition(n4, n5);
        int n6 = n4 - n2;
        int n7 = n5 - n3;
        if (aS != null) {
            aS.b(n6, WindowsDisplay.a(l2, n7));
        }
    }

    private void b(int n2, int n3) {
        if (this.bc != null) {
            this.bc.a(n2, n3);
        }
    }

    public void z() {
        this.bb = new WindowsKeyboard();
    }

    public void A() {
        this.bb = null;
    }

    public void b(ByteBuffer byteBuffer) {
        this.bb.a(byteBuffer);
    }

    public void c(ByteBuffer byteBuffer) {
        this.bb.b(byteBuffer);
    }

    public static native ByteBuffer nCreateCursor(int var0, int var1, int var2, int var3, int var4, IntBuffer var5, int var6, IntBuffer var7, int var8);

    public Object a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer, IntBuffer intBuffer2) {
        return WindowsDisplay.b(n2, n3, n4, n5, n6, intBuffer, intBuffer2);
    }

    static Object b(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer, IntBuffer intBuffer2) {
        return WindowsDisplay.nCreateCursor(n2, n3, n4, n5, n6, intBuffer, intBuffer.position(), intBuffer2, intBuffer2 != null ? intBuffer2.position() : -1);
    }

    public void b(Object object) {
        WindowsDisplay.doDestroyCursor(object);
    }

    static native void doDestroyCursor(Object var0);

    public int l() {
        try {
            return this.nGetPbufferCapabilities(new org.lwjgl.opengl.PixelFormat(0, 0, 0, 0, 0, 0, 0, 0, false));
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("Exception occurred while determining pbuffer capabilities: " + c2));
            return 0;
        }
    }

    private native int nGetPbufferCapabilities(org.lwjgl.opengl.PixelFormat var1);

    public boolean a(ii ii2) {
        return ((WindowsPbufferPeerInfo)ii2).d();
    }

    public ii a(int n2, int n3, org.lwjgl.opengl.PixelFormat pixelFormat, ds ds2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        return new WindowsPbufferPeerInfo(n2, n3, pixelFormat, intBuffer, intBuffer2);
    }

    public void a(ii ii2, int n2, int n3) {
        ((WindowsPbufferPeerInfo)ii2).a(n2, n3);
    }

    public void a(ii ii2, int n2) {
        ((WindowsPbufferPeerInfo)ii2).a(n2);
    }

    public void b(ii ii2, int n2) {
        ((WindowsPbufferPeerInfo)ii2).b(n2);
    }

    private void L() {
        if (this.bv != 0L) {
            WindowsDisplay.destroyIcon(this.bv);
            this.bv = 0L;
        }
    }

    private void M() {
        if (this.bw != 0L) {
            WindowsDisplay.destroyIcon(this.bw);
            this.bw = 0L;
        }
    }

    public int a(ByteBuffer[] arrbyteBuffer) {
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 0;
        int n3 = 16;
        int n4 = 32;
        block0: for (ByteBuffer byteBuffer : arrbyteBuffer) {
            long l2;
            int n5 = byteBuffer.limit() / 4;
            if ((int)Math.sqrt(n5) == n3 && !bl2) {
                l2 = WindowsDisplay.createIcon(n3, n3, byteBuffer.asIntBuffer());
                WindowsDisplay.sendMessage(this.bt, 128L, 0L, l2);
                this.L();
                this.bv = l2;
                ++n2;
                bl2 = true;
            }
            if ((int)Math.sqrt(n5) != n4 || bl3) continue;
            l2 = WindowsDisplay.createIcon(n4, n4, byteBuffer.asIntBuffer());
            WindowsDisplay.sendMessage(this.bt, 128L, 1L, l2);
            this.M();
            this.bw = l2;
            ++n2;
            bl3 = true;
            this.bx = false;
            long l3 = System.nanoTime();
            long l4 = 500000000L;
            while (true) {
                WindowsDisplay.nUpdate();
                if (this.bx || l4 < System.nanoTime() - l3) continue block0;
                Thread.yield();
            }
        }
        return n2;
    }

    private static native long createIcon(int var0, int var1, IntBuffer var2);

    private static native void destroyIcon(long var0);

    private static native long sendMessage(long var0, long var2, long var4, long var6);

    private static native long setWindowLongPtr(long var0, int var2, long var3);

    private static native long getWindowLongPtr(long var0, int var2);

    private static native boolean setWindowPos(long var0, long var2, int var4, int var5, int var6, int var7, long var8);

    private void a(int n2, int n3, long l2) {
        if (this.bc != null) {
            this.bc.a((byte)n2, (byte)n3, l2);
            if (this.by == -1 && n2 != -1 && n3 == 1) {
                this.by = n2;
                WindowsDisplay.nSetCapture(this.bt);
            }
            if (this.by != -1 && n2 == this.by && n3 == 0) {
                this.by = -1;
                WindowsDisplay.nReleaseCapture();
            }
        }
    }

    private boolean N() {
        return !this.bj && this.bk && org.lwjgl.a.j.x();
    }

    private static native long nSetCapture(long var0);

    private static native boolean nReleaseCapture();

    private void a(int n2, long l2) {
        if (this.bc != null) {
            this.bc.a(n2, l2);
        }
    }

    private static native void getClientRect(long var0, IntBuffer var2);

    private void a(long l2, long l3, long l4) {
        boolean bl2;
        byte by2 = (byte)(1L - (l3 >>> 31 & 1L));
        byte by3 = (byte)(l3 >>> 30 & 1L);
        boolean bl3 = bl2 = by2 == by3;
        if (this.bb != null) {
            this.bb.a((int)(l2 & 0xFFFFL), l4, bl2);
        }
    }

    private void b(long l2, long l3, long l4) {
        if (this.bb == null) {
            return;
        }
        byte by2 = (byte)(1L - (l3 >>> 31 & 1L));
        byte by3 = (byte)(l3 >>> 30 & 1L);
        boolean bl2 = by2 == by3;
        byte by4 = (byte)(l3 >>> 24 & 1L);
        int n2 = (int)(l3 >>> 16 & 0xFFL);
        this.bb.a((int)l2, n2, by4 != 0, by2, l4, bl2);
    }

    private static int a(long l2, int n2) {
        WindowsDisplay.getClientRect(l2, az);
        aA.b(az);
        return WindowsDisplay.aA.d - WindowsDisplay.aA.b - 1 - n2;
    }

    private static native void clientToScreen(long var0, IntBuffer var2);

    private static native void setWindowProc(Method var0);

    private static long a(long l2, int n2, long l3, long l4, long l5) {
        if (aS != null) {
            return aS.b(l2, n2, l3, l4, l5);
        }
        return WindowsDisplay.defWindowProc(l2, n2, l3, l4);
    }

    private static native long defWindowProc(long var0, int var2, long var3, long var5);

    private void O() {
        if ((dx.g() || this.bc != null && this.bc.a()) && !this.bj && this.bk && (WindowsDisplay.getForegroundWindow() == this.J() || aW)) {
            try {
                WindowsDisplay.a(this.J());
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("setupCursorClipping failed: " + c2.getMessage()));
            }
        } else {
            WindowsDisplay.C();
        }
    }

    private void c(boolean bl2) {
        if (bl2 != this.bj) {
            this.bj = bl2;
            this.O();
        }
    }

    private long b(long l2, int n2, long l3, long l4, long l5) {
        if (this.aX != null && !this.bk) {
            switch (n2) {
                case 513: 
                case 516: 
                case 519: 
                case 523: {
                    WindowsDisplay.sendMessage(this.aY, n2, l3, l4);
                }
            }
        }
        block3 : switch (n2) {
            case 6: {
                return 0L;
            }
            case 5: {
                switch ((int)l3) {
                    case 0: 
                    case 2: {
                        this.bn = true;
                        this.D();
                        this.c(false);
                        break block3;
                    }
                    case 1: {
                        this.c(true);
                    }
                }
                break;
            }
            case 532: {
                this.bn = true;
                this.D();
                break;
            }
            case 8: {
                this.a(false, l5);
                return 0L;
            }
            case 7: {
                this.a(true, l5);
                return 0L;
            }
            case 33: {
                if (this.aX == null) break;
                if (!this.bk) {
                    this.G();
                }
                return 3L;
            }
            case 512: {
                if (this.bc != null) {
                    short s2 = (short)(l4 & 0xFFFFL);
                    int n3 = WindowsDisplay.a(this.J(), (short)(l4 >>> 16));
                    this.bc.a(s2, n3, l5);
                }
                if (!this.bz) {
                    this.bz = true;
                    this.I();
                    this.nTrackMouseEvent(l2);
                }
                return 0L;
            }
            case 522: {
                short s3 = (short)(l3 >> 16 & 0xFFFFL);
                this.a((int)s3, l5);
                return 0L;
            }
            case 513: {
                this.a(0, 1, l5);
                return 0L;
            }
            case 514: {
                this.a(0, 0, l5);
                return 0L;
            }
            case 516: {
                this.a(1, 1, l5);
                return 0L;
            }
            case 517: {
                this.a(1, 0, l5);
                return 0L;
            }
            case 519: {
                this.a(2, 1, l5);
                return 0L;
            }
            case 520: {
                this.a(2, 0, l5);
                return 0L;
            }
            case 524: {
                if (l3 >> 16 == 1L) {
                    this.a(3, 0, l5);
                } else {
                    this.a(4, 0, l5);
                }
                return 1L;
            }
            case 523: {
                if ((l3 & 0xFFL) == 32L) {
                    this.a(3, 1, l5);
                } else {
                    this.a(4, 1, l5);
                }
                return 1L;
            }
            case 258: 
            case 262: {
                this.a(l3, l4, l5);
                return 0L;
            }
            case 261: {
                if (l3 == 18L || l3 == 121L) {
                    this.b(l3, l4, l5);
                    return 0L;
                }
            }
            case 257: {
                if (l3 == 44L && this.bb != null && !this.bb.a(183)) {
                    long l6 = l4 & Integer.MAX_VALUE;
                    this.b(l3, l6 &= 0xFFFFFFFFBFFFFFFFL, l5);
                }
            }
            case 256: 
            case 260: {
                this.b(l3, l4, l5);
                break;
            }
            case 18: {
                this.bd = true;
                return 0L;
            }
            case 274: {
                switch ((int)(l3 & 0xFFF0L)) {
                    case 61760: 
                    case 61808: {
                        return 0L;
                    }
                    case 61536: {
                        this.bd = true;
                        return 0L;
                    }
                }
                break;
            }
            case 15: {
                this.be = true;
                break;
            }
            case 675: {
                this.bz = false;
                break;
            }
            case 31: {
                WindowsDisplay.nReleaseCapture();
            }
            case 533: {
                if (this.by != -1) {
                    this.a(this.by, 0, l5);
                    this.by = -1;
                }
                return 0L;
            }
            case 71: {
                if (this.getWindowRect(l2, az)) {
                    aA.b(az);
                    this.bp = WindowsDisplay.aA.a;
                    this.bq = WindowsDisplay.aA.b;
                    break;
                }
                org.lwjgl.d.a((CharSequence)"WM_WINDOWPOSCHANGED: Unable to get window rect");
                break;
            }
            case 127: {
                this.bx = true;
            }
        }
        return WindowsDisplay.defWindowProc(l2, n2, l3, l4);
    }

    private native boolean getWindowRect(long var1, IntBuffer var3);

    public int p() {
        return this.bp;
    }

    public int q() {
        return this.bq;
    }

    public int n() {
        return this.br;
    }

    public int o() {
        return this.bs;
    }

    private native boolean nTrackMouseEvent(long var1);

    public boolean B() {
        return this.bz;
    }

    public void a(boolean bl2) {
        if (this.bo == bl2) {
            return;
        }
        this.bn = false;
        this.bo = bl2;
        int n2 = (int)WindowsDisplay.getWindowLongPtr(this.bt, -16);
        int n3 = (int)WindowsDisplay.getWindowLongPtr(this.bt, -20);
        n2 = bl2 && !dx.g() ? n2 | 0x50000 : n2 & 0xFFFAFFFF;
        WindowsDisplay.setWindowLongPtr(this.bt, -16, n2);
        WindowsDisplay.a(this.bt, aA);
        aA.a(az);
        this.adjustWindowRectEx(az, n2, false, n3);
        aA.b(az);
        WindowsDisplay.setWindowPos(this.bt, 0L, WindowsDisplay.aA.a, WindowsDisplay.aA.b, WindowsDisplay.aA.c - WindowsDisplay.aA.a, WindowsDisplay.aA.d - WindowsDisplay.aA.b, 36L);
        this.D();
    }

    private native boolean adjustWindowRectEx(IntBuffer var1, int var2, boolean var3, int var4);

    public boolean m() {
        if (this.bn) {
            this.bn = false;
            return true;
        }
        return false;
    }

    public float r() {
        return 1.0f;
    }

    static /* synthetic */ AtomicBoolean a(WindowsDisplay windowsDisplay) {
        return windowsDisplay.ba;
    }

    static /* synthetic */ void b(WindowsDisplay windowsDisplay) {
        windowsDisplay.F();
    }

    static /* synthetic */ Canvas c(WindowsDisplay windowsDisplay) {
        return windowsDisplay.aX;
    }

    static {
        try {
            Method method = WindowsDisplay.class.getDeclaredMethod("a", Long.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Long.TYPE);
            WindowsDisplay.setWindowProc(method);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException(noSuchMethodException);
        }
    }
}

