/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.util.LinkedList;
import org.apache.commons.compress.archivers.f.d;
import org.apache.commons.compress.archivers.f.f;

class r {
    f[] a;
    long b;
    long c;
    d[] d;
    long[] e;
    long[] f;
    boolean g;
    long h;
    int i;

    r() {
    }

    Iterable a() {
        LinkedList<f> linkedList = new LinkedList<f>();
        int n2 = (int)this.e[0];
        while (n2 != -1) {
            linkedList.addLast(this.a[n2]);
            int n3 = this.b(n2);
            n2 = n3 != -1 ? (int)this.d[n3].a : -1;
        }
        return linkedList;
    }

    int a(int n2) {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            if (this.d[i2].a != (long)n2) continue;
            return i2;
        }
        return -1;
    }

    int b(int n2) {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            if (this.d[i2].b != (long)n2) continue;
            return i2;
        }
        return -1;
    }

    long b() {
        if (this.c == 0L) {
            return 0L;
        }
        for (int i2 = (int)this.c - 1; i2 >= 0; --i2) {
            if (this.b(i2) >= 0) continue;
            return this.f[i2];
        }
        return 0L;
    }
}

