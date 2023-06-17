/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class cfy
extends aet {
    private int g = 32;
    private int h = 5;
    public static final List a = Arrays.asList(cff.a, cff.z, cff.i, cff.l, cff.m);
    public static final List f = Arrays.asList(cff.z);
    private static final List i = ov.a();

    public cfy() {
    }

    public cfy(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("spacing")) {
                this.g = cmk.a((String)entry.getValue(), this.g, 1);
                continue;
            }
            if (!((String)entry.getKey()).equals("separation")) continue;
            this.h = cmk.a((String)entry.getValue(), this.h, 1);
        }
    }

    @Override
    public String a() {
        return "Monument";
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
        Random random = this.e.a(n6, n7, 10387313);
        n6 *= this.g;
        n7 *= this.g;
        n2 = n4;
        n3 = n5;
        if (n2 == (n6 += (random.nextInt(this.g - this.h) + random.nextInt(this.g - this.h)) / 2) && n3 == (n7 += (random.nextInt(this.g - this.h) + random.nextInt(this.g - this.h)) / 2)) {
            if (!this.e.t_().a(n2 * 16 + 8, n3 * 16 + 8, 16, f)) {
                return false;
            }
            boolean bl2 = this.e.t_().a(n2 * 16 + 8, n3 * 16 + 8, 29, a);
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected cv b(int n2, int n3) {
        return new yd(this.e, this.d, n2, n3);
    }

    public List c() {
        return i;
    }

    static {
        i.add(new clh(bym.class, 1, 2, 4));
    }
}

