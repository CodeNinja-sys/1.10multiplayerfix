/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ch;
import java.util.concurrent.RecursiveAction;

public class cn
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final long[] d;
    private final long[] e;

    public cn(long[] arrl, long[] arrl2, int n2, int n3) {
        this.b = n2;
        this.c = n3;
        this.d = arrl;
        this.e = arrl2;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        long[] arrl = this.d;
        long[] arrl2 = this.e;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            ch.a(arrl, arrl2, this.b, this.c);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = ch.a(arrl, arrl2, n7, n7 + n9, n7 + 2 * n9);
        n6 = ch.a(arrl, arrl2, n6 - n9, n6, n6 + n9);
        n8 = ch.a(arrl, arrl2, n8 - 2 * n9, n8 - n9, n8);
        n6 = ch.a(arrl, arrl2, n7, n6, n8);
        long l2 = arrl[n6];
        long l3 = arrl2[n6];
        int n10 = n4 = this.b;
        int n11 = n3 = this.c - 1;
        while (true) {
            int n12;
            if (n10 <= n3 && (n2 = (n12 = Long.compare(arrl[n10], l2)) == 0 ? Long.compare(arrl2[n10], l3) : n12) <= 0) {
                if (n2 == 0) {
                    ch.e(arrl, arrl2, n4++, n10);
                }
                ++n10;
                continue;
            }
            while (n3 >= n10 && (n2 = (n12 = Long.compare(arrl[n3], l2)) == 0 ? Long.compare(arrl2[n3], l3) : n12) >= 0) {
                if (n2 == 0) {
                    ch.e(arrl, arrl2, n3, n11--);
                }
                --n3;
            }
            if (n10 > n3) break;
            ch.e(arrl, arrl2, n10++, n3--);
        }
        n9 = Math.min(n4 - this.b, n10 - n4);
        ch.b(arrl, arrl2, this.b, n10 - n9, n9);
        n9 = Math.min(n11 - n3, this.c - n11 - 1);
        ch.b(arrl, arrl2, n10, this.c - n9, n9);
        n9 = n10 - n4;
        n2 = n11 - n3;
        if (n9 > 1 && n2 > 1) {
            cn.invokeAll(new cn(arrl, arrl2, this.b, this.b + n9), new cn(arrl, arrl2, this.c - n2, this.c));
        } else if (n9 > 1) {
            cn.invokeAll(new cn(arrl, arrl2, this.b, this.b + n9));
        } else {
            cn.invokeAll(new cn(arrl, arrl2, this.c - n2, this.c));
        }
    }
}

