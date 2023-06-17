/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import com.a.a.b.cc;
import com.a.a.d.aad;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import net.minecraft.q.ae;
import net.minecraft.q.ar;
import net.minecraft.q.q;
import net.minecraft.u.b.n;
import net.minecraft.u.d.a;
import net.minecraft.w.a.g;
import net.minecraft.x.d.b.ak;
import net.minecraft.x.d.b.w;

public class ah
extends q {
    private final Set h = aad.a();
    private final Set i = Collections.unmodifiableSet(this.h);
    private boolean j = true;

    public ah(a a2, ae ae2, ar ar2) {
        super(n.a(), a2, ae2, ar2);
    }

    @Override
    public void a(float f2) {
        if (f2 != this.b) {
            super.a(f2);
            this.a(w.c);
        }
    }

    @Override
    public void a(ae ae2) {
        if (ae2 != this.c) {
            super.a(ae2);
            this.a(w.e);
        }
    }

    @Override
    public void a(ar ar2) {
        if (ar2 != this.d) {
            super.a(ar2);
            this.a(w.e);
        }
    }

    @Override
    public q a(boolean bl2) {
        if (bl2 != this.e) {
            super.a(bl2);
            this.a(w.f);
        }
        return this;
    }

    @Override
    public q b(boolean bl2) {
        if (bl2 != this.f) {
            super.b(bl2);
            this.a(w.f);
        }
        return this;
    }

    @Override
    public q c(boolean bl2) {
        if (bl2 != this.g) {
            super.c(bl2);
            this.a(w.f);
        }
        return this;
    }

    @Override
    public void a(a a2) {
        if (!cc.a((Object)a2, (Object)this.a)) {
            super.a(a2);
            this.a(w.d);
        }
    }

    private void a(w w2) {
        if (this.j) {
            ak ak2 = new ak(w2, this);
            for (g g2 : this.h) {
                g2.a.a(ak2);
            }
        }
    }

    public void a(g g2) {
        if (this.h.add(g2) && this.j) {
            g2.a.a(new ak(w.a, this));
        }
    }

    public void b(g g2) {
        if (this.h.remove(g2) && this.j) {
            g2.a.a(new ak(w.b, this));
        }
    }

    public void d(boolean bl2) {
        if (bl2 != this.j) {
            this.j = bl2;
            for (g g2 : this.h) {
                g2.a.a(new ak(bl2 ? w.a : w.b, this));
            }
        }
    }

    public Collection i() {
        return this.i;
    }
}

