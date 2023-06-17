/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.b.g;
import io.netty.c.a.c.ac;
import io.netty.c.a.c.m;
import io.netty.c.a.c.n;
import io.netty.c.a.c.o;
import io.netty.c.a.c.z;
import io.netty.channel.av;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import io.netty.util.b.w;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public class l
extends z {
    private final ac a;
    private final Deflater b;
    private volatile boolean c;
    private volatile bd d;
    private final CRC32 e = new CRC32();
    private static final byte[] f = new byte[]{31, -117, 8, 0, 0, 0, 0, 0, 0, 0};
    private boolean h = true;

    public l() {
        this(6);
    }

    public l(int n2) {
        this(ac.a, n2);
    }

    public l(ac ac2) {
        this(ac2, 6);
    }

    public l(ac ac2, int n2) {
        if (n2 < 0 || n2 > 9) {
            throw new IllegalArgumentException("compressionLevel: " + n2 + " (expected: 0-9)");
        }
        if (ac2 == null) {
            throw new NullPointerException("wrapper");
        }
        if (ac2 == ac.d) {
            throw new IllegalArgumentException("wrapper '" + (Object)((Object)ac.d) + "' is not " + "allowed for compression.");
        }
        this.a = ac2;
        this.b = new Deflater(n2, ac2 != ac.a);
    }

    public l(byte[] arrby) {
        this(6, arrby);
    }

    public l(int n2, byte[] arrby) {
        if (n2 < 0 || n2 > 9) {
            throw new IllegalArgumentException("compressionLevel: " + n2 + " (expected: 0-9)");
        }
        if (arrby == null) {
            throw new NullPointerException("dictionary");
        }
        this.a = ac.a;
        this.b = new Deflater(n2);
        this.b.setDictionary(arrby);
    }

    @Override
    public av a() {
        return this.a(this.c().r());
    }

    @Override
    public av a(bw bw2) {
        bd bd2 = this.c();
        w w2 = bd2.e();
        if (w2.bt_()) {
            return this.d(bd2, bw2);
        }
        bw bw3 = bd2.r();
        w2.execute(new m(this, bw3, bw2));
        return bw3;
    }

    private bd c() {
        bd bd2 = this.d;
        if (bd2 == null) {
            throw new IllegalStateException("not added to a pipeline");
        }
        return bd2;
    }

    @Override
    public boolean b() {
        return this.c;
    }

    protected void a(bd bd2, g g2, g g3) {
        int n2;
        byte[] arrby;
        if (this.c) {
            g3.b(g2);
            return;
        }
        int n3 = g2.r();
        if (g2.W()) {
            arrby = g2.X();
            n2 = g2.Y() + g2.p();
            g2.A(n3);
        } else {
            arrby = new byte[n3];
            g2.b(arrby);
            n2 = 0;
        }
        if (this.h) {
            this.h = false;
            if (this.a == ac.b) {
                g3.c(f);
            }
        }
        if (this.a == ac.b) {
            this.e.update(arrby, n2, n3);
        }
        this.b.setInput(arrby, n2, n3);
        while (!this.b.needsInput()) {
            this.a(g3);
        }
    }

    protected final g a(bd bd2, g g2, boolean bl2) {
        int n2 = (int)Math.ceil((double)g2.r() * 1.001) + 12;
        if (this.h) {
            switch (this.a) {
                case b: {
                    n2 += f.length;
                    break;
                }
                case a: {
                    n2 += 2;
                }
            }
        }
        return bd2.d().c(n2);
    }

    @Override
    public void b(bd bd2, bw bw2) {
        av av2 = this.d(bd2, bd2.r());
        av2.a((ad)new n(this, bd2, bw2));
        if (!av2.isDone()) {
            bd2.e().a(new o(this, bd2, bw2), 10L, TimeUnit.SECONDS);
        }
    }

    private av d(bd bd2, bw bw2) {
        if (this.c) {
            bw2.b();
            return bw2;
        }
        this.c = true;
        g g2 = bd2.d().c();
        if (this.h && this.a == ac.b) {
            this.h = false;
            g2.c(f);
        }
        this.b.finish();
        while (!this.b.finished()) {
            this.a(g2);
            if (g2.v()) continue;
            bd2.c(g2);
            g2 = bd2.d().c();
        }
        if (this.a == ac.b) {
            int n2 = (int)this.e.getValue();
            int n3 = this.b.getTotalIn();
            g2.B(n2);
            g2.B(n2 >>> 8);
            g2.B(n2 >>> 16);
            g2.B(n2 >>> 24);
            g2.B(n3);
            g2.B(n3 >>> 8);
            g2.B(n3 >>> 16);
            g2.B(n3 >>> 24);
        }
        this.b.end();
        return bd2.b(g2, bw2);
    }

    private void a(g g2) {
        int n2;
        do {
            int n3 = g2.q();
            n2 = this.b.deflate(g2.X(), g2.Y() + n3, g2.s(), 2);
            g2.h(n3 + n2);
        } while (n2 > 0);
    }

    @Override
    public void e(bd bd2) {
        this.d = bd2;
    }

    static /* synthetic */ bd a(l l2) {
        return l2.c();
    }

    static /* synthetic */ av a(l l2, bd bd2, bw bw2) {
        return l2.d(bd2, bw2);
    }
}

