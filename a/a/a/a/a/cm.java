/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ch;
import java.util.concurrent.RecursiveAction;

public class cm
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final int[] d;

    public cm(int[] arrn, int n2, int n3) {
        this.b = n2;
        this.c = n3;
        this.d = arrn;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        int[] arrn = this.d;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            ch.g(arrn, this.b, this.c);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = ch.d(arrn, n7, n7 + n9, n7 + 2 * n9);
        n6 = ch.d(arrn, n6 - n9, n6, n6 + n9);
        n8 = ch.d(arrn, n8 - 2 * n9, n8 - n9, n8);
        n6 = ch.d(arrn, n7, n6, n8);
        int n10 = arrn[n6];
        int n11 = n4 = this.b;
        int n12 = n3 = this.c - 1;
        while (true) {
            if (n11 <= n3 && (n2 = Integer.compare(arrn[n11], n10)) <= 0) {
                if (n2 == 0) {
                    ch.f(arrn, n4++, n11);
                }
                ++n11;
                continue;
            }
            while (n3 >= n11 && (n2 = Integer.compare(arrn[n3], n10)) >= 0) {
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
            cm.invokeAll(new cm(arrn, this.b, this.b + n9), new cm(arrn, this.c - n2, this.c));
        } else if (n9 > 1) {
            cm.invokeAll(new cm(arrn, this.b, this.b + n9));
        } else {
            cm.invokeAll(new cm(arrn, this.c - n2, this.c));
        }
    }
}

