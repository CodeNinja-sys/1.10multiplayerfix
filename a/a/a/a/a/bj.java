/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.bb;
import a.a.a.a.a.bc;
import a.a.a.a.a.cd;
import a.a.a.a.g;
import java.util.NoSuchElementException;

class bj {
    int b;
    int c;
    int d;
    boolean e;
    cd f;
    final /* synthetic */ bb g;

    private bj(bb bb2) {
        this.g = bb2;
        this.b = this.g.o;
        this.c = -1;
        this.d = this.g.q;
        this.e = this.g.m;
    }

    public boolean hasNext() {
        return this.d != 0;
    }

    public int c() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        --this.d;
        if (this.e) {
            this.e = false;
            this.c = this.g.o;
            return this.c;
        }
        int[] arrn = this.g.j;
        do {
            if (--this.b >= 0) continue;
            this.c = Integer.MIN_VALUE;
            int n2 = this.f.q(-this.b - 1);
            int n3 = a.a.a.a.g.b(this.g.n.a(n2)) & this.g.l;
            while (!this.g.n.a(n2, arrn[n3])) {
                n3 = n3 + 1 & this.g.l;
            }
            return n3;
        } while (arrn[this.b] == 0);
        this.c = this.b;
        return this.c;
    }

    private final void a(int n2) {
        int[] arrn = this.g.j;
        while (true) {
            int n3;
            int n4 = n2;
            n2 = n4 + 1 & this.g.l;
            while (true) {
                if ((n3 = arrn[n2]) == 0) {
                    arrn[n4] = 0;
                    this.g.k[n4] = null;
                    return;
                }
                int n5 = a.a.a.a.g.b(this.g.n.a(n3)) & this.g.l;
                if (n4 <= n2 ? n4 >= n5 || n5 > n2 : n4 >= n5 && n5 > n2) break;
                n2 = n2 + 1 & this.g.l;
            }
            if (n2 < n4) {
                if (this.f == null) {
                    this.f = new cd(2);
                }
                this.f.e(arrn[n2]);
            }
            arrn[n4] = n3;
            this.g.k[n4] = this.g.k[n2];
        }
    }

    public void remove() {
        if (this.c == -1) {
            throw new IllegalStateException();
        }
        if (this.c == this.g.o) {
            this.g.m = false;
            this.g.k[this.g.o] = null;
        } else if (this.b >= 0) {
            this.a(this.c);
        } else {
            this.g.a(this.f.q(-this.b - 1));
            this.c = -1;
            return;
        }
        --this.g.q;
        this.c = -1;
    }

    public int b(int n2) {
        int n3 = n2;
        while (n3-- != 0 && this.hasNext()) {
            this.c();
        }
        return n2 - n3 - 1;
    }

    /* synthetic */ bj(bb bb2, bc bc2) {
        this(bb2);
    }
}

