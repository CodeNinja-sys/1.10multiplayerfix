/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.m;
import com.a.a.i.by;
import com.a.a.i.ca;
import com.a.a.i.h;
import com.a.a.i.j;

class l
implements by {
    int a = 0;
    int b = 0;
    int c = 0;
    boolean d = false;
    final m e = this.g.a();
    final /* synthetic */ ca f;
    final /* synthetic */ j g;

    l(j j2, ca ca2) {
        this.g = j2;
        this.f = ca2;
    }

    @Override
    public int a() {
        while (true) {
            int n2;
            if ((n2 = this.f.a()) == -1) {
                if (!this.d && !j.a(this.g).b(this.c)) {
                    throw new h("Invalid input length " + this.c);
                }
                return -1;
            }
            ++this.c;
            char c2 = (char)n2;
            if (this.e.c(c2)) {
                if (!(this.d || this.c != 1 && j.a(this.g).b(this.c - 1))) {
                    throw new h("Padding cannot start at index " + this.c);
                }
                this.d = true;
                continue;
            }
            if (this.d) {
                throw new h("Expected padding character but found '" + c2 + "' at index " + this.c);
            }
            this.a <<= j.a((j)this.g).t;
            this.a |= j.a(this.g).d(c2);
            this.b += j.a((j)this.g).t;
            if (this.b >= 8) break;
        }
        this.b -= 8;
        return this.a >> this.b & 0xFF;
    }

    @Override
    public void b() {
        this.f.b();
    }
}

