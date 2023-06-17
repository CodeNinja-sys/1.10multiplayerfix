/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.channel.ak;
import io.netty.channel.dg;

final class al
implements dg {
    private final int a;
    private final int b;
    private int c;
    private int d;
    private boolean e;

    al(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = ak.a(n4);
        this.d = ak.b()[this.c];
    }

    @Override
    public g a(h h2) {
        return h2.b(this.d);
    }

    @Override
    public int a() {
        return this.d;
    }

    @Override
    public void a(int n2) {
        if (n2 <= ak.b()[Math.max(0, this.c - 1 - 1)]) {
            if (this.e) {
                this.c = Math.max(this.c - 1, this.a);
                this.d = ak.b()[this.c];
                this.e = false;
            } else {
                this.e = true;
            }
        } else if (n2 >= this.d) {
            this.c = Math.min(this.c + 4, this.b);
            this.d = ak.b()[this.c];
            this.e = false;
        }
    }
}

