/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.b.g;
import io.netty.b.k;
import io.netty.c.a.i.f;
import io.netty.c.a.p;
import io.netty.channel.bd;
import java.io.Serializable;

public class j
extends p {
    private static final byte[] a = new byte[4];

    protected void a(bd bd2, Serializable serializable, g g2) {
        int n2 = g2.q();
        k k2 = new k(g2);
        k2.write(a);
        f f2 = new f(k2);
        f2.writeObject(serializable);
        f2.flush();
        f2.close();
        int n3 = g2.q();
        g2.e(n2, n3 - n2 - 4);
    }
}

