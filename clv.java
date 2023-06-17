/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class clv {
    public static final clv a = new clv();
    private final List b = ov.a();

    private clv() {
    }

    public clv(List list) {
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            this.b.add(list.get(i2));
        }
    }

    public bpx a(bhl bhl2, iu iu2, bga bga2) {
        if (!this.b.isEmpty()) {
            for (mh mh2 : this.b) {
                if (!mh2.a(bhl2, iu2, bga2)) continue;
                return mh2.a();
            }
        }
        return null;
    }
}

