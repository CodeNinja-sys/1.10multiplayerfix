/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.j;

class bmn
extends j {
    private cmz b;
    final /* synthetic */ akv a;

    bmn(akv akv2) {
        this.a = akv2;
    }

    protected cmz d() {
        if (this.b == null) {
            this.b = this.a.a;
            return this.b;
        }
        if (this.b.equals(this.a.b)) {
            return (cmz)this.b();
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
        this.b = new cmz(n2, n3, n4);
        return this.b;
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

