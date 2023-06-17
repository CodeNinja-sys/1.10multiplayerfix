/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import org.lwjgl.ab;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.LinuxCanvasImplementation;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dk;
import org.lwjgl.opengl.dr;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.du;
import org.lwjgl.opengl.eh;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.gz;
import org.lwjgl.opengl.ii;
import org.lwjgl.opengl.ij;
import org.lwjgl.opengl.iy;
import org.lwjgl.opengl.iz;
import org.lwjgl.x;

public class dl
extends Canvas
implements ComponentListener,
HierarchyListener,
ek {
    private static final long a = 1L;
    private static final dk b;
    private boolean c;
    private Object d = new Object();
    private final PixelFormat e;
    private final eh f;
    private final ds g;
    private ii h;
    private du i;
    private int j;
    private boolean k;

    static dk a() {
        switch (org.lwjgl.d.a()) {
            case 1: {
                return new LinuxCanvasImplementation();
            }
            case 3: {
                return new iz();
            }
            case 2: {
                return new gz();
            }
        }
        throw new IllegalStateException("Unsupported platform");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void o() {
        Object object = this.d;
        synchronized (object) {
            this.c = true;
        }
    }

    public void a(ij ij2) {
        throw new UnsupportedOperationException();
    }

    public void a(ij ij2, ds ds2) {
        throw new UnsupportedOperationException();
    }

    public ij b() {
        return this.e;
    }

    public du c() {
        return this.i;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public du d() {
        Object object = this.d;
        synchronized (object) {
            if (this.i == null) {
                throw new IllegalStateException("Canvas not yet displayable");
            }
            return new du(this.h, this.i.f(), this.i);
        }
    }

    public void e() {
        iy.a();
    }

    public void a(float f2, float f3, float f4) {
        GL11.a(f2, f3, f4, 0.0f);
        GL11.a(16384);
    }

    public dl() {
        this(new PixelFormat());
    }

    public dl(PixelFormat pixelFormat) {
        this(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(), pixelFormat);
    }

    public dl(GraphicsDevice graphicsDevice, PixelFormat pixelFormat) {
        this(graphicsDevice, pixelFormat, null);
    }

    public dl(GraphicsDevice graphicsDevice, PixelFormat pixelFormat, eh eh2) {
        this(graphicsDevice, pixelFormat, eh2, null);
    }

    public dl(GraphicsDevice graphicsDevice, PixelFormat pixelFormat, eh eh2, ds ds2) {
        super(b.a(graphicsDevice, pixelFormat));
        if (pixelFormat == null) {
            throw new NullPointerException("Pixel format must be non-null");
        }
        this.addHierarchyListener(this);
        this.addComponentListener(this);
        this.f = eh2;
        this.e = pixelFormat;
        this.g = ds2;
    }

    public void addNotify() {
        super.addNotify();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void removeNotify() {
        Object object = this.d;
        synchronized (object) {
            this.j();
            super.removeNotify();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2) {
        Object object = this.d;
        synchronized (object) {
            if (this.i == null) {
                throw new IllegalStateException("Canvas not yet displayable");
            }
            du.a(n2);
        }
    }

    public void a(boolean bl2) {
        this.a(bl2 ? 1 : 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        Object object = this.d;
        synchronized (object) {
            if (this.i == null) {
                throw new IllegalStateException("Canvas not yet displayable");
            }
            du.i();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean g() {
        Object object = this.d;
        synchronized (object) {
            if (this.i == null) {
                throw new IllegalStateException("Canvas not yet displayable");
            }
            return this.i.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void h() {
        Object object = this.d;
        synchronized (object) {
            if (this.i == null) {
                throw new IllegalStateException("Canvas not yet displayable");
            }
            this.i.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i() {
        Object object = this.d;
        synchronized (object) {
            if (this.i == null) {
                throw new IllegalStateException("Canvas not yet displayable");
            }
            if (this.i.a()) {
                this.i.c();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void j() {
        Object object = this.d;
        synchronized (object) {
            try {
                if (this.i != null) {
                    this.i.k();
                    this.i = null;
                    this.j = 0;
                    this.h.c();
                    this.h = null;
                }
            }
            catch (c c2) {
                throw new RuntimeException(c2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(x x2) {
        Object object = this.d;
        synchronized (object) {
            if (this.i == null) {
                throw new IllegalStateException("Canvas not yet displayable");
            }
            this.i.a(x2);
        }
    }

    protected void k() {
    }

    protected void l() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void paint(Graphics graphics) {
        c c2 = null;
        Object object = this.d;
        synchronized (object) {
            if (!this.isDisplayable()) {
                return;
            }
            try {
                if (this.h == null) {
                    this.h = b.a(this, this.e, this.g);
                }
                this.h.g();
                try {
                    if (this.i == null) {
                        this.i = new du(this.h, this.g, this.f != null ? (du)((ek)this.f).n() : null);
                        this.k = true;
                    }
                    if (this.j == 0) {
                        this.i.b();
                    }
                    ++this.j;
                    try {
                        if (this.c) {
                            this.i.h();
                            this.c = false;
                        }
                        if (this.k) {
                            this.k = false;
                            this.k();
                        }
                        this.l();
                    }
                    finally {
                        --this.j;
                        if (this.j == 0) {
                            this.i.c();
                        }
                    }
                }
                finally {
                    this.h.f();
                }
            }
            catch (c c3) {
                c2 = c3;
            }
        }
        if (c2 != null) {
            this.a(c2);
        }
    }

    protected void a(c c2) {
        org.lwjgl.d.a((CharSequence)("Unhandled exception occurred, skipping paint(): " + c2));
    }

    public void update(Graphics graphics) {
        this.paint(graphics);
    }

    public void componentShown(ComponentEvent componentEvent) {
    }

    public void componentHidden(ComponentEvent componentEvent) {
    }

    public void componentResized(ComponentEvent componentEvent) {
        this.o();
    }

    public void componentMoved(ComponentEvent componentEvent) {
        this.o();
    }

    public void setLocation(int n2, int n3) {
        super.setLocation(n2, n3);
        this.o();
    }

    public void setLocation(Point point) {
        super.setLocation(point);
        this.o();
    }

    public void setSize(Dimension dimension) {
        super.setSize(dimension);
        this.o();
    }

    public void setSize(int n2, int n3) {
        super.setSize(n2, n3);
        this.o();
    }

    public void setBounds(int n2, int n3, int n4, int n5) {
        super.setBounds(n2, n3, n4, n5);
        this.o();
    }

    public void hierarchyChanged(HierarchyEvent hierarchyEvent) {
        this.o();
    }

    public /* synthetic */ dr m() {
        return this.d();
    }

    public /* synthetic */ dr n() {
        return this.c();
    }

    static {
        ab.b();
        b = dl.a();
    }
}

