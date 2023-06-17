/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.j;

class cew
extends j {
    private pj b;
    final /* synthetic */ cyz a;

    cew(cyz cyz2) {
        this.a = cyz2;
    }

    protected pj d() {
        if (this.b == null) {
            this.b = new pj(this.a.a.a(), this.a.a.b(), this.a.a.c());
            return this.b;
        }
        if (this.b.equals(this.a.b)) {
            return (pj)this.b();
        }
        int n2 = this.b.a();
        int n3 = this.b.b();
        int n4 = this.b.c();
        if (n2 < this.a.b.a()) {
            ++n2;
        } else if (n3 < this.a.b.b()) {
            n2 = this.a.a.a();
            ++n3;
        } else if (n4 < this.a.b.c()) {
            n2 = this.a.a.a();
            n3 = this.a.a.b();
            ++n4;
        }
        this.b.a = n2;
        this.b.b = n3;
        this.b.c = n4;
        return this.b;
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

