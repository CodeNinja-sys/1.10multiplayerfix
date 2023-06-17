/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.ab;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.CallbackUtil;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.LinuxContextImplementation;
import org.lwjgl.opengl.MacOSXContextImplementation;
import org.lwjgl.opengl.WindowsContextImplementation;
import org.lwjgl.opengl.dr;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.dw;
import org.lwjgl.opengl.ig;
import org.lwjgl.opengl.ii;
import org.lwjgl.x;

final class du
implements dr {
    private static final dw a;
    private static final ThreadLocal b;
    private final ByteBuffer c;
    private final ii d;
    private final ds e;
    private final boolean f;
    private boolean g;
    private boolean h;
    private Thread i;

    private static dw m() {
        switch (org.lwjgl.d.a()) {
            case 1: {
                return new LinuxContextImplementation();
            }
            case 3: {
                return new WindowsContextImplementation();
            }
            case 2: {
                return new MacOSXContextImplementation();
            }
        }
        throw new IllegalStateException("Unsupported platform");
    }

    ii e() {
        return this.d;
    }

    ds f() {
        return this.e;
    }

    static du g() {
        return (du)b.get();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    du(ii ii2, ds ds2, du du2) {
        du du3;
        du du4 = du3 = du2 != null ? du2 : this;
        synchronized (du4) {
            if (du2 != null && du2.g) {
                throw new IllegalArgumentException("Shared context is destroyed");
            }
            GLContext.b();
            try {
                IntBuffer intBuffer;
                this.d = ii2;
                this.e = ds2;
                if (ds2 != null) {
                    intBuffer = ds2.p();
                    this.f = ds2.i();
                } else {
                    intBuffer = null;
                    this.f = false;
                }
                this.c = a.a(ii2, intBuffer, du2 != null ? du2.c : null);
            }
            catch (c c2) {
                GLContext.c();
                throw c2;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        du du2 = du.g();
        if (du2 != null) {
            a.b();
            GLContext.b(null);
            b.set(null);
            du du3 = du2;
            synchronized (du3) {
                du2.i = null;
                du2.p();
            }
        }
    }

    public synchronized void d() {
        if (this.g) {
            throw new IllegalStateException("Context is destroyed");
        }
        a.a(this.j());
    }

    public synchronized void h() {
        if (this.g) {
            throw new IllegalStateException("Context is destroyed");
        }
        a.b(this.j());
    }

    public static void i() {
        a.a();
    }

    private boolean n() {
        return this.i == null || Thread.currentThread() == this.i;
    }

    private void o() {
        if (!this.n()) {
            throw new IllegalStateException("From thread " + Thread.currentThread() + ": " + this.i + " already has the context current");
        }
    }

    public synchronized void b() {
        this.o();
        if (this.g) {
            throw new IllegalStateException("Context is destroyed");
        }
        this.i = Thread.currentThread();
        b.set(this);
        a.a(this.d, this.c);
        GLContext.a(this, this.f);
    }

    ByteBuffer j() {
        return this.c;
    }

    public synchronized boolean a() {
        if (this.g) {
            throw new IllegalStateException("Context is destroyed");
        }
        return a.c(this.c);
    }

    private void p() {
        if (!this.g && this.h) {
            try {
                this.d();
                a.b(this.d, this.c);
                CallbackUtil.b(this);
                this.g = true;
                this.i = null;
                GLContext.c();
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Exception occurred while destroying context: " + c2));
            }
        }
    }

    public static void a(int n2) {
        a.a(n2);
    }

    public synchronized void k() {
        this.o();
        this.l();
    }

    public synchronized void l() {
        if (this.g) {
            return;
        }
        this.h = true;
        boolean bl2 = this.a();
        int n2 = 0;
        if (bl2) {
            try {
                n2 = GL11.b();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.c();
        }
        this.p();
        if (bl2 && n2 != 0) {
            throw new ig(n2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized void a(x x2) {
        ByteBuffer byteBuffer = this.d.g();
        try {
            switch (org.lwjgl.d.a()) {
                case 3: {
                    WindowsContextImplementation windowsContextImplementation = (WindowsContextImplementation)a;
                    x2.a(8200L).a(windowsContextImplementation.getHGLRC(this.c));
                    x2.a(8203L).a(windowsContextImplementation.getHDC(byteBuffer));
                    return;
                }
                case 1: {
                    LinuxContextImplementation linuxContextImplementation = (LinuxContextImplementation)a;
                    x2.a(8200L).a(linuxContextImplementation.getGLXContext(this.c));
                    x2.a(8202L).a(linuxContextImplementation.getDisplay(byteBuffer));
                    return;
                }
                case 2: {
                    if (!org.lwjgl.d.a(10, 6)) throw new UnsupportedOperationException("CL/GL context sharing is not supported on this platform.");
                    MacOSXContextImplementation macOSXContextImplementation = (MacOSXContextImplementation)a;
                    long l2 = macOSXContextImplementation.getCGLShareGroup(this.c);
                    x2.a(0x10000000L).a(l2);
                    return;
                }
                default: {
                    throw new UnsupportedOperationException("CL/GL context sharing is not supported on this platform.");
                }
            }
        }
        finally {
            this.d.f();
        }
    }

    static {
        b = new ThreadLocal();
        ab.b();
        a = du.m();
    }
}

