/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.b.k;
import io.netty.c.a.p;
import io.netty.channel.bd;
import io.netty.util.b;
import io.netty.util.c;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class g
extends p {
    private static final c a = io.netty.util.c.a(g.class.getName() + ".OOS");
    private final int b;
    private int c;

    public g() {
        this(16);
    }

    public g(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("resetInterval: " + n2);
        }
        this.b = n2;
    }

    protected ObjectOutputStream a(OutputStream outputStream) {
        return new ObjectOutputStream(outputStream);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(bd bd2, Serializable serializable, io.netty.b.g g2) {
        ObjectOutputStream objectOutputStream;
        b b2 = bd2.a(a);
        ObjectOutputStream objectOutputStream2 = (ObjectOutputStream)b2.get();
        if (objectOutputStream2 == null && (objectOutputStream = (ObjectOutputStream)b2.a(objectOutputStream2 = this.a(new k(g2)))) != null) {
            objectOutputStream2 = objectOutputStream;
        }
        objectOutputStream = objectOutputStream2;
        synchronized (objectOutputStream) {
            if (this.b != 0) {
                ++this.c;
                if (this.c % this.b == 0) {
                    objectOutputStream2.reset();
                }
            }
            objectOutputStream2.writeObject(serializable);
            objectOutputStream2.flush();
        }
    }
}

