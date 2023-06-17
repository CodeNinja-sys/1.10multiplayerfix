/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.db;
import com.ibm.icu.util.e;
import com.ibm.icu.util.l;
import java.nio.ByteBuffer;

public final class k
extends cs {
    private final byte[] d = new byte[5];
    private byte[] e;
    private int f;

    public k a(byte[] arrby, int n2, int n3) {
        this.b(new l(arrby, n2), n3);
        return this;
    }

    public e a(db db2) {
        this.d(db2);
        return new e(this.e, this.e.length - this.f);
    }

    public ByteBuffer b(db db2) {
        this.d(db2);
        return ByteBuffer.wrap(this.e, this.e.length - this.f, this.f);
    }

    private void d(db db2) {
        if (this.e == null) {
            this.e = new byte[1024];
        }
        this.c(db2);
    }

    public k a() {
        this.f();
        this.e = null;
        this.f = 0;
        return this;
    }

    protected boolean b() {
        return false;
    }

    protected int c() {
        return 5;
    }

    protected int d() {
        return 16;
    }

    protected int e() {
        return 16;
    }

    private void c(int n2) {
        if (n2 > this.e.length) {
            int n3 = this.e.length;
            while ((n3 *= 2) <= n2) {
            }
            byte[] arrby = new byte[n3];
            System.arraycopy(this.e, this.e.length - this.f, arrby, arrby.length - this.f, this.f);
            this.e = arrby;
        }
    }

    protected int a(int n2) {
        int n3 = this.f + 1;
        this.c(n3);
        this.f = n3;
        this.e[this.e.length - this.f] = (byte)n2;
        return this.f;
    }

    protected int a(int n2, int n3) {
        int n4 = this.f + n3;
        this.c(n4);
        this.f = n4;
        int n5 = this.e.length - this.f;
        while (n3 > 0) {
            this.e[n5++] = (byte)this.b.charAt(n2++);
            --n3;
        }
        return this.f;
    }

    private int a(byte[] arrby, int n2) {
        int n3 = this.f + n2;
        this.c(n3);
        this.f = n3;
        System.arraycopy(arrby, 0, this.e, this.e.length - this.f, n2);
        return this.f;
    }

    protected int a(int n2, boolean bl2) {
        if (0 <= n2 && n2 <= 64) {
            return this.a(16 + n2 << 1 | (bl2 ? 1 : 0));
        }
        int n3 = 1;
        if (n2 < 0 || n2 > 0xFFFFFF) {
            this.d[0] = 127;
            this.d[1] = (byte)(n2 >> 24);
            this.d[2] = (byte)(n2 >> 16);
            this.d[3] = (byte)(n2 >> 8);
            this.d[4] = (byte)n2;
            n3 = 5;
        } else {
            if (n2 <= 6911) {
                this.d[0] = (byte)(81 + (n2 >> 8));
            } else {
                if (n2 <= 0x11FFFF) {
                    this.d[0] = (byte)(108 + (n2 >> 16));
                } else {
                    this.d[0] = 126;
                    this.d[1] = (byte)(n2 >> 16);
                    n3 = 2;
                }
                this.d[n3++] = (byte)(n2 >> 8);
            }
            this.d[n3++] = (byte)n2;
        }
        this.d[0] = (byte)(this.d[0] << 1 | (bl2 ? 1 : 0));
        return this.a(this.d, n3);
    }

    protected int a(boolean bl2, int n2, int n3) {
        int n4 = this.a(n3);
        if (bl2) {
            n4 = this.a(n2, false);
        }
        return n4;
    }

    protected int b(int n2) {
        int n3;
        int n4 = this.f - n2;
        assert (n4 >= 0);
        if (n4 <= 191) {
            return this.a(n4);
        }
        if (n4 <= 12287) {
            this.d[0] = (byte)(192 + (n4 >> 8));
            n3 = 1;
        } else {
            if (n4 <= 917503) {
                this.d[0] = (byte)(240 + (n4 >> 16));
                n3 = 2;
            } else {
                if (n4 <= 0xFFFFFF) {
                    this.d[0] = -2;
                    n3 = 3;
                } else {
                    this.d[0] = -1;
                    this.d[1] = (byte)(n4 >> 24);
                    n3 = 4;
                }
                this.d[1] = (byte)(n4 >> 16);
            }
            this.d[1] = (byte)(n4 >> 8);
        }
        this.d[n3++] = (byte)n4;
        return this.a(this.d, n3);
    }
}

