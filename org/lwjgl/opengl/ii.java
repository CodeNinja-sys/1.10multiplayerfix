/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.d;

abstract class ii {
    private final ByteBuffer a;
    private Thread b;
    private int c;

    protected ii(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    private void d() {
        this.a();
    }

    public final synchronized void f() {
        if (this.c <= 0) {
            throw new IllegalStateException("PeerInfo not locked!");
        }
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("PeerInfo already locked by " + this.b);
        }
        --this.c;
        if (this.c == 0) {
            this.b();
            this.b = null;
            this.notify();
        }
    }

    protected abstract void a();

    protected abstract void b();

    public final synchronized ByteBuffer g() {
        Thread thread = Thread.currentThread();
        while (this.b != null && this.b != thread) {
            try {
                this.wait();
            }
            catch (InterruptedException interruptedException) {
                d.a((CharSequence)("Interrupted while waiting for PeerInfo lock: " + interruptedException));
            }
        }
        if (this.c == 0) {
            this.b = thread;
            this.a();
        }
        ++this.c;
        return this.h();
    }

    protected final ByteBuffer h() {
        return this.a;
    }

    public void c() {
    }
}

