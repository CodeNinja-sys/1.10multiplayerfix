/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class atr
implements cm {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    atr(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    public boolean a(cpk cpk2) {
        return cpk2 != null && cpk2.i_().equals(this.a) != this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

