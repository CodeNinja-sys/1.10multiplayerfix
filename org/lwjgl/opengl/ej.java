/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengles.EGL
 *  org.lwjgl.opengles.EGLConfig
 *  org.lwjgl.opengles.EGLDisplay
 *  org.lwjgl.opengles.EGLSurface
 *  org.lwjgl.opengles.GLES20
 *  org.lwjgl.opengles.PixelFormat
 *  org.lwjgl.opengles.PowerManagementEventException
 *  org.lwjgl.opengles.Util
 */
package org.lwjgl.opengl;

import org.lwjgl.BufferUtils;
import org.lwjgl.b.a;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.dr;
import org.lwjgl.opengl.dv;
import org.lwjgl.opengl.eh;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.fz;
import org.lwjgl.opengl.ij;
import org.lwjgl.opengles.EGL;
import org.lwjgl.opengles.EGLConfig;
import org.lwjgl.opengles.EGLDisplay;
import org.lwjgl.opengles.EGLSurface;
import org.lwjgl.opengles.GLES20;
import org.lwjgl.opengles.PixelFormat;
import org.lwjgl.opengles.PowerManagementEventException;
import org.lwjgl.opengles.Util;
import org.lwjgl.x;

abstract class ej
implements ek {
    protected PixelFormat a;
    protected EGLDisplay b;
    protected EGLConfig c;
    protected EGLSurface d;
    protected dv e;
    protected eh f;

    protected ej() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ij ij2) {
        Object object = fz.a;
        synchronized (object) {
            this.a = (PixelFormat)ij2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ij b() {
        Object object = fz.a;
        synchronized (object) {
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l2, long l3, int n2, PixelFormat pixelFormat) {
        Object object = fz.a;
        synchronized (object) {
            if (this.d != null) {
                this.d.destroy();
                this.d = null;
            }
            if (this.b != null) {
                this.b.terminate();
                this.b = null;
            }
            EGLDisplay eGLDisplay = EGL.eglGetDisplay((long)((int)l3));
            int[] arrn = new int[]{12329, 0, 12352, 4, 12333, 0};
            EGLConfig[] arreGLConfig = eGLDisplay.chooseConfig(pixelFormat.getAttribBuffer(eGLDisplay, n2, arrn), null, BufferUtils.d(1));
            if (arreGLConfig.length == 0) {
                throw new c("No EGLConfigs found for the specified PixelFormat.");
            }
            EGLConfig eGLConfig = pixelFormat.getBestMatch(arreGLConfig);
            EGLSurface eGLSurface = eGLDisplay.createWindowSurface(eGLConfig, l2, null);
            pixelFormat.setSurfaceAttribs(eGLSurface);
            this.b = eGLDisplay;
            this.c = eGLConfig;
            this.d = eGLSurface;
            if (this.e != null) {
                this.e.e().setDisplay(eGLDisplay);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(a a2, eh eh2) {
        Object object = fz.a;
        synchronized (object) {
            this.e = new dv(this, a2, eh2 != null ? ((ej)eh2).l() : null);
            this.f = eh2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    eh a() {
        Object object = fz.a;
        synchronized (object) {
            return this.f;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public EGLDisplay c() {
        Object object = fz.a;
        synchronized (object) {
            return this.b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public EGLConfig d() {
        Object object = fz.a;
        synchronized (object) {
            return this.c;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public EGLSurface k() {
        Object object = fz.a;
        synchronized (object) {
            return this.d;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dv l() {
        Object object = fz.a;
        synchronized (object) {
            return this.e;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dr m() {
        Object object = fz.a;
        synchronized (object) {
            this.o();
            return new dv(this, this.e.f(), this.e);
        }
    }

    public void e() {
        Util.checkGLError();
    }

    public void a(int n2) {
        dv.a(n2);
    }

    public void f() {
        dv.h();
    }

    public void a(float f2, float f3, float f4) {
        GLES20.glClearColor((float)f2, (float)f3, (float)f4, (float)0.0f);
        GLES20.glClear((int)16384);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean g() {
        Object object = fz.a;
        synchronized (object) {
            this.o();
            return this.e.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void h() {
        Object object = fz.a;
        synchronized (object) {
            this.o();
            this.e.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i() {
        Object object = fz.a;
        synchronized (object) {
            this.o();
            if (this.e.a()) {
                this.e.c();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j() {
        Object object = fz.a;
        synchronized (object) {
            try {
                if (this.e != null) {
                    try {
                        this.i();
                    }
                    catch (PowerManagementEventException powerManagementEventException) {
                        // empty catch block
                    }
                    this.e.i();
                    this.e = null;
                }
                if (this.d != null) {
                    this.d.destroy();
                    this.d = null;
                }
                if (this.b != null) {
                    this.b.terminate();
                    this.b = null;
                }
                this.a = null;
                this.f = null;
            }
            catch (c c2) {
                org.lwjgl.d.a((CharSequence)("Exception occurred while destroying Drawable: " + c2));
            }
        }
    }

    protected void o() {
        if (this.e == null) {
            throw new IllegalStateException("The Drawable has no context available.");
        }
    }

    public void a(x x2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ dr n() {
        return this.l();
    }
}

