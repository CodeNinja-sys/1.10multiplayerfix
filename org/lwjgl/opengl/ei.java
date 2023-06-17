/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dr;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.du;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.fz;
import org.lwjgl.opengl.ii;
import org.lwjgl.opengl.ij;
import org.lwjgl.opengl.iy;
import org.lwjgl.x;

abstract class ei
implements ek {
    protected PixelFormat a;
    protected ii b;
    protected du c;

    protected ei() {
    }

    public void a(ij ij2) {
        throw new UnsupportedOperationException();
    }

    public void a(ij ij2, ds ds2) {
        this.a = (PixelFormat)ij2;
        this.b = dx.t().a(this.a, ds2);
    }

    public ij b() {
        return this.a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public du a() {
        Object object = fz.a;
        synchronized (object) {
            return this.c;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public du c() {
        Object object = fz.a;
        synchronized (object) {
            this.d();
            return new du(this.b, this.c.f(), this.c);
        }
    }

    public void e() {
        iy.a();
    }

    public void a(int n2) {
        du.a(n2);
    }

    public void f() {
        du.i();
    }

    public void a(float f2, float f3, float f4) {
        GL11.a(f2, f3, f4, 0.0f);
        GL11.a(16384);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean g() {
        Object object = fz.a;
        synchronized (object) {
            this.d();
            return this.c.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void h() {
        Object object = fz.a;
        synchronized (object) {
            this.d();
            this.c.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i() {
        Object object = fz.a;
        synchronized (object) {
            this.d();
            if (this.c.a()) {
                this.c.c();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j() {
        Object object = fz.a;
        synchronized (object) {
            if (this.c == null) {
                return;
            }
            try {
                this.i();
                this.c.k();
                this.c = null;
                if (this.b != null) {
                    this.b.c();
                    this.b = null;
                }
            }
            catch (c c2) {
                d.a((CharSequence)("Exception occurred while destroying Drawable: " + c2));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(x x2) {
        Object object = fz.a;
        synchronized (object) {
            this.d();
            this.c.a(x2);
        }
    }

    protected final void d() {
        if (this.c == null) {
            throw new IllegalStateException("The Drawable has no context available.");
        }
    }

    public /* synthetic */ dr m() {
        return this.c();
    }

    public /* synthetic */ dr n() {
        return this.a();
    }
}

