/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

final class csi
implements brj {
    csi() {
    }

    @Override
    public void a() {
    }

    @Override
    public boolean a(int n2, cbu cbu2, cmz cmz2, List list, Random random) {
        ih ih2 = cbu2.b.c();
        cbu cbu3 = bze.a(list, bze.a(cbu2, new cmz(-3, 4, -3), "fat_tower_base", ih2, true));
        cbu3 = bze.a(list, bze.a(cbu3, new cmz(0, 4, 0), "fat_tower_middle", ih2, true));
        for (int i2 = 0; i2 < 2 && random.nextInt(3) != 0; ++i2) {
            cbu3 = bze.a(list, bze.a(cbu3, new cmz(0, 8, 0), "fat_tower_middle", ih2, true));
            for (cam cam2 : bze.i()) {
                if (!random.nextBoolean()) continue;
                cbu cbu4 = bze.a(list, bze.a(cbu3, (cmz)cam2.b(), "bridge_end", ih2.a((ih)((Object)cam2.a())), true));
                bze.a(bze.f(), n2 + 1, cbu4, null, list, random);
            }
        }
        cbu3 = bze.a(list, bze.a(cbu3, new cmz(-2, 8, -2), "fat_tower_top", ih2, true));
        return true;
    }
}

