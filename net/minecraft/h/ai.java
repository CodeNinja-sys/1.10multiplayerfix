/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.ad;
import net.minecraft.h.r;
import net.minecraft.m.cu;
import net.minecraft.r.o;
import net.minecraft.w.a.b;
import net.minecraft.w.aj;

public class ai
extends r {
    private final ad a;
    private final b f;
    private int g;
    private final aj h;

    public ai(b b2, aj aj2, ad ad2, int n2, int n3, int n4) {
        super(ad2, n2, n3, n4);
        this.f = b2;
        this.h = aj2;
        this.a = ad2;
    }

    @Override
    public boolean a(cu cu2) {
        return false;
    }

    @Override
    public cu a(int n2) {
        if (this.c()) {
            this.g += Math.min(n2, this.b().b);
        }
        return super.a(n2);
    }

    @Override
    protected void a(cu cu2, int n2) {
        this.g += n2;
        this.c(cu2);
    }

    @Override
    protected void c(cu cu2) {
        cu2.a(this.f.aQ, this.f, this.g);
        this.g = 0;
    }

    @Override
    public void a(b b2, cu cu2) {
        cu cu3;
        cu cu4;
        this.c(cu2);
        net.minecraft.b.b b3 = this.a.c();
        if (b3 != null && (this.a(b3, cu4 = this.a.a(0), cu3 = this.a.a(1)) || this.a(b3, cu3, cu4))) {
            this.h.a(b3);
            b2.a(o.I);
            if (cu4 != null && cu4.b <= 0) {
                cu4 = null;
            }
            if (cu3 != null && cu3.b <= 0) {
                cu3 = null;
            }
            this.a.a(0, cu4);
            this.a.a(1, cu3);
        }
    }

    private boolean a(net.minecraft.b.b b2, cu cu2, cu cu3) {
        cu cu4 = b2.a();
        cu cu5 = b2.b();
        if (cu2 != null && cu2.a() == cu4.a() && cu2.b >= cu4.b) {
            if (cu5 != null && cu3 != null && cu5.a() == cu3.a() && cu3.b >= cu5.b) {
                cu2.b -= cu4.b;
                cu3.b -= cu5.b;
                return true;
            }
            if (cu5 == null && cu3 == null) {
                cu2.b -= cu4.b;
                return true;
            }
        }
        return false;
    }
}

