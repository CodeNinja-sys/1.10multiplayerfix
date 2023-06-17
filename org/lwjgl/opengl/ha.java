/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import org.lwjgl.opengl.hb;

final class ha
implements ComponentListener,
HierarchyListener {
    private final Canvas a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;

    ha(Canvas canvas) {
        this.a = canvas;
        canvas.addComponentListener(this);
        canvas.addHierarchyListener(this);
        this.f();
    }

    public void a() {
        EventQueue.invokeLater(new hb(this));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b() {
        boolean bl2;
        ha ha2 = this;
        synchronized (ha2) {
            bl2 = this.d;
            this.d = false;
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private synchronized void f() {
        ha ha2 = this;
        synchronized (ha2) {
            this.b = this.a.getWidth();
            this.c = this.a.getHeight();
            this.d = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int c() {
        ha ha2 = this;
        synchronized (ha2) {
            return this.b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int d() {
        ha ha2 = this;
        synchronized (ha2) {
            return this.c;
        }
    }

    public void componentShown(ComponentEvent componentEvent) {
    }

    public void componentHidden(ComponentEvent componentEvent) {
    }

    public void componentResized(ComponentEvent componentEvent) {
        this.f();
        this.e = true;
    }

    public void componentMoved(ComponentEvent componentEvent) {
        this.f();
    }

    public void hierarchyChanged(HierarchyEvent hierarchyEvent) {
        this.f();
    }

    public boolean e() {
        if (this.e) {
            this.e = false;
            return true;
        }
        return false;
    }

    static /* synthetic */ Canvas a(ha ha2) {
        return ha2.a;
    }
}

