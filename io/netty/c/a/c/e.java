/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.jcraft.jzlib.Deflater
 *  com.jcraft.jzlib.JZlib
 */
package io.netty.c.a.c;

import com.jcraft.jzlib.Deflater;
import com.jcraft.jzlib.JZlib;
import io.netty.b.bi;
import io.netty.c.a.c.aa;
import io.netty.c.a.c.ac;
import io.netty.c.a.c.f;
import io.netty.c.a.c.g;
import io.netty.c.a.c.h;
import io.netty.c.a.c.z;
import io.netty.channel.av;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import io.netty.util.b.w;
import io.netty.util.c.d;
import java.util.concurrent.TimeUnit;

public class e
extends z {
    private final int a;
    private final Deflater b = new Deflater();
    private volatile boolean c;
    private volatile bd d;

    public e() {
        this(6);
    }

    public e(int n2) {
        this(ac.a, n2);
    }

    public e(ac ac2) {
        this(ac2, 6);
    }

    public e(ac ac2, int n2) {
        this(ac2, n2, 15, 8);
    }

    public e(ac ac2, int n2, int n3, int n4) {
        if (n2 < 0 || n2 > 9) {
            throw new IllegalArgumentException("compressionLevel: " + n2 + " (expected: 0-9)");
        }
        if (n3 < 9 || n3 > 15) {
            throw new IllegalArgumentException("windowBits: " + n3 + " (expected: 9-15)");
        }
        if (n4 < 1 || n4 > 9) {
            throw new IllegalArgumentException("memLevel: " + n4 + " (expected: 1-9)");
        }
        if (ac2 == null) {
            throw new NullPointerException("wrapper");
        }
        if (ac2 == ac.d) {
            throw new IllegalArgumentException("wrapper '" + (Object)((Object)ac.d) + "' is not " + "allowed for compression.");
        }
        int n5 = this.b.init(n2, n3, n4, aa.a(ac2));
        if (n5 != 0) {
            aa.a(this.b, "initialization failure", n5);
        }
        this.a = aa.b(ac2);
    }

    public e(byte[] arrby) {
        this(6, arrby);
    }

    public e(int n2, byte[] arrby) {
        this(n2, 15, 8, arrby);
    }

    public e(int n2, int n3, int n4, byte[] arrby) {
        if (n2 < 0 || n2 > 9) {
            throw new IllegalArgumentException("compressionLevel: " + n2 + " (expected: 0-9)");
        }
        if (n3 < 9 || n3 > 15) {
            throw new IllegalArgumentException("windowBits: " + n3 + " (expected: 9-15)");
        }
        if (n4 < 1 || n4 > 9) {
            throw new IllegalArgumentException("memLevel: " + n4 + " (expected: 1-9)");
        }
        if (arrby == null) {
            throw new NullPointerException("dictionary");
        }
        int n5 = this.b.deflateInit(n2, n3, n4, JZlib.W_ZLIB);
        if (n5 != 0) {
            aa.a(this.b, "initialization failure", n5);
        } else {
            n5 = this.b.deflateSetDictionary(arrby, arrby.length);
            if (n5 != 0) {
                aa.a(this.b, "failed to set the dictionary", n5);
            }
        }
        this.a = aa.b(ac.a);
    }

    @Override
    public av a() {
        return this.a(this.c().b().p());
    }

    @Override
    public av a(bw bw2) {
        bd bd2 = this.c();
        w w2 = bd2.e();
        if (w2.bt_()) {
            return this.d(bd2, bw2);
        }
        bw bw3 = bd2.r();
        w2.execute(new f(this, bw3, bw2));
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(bd bd2, io.netty.b.g g2, io.netty.b.g g3) {
        if (this.c) {
            return;
        }
        try {
            int n2;
            int n3;
            int n4 = g2.r();
            boolean bl2 = g2.W();
            this.b.avail_in = n4;
            if (bl2) {
                this.b.next_in = g2.X();
                this.b.next_in_index = g2.Y() + g2.p();
            } else {
                byte[] arrby = new byte[n4];
                g2.a(g2.p(), arrby);
                this.b.next_in = arrby;
                this.b.next_in_index = 0;
            }
            int n5 = this.b.next_in_index;
            int n6 = (int)Math.ceil((double)n4 * 1.001) + 12 + this.a;
            g3.k(n6);
            this.b.avail_out = n6;
            this.b.next_out = g3.X();
            int n7 = this.b.next_out_index = g3.Y() + g3.q();
            try {
                n3 = this.b.deflate(2);
            }
            finally {
                g2.A(this.b.next_in_index - n5);
            }
            if (n3 != 0) {
                aa.a(this.b, "compression failure", n3);
            }
            if ((n2 = this.b.next_out_index - n7) > 0) {
                g3.h(g3.q() + n2);
            }
        }
        finally {
            this.b.next_in = null;
            this.b.next_out = null;
        }
    }

    @Override
    public void b(bd bd2, bw bw2) {
        av av2 = this.d(bd2, bd2.r());
        av2.a((ad)new g(this, bd2, bw2));
        if (!av2.isDone()) {
            bd2.e().a(new h(this, bd2, bw2), 10L, TimeUnit.SECONDS);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private av d(bd bd2, bw bw2) {
        io.netty.b.g g2;
        if (this.c) {
            bw2.b();
            return bw2;
        }
        this.c = true;
        try {
            this.b.next_in = io.netty.util.c.d.a;
            this.b.next_in_index = 0;
            this.b.avail_in = 0;
            byte[] arrby = new byte[32];
            this.b.next_out = arrby;
            this.b.next_out_index = 0;
            this.b.avail_out = arrby.length;
            int n2 = this.b.deflate(4);
            if (n2 != 0 && n2 != 1) {
                bw2.a(aa.b(this.b, "compression failure", n2));
                bw bw3 = bw2;
                return bw3;
            }
            g2 = this.b.next_out_index != 0 ? bi.a(arrby, 0, this.b.next_out_index) : bi.c;
        }
        finally {
            this.b.deflateEnd();
            this.b.next_in = null;
            this.b.next_out = null;
        }
        return bd2.b(g2, bw2);
    }

    @Override
    public void e(bd bd2) {
        this.d = bd2;
    }

    static /* synthetic */ bd a(e e2) {
        return e2.c();
    }

    static /* synthetic */ av a(e e2, bd bd2, bw bw2) {
        return e2.d(bd2, bw2);
    }
}

