/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ai;
import a.a.a.a.b.aj;
import a.a.a.a.g;
import java.util.NoSuchElementException;

class aq {
    int c = -1;
    int d = -1;
    int e = -1;
    int f = -1;
    final /* synthetic */ ai g;

    private aq(ai ai2) {
        this.g = ai2;
        this.d = ai2.n;
        this.f = 0;
    }

    private aq(ai ai2, long l2) {
        this.g = ai2;
        if (l2 == 0L) {
            if (ai2.m) {
                this.d = (int)ai2.p[ai2.q];
                this.c = ai2.q;
                return;
            }
            throw new NoSuchElementException("The key " + l2 + " does not belong to this map.");
        }
        if (ai2.j[ai2.o] == l2) {
            this.c = ai2.o;
            this.f = ai2.s;
            return;
        }
        int n2 = (int)a.a.a.a.g.b(l2) & ai2.l;
        while (ai2.j[n2] != 0L) {
            if (ai2.j[n2] == l2) {
                this.d = (int)ai2.p[n2];
                this.c = n2;
                return;
            }
            n2 = n2 + 1 & ai2.l;
        }
        throw new NoSuchElementException("The key " + l2 + " does not belong to this map.");
    }

    public boolean hasNext() {
        return this.d != -1;
    }

    public boolean hasPrevious() {
        return this.c != -1;
    }

    private final void a() {
        if (this.f >= 0) {
            return;
        }
        if (this.c == -1) {
            this.f = 0;
            return;
        }
        if (this.d == -1) {
            this.f = this.g.s;
            return;
        }
        int n2 = this.g.n;
        this.f = 1;
        while (n2 != this.c) {
            n2 = (int)this.g.p[n2];
            ++this.f;
        }
    }

    public int nextIndex() {
        this.a();
        return this.f;
    }

    public int previousIndex() {
        this.a();
        return this.f - 1;
    }

    public int e() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.e = this.d;
        this.d = (int)this.g.p[this.e];
        this.c = this.e;
        if (this.f >= 0) {
            ++this.f;
        }
        return this.e;
    }

    public int f() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.e = this.c;
        this.c = (int)(this.g.p[this.e] >>> 32);
        this.d = this.e;
        if (this.f >= 0) {
            --this.f;
        }
        return this.e;
    }

    public void remove() {
        this.a();
        if (this.e == -1) {
            throw new IllegalStateException();
        }
        if (this.e == this.c) {
            --this.f;
            this.c = (int)(this.g.p[this.e] >>> 32);
        } else {
            this.d = (int)this.g.p[this.e];
        }
        --this.g.s;
        if (this.c == -1) {
            this.g.n = this.d;
        } else {
            int n2 = this.c;
            this.g.p[n2] = this.g.p[n2] ^ (this.g.p[this.c] ^ (long)this.d & 0xFFFFFFFFL) & 0xFFFFFFFFL;
        }
        if (this.d == -1) {
            this.g.o = this.c;
        } else {
            int n3 = this.d;
            this.g.p[n3] = this.g.p[n3] ^ (this.g.p[this.d] ^ ((long)this.c & 0xFFFFFFFFL) << 32) & 0xFFFFFFFF00000000L;
        }
        int n4 = this.e;
        this.e = -1;
        if (n4 != this.g.q) {
            long[] arrl = this.g.j;
            while (true) {
                long l2;
                int n5 = n4;
                n4 = n5 + 1 & this.g.l;
                while (true) {
                    if ((l2 = arrl[n4]) == 0L) {
                        arrl[n5] = 0L;
                        this.g.k[n5] = null;
                        return;
                    }
                    int n6 = (int)a.a.a.a.g.b(l2) & this.g.l;
                    if (n5 <= n4 ? n5 >= n6 || n6 > n4 : n5 >= n6 && n6 > n4) break;
                    n4 = n4 + 1 & this.g.l;
                }
                arrl[n5] = l2;
                this.g.k[n5] = this.g.k[n4];
                if (this.d == n4) {
                    this.d = n5;
                }
                if (this.c == n4) {
                    this.c = n5;
                }
                this.g.a(n4, n5);
            }
        }
        this.g.m = false;
        this.g.k[this.g.q] = null;
    }

    public int b(int n2) {
        int n3 = n2;
        while (n3-- != 0 && this.hasNext()) {
            this.e();
        }
        return n2 - n3 - 1;
    }

    public int a(int n2) {
        int n3 = n2;
        while (n3-- != 0 && this.hasPrevious()) {
            this.f();
        }
        return n2 - n3 - 1;
    }

    /* synthetic */ aq(ai ai2, aj aj2) {
        this(ai2);
    }

    /* synthetic */ aq(ai ai2, long l2, aj aj2) {
        this(ai2, l2);
    }
}

