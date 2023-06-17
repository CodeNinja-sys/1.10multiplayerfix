/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bm;
import io.netty.util.c.a.x;

class bl {
    av[] c;
    av d;
    int e;
    int f;
    int g;
    final int h;

    bl(av[] arrav, int n2, int n3, int n4) {
        this.c = arrav;
        this.h = n2;
        this.f = this.e = n3;
        this.g = n4;
        this.d = null;
    }

    final av c() {
        av av2 = this.d;
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
                        this.d = av2;
                        return this.d;
                    }
                    if (this.f >= this.g) break block8;
                    arrav = this.c;
                    if (this.c != null && (n2 = arrav.length) > (n3 = this.e) && n3 >= 0) break block9;
                }
                this.d = null;
                return null;
            }
            av2 = a.a(arrav, this.e);
            if (av2 != null && av2.b < 0) {
                if (av2 instanceof x) {
                    this.c = ((x)av2).a;
                    av2 = null;
                    continue;
                }
                av2 = av2 instanceof bm ? ((bm)av2).f : null;
            }
            if ((this.e += this.h) < n2) continue;
            this.e = ++this.f;
        }
    }
}

