/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.jcraft.jzlib.Inflater
 *  com.jcraft.jzlib.JZlib
 */
package io.netty.c.a.c;

import com.jcraft.jzlib.Inflater;
import com.jcraft.jzlib.JZlib;
import io.netty.b.g;
import io.netty.c.a.c.aa;
import io.netty.c.a.c.ac;
import io.netty.c.a.c.y;
import io.netty.channel.bd;
import java.util.List;

public class d
extends y {
    private final Inflater a = new Inflater();
    private byte[] c;
    private volatile boolean d;

    public d() {
        this(ac.a);
    }

    public d(ac ac2) {
        if (ac2 == null) {
            throw new NullPointerException("wrapper");
        }
        int n2 = this.a.init(aa.a(ac2));
        if (n2 != 0) {
            aa.a(this.a, "initialization failure", n2);
        }
    }

    public d(byte[] arrby) {
        if (arrby == null) {
            throw new NullPointerException("dictionary");
        }
        this.c = arrby;
        int n2 = this.a.inflateInit(JZlib.W_ZLIB);
        if (n2 != 0) {
            aa.a(this.a, "initialization failure", n2);
        }
    }

    @Override
    public boolean d() {
        return this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(bd bd2, g g2, List list) {
        if (this.d) {
            g2.A(g2.r());
            return;
        }
        if (!g2.u()) {
            return;
        }
        try {
            int n2;
            this.a.avail_in = n2 = g2.r();
            if (g2.W()) {
                this.a.next_in = g2.X();
                this.a.next_in_index = g2.Y() + g2.p();
            } else {
                byte[] arrby = new byte[n2];
                g2.a(g2.p(), arrby);
                this.a.next_in = arrby;
                this.a.next_in_index = 0;
            }
            int n3 = this.a.next_in_index;
            int n4 = n2 << 1;
            g g3 = bd2.d().c(n4);
            block12: while (true) {
                block13: while (true) {
                    this.a.avail_out = n4;
                    g3.k(n4);
                    this.a.next_out = g3.X();
                    int n5 = this.a.next_out_index = g3.Y() + g3.q();
                    int n6 = this.a.inflate(2);
                    int n7 = this.a.next_out_index - n5;
                    if (n7 > 0) {
                        g3.h(g3.q() + n7);
                    }
                    switch (n6) {
                        case 2: {
                            if (this.c == null) {
                                aa.a(this.a, "decompression failure", n6);
                                continue block12;
                            }
                            n6 = this.a.inflateSetDictionary(this.c, this.c.length);
                            if (n6 == 0) continue block12;
                            aa.a(this.a, "failed to set the dictionary", n6);
                            continue block12;
                        }
                        case 1: {
                            this.d = true;
                            this.a.inflateEnd();
                            return;
                        }
                        case 0: {
                            continue block12;
                        }
                        case -5: {
                            if (this.a.avail_in <= 0) return;
                            continue block12;
                        }
                        default: {
                            aa.a(this.a, "decompression failure", n6);
                            continue block13;
                        }
                    }
                    break;
                }
                break;
            }
            finally {
                g2.A(this.a.next_in_index - n3);
                if (g3.u()) {
                    list.add(g3);
                } else {
                    g3.ad();
                }
            }
        }
        finally {
            this.a.next_in = null;
            this.a.next_out = null;
        }
    }
}

