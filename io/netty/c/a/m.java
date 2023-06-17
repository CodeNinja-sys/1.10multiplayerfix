/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.c.a.d;
import io.netty.c.a.f;
import io.netty.c.a.g;
import io.netty.c.a.y;
import io.netty.channel.bd;
import java.nio.ByteOrder;
import java.util.List;

public class m
extends d {
    private final ByteOrder a;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int h;
    private final int i;
    private final boolean j;
    private boolean k;
    private long l;
    private long m;

    public m(int n2, int n3, int n4) {
        this(n2, n3, n4, 0, 0);
    }

    public m(int n2, int n3, int n4, int n5, int n6) {
        this(n2, n3, n4, n5, n6, true);
    }

    public m(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        this(ByteOrder.BIG_ENDIAN, n2, n3, n4, n5, n6, bl2);
    }

    public m(ByteOrder byteOrder, int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        if (byteOrder == null) {
            throw new NullPointerException("byteOrder");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxFrameLength must be a positive integer: " + n2);
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("lengthFieldOffset must be a non-negative integer: " + n3);
        }
        if (n6 < 0) {
            throw new IllegalArgumentException("initialBytesToStrip must be a non-negative integer: " + n6);
        }
        if (n3 > n2 - n4) {
            throw new IllegalArgumentException("maxFrameLength (" + n2 + ") " + "must be equal to or greater than " + "lengthFieldOffset (" + n3 + ") + " + "lengthFieldLength (" + n4 + ").");
        }
        this.a = byteOrder;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.h = n5;
        this.f = n3 + n4;
        this.i = n6;
        this.j = bl2;
    }

    @Override
    protected final void a(bd bd2, io.netty.b.g g2, List list) {
        Object object = this.a(bd2, g2);
        if (object != null) {
            list.add(object);
        }
    }

    protected Object a(bd bd2, io.netty.b.g g2) {
        if (this.k) {
            long l2 = this.m;
            int n2 = (int)Math.min(l2, (long)g2.r());
            g2.A(n2);
            this.m = l2 -= (long)n2;
            this.b(false);
        }
        if (g2.r() < this.f) {
            return null;
        }
        int n3 = g2.p() + this.d;
        long l3 = this.a(g2, n3, this.e, this.a);
        if (l3 < 0L) {
            g2.A(this.f);
            throw new f("negative pre-adjustment length field: " + l3);
        }
        if ((l3 += (long)(this.h + this.f)) < (long)this.f) {
            g2.A(this.f);
            throw new f("Adjusted frame length (" + l3 + ") is less " + "than lengthFieldEndOffset: " + this.f);
        }
        if (l3 > (long)this.c) {
            long l4 = l3 - (long)g2.r();
            this.l = l3;
            if (l4 < 0L) {
                g2.A((int)l3);
            } else {
                this.k = true;
                this.m = l4;
                g2.A(g2.r());
            }
            this.b(true);
            return null;
        }
        int n4 = (int)l3;
        if (g2.r() < n4) {
            return null;
        }
        if (this.i > n4) {
            g2.A(n4);
            throw new f("Adjusted frame length (" + l3 + ") is less " + "than initialBytesToStrip: " + this.i);
        }
        g2.A(this.i);
        int n5 = g2.p();
        int n6 = n4 - this.i;
        io.netty.b.g g3 = this.a(bd2, g2, n5, n6);
        g2.g(n5 + n6);
        return g3;
    }

    protected long a(io.netty.b.g g2, int n2, int n3, ByteOrder byteOrder) {
        long l2;
        g2 = g2.a(byteOrder);
        switch (n3) {
            case 1: {
                l2 = g2.n(n2);
                break;
            }
            case 2: {
                l2 = g2.p(n2);
                break;
            }
            case 3: {
                l2 = g2.r(n2);
                break;
            }
            case 4: {
                l2 = g2.t(n2);
                break;
            }
            case 8: {
                l2 = g2.u(n2);
                break;
            }
            default: {
                throw new g("unsupported lengthFieldLength: " + this.e + " (expected: 1, 2, 3, 4, or 8)");
            }
        }
        return l2;
    }

    private void b(boolean bl2) {
        if (this.m == 0L) {
            long l2 = this.l;
            this.l = 0L;
            this.k = false;
            if (!this.j || this.j && bl2) {
                this.a(l2);
            }
        } else if (this.j && bl2) {
            this.a(this.l);
        }
    }

    protected io.netty.b.g a(bd bd2, io.netty.b.g g2, int n2, int n3) {
        io.netty.b.g g3 = bd2.d().a(n3);
        g3.b(g2, n2, n3);
        return g3;
    }

    private void a(long l2) {
        if (l2 > 0L) {
            throw new y("Adjusted frame length exceeds " + this.c + ": " + l2 + " - discarded");
        }
        throw new y("Adjusted frame length exceeds " + this.c + " - discarding");
    }
}

