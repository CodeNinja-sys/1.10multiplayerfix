/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ad;
import io.netty.util.b.ae;
import java.util.Arrays;

final class j {
    private ad[] a = new ad[2];
    private int b;
    private int c;

    j(ad ad2, ad ad3) {
        this.a[0] = ad2;
        this.a[1] = ad3;
        this.b = 2;
        if (ad2 instanceof ae) {
            ++this.c;
        }
        if (ad3 instanceof ae) {
            ++this.c;
        }
    }

    public void a(ad ad2) {
        int n2 = this.b;
        ad[] arrad = this.a;
        if (n2 == arrad.length) {
            this.a = arrad = Arrays.copyOf(arrad, n2 << 1);
        }
        arrad[n2] = ad2;
        this.b = n2 + 1;
        if (ad2 instanceof ae) {
            ++this.c;
        }
    }

    public void b(ad ad2) {
        ad[] arrad = this.a;
        int n2 = this.b;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrad[i2] != ad2) continue;
            int n3 = n2 - i2 - 1;
            if (n3 > 0) {
                System.arraycopy(arrad, i2 + 1, arrad, i2, n3);
            }
            arrad[--n2] = null;
            this.b = n2;
            if (ad2 instanceof ae) {
                --this.c;
            }
            return;
        }
    }

    public ad[] a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }
}

