/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.o;
import java.util.Comparator;
import java.util.concurrent.RecursiveAction;

public class t
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final Object[] d;
    private final Comparator e;

    public t(Object[] arrobject, int n2, int n3, Comparator comparator) {
        this.b = n2;
        this.c = n3;
        this.d = arrobject;
        this.e = comparator;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        Object[] arrobject = this.d;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            o.a(arrobject, this.b, this.c, this.e);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = o.a(arrobject, n7, n7 + n9, n7 + 2 * n9, this.e);
        n6 = o.a(arrobject, n6 - n9, n6, n6 + n9, this.e);
        n8 = o.a(arrobject, n8 - 2 * n9, n8 - n9, n8, this.e);
        n6 = o.a(arrobject, n7, n6, n8, this.e);
        Object object = arrobject[n6];
        int n10 = n4 = this.b;
        int n11 = n3 = this.c - 1;
        while (true) {
            if (n10 <= n3 && (n2 = this.e.compare(arrobject[n10], object)) <= 0) {
                if (n2 == 0) {
                    o.f(arrobject, n4++, n10);
                }
                ++n10;
                continue;
            }
            while (n3 >= n10 && (n2 = this.e.compare(arrobject[n3], object)) >= 0) {
                if (n2 == 0) {
                    o.f(arrobject, n3, n11--);
                }
                --n3;
            }
            if (n10 > n3) break;
            o.f(arrobject, n10++, n3--);
        }
        n9 = Math.min(n4 - this.b, n10 - n4);
        o.a(arrobject, this.b, n10 - n9, n9);
        n9 = Math.min(n11 - n3, this.c - n11 - 1);
        o.a(arrobject, n10, this.c - n9, n9);
        n9 = n10 - n4;
        n2 = n11 - n3;
        if (n9 > 1 && n2 > 1) {
            t.invokeAll(new t(arrobject, this.b, this.b + n9, this.e), new t(arrobject, this.c - n2, this.c, this.e));
        } else if (n9 > 1) {
            t.invokeAll(new t(arrobject, this.b, this.b + n9, this.e));
        } else {
            t.invokeAll(new t(arrobject, this.c - n2, this.c, this.e));
        }
    }
}

