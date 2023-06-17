/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

final class bdx
implements cm {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    bdx(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    public boolean a(cpk cpk2) {
        if (!(cpk2 instanceof bga)) {
            return false;
        }
        bga bga2 = (bga)cpk2;
        ccw ccw2 = bga2.as_();
        String string = ccw2 == null ? "" : ccw2.a();
        return string.equals(this.a) != this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

