/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.c;

import net.minecraft.c.a;
import net.minecraft.u.d.k;
import net.minecraft.x.ak;
import net.minecraft.x.f.a.b;

public class g
implements net.minecraft.x.f.b {
    private static final net.minecraft.u.d.a a = new k("Status request has been handled.");
    private final a b;
    private final ak c;
    private boolean d;

    public g(a a2, ak ak2) {
        this.b = a2;
        this.c = ak2;
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
    }

    @Override
    public void a(b b2) {
        if (this.d) {
            this.c.a(a);
        } else {
            this.d = true;
            this.c.a(new net.minecraft.x.f.b.b(this.b.aP()));
        }
    }

    @Override
    public void a(net.minecraft.x.f.a.a a2) {
        this.c.a(new net.minecraft.x.f.b.a(a2.a()));
        this.c.a(a);
    }
}

