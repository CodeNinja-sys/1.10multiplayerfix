/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.List;
import net.minecraft.x.a.o;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class x
implements p {
    private int a;
    private List b;

    public x() {
    }

    public x(int n2, o o2, boolean bl2) {
        this.a = n2;
        this.b = bl2 ? o2.c() : o2.b();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = o.b(a2);
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        o.a(this.b, a2);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public List a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}

