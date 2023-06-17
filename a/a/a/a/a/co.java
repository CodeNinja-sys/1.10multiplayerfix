/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ch;
import a.a.a.a.a.cy;
import java.util.concurrent.RecursiveAction;

public class co
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final int[] d;
    private final cy e;

    public co(int[] arrn, int n2, int n3, cy cy2) {
        this.b = n2;
        this.c = n3;
        this.d = arrn;
        this.e = cy2;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        int[] arrn = this.d;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            ch.a(arrn, this.b, this.c, this.e);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = ch.b(arrn, n7, n7 + n9, n7 + 2 * n9, this.e);
        n6 = ch.b(arrn, n6 - n9, n6, n6 + n9, this.e);
        n8 = ch.b(arrn, n8 - 2 * n9, n8 - n9, n8, this.e);
        n6 = ch.b(arrn, n7, n6, n8, this.e);
        int n10 = arrn[n6];
        int n11 = n4 = this.b;
        int n12 = n3 = this.c - 1;
        while (true) {
            if (n11 <= n3 && (n2 = this.e.a(arrn[n11], n10)) <= 0) {
                if (n2 == 0) {
                    ch.f(arrn, n4++, n11);
                }
                ++n11;
                continue;
            }
            while (n3 >= n11 && (n2 = this.e.a(arrn[n3], n10)) >= 0) {
                if (n2 == 0) {
                    ch.f(arrn, n3, n12--);
                }
                --n3;
            }
            if (n11 > n3) break;
            ch.f(arrn, n11++, n3--);
        }
        n9 = Math.min(n4 - this.b, n11 - n4);
        ch.b(arrn, this.b, n11 - n9, n9);
        n9 = Math.min(n12 - n3, this.c - n12 - 1);
        ch.b(arrn, n11, this.c - n9, n9);
        n9 = n11 - n4;
        n2 = n12 - n3;
        if (n9 > 1 && n2 > 1) {
            co.invokeAll(new co(arrn, this.b, this.b + n9, this.e), new co(arrn, this.c - n2, this.c, this.e));
        } else if (n9 > 1) {
            co.invokeAll(new co(arrn, this.b, this.b + n9, this.e));
        } else {
            co.invokeAll(new co(arrn, this.c - n2, this.c, this.e));
        }
    }
}

