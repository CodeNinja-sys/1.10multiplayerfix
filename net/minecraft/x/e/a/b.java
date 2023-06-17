/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.e.a;

import com.c.a.e;
import net.minecraft.x.a;
import net.minecraft.x.p;

public class b
implements p {
    private e a;

    public b() {
    }

    public b(e e2) {
        this.a = e2;
    }

    @Override
    public void a(a a2) {
        this.a = new e(null, a2.e(16));
    }

    @Override
    public void b(a a2) {
        a2.a(this.a.b());
    }

    public void a(net.minecraft.x.e.b b2) {
        b2.a(this);
    }

    public e a() {
        return this.a;
    }
}

