/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class dgz
extends bcf {
    private static final Map a = sz.c();

    public dgz(bid bid2, boi boi2, float f2) {
        super(bid2, boi2, f2);
    }

    protected void a(it it2, float f2) {
        float f3 = 1.0f;
        bmv bmv2 = it2.x();
        if (bmv2 == bmv.b) {
            f3 *= 0.87f;
        } else if (bmv2 == bmv.c) {
            f3 *= 0.92f;
        }
        cja.b(f3, f3, f3);
        super.a(it2, f2);
    }

    protected bpx a(it it2) {
        if (!it2.W()) {
            return it2.x().e();
        }
        return this.b(it2);
    }

    private bpx b(it it2) {
        String string = it2.Y();
        if (!it2.X()) {
            return null;
        }
        bpx bpx2 = (bpx)a.get(string);
        if (bpx2 == null) {
            bpx2 = new bpx(string);
            bxy.B().P().a(bpx2, new dbf(it2.Z()));
            a.put(string, bpx2);
        }
        return bpx2;
    }
}

