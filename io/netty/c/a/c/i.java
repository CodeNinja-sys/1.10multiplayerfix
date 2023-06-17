/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.b.g;
import io.netty.c.a.c.ac;
import io.netty.c.a.c.c;
import io.netty.c.a.c.k;
import io.netty.c.a.c.y;
import io.netty.channel.bd;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class i
extends y {
    private static final int a = 2;
    private static final int c = 4;
    private static final int d = 8;
    private static final int e = 16;
    private static final int f = 224;
    private Inflater h;
    private final byte[] i;
    private final CRC32 j;
    private k k = io.netty.c.a.c.k.a;
    private int l = -1;
    private int m = -1;
    private volatile boolean n;
    private boolean o;

    public i() {
        this(ac.a, null);
    }

    public i(byte[] arrby) {
        this(ac.a, arrby);
    }

    public i(ac ac2) {
        this(ac2, null);
    }

    private i(ac ac2, byte[] arrby) {
        if (ac2 == null) {
            throw new NullPointerException("wrapper");
        }
        switch (ac2) {
            case b: {
                this.h = new Inflater(true);
                this.j = new CRC32();
                break;
            }
            case c: {
                this.h = new Inflater(true);
                this.j = null;
                break;
            }
            case a: {
                this.h = new Inflater();
                this.j = null;
                break;
            }
            case d: {
                this.o = true;
                this.j = null;
                break;
            }
            default: {
                throw new IllegalArgumentException("Only GZIP or ZLIB is supported, but you used " + (Object)((Object)ac2));
            }
        }
        this.i = arrby;
    }

    @Override
    public boolean d() {
        return this.n;
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        int n2;
        if (this.n) {
            g2.A(g2.r());
            return;
        }
        if (!g2.u()) {
            return;
        }
        if (this.o) {
            if (g2.r() < 2) {
                return;
            }
            n2 = !io.netty.c.a.c.i.a(g2.o(0)) ? 1 : 0;
            this.h = new Inflater(n2 != 0);
            this.o = false;
        }
        if (this.j != null) {
            switch (this.k) {
                case h: {
                    if (this.b(g2)) {
                        this.n = true;
                    }
                    return;
                }
            }
            if (this.k != io.netty.c.a.c.k.b && !this.a(g2)) {
                return;
            }
        }
        n2 = g2.r();
        if (g2.W()) {
            this.h.setInput(g2.X(), g2.Y() + g2.p(), g2.r());
        } else {
            byte[] arrby = new byte[g2.r()];
            g2.a(g2.p(), arrby);
            this.h.setInput(arrby);
        }
        int n3 = this.h.getRemaining() << 1;
        g g3 = bd2.d().c(n3);
        try {
            boolean bl2 = false;
            byte[] arrby = g3.X();
            while (!this.h.needsInput()) {
                int n4 = g3.q();
                int n5 = g3.Y() + n4;
                int n6 = g3.s();
                if (n6 == 0) {
                    list.add(g3);
                    g3 = bd2.d().c(n3);
                    arrby = g3.X();
                    continue;
                }
                int n7 = this.h.inflate(arrby, n5, n6);
                if (n7 > 0) {
                    g3.h(n4 + n7);
                    if (this.j != null) {
                        this.j.update(arrby, n5, n7);
                    }
                } else if (this.h.needsDictionary()) {
                    if (this.i == null) {
                        throw new c("decompression failure, unable to set dictionary as non was specified");
                    }
                    this.h.setDictionary(this.i);
                }
                if (!this.h.finished()) continue;
                if (this.j == null) {
                    this.n = true;
                    break;
                }
                bl2 = true;
                break;
            }
            g2.A(n2 - this.h.getRemaining());
            if (bl2) {
                this.k = io.netty.c.a.c.k.h;
                if (this.b(g2)) {
                    this.n = true;
                }
            }
        }
        catch (DataFormatException dataFormatException) {
            throw new c("decompression failure", dataFormatException);
        }
        finally {
            if (g3.u()) {
                list.add(g3);
            } else {
                g3.ad();
            }
        }
    }

    @Override
    protected void k(bd bd2) {
        super.k(bd2);
        if (this.h != null) {
            this.h.end();
        }
    }

    private boolean a(g g2) {
        switch (this.k) {
            case a: {
                if (g2.r() < 10) {
                    return false;
                }
                byte by2 = g2.E();
                byte by3 = g2.E();
                if (by2 != 31) {
                    throw new c("Input is not in the GZIP format");
                }
                this.j.update(by2);
                this.j.update(by3);
                short s2 = g2.F();
                if (s2 != 8) {
                    throw new c("Unsupported compression method " + s2 + " in the GZIP header");
                }
                this.j.update(s2);
                this.l = g2.F();
                this.j.update(this.l);
                if ((this.l & 0xE0) != 0) {
                    throw new c("Reserved flags are set in the GZIP header");
                }
                this.j.update(g2.E());
                this.j.update(g2.E());
                this.j.update(g2.E());
                this.j.update(g2.E());
                this.j.update(g2.F());
                this.j.update(g2.F());
                this.k = io.netty.c.a.c.k.c;
            }
            case c: {
                short s3;
                if ((this.l & 4) != 0) {
                    if (g2.r() < 2) {
                        return false;
                    }
                    s3 = g2.F();
                    short s4 = g2.F();
                    this.j.update(s3);
                    this.j.update(s4);
                    this.m |= s3 << 8 | s4;
                }
                this.k = io.netty.c.a.c.k.d;
            }
            case d: {
                if (this.m != -1) {
                    if (g2.r() < this.m) {
                        return false;
                    }
                    byte[] arrby = new byte[this.m];
                    g2.b(arrby);
                    this.j.update(arrby);
                }
                this.k = io.netty.c.a.c.k.e;
            }
            case e: {
                short s3;
                if ((this.l & 8) != 0) {
                    if (!g2.u()) {
                        return false;
                    }
                    do {
                        s3 = g2.F();
                        this.j.update(s3);
                    } while (s3 != 0 && g2.u());
                }
                this.k = io.netty.c.a.c.k.f;
            }
            case f: {
                short s3;
                if ((this.l & 0x10) != 0) {
                    if (!g2.u()) {
                        return false;
                    }
                    do {
                        s3 = g2.F();
                        this.j.update(s3);
                    } while (s3 != 0 && g2.u());
                }
                this.k = io.netty.c.a.c.k.g;
            }
            case g: {
                if ((this.l & 2) != 0) {
                    if (g2.r() < 4) {
                        return false;
                    }
                    this.c(g2);
                }
                this.j.reset();
                this.k = io.netty.c.a.c.k.b;
            }
            case b: {
                return true;
            }
        }
        throw new IllegalStateException();
    }

    private boolean b(g g2) {
        int n2;
        if (g2.r() < 8) {
            return false;
        }
        this.c(g2);
        int n3 = 0;
        for (n2 = 0; n2 < 4; ++n2) {
            n3 |= g2.F() << n2 * 8;
        }
        n2 = this.h.getTotalOut();
        if (n3 != n2) {
            throw new c("Number of bytes mismatch. Expected: " + n3 + ", Got: " + n2);
        }
        return true;
    }

    private void c(g g2) {
        long l2 = 0L;
        for (int i2 = 0; i2 < 4; ++i2) {
            l2 |= (long)g2.F() << i2 * 8;
        }
        long l3 = this.j.getValue();
        if (l2 != l3) {
            throw new c("CRC value missmatch. Expected: " + l2 + ", Got: " + l3);
        }
    }

    private static boolean a(short s2) {
        return (s2 & 0x7800) == 30720 && s2 % 31 == 0;
    }
}

