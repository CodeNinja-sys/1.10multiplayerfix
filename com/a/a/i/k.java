/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.bz;
import com.a.a.i.cb;
import com.a.a.i.j;

class k
implements bz {
    int a = 0;
    int b = 0;
    int c = 0;
    final /* synthetic */ cb d;
    final /* synthetic */ j e;

    k(j j2, cb cb2) {
        this.e = j2;
        this.d = cb2;
    }

    @Override
    public void a(byte by2) {
        this.a <<= 8;
        this.a |= by2 & 0xFF;
        this.b += 8;
        while (this.b >= j.a((j)this.e).t) {
            int n2 = this.a >> this.b - j.a((j)this.e).t & j.a((j)this.e).s;
            this.d.a(j.a(this.e).a(n2));
            ++this.c;
            this.b -= j.a((j)this.e).t;
        }
    }

    @Override
    public void a() {
        this.d.a();
    }

    @Override
    public void b() {
        if (this.b > 0) {
            int n2 = this.a << j.a((j)this.e).t - this.b & j.a((j)this.e).s;
            this.d.a(j.a(this.e).a(n2));
            ++this.c;
            if (j.b(this.e) != null) {
                while (this.c % j.a((j)this.e).u != 0) {
                    this.d.a(j.b(this.e).charValue());
                    ++this.c;
                }
            }
        }
        this.d.b();
    }
}

