/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

class cnl
implements cm {
    final /* synthetic */ bdt a;

    cnl(bdt bdt2) {
        this.a = bdt2;
    }

    public boolean a(czu czu2) {
        return czu2.d() != null && !czu2.d().startsWith("#");
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((czu)object);
    }
}

