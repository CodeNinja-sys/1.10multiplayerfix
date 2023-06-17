/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

final class cai
implements brj {
    cai() {
    }

    @Override
    public void a() {
    }

    @Override
    public boolean a(int n2, cbu cbu2, cmz cmz2, List list, Random random) {
        if (n2 > 8) {
            return false;
        }
        ih ih2 = cbu2.b.c();
        cbu cbu3 = bze.a(list, bze.a(cbu2, cmz2, "base_floor", ih2, true));
        int n3 = random.nextInt(3);
        if (n3 == 0) {
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(-1, 4, -1), "base_roof", ih2, true));
        } else if (n3 == 1) {
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(-1, 0, -1), "second_floor_2", ih2, false));
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(-1, 8, -1), "second_roof", ih2, false));
            bze.a(bze.d(), n2 + 1, cbu3, null, list, random);
        } else if (n3 == 2) {
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(-1, 0, -1), "second_floor_2", ih2, false));
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(-1, 4, -1), "third_floor_c", ih2, false));
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(-1, 8, -1), "third_roof", ih2, true));
            bze.a(bze.d(), n2 + 1, cbu3, null, list, random);
        }
        return true;
    }
}

