/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

class hi
extends baj {
    protected List a = ov.a();

    public hi(String string) {
        this.b = string;
    }

    @Override
    public azt a() {
        bvp bvp2 = new bvp();
        for (baj baj2 : this.a) {
            bvp2.a(baj2.b, baj2.a());
        }
        return bvp2;
    }
}

