/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ch;
import java.util.concurrent.RecursiveAction;

public class cp
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final int[] d;
    private final long[] e;

    public cp(int[] arrn, long[] arrl, int n2, int n3) {
        this.b = n2;
        this.c = n3;
        this.e = arrl;
        this.d = arrn;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        long[] arrl = this.e;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            ch.a(this.d, arrl, this.b, this.c);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = ch.a(this.d, arrl, n7, n7 + n9, n7 + 2 * n9);
        n6 = ch.a(this.d, arrl, n6 - n9, n6, n6 + n9);
        n8 = ch.a(this.d, arrl, n8 - 2 * n9, n8 - n9, n8);
        n6 = ch.a(this.d, arrl, n7, n6, n8);
        long l2 = arrl[this.d[n6]];
        int n10 = n4 = this.b;
        int n11 = n3 = this.c - 1;
        while (true) {
            if (n10 <= n3 && (n2 = Long.compare(arrl[this.d[n10]], l2)) <= 0) {
                if (n2 == 0) {
                    a.a.a.a.a.ch.f(this.d, n4++, n10);
                }
                ++n10;
                continue;
            }
            while (n3 >= n10 && (n2 = Long.compare(arrl[this.d[n3]], l2)) >= 0) {
                if (n2 == 0) {
                    a.a.a.a.a.ch.f(this.d, n3, n11--);
                }
                --n3;
            }
            if (n10 > n3) break;
            a.a.a.a.a.ch.f(this.d, n10++, n3--);
        }
        n9 = Math.min(n4 - this.b, n10 - n4);
        a.a.a.a.a.ch.b(this.d, this.b, n10 - n9, n9);
        n9 = Math.min(n11 - n3, this.c - n11 - 1);
        a.a.a.a.a.ch.b(this.d, n10, this.c - n9, n9);
        n9 = n10 - n4;
        n2 = n11 - n3;
        if (n9 > 1 && n2 > 1) {
            cp.invokeAll(new cp(this.d, arrl, this.b, this.b + n9), new cp(this.d, arrl, this.c - n2, this.c));
        } else if (n9 > 1) {
            cp.invokeAll(new cp(this.d, arrl, this.b, this.b + n9));
        } else {
            cp.invokeAll(new cp(this.d, arrl, this.c - n2, this.c));
        }
    }
}

