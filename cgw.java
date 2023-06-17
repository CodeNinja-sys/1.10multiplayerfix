/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class cgw
implements cm {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    cgw(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    public boolean a(cpk cpk2) {
        if (cpk2 == null) {
            return false;
        }
        if ("".equals(this.a)) {
            return cpk2.bX().isEmpty() != this.b;
        }
        return cpk2.bX().contains(this.a) != this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

