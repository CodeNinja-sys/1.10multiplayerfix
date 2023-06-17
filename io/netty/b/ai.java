/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ah;
import io.netty.b.ak;
import io.netty.b.at;
import io.netty.b.au;
import io.netty.b.aw;
import io.netty.b.ba;
import io.netty.util.c.u;
import java.nio.ByteBuffer;

final class ai
extends ah {
    private static final boolean i = u.f();

    ai(au au2, int n2, int n3, int n4, int n5) {
        super(au2, n2, n3, n4, n5);
    }

    @Override
    boolean a() {
        return true;
    }

    @Override
    protected ak a(int n2, int n3, int n4, int n5) {
        return new ak(this, ByteBuffer.allocateDirect(n5), n2, n3, n4, n5);
    }

    @Override
    protected ak g(int n2) {
        return new ak(this, ByteBuffer.allocateDirect(n2), n2);
    }

    @Override
    protected void a(ak ak2) {
        u.a((ByteBuffer)ak2.b);
    }

    @Override
    protected at h(int n2) {
        if (i) {
            return ba.Q(n2);
        }
        return aw.Q(n2);
    }

    protected void a(ByteBuffer byteBuffer, int n2, ByteBuffer byteBuffer2, int n3, int n4) {
        if (n4 == 0) {
            return;
        }
        if (i) {
            u.a(u.b(byteBuffer) + (long)n2, u.b(byteBuffer2) + (long)n3, (long)n4);
        } else {
            byteBuffer = byteBuffer.duplicate();
            byteBuffer2 = byteBuffer2.duplicate();
            byteBuffer.position(n2).limit(n2 + n4);
            byteBuffer2.position(n3);
            byteBuffer2.put(byteBuffer);
        }
    }
}

