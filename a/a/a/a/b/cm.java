/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ch;
import java.util.concurrent.RecursiveAction;

public class cm
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final long[] d;

    public cm(long[] arrl, int n2, int n3) {
        this.b = n2;
        this.c = n3;
        this.d = arrl;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        long[] arrl = this.d;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            ch.g(arrl, this.b, this.c);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = ch.b(arrl, n7, n7 + n9, n7 + 2 * n9);
        n6 = ch.b(arrl, n6 - n9, n6, n6 + n9);
        n8 = ch.b(arrl, n8 - 2 * n9, n8 - n9, n8);
        n6 = ch.b(arrl, n7, n6, n8);
        long l2 = arrl[n6];
        int n10 = n4 = this.b;
        int n11 = n3 = this.c - 1;
        while (true) {
            if (n10 <= n3 && (n2 = Long.compare(arrl[n10], l2)) <= 0) {
                if (n2 == 0) {
                    ch.f(arrl, n4++, n10);
                }
                ++n10;
                continue;
            }
            while (n3 >= n10 && (n2 = Long.compare(arrl[n3], l2)) >= 0) {
                if (n2 == 0) {
                    ch.f(arrl, n3, n11--);
                }
                --n3;
            }
            if (n10 > n3) break;
            ch.f(arrl, n10++, n3--);
        }
        n9 = Math.min(n4 - this.b, n10 - n4);
        ch.a(arrl, this.b, n10 - n9, n9);
        n9 = Math.min(n11 - n3, this.c - n11 - 1);
        ch.a(arrl, n10, this.c - n9, n9);
        n9 = n10 - n4;
        n2 = n11 - n3;
        if (n9 > 1 && n2 > 1) {
            cm.invokeAll(new cm(arrl, this.b, this.b + n9), new cm(arrl, this.c - n2, this.c));
        } else if (n9 > 1) {
            cm.invokeAll(new cm(arrl, this.b, this.b + n9));
        } else {
            cm.invokeAll(new cm(arrl, this.c - n2, this.c));
        }
    }
}

