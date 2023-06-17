/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bm;
import io.netty.util.c.a.br;
import io.netty.util.c.a.x;

abstract class g
extends br {
    av[] a;
    av b;
    int c;
    int d;
    int e;
    final int f;
    int g;

    g(g g2, int n2, int n3, int n4, av[] arrav) {
        super(g2);
        this.g = n2;
        this.c = this.d = n3;
        this.a = arrav;
        if (arrav == null) {
            this.e = 0;
            this.f = 0;
        } else if (g2 == null) {
            this.f = this.e = arrav.length;
        } else {
            this.e = n4;
            this.f = g2.f;
        }
    }

    final av a() {
        av av2 = this.b;
        if (av2 != null) {
            av2 = av2.e;
        }
        while (true) {
            int n2;
            av[] arrav;
            block9: {
                block8: {
                    int n3;
                    if (av2 != null) {
                        this.b = av2;
                        return this.b;
                    }
                    if (this.d >= this.e) break block8;
                    arrav = this.a;
                    if (this.a != null && (n2 = arrav.length) > (n3 = this.c) && n3 >= 0) break block9;
                }
                this.b = null;
                return null;
            }
            av2 = io.netty.util.c.a.a.a(arrav, this.c);
            if (av2 != null && av2.b < 0) {
                if (av2 instanceof x) {
                    this.a = ((x)av2).a;
                    av2 = null;
                    continue;
                }
                av2 = av2 instanceof bm ? ((bm)av2).f : null;
            }
            if ((this.c += this.f) < n2) continue;
            this.c = ++this.d;
        }
    }
}

