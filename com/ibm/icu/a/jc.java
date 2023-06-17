/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

class jc {
    private boolean[] a = new boolean[16];
    private int b;
    private int c;

    public void a(int n2) {
        if (n2 > this.a.length) {
            this.a = new boolean[n2];
        }
        this.a();
    }

    public void a() {
        int n2 = this.a.length;
        while (n2-- > 0) {
            this.a[n2] = false;
        }
        this.b = 0;
        this.c = 0;
    }

    public boolean b() {
        return this.b == 0;
    }

    public void b(int n2) {
        int n3 = this.c + n2;
        if (n3 >= this.a.length) {
            n3 -= this.a.length;
        }
        if (this.a[n3]) {
            this.a[n3] = false;
            --this.b;
        }
        this.c = n3;
    }

    public void c(int n2) {
        int n3 = this.c + n2;
        if (n3 >= this.a.length) {
            n3 -= this.a.length;
        }
        this.a[n3] = true;
        ++this.b;
    }

    public boolean d(int n2) {
        int n3 = this.c + n2;
        if (n3 >= this.a.length) {
            n3 -= this.a.length;
        }
        return this.a[n3];
    }

    public int c() {
        int n2 = this.c;
        while (++n2 < this.a.length) {
            if (!this.a[n2]) continue;
            this.a[n2] = false;
            --this.b;
            int n3 = n2 - this.c;
            this.c = n2;
            return n3;
        }
        int n4 = this.a.length - this.c;
        n2 = 0;
        while (!this.a[n2]) {
            ++n2;
        }
        this.a[n2] = false;
        --this.b;
        this.c = n2;
        return n4 + n2;
    }
}

