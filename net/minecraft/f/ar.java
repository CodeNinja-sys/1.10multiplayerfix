/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.q.al;
import net.minecraft.q.an;
import net.minecraft.q.d;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;

public abstract class ar
extends ap
implements al,
d {
    private an a = an.a;

    @Override
    public void b(e e2) {
        super.b(e2);
        this.a = an.b(e2);
    }

    @Override
    public e a(e e2) {
        super.a(e2);
        if (this.a != null) {
            this.a.a(e2);
        }
        return e2;
    }

    @Override
    public boolean q() {
        return this.a != null && !this.a.a();
    }

    @Override
    public an r() {
        return this.a;
    }

    @Override
    public void a(an an2) {
        this.a = an2;
    }

    @Override
    public a aK() {
        return this.bO_() ? new k(this.X()) : new l(this.X(), new Object[0]);
    }
}

