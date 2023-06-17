/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d;

import com.c.c.d.a.ae;
import com.c.c.d.b;
import com.c.c.d.c;
import net.minecraft.s.f;

public abstract class d
implements b,
c,
Runnable {
    protected ae a;

    public void a(ae ae2) {
        this.a = ae2;
    }

    @Override
    public void a(String string) {
        this.a.a(string);
    }

    public void b(String string) {
        this.a.b(string);
    }

    public boolean b() {
        return this.a.c();
    }

    @Override
    public void a() {
    }

    @Override
    public void a(f f2) {
    }

    public void c() {
    }

    public void d() {
    }
}

