/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ch;
import java.util.concurrent.RecursiveAction;

public class cn
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final int[] d;
    private final int[] e;

    public cn(int[] arrn, int[] arrn2, int n2, int n3) {
        this.b = n2;
        this.c = n3;
        this.d = arrn;
        this.e = arrn2;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        int[] arrn = this.d;
        int[] arrn2 = this.e;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            ch.d(arrn, arrn2, this.b, this.c);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = ch.b(arrn, arrn2, n7, n7 + n9, n7 + 2 * n9);
        n6 = ch.b(arrn, arrn2, n6 - n9, n6, n6 + n9);
        n8 = ch.b(arrn, arrn2, n8 - 2 * n9, n8 - n9, n8);
        n6 = ch.b(arrn, arrn2, n7, n6, n8);
        int n10 = arrn[n6];
        int n11 = arrn2[n6];
        int n12 = n4 = this.b;
        int n13 = n3 = this.c - 1;
        while (true) {
            int n14;
            if (n12 <= n3 && (n2 = (n14 = Integer.compare(arrn[n12], n10)) == 0 ? Integer.compare(arrn2[n12], n11) : n14) <= 0) {
                if (n2 == 0) {
                    ch.h(arrn, arrn2, n4++, n12);
                }
                ++n12;
                continue;
            }
            while (n3 >= n12 && (n2 = (n14 = Integer.compare(arrn[n3], n10)) == 0 ? Integer.compare(arrn2[n3], n11) : n14) >= 0) {
                if (n2 == 0) {
                    ch.h(arrn, arrn2, n3, n13--);
                }
                --n3;
            }
            if (n12 > n3) break;
            ch.h(arrn, arrn2, n12++, n3--);
        }
        n9 = Math.min(n4 - this.b, n12 - n4);
        ch.c(arrn, arrn2, this.b, n12 - n9, n9);
        n9 = Math.min(n13 - n3, this.c - n13 - 1);
        ch.c(arrn, arrn2, n12, this.c - n9, n9);
        n9 = n12 - n4;
        n2 = n13 - n3;
        if (n9 > 1 && n2 > 1) {
            cn.invokeAll(new cn(arrn, arrn2, this.b, this.b + n9), new cn(arrn, arrn2, this.c - n2, this.c));
        } else if (n9 > 1) {
            cn.invokeAll(new cn(arrn, arrn2, this.b, this.b + n9));
        } else {
            cn.invokeAll(new cn(arrn, arrn2, this.c - n2, this.c));
        }
    }
}

