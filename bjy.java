/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.d.aad;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class bjy
extends bds {
    private final Set h = aad.a();
    private final Set i = Collections.unmodifiableSet(this.h);
    private boolean j = true;

    public bjy(cbg cbg2, jd jd2, abo abo2) {
        super(cmk.a(), cbg2, jd2, abo2);
    }

    @Override
    public void a(float f2) {
        if (f2 != this.b) {
            super.a(f2);
            this.a(atf.c);
        }
    }

    @Override
    public void a(jd jd2) {
        if (jd2 != this.c) {
            super.a(jd2);
            this.a(atf.e);
        }
    }

    @Override
    public void a(abo abo2) {
        if (abo2 != this.d) {
            super.a(abo2);
            this.a(atf.e);
        }
    }

    @Override
    public bds a(boolean bl2) {
        if (bl2 != this.e) {
            super.a(bl2);
            this.a(atf.f);
        }
        return this;
    }

    @Override
    public bds b(boolean bl2) {
        if (bl2 != this.f) {
            super.b(bl2);
            this.a(atf.f);
        }
        return this;
    }

    @Override
    public bds c(boolean bl2) {
        if (bl2 != this.g) {
            super.c(bl2);
            this.a(atf.f);
        }
        return this;
    }

    @Override
    public void a(cbg cbg2) {
        if (!cc.a((Object)cbg2, (Object)this.a)) {
            super.a(cbg2);
            this.a(atf.d);
        }
    }

    private void a(atf atf2) {
        if (this.j) {
            dgy dgy2 = new dgy(atf2, this);
            for (czt czt2 : this.h) {
                czt2.a.a(dgy2);
            }
        }
    }

    public void a(czt czt2) {
        if (this.h.add(czt2) && this.j) {
            czt2.a.a(new dgy(atf.a, this));
        }
    }

    public void b(czt czt2) {
        if (this.h.remove(czt2) && this.j) {
            czt2.a.a(new dgy(atf.b, this));
        }
    }

    public void d(boolean bl2) {
        if (bl2 != this.j) {
            this.j = bl2;
            for (czt czt2 : this.h) {
                czt2.a.a(new dgy(bl2 ? atf.a : atf.b, this));
            }
        }
    }

    public Collection i() {
        return this.i;
    }
}

