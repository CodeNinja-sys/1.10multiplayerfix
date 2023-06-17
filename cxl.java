/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

final class cxl
implements brj {
    cxl() {
    }

    @Override
    public void a() {
    }

    @Override
    public boolean a(int n2, cbu cbu2, cmz cmz2, List list, Random random) {
        ih ih2 = cbu2.b.c();
        cbu cbu3 = cbu2;
        cbu3 = bze.a(list, bze.a(cbu3, new cmz(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", ih2, true));
        cbu3 = bze.a(list, bze.a(cbu3, new cmz(0, 7, 0), "tower_piece", ih2, true));
        cbu cbu4 = random.nextInt(3) == 0 ? cbu3 : null;
        int n3 = 1 + random.nextInt(3);
        for (int i2 = 0; i2 < n3; ++i2) {
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(0, 4, 0), "tower_piece", ih2, true));
            if (i2 >= n3 - 1 || !random.nextBoolean()) continue;
            cbu4 = cbu3;
        }
        if (cbu4 != null) {
            for (cam cam2 : bze.e()) {
                if (!random.nextBoolean()) continue;
                cbu cbu5 = bze.a(list, bze.a(cbu4, (cmz)cam2.b(), "bridge_end", ih2.a((ih)((Object)cam2.a())), true));
                bze.a(bze.f(), n2 + 1, cbu5, null, list, random);
            }
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(-1, 4, -1), "tower_top", ih2, true));
        } else if (n2 == 7) {
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(-1, 4, -1), "tower_top", ih2, true));
        } else {
            return bze.a(bze.g(), n2 + 1, cbu3, null, list, random);
        }
        return true;
    }
}

