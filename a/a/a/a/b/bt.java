/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.bl;
import a.a.a.a.b.bm;
import a.a.a.a.b.cd;
import a.a.a.a.g;
import java.util.NoSuchElementException;

class bt {
    int b;
    int c;
    int d;
    boolean e;
    cd f;
    final /* synthetic */ bl g;

    private bt(bl bl2) {
        this.g = bl2;
        this.b = this.g.n;
        this.c = -1;
        this.d = this.g.p;
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
            this.c = this.g.n;
            return this.c;
        }
        long[] arrl = this.g.j;
        do {
            if (--this.b >= 0) continue;
            this.c = Integer.MIN_VALUE;
            long l2 = this.f.l(-this.b - 1);
            int n2 = (int)a.a.a.a.g.b(l2) & this.g.l;
            while (l2 != arrl[n2]) {
                n2 = n2 + 1 & this.g.l;
            }
            return n2;
        } while (arrl[this.b] == 0L);
        this.c = this.b;
        return this.c;
    }

    private final void a(int n2) {
        long[] arrl = this.g.j;
        while (true) {
            long l2;
            int n3 = n2;
            n2 = n3 + 1 & this.g.l;
            while (true) {
                if ((l2 = arrl[n2]) == 0L) {
                    arrl[n3] = 0L;
                    this.g.k[n3] = null;
                    return;
                }
                int n4 = (int)a.a.a.a.g.b(l2) & this.g.l;
                if (n3 <= n2 ? n3 >= n4 || n4 > n2 : n3 >= n4 && n4 > n2) break;
                n2 = n2 + 1 & this.g.l;
            }
            if (n2 < n3) {
                if (this.f == null) {
                    this.f = new cd(2);
                }
                this.f.e(arrl[n2]);
            }
            arrl[n3] = l2;
            this.g.k[n3] = this.g.k[n2];
        }
    }

    public void remove() {
        if (this.c == -1) {
            throw new IllegalStateException();
        }
        if (this.c == this.g.n) {
            this.g.m = false;
            this.g.k[this.g.n] = null;
        } else if (this.b >= 0) {
            this.a(this.c);
        } else {
            this.g.a(this.f.l(-this.b - 1));
            this.c = -1;
            return;
        }
        --this.g.p;
        this.c = -1;
    }

    public int b(int n2) {
        int n3 = n2;
        while (n3-- != 0 && this.hasNext()) {
            this.c();
        }
        return n2 - n3 - 1;
    }

    /* synthetic */ bt(bl bl2, bm bm2) {
        this(bl2);
    }
}

