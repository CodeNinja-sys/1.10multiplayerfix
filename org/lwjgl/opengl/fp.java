/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;

class fp {
    private static final int a = 200;
    private final int b;
    private final ByteBuffer c;

    protected fp(int n2) {
        this.b = n2;
        this.c = ByteBuffer.allocate(200 * n2);
    }

    protected synchronized void a() {
        this.c.clear();
    }

    public synchronized void a(ByteBuffer byteBuffer) {
        this.c.flip();
        int n2 = this.c.limit();
        if (byteBuffer.remaining() < this.c.remaining()) {
            this.c.limit(byteBuffer.remaining() + this.c.position());
        }
        byteBuffer.put(this.c);
        this.c.limit(n2);
        this.c.compact();
    }

    public synchronized boolean b(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != this.b) {
            throw new IllegalArgumentException("Internal error: event size " + this.b + " does not equal the given event size " + byteBuffer.remaining());
        }
        if (this.c.remaining() >= byteBuffer.remaining()) {
            this.c.put(byteBuffer);
            return true;
        }
        return false;
    }
}

