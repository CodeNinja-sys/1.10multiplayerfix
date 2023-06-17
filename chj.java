/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import com.a.a.b.cm;

class chj
implements cm {
    final /* synthetic */ bvs a;
    final /* synthetic */ cg b;
    final /* synthetic */ cgc c;

    chj(cgc cgc2, bvs bvs2, cg cg2) {
        this.c = cgc2;
        this.a = bvs2;
        this.b = cg2;
    }

    public boolean a(dbk dbk2) {
        return dbk2 != null && dbk2.b(this.a).equals(this.b.c());
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((dbk)object);
    }
}

