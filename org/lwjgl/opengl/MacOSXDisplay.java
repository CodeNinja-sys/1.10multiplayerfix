/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.Robot;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.BufferUtils;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.MacOSXCanvasPeerInfo;
import org.lwjgl.opengl.MacOSXMouseEventQueue;
import org.lwjgl.opengl.MacOSXNativeKeyboard;
import org.lwjgl.opengl.MacOSXNativeMouse;
import org.lwjgl.opengl.MacOSXPbufferPeerInfo;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dn;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.eg;
import org.lwjgl.opengl.ei;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.gk;
import org.lwjgl.opengl.hd;
import org.lwjgl.opengl.ii;

final class MacOSXDisplay
implements eg {
    private static final int a = 24;
    private static final int b = 256;
    private Canvas c;
    private Robot d;
    private MacOSXMouseEventQueue e;
    private gk f;
    private DisplayMode g;
    private MacOSXNativeMouse h;
    private MacOSXNativeKeyboard i;
    private ByteBuffer j;
    private ByteBuffer k;
    private boolean l = false;
    private static final IntBuffer m = BufferUtils.d(16);
    private boolean n;
    private boolean o;
    private boolean p = true;
    private boolean q = false;
    private long r = 0L;
    private boolean s = false;
    private float t = 1.0f;

    MacOSXDisplay() {
    }

    private native ByteBuffer nCreateWindow(int var1, int var2, int var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9, boolean var10, ByteBuffer var11, ByteBuffer var12);

    private native Object nGetCurrentDisplayMode();

    private native void nGetDisplayModes(Object var1);

    private native boolean nIsMiniaturized(ByteBuffer var1);

    private native boolean nIsFocused(ByteBuffer var1);

    private native void nSetResizable(ByteBuffer var1, boolean var2);

    private native void nResizeWindow(ByteBuffer var1, int var2, int var3, int var4, int var5);

    private native boolean nWasResized(ByteBuffer var1);

    private native int nGetX(ByteBuffer var1);

    private native int nGetY(ByteBuffer var1);

    private native int nGetWidth(ByteBuffer var1);

    private native int nGetHeight(ByteBuffer var1);

    private native boolean nIsNativeMode(ByteBuffer var1);

    private static boolean E() {
        return dx.b("org.lwjgl.opengl.Window.undecorated");
    }

    public void a(ek ek2, DisplayMode displayMode, Canvas canvas, int n2, int n3) {
        boolean bl2 = dx.g();
        boolean bl3 = dx.y();
        boolean bl4 = canvas != null && !bl2;
        boolean bl5 = org.lwjgl.d.a(10, 7) && canvas == null && !dx.b("org.lwjgl.opengl.Display.disableOSXFullscreenModeAPI");
        this.s = org.lwjgl.d.a(10, 7) && canvas == null && (dx.b("org.lwjgl.opengl.Display.enableHighDPI") || bl2);
        this.c = bl4 ? canvas : null;
        this.o = false;
        ei ei2 = (ei)dx.a();
        ii ii2 = ei2.b;
        ByteBuffer byteBuffer = ii2.g();
        ByteBuffer byteBuffer2 = bl4 ? ((MacOSXCanvasPeerInfo)ii2).a : this.j;
        try {
            this.j = this.nCreateWindow(n2, n3, displayMode.b(), displayMode.c(), bl2, MacOSXDisplay.E(), bl3, bl4, bl5, this.s, byteBuffer, byteBuffer2);
            if (bl2) {
                this.l = true;
                m.put(2, displayMode.b());
                m.put(3, displayMode.c());
            }
            this.p = this.nIsNativeMode(byteBuffer);
            if (!this.p) {
                this.d = dn.a(this.c);
            }
        }
        catch (c c2) {
            this.a();
            throw c2;
        }
        finally {
            ii2.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void C() {
        MacOSXDisplay macOSXDisplay = this;
        synchronized (macOSXDisplay) {
            this.o = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(boolean bl2) {
        MacOSXDisplay macOSXDisplay = this;
        synchronized (macOSXDisplay) {
            this.n = bl2;
        }
        this.q = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(float f2) {
        MacOSXDisplay macOSXDisplay = this;
        synchronized (macOSXDisplay) {
            this.t = f2;
        }
    }

    public native void nDestroyCALayer(ByteBuffer var1);

    public native void nDestroyWindow(ByteBuffer var1);

    public void a() {
        if (!this.p) {
            ei ei2 = (ei)dx.a();
            ii ii2 = ei2.b;
            if (ii2 != null) {
                ByteBuffer byteBuffer = ii2.h();
                this.nDestroyCALayer(byteBuffer);
            }
            this.d = null;
        }
        this.nDestroyWindow(this.j);
    }

    public int c() {
        return 256;
    }

    public native void setGammaRamp(FloatBuffer var1);

    public String d() {
        return null;
    }

    public String e() {
        return null;
    }

    private static boolean a(DisplayMode displayMode, DisplayMode displayMode2) {
        return displayMode.b() == displayMode2.b() && displayMode.c() == displayMode2.c() && displayMode.d() == displayMode2.d() && displayMode.e() == displayMode2.e();
    }

    public void a(DisplayMode displayMode) {
        DisplayMode[] arrdisplayMode;
        for (DisplayMode displayMode2 : arrdisplayMode = this.getAvailableDisplayModes()) {
            if (!MacOSXDisplay.a(displayMode2, displayMode)) continue;
            this.g = displayMode2;
            return;
        }
        throw new c(displayMode + " is not supported");
    }

    public void b() {
        this.g = null;
        this.restoreGamma();
    }

    private native void restoreGamma();

    public Object b(int n2, int n3, int n4, int n5) {
        return new DisplayMode(n2, n3, n4, n5);
    }

    public DisplayMode f() {
        return (DisplayMode)this.nGetCurrentDisplayMode();
    }

    public void a(Object object, int n2, int n3, int n4, int n5) {
        List list = (List)object;
        DisplayMode displayMode = new DisplayMode(n2, n3, n4, n5);
        list.add(displayMode);
    }

    public DisplayMode[] getAvailableDisplayModes() {
        ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
        this.nGetDisplayModes(arrayList);
        arrayList.add(dx.c());
        return arrayList.toArray(new DisplayMode[arrayList.size()]);
    }

    private native void nSetTitle(ByteBuffer var1, ByteBuffer var2);

    public void a(String string) {
        ByteBuffer byteBuffer = org.lwjgl.o.b(string);
        this.nSetTitle(this.j, byteBuffer);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean g() {
        boolean bl2;
        MacOSXDisplay macOSXDisplay = this;
        synchronized (macOSXDisplay) {
            bl2 = this.o;
            this.o = false;
        }
        return bl2;
    }

    public boolean h() {
        return true;
    }

    public boolean i() {
        if (this.p) {
            return this.nIsFocused(this.j);
        }
        return dx.f().hasFocus();
    }

    public Canvas D() {
        return this.c;
    }

    public boolean j() {
        return false;
    }

    public ii a(PixelFormat pixelFormat, ds ds2) {
        try {
            return new hd(pixelFormat, ds2, true);
        }
        catch (c c2) {
            return new hd(pixelFormat, ds2, false);
        }
    }

    public void k() {
        boolean bl2 = true;
        ei ei2 = (ei)dx.a();
        if (bl2) {
            if (this.l) {
                this.l = false;
            } else {
                GL11.c(2978, m);
            }
            ei2.c.h();
            GL11.e(m.get(0), m.get(1), m.get(2), m.get(3));
        }
        if (this.p && this.q) {
            this.q = false;
            try {
                this.a((Object)this.r);
            }
            catch (c c2) {
                c2.printStackTrace();
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
    }

    public boolean s() {
        return dn.a();
    }

    public int t() {
        return dn.b();
    }

    public void u() {
        if (this.p) {
            this.h = new MacOSXNativeMouse(this, this.j);
            this.h.b();
        } else {
            this.e = new MacOSXMouseEventQueue(this.c);
            this.e.d();
        }
    }

    public void v() {
        if (this.p) {
            try {
                MacOSXNativeMouse.b(0L);
            }
            catch (c c2) {
                // empty catch block
            }
            this.b(false);
            if (this.h != null) {
                this.h.c();
            }
            this.h = null;
        } else {
            if (this.e != null) {
                MacOSXMouseEventQueue.nGrabMouse(false);
                this.e.e();
            }
            this.e = null;
        }
    }

    public void a(IntBuffer intBuffer, ByteBuffer byteBuffer) {
        if (this.p) {
            this.h.a(intBuffer, byteBuffer);
        } else {
            this.e.a(intBuffer, byteBuffer);
        }
    }

    public void a(ByteBuffer byteBuffer) {
        if (this.p) {
            this.h.a(byteBuffer);
        } else {
            this.e.a(byteBuffer);
        }
    }

    public void b(boolean bl2) {
        if (this.p) {
            this.h.a(bl2);
        } else {
            this.e.a(bl2);
        }
    }

    public int w() {
        if (this.p) {
            return 7;
        }
        return dn.c();
    }

    public void a(int n2, int n3) {
        if (this.p && this.h != null) {
            this.h.a(n2, n3);
        }
    }

    public void a(Object object) {
        if (this.p) {
            this.r = MacOSXDisplay.c(object);
            if (dx.v()) {
                if (this.n) {
                    MacOSXNativeMouse.b(this.r);
                } else {
                    MacOSXNativeMouse.b(0L);
                }
            }
        }
    }

    public int x() {
        return 1;
    }

    public int y() {
        DisplayMode displayMode = dx.c();
        return Math.min(displayMode.b(), displayMode.c()) / 2;
    }

    public void z() {
        if (this.p) {
            this.i = new MacOSXNativeKeyboard(this.j);
            this.i.b();
        } else {
            this.f = new gk(this.c);
            this.f.b();
        }
    }

    public void A() {
        if (this.p) {
            if (this.i != null) {
                this.i.c();
            }
            this.i = null;
        } else {
            if (this.f != null) {
                this.f.c();
            }
            this.f = null;
        }
    }

    public void b(ByteBuffer byteBuffer) {
        if (this.p) {
            this.i.c(byteBuffer);
        } else {
            this.f.c(byteBuffer);
        }
    }

    public void c(ByteBuffer byteBuffer) {
        if (this.p) {
            this.i.a(byteBuffer);
        } else {
            this.f.a(byteBuffer);
        }
    }

    public Object a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer, IntBuffer intBuffer2) {
        if (this.p) {
            long l2 = MacOSXNativeMouse.a(n2, n3, n4, n5, n6, intBuffer, intBuffer2);
            return l2;
        }
        return dn.a(n2, n3, n4, n5, n6, intBuffer, intBuffer2);
    }

    public void b(Object object) {
        long l2 = MacOSXDisplay.c(object);
        if (this.r == l2) {
            this.r = 0L;
        }
        MacOSXNativeMouse.a(l2);
    }

    private static long c(Object object) {
        return object != null ? (Long)object : 0L;
    }

    public int l() {
        return 1;
    }

    public boolean a(ii ii2) {
        return false;
    }

    public ii a(int n2, int n3, PixelFormat pixelFormat, ds ds2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        return new MacOSXPbufferPeerInfo(n2, n3, pixelFormat, ds2);
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

    public int a(ByteBuffer[] arrbyteBuffer) {
        return 0;
    }

    public int p() {
        return this.nGetX(this.j);
    }

    public int q() {
        return this.nGetY(this.j);
    }

    public int n() {
        return this.nGetWidth(this.j);
    }

    public int o() {
        return this.nGetHeight(this.j);
    }

    public boolean B() {
        return this.n;
    }

    public void a(boolean bl2) {
        this.nSetResizable(this.j, bl2);
    }

    public boolean m() {
        return this.nWasResized(this.j);
    }

    public float r() {
        return this.s && !dx.g() ? this.t : 1.0f;
    }
}

