/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.u.ad;
import net.minecraft.x.a;
import net.minecraft.x.d.a.ae;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class ab
implements p {
    private net.minecraft.u.b.b a;
    private ad b;
    private ae c;

    public ab() {
    }

    public ab(ae ae2, net.minecraft.u.b.b b2, ad ad2) {
        this.c = ae2;
        this.a = b2;
        this.b = ad2;
    }

    @Override
    public void a(a a2) {
        this.c = (ae)a2.a(ae.class);
        this.a = a2.c();
        this.b = ad.a(a2.F());
    }

    @Override
    public void b(a a2) {
        a2.a(this.c);
        a2.a(this.a);
        a2.B(this.b.b());
    }

    public void a(b b2) {
        b2.a(this);
    }

    public net.minecraft.u.b.b a() {
        return this.a;
    }

    public ad b() {
        return this.b;
    }

    public ae c() {
        return this.c;
    }
}

