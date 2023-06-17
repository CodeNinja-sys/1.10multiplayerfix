/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class fo
extends aet {
    public static final List a = Arrays.asList(cff.c, cff.d, cff.K, cff.g);
    private int f;
    private int g = 32;
    private final int h = 8;

    public fo() {
    }

    public fo(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("size")) {
                this.f = cmk.a((String)entry.getValue(), this.f, 0);
                continue;
            }
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.g = cmk.a((String)entry.getValue(), this.g, 9);
        }
    }

    @Override
    public String a() {
        return "Village";
    }

    @Override
    protected boolean a(int n2, int n3) {
        boolean bl2;
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
        Random random = this.e.a(n6, n7, 10387312);
        n6 *= this.g;
        n7 *= this.g;
        n2 = n4;
        n3 = n5;
        return n2 == (n6 += random.nextInt(this.g - 8)) && n3 == (n7 += random.nextInt(this.g - 8)) && (bl2 = this.e.t_().a(n2 * 16 + 8, n3 * 16 + 8, 0, a));
    }

    @Override
    protected cv b(int n2, int n3) {
        return new chv(this.e, this.d, n2, n3, this.f);
    }
}

