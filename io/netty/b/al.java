/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ah;
import io.netty.b.ak;
import io.netty.b.at;
import io.netty.util.c.ad;

final class al {
    private final ah c;
    private final al d;
    al a;
    private final int e;
    private final int f;
    private ak g;

    al(ah ah2, al al2, int n2, int n3) {
        this.c = ah2;
        this.d = al2;
        this.e = n2;
        this.f = n3;
    }

    boolean a(at at2, int n2, int n3) {
        long l2;
        if (this.g == null) {
            return false;
        }
        ak ak2 = this.g;
        while ((l2 = ak2.a(n3)) < 0L) {
            ak2 = ak2.f;
            if (ak2 != null) continue;
            return false;
        }
        ak2.a(at2, l2, n2);
        if (ak2.a() >= this.f) {
            this.b(ak2);
            this.d.a(ak2);
        }
        return true;
    }

    void a(ak ak2, long l2) {
        ak2.a(l2);
        if (ak2.a() < this.e) {
            this.b(ak2);
            if (this.a == null) {
                assert (ak2.a() == 0);
                this.c.a(ak2);
            } else {
                this.a.a(ak2);
            }
        }
    }

    void a(ak ak2) {
        if (ak2.a() >= this.f) {
            this.d.a(ak2);
            return;
        }
        ak2.d = this;
        if (this.g == null) {
            this.g = ak2;
            ak2.e = null;
            ak2.f = null;
        } else {
            ak2.e = null;
            ak2.f = this.g;
            this.g.e = ak2;
            this.g = ak2;
        }
    }

    private void b(ak ak2) {
        if (ak2 == this.g) {
            this.g = ak2.f;
            if (this.g != null) {
                this.g.e = null;
            }
        } else {
            ak ak3;
            ak2.e.f = ak3 = ak2.f;
            if (ak3 != null) {
                ak3.e = ak2.e;
            }
        }
    }

    public String toString() {
        if (this.g == null) {
            return "none";
        }
        StringBuilder stringBuilder = new StringBuilder();
        ak ak2 = this.g;
        while (true) {
            stringBuilder.append(ak2);
            ak2 = ak2.f;
            if (ak2 == null) break;
            stringBuilder.append(ad.a);
        }
        return stringBuilder.toString();
    }
}

