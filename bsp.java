/*
 * Decompiled with CFR 0.150.
 */
public class bsp
extends azg {
    public bsp() {
        this.d(1);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        bdl2.a(bhl2, bqp2);
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }

    public static boolean b(bvp bvp2) {
        if (bvp2 == null) {
            return false;
        }
        if (!bvp2.b("pages", 9)) {
            return false;
        }
        bmh bmh2 = bvp2.c("pages", 8);
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            String string = bmh2.g(i2);
            if (string == null) {
                return false;
            }
            if (string.length() <= 32767) continue;
            return false;
        }
        return true;
    }
}

