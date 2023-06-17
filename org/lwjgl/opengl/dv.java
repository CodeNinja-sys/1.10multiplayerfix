/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengles.EGL
 *  org.lwjgl.opengles.EGLContext
 *  org.lwjgl.opengles.EGLDisplay
 *  org.lwjgl.opengles.GLContext
 *  org.lwjgl.opengles.GLES20
 *  org.lwjgl.opengles.PowerManagementEventException
 */
package org.lwjgl.opengl;

import org.lwjgl.ab;
import org.lwjgl.b.a;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.dr;
import org.lwjgl.opengl.ej;
import org.lwjgl.opengl.ig;
import org.lwjgl.opengles.EGL;
import org.lwjgl.opengles.EGLContext;
import org.lwjgl.opengles.EGLDisplay;
import org.lwjgl.opengles.GLContext;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.opengles.PowerManagementEventException;

final class dv
implements dr {
    private static final ThreadLocal a = new ThreadLocal();
    private final ej b;
    private final EGLContext c;
    private final a d;
    private boolean e;
    private boolean f;
    private Thread g;

    public EGLContext e() {
        return this.c;
    }

    a f() {
        return this.d;
    }

    static dv g() {
        return (dv)a.get();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    dv(ej ej2, a a2, dv dv2) {
        dv dv3;
        if (ej2 == null) {
            throw new IllegalArgumentException();
        }
        dv dv4 = dv3 = dv2 != null ? dv2 : this;
        synchronized (dv4) {
            if (dv2 != null && dv2.e) {
                throw new IllegalArgumentException("Shared context is destroyed");
            }
            this.b = ej2;
            this.d = a2;
            this.c = ej2.c().createContext(ej2.d(), dv2 == null ? null : dv2.c, a2 == null ? new a(2).b() : a2.b());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        EGL.eglReleaseCurrent((EGLDisplay)this.b.c());
        GLContext.useContext(null);
        a.set(null);
        dv dv2 = this;
        synchronized (dv2) {
            this.g = null;
            this.m();
        }
    }

    public static void h() {
        dv dv2 = dv.g();
        if (dv2 != null) {
            dv2.b.k().swapBuffers();
        }
    }

    private boolean k() {
        return this.g == null || Thread.currentThread() == this.g;
    }

    private void l() {
        if (!this.k()) {
            throw new IllegalStateException("From thread " + Thread.currentThread() + ": " + this.g + " already has the context current");
        }
    }

    public synchronized void b() {
        this.l();
        if (this.e) {
            throw new IllegalStateException("Context is destroyed");
        }
        this.g = Thread.currentThread();
        a.set(this);
        this.c.makeCurrent(this.b.k());
        GLContext.useContext((Object)this);
    }

    public synchronized boolean a() {
        if (this.e) {
            throw new IllegalStateException("Context is destroyed");
        }
        return EGL.eglIsCurrentContext((EGLContext)this.c);
    }

    private void m() {
        if (!this.e && this.f) {
            try {
                this.c.destroy();
                this.e = true;
                this.g = null;
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Exception occurred while destroying context: " + c2));
            }
        }
    }

    public static void a(int n2) {
        dv dv2 = dv.g();
        if (dv2 != null) {
            try {
                dv2.b.c().setSwapInterval(n2);
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Failed to set swap interval. Reason: " + c2.getMessage()));
            }
        }
    }

    public synchronized void i() {
        this.l();
        this.j();
    }

    public synchronized void j() {
        if (this.e) {
            return;
        }
        this.f = true;
        boolean bl2 = this.a();
        int n2 = 0;
        if (bl2) {
            if (GLContext.getCapabilities() != null && GLContext.getCapabilities().OpenGLES20) {
                n2 = GLES20.glGetError();
            }
            try {
                this.c();
            }
            catch (PowerManagementEventException powerManagementEventException) {
                // empty catch block
            }
        }
        this.m();
        if (bl2 && n2 != 0) {
            throw new ig(n2);
        }
    }

    public void d() {
    }

    static {
        ab.b();
    }
}

