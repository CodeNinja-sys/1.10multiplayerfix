/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.b.g;
import io.netty.c.a.p;
import io.netty.channel.bd;

public class n
extends p {
    private final int a;
    private final boolean b;
    private final int c;

    public n(int n2) {
        this(n2, false);
    }

    public n(int n2, boolean bl2) {
        this(n2, 0, bl2);
    }

    public n(int n2, int n3) {
        this(n2, n3, false);
    }

    public n(int n2, int n3, boolean bl2) {
        if (n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 && n2 != 8) {
            throw new IllegalArgumentException("lengthFieldLength must be either 1, 2, 3, 4, or 8: " + n2);
        }
        this.a = n2;
        this.b = bl2;
        this.c = n3;
    }

    protected void a(bd bd2, g g2, g g3) {
        int n2 = g2.r() + this.c;
        if (this.b) {
            n2 += this.a;
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("Adjusted frame length (" + n2 + ") is less than zero");
        }
        switch (this.a) {
            case 1: {
                if (n2 >= 256) {
                    throw new IllegalArgumentException("length does not fit into a byte: " + n2);
                }
                g3.B((byte)n2);
                break;
            }
            case 2: {
                if (n2 >= 65536) {
                    throw new IllegalArgumentException("length does not fit into a short integer: " + n2);
                }
                g3.C((short)n2);
                break;
            }
            case 3: {
                if (n2 >= 0x1000000) {
                    throw new IllegalArgumentException("length does not fit into a medium integer: " + n2);
                }
                g3.D(n2);
                break;
            }
            case 4: {
                g3.E(n2);
                break;
            }
            case 8: {
                g3.b(n2);
                break;
            }
            default: {
                throw new Error("should not reach here");
            }
        }
        g3.b(g2, g2.p(), g2.r());
    }
}

