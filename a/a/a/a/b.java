/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a;

import a.a.a.a.a;
import a.a.a.a.a.cy;
import a.a.a.a.i;
import java.util.concurrent.RecursiveAction;

public class b
extends RecursiveAction {
    private static final long a = 1L;
    private final int b;
    private final int c;
    private final cy d;
    private final i e;

    public b(int n2, int n3, cy cy2, i i2) {
        this.b = n2;
        this.c = n3;
        this.d = cy2;
        this.e = i2;
    }

    @Override
    protected void compute() {
        int n2;
        int n3;
        int n4;
        int n5 = this.c - this.b;
        if (n5 < 8192) {
            a.a.a.a.a.c(this.b, this.c, this.d, this.e);
            return;
        }
        int n6 = this.b + n5 / 2;
        int n7 = this.b;
        int n8 = this.c - 1;
        int n9 = n5 / 8;
        n7 = a.a.a.a.a.a(n7, n7 + n9, n7 + 2 * n9, this.d);
        n6 = a.a.a.a.a.a(n6 - n9, n6, n6 + n9, this.d);
        n8 = a.a.a.a.a.a(n8 - 2 * n9, n8 - n9, n8, this.d);
        n6 = a.a.a.a.a.a(n7, n6, n8, this.d);
        int n10 = n4 = this.b;
        int n11 = n3 = this.c - 1;
        while (true) {
            if (n10 <= n3 && (n2 = this.d.a(n10, n6)) <= 0) {
                if (n2 == 0) {
                    if (n4 == n6) {
                        n6 = n10;
                    } else if (n10 == n6) {
                        n6 = n4;
                    }
                    this.e.a(n4++, n10);
                }
                ++n10;
                continue;
            }
            while (n3 >= n10 && (n2 = this.d.a(n3, n6)) >= 0) {
                if (n2 == 0) {
                    if (n3 == n6) {
                        n6 = n11;
                    } else if (n11 == n6) {
                        n6 = n3;
                    }
                    this.e.a(n3, n11--);
                }
                --n3;
            }
            if (n10 > n3) break;
            if (n10 == n6) {
                n6 = n11;
            } else if (n3 == n6) {
                n6 = n3;
            }
            this.e.a(n10++, n3--);
        }
        n9 = Math.min(n4 - this.b, n10 - n4);
        a.a.a.a.a.a(this.e, this.b, n10 - n9, n9);
        n9 = Math.min(n11 - n3, this.c - n11 - 1);
        a.a.a.a.a.a(this.e, n10, this.c - n9, n9);
        n9 = n10 - n4;
        n2 = n11 - n3;
        if (n9 > 1 && n2 > 1) {
            a.a.a.a.b.invokeAll(new b(this.b, this.b + n9, this.d, this.e), new b(this.c - n2, this.c, this.d, this.e));
        } else if (n9 > 1) {
            a.a.a.a.b.invokeAll(new b(this.b, this.b + n9, this.d, this.e));
        } else {
            a.a.a.a.b.invokeAll(new b(this.c - n2, this.c, this.d, this.e));
        }
    }
}

