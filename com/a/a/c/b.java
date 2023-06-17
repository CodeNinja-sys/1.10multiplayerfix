/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ai;
import com.a.a.c.c;
import com.a.a.c.cu;
import com.a.a.c.cv;

public final class b
implements c {
    private final cu a = cv.a();
    private final cu b = cv.a();
    private final cu c = cv.a();
    private final cu d = cv.a();
    private final cu e = cv.a();
    private final cu f = cv.a();

    @Override
    public void a(int n2) {
        this.a.a(n2);
    }

    @Override
    public void b(int n2) {
        this.b.a(n2);
    }

    @Override
    public void a(long l2) {
        this.c.a();
        this.e.a(l2);
    }

    @Override
    public void b(long l2) {
        this.d.a();
        this.e.a(l2);
    }

    @Override
    public void a() {
        this.f.a();
    }

    @Override
    public ai b() {
        return new ai(this.a.b(), this.b.b(), this.c.b(), this.d.b(), this.e.b(), this.f.b());
    }

    public void a(c c2) {
        ai ai2 = c2.b();
        this.a.a(ai2.b());
        this.b.a(ai2.d());
        this.c.a(ai2.g());
        this.d.a(ai2.h());
        this.e.a(ai2.j());
        this.f.a(ai2.l());
    }
}

