/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.java.games.input.OSXEvent;
import net.java.games.input.ci;
import net.java.games.input.co;

final class OSXHIDQueue {
    private final Map a = new HashMap();
    private final long b;
    private boolean c;

    public OSXHIDQueue(long l2, int n2) {
        this.b = l2;
        try {
            this.b(n2);
        }
        catch (IOException iOException) {
            this.a();
            throw iOException;
        }
    }

    public final synchronized void a(int n2) {
        this.e();
        this.d();
        this.b();
        this.b(n2);
    }

    private final void b(int n2) {
        this.c(n2);
        try {
            this.c();
        }
        catch (IOException iOException) {
            this.b();
            throw iOException;
        }
    }

    public final ci a(OSXEvent oSXEvent) {
        return (ci)this.a.get(new Long(oSXEvent.b()));
    }

    private final void c(int n2) {
        OSXHIDQueue.nOpen(this.b, n2);
    }

    private static final native void nOpen(long var0, int var2);

    private final void b() {
        OSXHIDQueue.nClose(this.b);
    }

    private static final native void nClose(long var0);

    private final void c() {
        OSXHIDQueue.nStart(this.b);
    }

    private static final native void nStart(long var0);

    private final void d() {
        OSXHIDQueue.nStop(this.b);
    }

    private static final native void nStop(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final synchronized void a() {
        if (!this.c) {
            this.c = true;
            try {
                this.d();
                this.b();
            }
            finally {
                OSXHIDQueue.nReleaseQueue(this.b);
            }
        }
    }

    private static final native void nReleaseQueue(long var0);

    public final void a(co co2, ci ci2) {
        OSXHIDQueue.nAddElement(this.b, co2.b());
        this.a.put(new Long(co2.b()), ci2);
    }

    private static final native void nAddElement(long var0, long var2);

    public final void a(co co2) {
        OSXHIDQueue.nRemoveElement(this.b, co2.b());
        this.a.remove(new Long(co2.b()));
    }

    private static final native void nRemoveElement(long var0, long var2);

    public final synchronized boolean b(OSXEvent oSXEvent) {
        this.e();
        return OSXHIDQueue.nGetNextEvent(this.b, oSXEvent);
    }

    private static final native boolean nGetNextEvent(long var0, OSXEvent var2);

    private final void e() {
        if (this.c) {
            throw new IOException("Queue is released");
        }
    }
}

