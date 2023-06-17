/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.bi;
import io.netty.c.a.d.c.a;
import io.netty.c.a.d.c.ae;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.c.c;
import io.netty.c.a.d.c.d;
import io.netty.c.a.d.c.e;
import io.netty.c.a.d.c.g;
import io.netty.c.a.d.c.n;
import io.netty.c.a.f;
import io.netty.c.a.w;
import io.netty.c.a.y;
import io.netty.channel.aw;
import io.netty.channel.bd;
import io.netty.util.b.ad;
import io.netty.util.c.b.h;
import java.util.List;

public class l
extends w
implements ae {
    private static final io.netty.util.c.b.g c = io.netty.util.c.b.h.a(l.class);
    private static final byte d = 0;
    private static final byte e = 1;
    private static final byte f = 2;
    private static final byte h = 8;
    private static final byte i = 9;
    private static final byte j = 10;
    private int k;
    private final long l;
    private boolean m;
    private int n;
    private int o;
    private long p;
    private io.netty.b.g q;
    private int r;
    private byte[] s;
    private io.netty.b.g t;
    private final boolean u;
    private final boolean v;
    private boolean w;
    private g x;

    public l(boolean bl2, boolean bl3, int n2) {
        super((Object)io.netty.c.a.d.c.n.a);
        this.v = bl2;
        this.u = bl3;
        this.l = n2;
    }

    @Override
    protected void a(bd bd2, io.netty.b.g g2, List list) {
        if (this.w) {
            g2.A(this.b());
            return;
        }
        try {
            switch ((n)((Object)this.e())) {
                case a: {
                    this.r = 0;
                    this.p = -1L;
                    this.q = null;
                    this.t = null;
                    byte by2 = g2.E();
                    this.m = (by2 & 0x80) != 0;
                    this.n = (by2 & 0x70) >> 4;
                    this.o = by2 & 0xF;
                    if (c.d()) {
                        c.b("Decoding WebSocket Frame opCode={}", (Object)this.o);
                    }
                    boolean bl2 = ((by2 = g2.E()) & 0x80) != 0;
                    int n2 = by2 & 0x7F;
                    if (this.n != 0 && !this.u) {
                        this.a(bd2, "RSV != 0 and no extension negotiated, RSV:" + this.n);
                        return;
                    }
                    if (this.v && !bl2) {
                        this.a(bd2, "unmasked client to server frame");
                        return;
                    }
                    if (this.o > 7) {
                        if (!this.m) {
                            this.a(bd2, "fragmented control frame");
                            return;
                        }
                        if (n2 > 125) {
                            this.a(bd2, "control frame with payload length > 125 octets");
                            return;
                        }
                        if (this.o != 8 && this.o != 9 && this.o != 10) {
                            this.a(bd2, "control frame using reserved opcode " + this.o);
                            return;
                        }
                        if (this.o == 8 && n2 == 1) {
                            this.a(bd2, "received close control frame with payload len 1");
                            return;
                        }
                    } else {
                        if (this.o != 0 && this.o != 1 && this.o != 2) {
                            this.a(bd2, "data frame using reserved opcode " + this.o);
                            return;
                        }
                        if (this.k == 0 && this.o == 0) {
                            this.a(bd2, "received continuation data frame outside fragmented message");
                            return;
                        }
                        if (this.k != 0 && this.o != 0 && this.o != 9) {
                            this.a(bd2, "received non-continuation data frame while inside fragmented message");
                            return;
                        }
                    }
                    if (n2 == 126) {
                        this.p = g2.H();
                        if (this.p < 126L) {
                            this.a(bd2, "invalid data frame length (not using minimal length encoding)");
                            return;
                        }
                    } else if (n2 == 127) {
                        this.p = g2.M();
                        if (this.p < 65536L) {
                            this.a(bd2, "invalid data frame length (not using minimal length encoding)");
                            return;
                        }
                    } else {
                        this.p = n2;
                    }
                    if (this.p > this.l) {
                        this.a(bd2, "Max frame length of " + this.l + " has been exceeded.");
                        return;
                    }
                    if (c.d()) {
                        c.b("Decoding WebSocket Frame length={}", (Object)this.p);
                    }
                    this.a((Object)io.netty.c.a.d.c.n.b);
                }
                case b: {
                    if (this.v) {
                        if (this.s == null) {
                            this.s = new byte[4];
                        }
                        g2.b(this.s);
                    }
                    this.a((Object)io.netty.c.a.d.c.n.c);
                }
                case c: {
                    int n3 = this.b();
                    long l2 = this.r + n3;
                    if (l2 == this.p) {
                        this.t = bd2.d().a(n3);
                        this.t.b(g2, n3);
                    } else {
                        if (l2 < this.p) {
                            if (this.q == null) {
                                this.q = bd2.d().a(io.netty.c.a.d.c.l.a(this.p));
                            }
                            this.q.b(g2, n3);
                            this.r += n3;
                            return;
                        }
                        if (l2 > this.p) {
                            if (this.q == null) {
                                this.q = bd2.d().a(io.netty.c.a.d.c.l.a(this.p));
                            }
                            this.q.b(g2, io.netty.c.a.d.c.l.a(this.p - (long)this.r));
                        }
                    }
                    this.a((Object)io.netty.c.a.d.c.n.a);
                    if (this.q == null) {
                        this.q = this.t;
                        this.t = null;
                    } else if (this.t != null) {
                        this.q.b(this.t);
                        this.t.ad();
                        this.t = null;
                    }
                    if (this.v) {
                        this.a(this.q);
                    }
                    if (this.o == 9) {
                        list.add(new d(this.m, this.n, this.q));
                        this.q = null;
                        return;
                    }
                    if (this.o == 10) {
                        list.add(new e(this.m, this.n, this.q));
                        this.q = null;
                        return;
                    }
                    if (this.o == 8) {
                        this.a(bd2, this.q);
                        this.w = true;
                        list.add(new b(this.m, this.n, this.q));
                        this.q = null;
                        return;
                    }
                    if (this.m) {
                        if (this.o != 9) {
                            this.k = 0;
                            if (this.o == 1 || this.x != null && this.x.b()) {
                                this.b(bd2, this.q);
                                this.x.a();
                            }
                        }
                    } else {
                        if (this.k == 0) {
                            if (this.o == 1) {
                                this.b(bd2, this.q);
                            }
                        } else if (this.x != null && this.x.b()) {
                            this.b(bd2, this.q);
                        }
                        ++this.k;
                    }
                    if (this.o == 1) {
                        list.add(new io.netty.c.a.d.c.f(this.m, this.n, this.q));
                        this.q = null;
                        return;
                    }
                    if (this.o == 2) {
                        list.add(new a(this.m, this.n, this.q));
                        this.q = null;
                        return;
                    }
                    if (this.o == 0) {
                        list.add(new c(this.m, this.n, this.q));
                        this.q = null;
                        return;
                    }
                    throw new UnsupportedOperationException("Cannot decode web socket frame with opcode: " + this.o);
                }
                case d: {
                    g2.E();
                    return;
                }
            }
            throw new Error("Shouldn't reach here.");
        }
        catch (Exception exception) {
            if (this.t != null) {
                if (this.t.ac() > 0) {
                    this.t.ad();
                }
                this.t = null;
            }
            if (this.q != null) {
                if (this.q.ac() > 0) {
                    this.q.ad();
                }
                this.q = null;
            }
            throw exception;
        }
    }

    private void a(io.netty.b.g g2) {
        for (int i2 = g2.p(); i2 < g2.q(); ++i2) {
            g2.b(i2, g2.m(i2) ^ this.s[i2 % 4]);
        }
    }

    private void a(bd bd2, String string) {
        this.a(bd2, new f(string));
    }

    private void a(bd bd2, f f2) {
        this.a((Object)io.netty.c.a.d.c.n.d);
        if (bd2.b().I()) {
            bd2.d(bi.c).a((ad)aw.g);
        }
        throw f2;
    }

    private static int a(long l2) {
        if (l2 > Integer.MAX_VALUE) {
            throw new y("Length:" + l2);
        }
        return (int)l2;
    }

    private void b(bd bd2, io.netty.b.g g2) {
        try {
            if (this.x == null) {
                this.x = new g();
            }
            this.x.a(g2);
        }
        catch (f f2) {
            this.a(bd2, f2);
        }
    }

    protected void a(bd bd2, io.netty.b.g g2) {
        if (g2 == null || !g2.u()) {
            return;
        }
        if (g2.r() == 1) {
            this.a(bd2, "Invalid close frame body");
        }
        int n2 = g2.p();
        g2.g(0);
        short s2 = g2.G();
        if (s2 >= 0 && s2 <= 999 || s2 >= 1004 && s2 <= 1006 || s2 >= 1012 && s2 <= 2999) {
            this.a(bd2, "Invalid close frame getStatus code: " + s2);
        }
        if (g2.u()) {
            try {
                new g().a(g2);
            }
            catch (f f2) {
                this.a(bd2, f2);
            }
        }
        g2.g(n2);
    }

    @Override
    public void b(bd bd2) {
        super.b(bd2);
        if (this.q != null) {
            this.q.ad();
        }
        if (this.t != null) {
            this.t.ad();
        }
    }
}

