/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.c.a;
import io.netty.c.a.d.c.ac;
import io.netty.c.a.d.c.af;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.c.c;
import io.netty.c.a.d.c.d;
import io.netty.c.a.d.c.e;
import io.netty.c.a.d.c.f;
import io.netty.c.a.u;
import io.netty.c.a.y;
import io.netty.channel.bd;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.z;
import java.nio.ByteBuffer;
import java.util.List;

public class o
extends u
implements af {
    private static final g a = io.netty.util.c.b.h.a(o.class);
    private static final byte b = 0;
    private static final byte c = 1;
    private static final byte d = 2;
    private static final byte e = 8;
    private static final byte f = 9;
    private static final byte h = 10;
    private final boolean i;

    public o(boolean bl2) {
        this.i = bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(bd bd2, ac ac2, List list) {
        int n2;
        io.netty.b.g g2 = ac2.a();
        if (ac2 instanceof f) {
            n2 = 1;
        } else if (ac2 instanceof d) {
            n2 = 9;
        } else if (ac2 instanceof e) {
            n2 = 10;
        } else if (ac2 instanceof b) {
            n2 = 8;
        } else if (ac2 instanceof a) {
            n2 = 2;
        } else if (ac2 instanceof c) {
            n2 = 0;
        } else {
            throw new UnsupportedOperationException("Cannot encode frame of type: " + ac2.getClass().getName());
        }
        int n3 = g2.r();
        if (a.d()) {
            a.b("Encoding WebSocket Frame opCode=" + n2 + " length=" + n3);
        }
        int n4 = 0;
        if (ac2.m()) {
            n4 |= 0x80;
        }
        n4 |= ac2.n() % 8 << 4;
        n4 |= n2 % 128;
        if (n2 == 9 && n3 > 125) {
            throw new y("invalid payload for PING (payload length must be <= 125, was " + n3);
        }
        boolean bl2 = true;
        z z2 = null;
        try {
            int n5;
            int n6;
            int n7;
            int n8 = n7 = this.i ? 4 : 0;
            if (n3 <= 125) {
                n6 = 2 + n7;
                if (this.i) {
                    n6 += n3;
                }
                z2 = bd2.d().a(n6);
                ((io.netty.b.g)z2).B(n4);
                n5 = this.i ? (byte)(0x80 | (byte)n3) : (byte)n3;
                ((io.netty.b.g)z2).B(n5);
            } else if (n3 <= 65535) {
                n6 = 4 + n7;
                if (this.i) {
                    n6 += n3;
                }
                z2 = bd2.d().a(n6);
                ((io.netty.b.g)z2).B(n4);
                ((io.netty.b.g)z2).B(this.i ? 254 : 126);
                ((io.netty.b.g)z2).B(n3 >>> 8 & 0xFF);
                ((io.netty.b.g)z2).B(n3 & 0xFF);
            } else {
                n6 = 10 + n7;
                if (this.i) {
                    n6 += n3;
                }
                z2 = bd2.d().a(n6);
                ((io.netty.b.g)z2).B(n4);
                ((io.netty.b.g)z2).B(this.i ? 255 : 127);
                ((io.netty.b.g)z2).b(n3);
            }
            if (this.i) {
                n6 = (int)(Math.random() * 2.147483647E9);
                byte[] arrby = ByteBuffer.allocate(4).putInt(n6).array();
                ((io.netty.b.g)z2).c(arrby);
                n5 = 0;
                for (int i2 = g2.p(); i2 < g2.q(); ++i2) {
                    byte by2 = g2.m(i2);
                    ((io.netty.b.g)z2).B(by2 ^ arrby[n5++ % 4]);
                }
                list.add(z2);
            } else if (((io.netty.b.g)z2).s() >= g2.r()) {
                ((io.netty.b.g)z2).b(g2);
                list.add(z2);
            } else {
                list.add(z2);
                list.add(g2.ab());
            }
            bl2 = false;
        }
        finally {
            if (bl2 && z2 != null) {
                z2.ad();
            }
        }
    }
}

