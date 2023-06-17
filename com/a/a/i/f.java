/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.cb;

final class f
implements cb {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ cb d;

    f(int n2, String string, cb cb2) {
        this.b = n2;
        this.c = string;
        this.d = cb2;
        this.a = this.b;
    }

    @Override
    public void a(char c2) {
        if (this.a == 0) {
            for (int i2 = 0; i2 < this.c.length(); ++i2) {
                this.d.a(this.c.charAt(i2));
            }
            this.a = this.b;
        }
        this.d.a(c2);
        --this.a;
    }

    @Override
    public void a() {
        this.d.a();
    }

    @Override
    public void b() {
        this.d.b();
    }
}

