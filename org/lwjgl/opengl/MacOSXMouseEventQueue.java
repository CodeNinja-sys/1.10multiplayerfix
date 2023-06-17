/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.hf;

final class MacOSXMouseEventQueue
extends hf {
    private final IntBuffer b = BufferUtils.d(2);
    private boolean c;
    private static boolean d;

    MacOSXMouseEventQueue(Component component) {
        super(component);
    }

    public void a(boolean bl2) {
        if (d != bl2) {
            super.a(bl2);
            this.c();
            MacOSXMouseEventQueue.b(bl2);
        }
    }

    private static synchronized void b(boolean bl2) {
        d = bl2;
        if (!bl2) {
            MacOSXMouseEventQueue.nGrabMouse(bl2);
        }
    }

    protected void b() {
        super.b();
        MacOSXMouseEventQueue.getMouseDeltas(this.b);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(long l2) {
        super.a(l2);
        MacOSXMouseEventQueue macOSXMouseEventQueue = this;
        synchronized (macOSXMouseEventQueue) {
            MacOSXMouseEventQueue.getMouseDeltas(this.b);
            int n2 = this.b.get(0);
            int n3 = -this.b.get(1);
            if (this.c) {
                this.c = false;
                MacOSXMouseEventQueue.nGrabMouse(this.g());
                return;
            }
            if (n2 != 0 || n3 != 0) {
                this.a((byte)-1, (byte)0, n2, n3, 0, l2);
                this.a(n2, n3);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void c() {
        Object object = this;
        synchronized (object) {
            this.c = this.g();
        }
        if (this.g()) {
            object = this.f().getBounds();
            Point point = this.f().getLocationOnScreen();
            int n2 = point.x + ((Rectangle)object).width / 2;
            int n3 = point.y + ((Rectangle)object).height / 2;
            MacOSXMouseEventQueue.nWarpCursor(n2, n3);
        }
    }

    private static native void getMouseDeltas(IntBuffer var0);

    private static native void nWarpCursor(int var0, int var1);

    static native void nGrabMouse(boolean var0);
}

