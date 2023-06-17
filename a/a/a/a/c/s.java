/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.o;
import java.util.concurrent.RecursiveAction;

public class s
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final Object[] d;
    private final Object[] e;

    public s(Object[] arrobject, Object[] arrobject2, int n2, int n3) {
        this.b = n2;
        this.c = n3;
        this.d = arrobject;
        this.e = arrobject2;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        Object[] arrobject = this.d;
        Object[] arrobject2 = this.e;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            o.a(arrobject, arrobject2, this.b, this.c);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = o.a(arrobject, arrobject2, n7, n7 + n9, n7 + 2 * n9);
        n6 = o.a(arrobject, arrobject2, n6 - n9, n6, n6 + n9);
        n8 = o.a(arrobject, arrobject2, n8 - 2 * n9, n8 - n9, n8);
        n6 = o.a(arrobject, arrobject2, n7, n6, n8);
        Object object = arrobject[n6];
        Object object2 = arrobject2[n6];
        int n10 = n4 = this.b;
        int n11 = n3 = this.c - 1;
        while (true) {
            int n12;
            if (n10 <= n3 && (n2 = (n12 = ((Comparable)arrobject[n10]).compareTo(object)) == 0 ? ((Comparable)arrobject2[n10]).compareTo(object2) : n12) <= 0) {
                if (n2 == 0) {
                    o.c(arrobject, arrobject2, n4++, n10);
                }
                ++n10;
                continue;
            }
            while (n3 >= n10 && (n2 = (n12 = ((Comparable)arrobject[n3]).compareTo(object)) == 0 ? ((Comparable)arrobject2[n3]).compareTo(object2) : n12) >= 0) {
                if (n2 == 0) {
                    o.c(arrobject, arrobject2, n3, n11--);
                }
                --n3;
            }
            if (n10 > n3) break;
            o.c(arrobject, arrobject2, n10++, n3--);
        }
        n9 = Math.min(n4 - this.b, n10 - n4);
        o.b(arrobject, arrobject2, this.b, n10 - n9, n9);
        n9 = Math.min(n11 - n3, this.c - n11 - 1);
        o.b(arrobject, arrobject2, n10, this.c - n9, n9);
        n9 = n10 - n4;
        n2 = n11 - n3;
        if (n9 > 1 && n2 > 1) {
            s.invokeAll(new s(arrobject, arrobject2, this.b, this.b + n9), new s(arrobject, arrobject2, this.c - n2, this.c));
        } else if (n9 > 1) {
            s.invokeAll(new s(arrobject, arrobject2, this.b, this.b + n9));
        } else {
            s.invokeAll(new s(arrobject, arrobject2, this.c - n2, this.c));
        }
    }
}

