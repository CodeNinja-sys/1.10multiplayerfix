/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class bah
extends aet {
    private static final List a = Arrays.asList(cff.d, cff.s, cff.w, cff.x, cff.h, cff.n, cff.F);
    private final List f = ov.a();
    private int g = 32;
    private final int h = 8;

    public bah() {
        this.f.add(new clh(byl.class, 1, 1, 1));
    }

    public bah(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.g = cmk.a((String)entry.getValue(), this.g, 9);
        }
    }

    @Override
    public String a() {
        return "Temple";
    }

    @Override
    protected boolean a(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        if (n2 < 0) {
            n2 -= this.g - 1;
        }
        if (n3 < 0) {
            n3 -= this.g - 1;
        }
        int n6 = n2 / this.g;
        int n7 = n3 / this.g;
        Random random = this.e.a(n6, n7, 14357617);
        n6 *= this.g;
        n7 *= this.g;
        n2 = n4;
        n3 = n5;
        if (n2 == (n6 += random.nextInt(this.g - 8)) && n3 == (n7 += random.nextInt(this.g - 8))) {
            anr anr2 = this.e.t_().a(new cmz(n2 * 16 + 8, 0, n3 * 16 + 8));
            if (anr2 == null) {
                return false;
            }
            for (anr anr3 : a) {
                if (anr2 != anr3) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected cv b(int n2, int n3) {
        return new oo(this.e, this.d, n2, n3);
    }

    public boolean c(cmz cmz2) {
        cv cv2 = this.b(cmz2);
        if (cv2 == null || !(cv2 instanceof oo) || cv2.a.isEmpty()) {
            return false;
        }
        pc pc2 = (pc)cv2.a.get(0);
        return pc2 instanceof cpo;
    }

    public List c() {
        return this.f;
    }
}

