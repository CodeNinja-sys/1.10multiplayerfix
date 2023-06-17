/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

final class adq
implements brj {
    public boolean a;

    adq() {
    }

    @Override
    public void a() {
        this.a = false;
    }

    @Override
    public boolean a(int n2, cbu cbu2, cmz cmz2, List list, Random random) {
        ih ih2 = cbu2.b.c();
        int n3 = random.nextInt(4) + 1;
        cbu cbu3 = bze.a(list, bze.a(cbu2, new cmz(0, 0, -4), "bridge_piece", ih2, true));
        cbu3.m = -1;
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (random.nextBoolean()) {
                cbu3 = bze.a(list, bze.a(cbu3, new cmz(0, n4, -4), "bridge_piece", ih2, true));
                n4 = 0;
                continue;
            }
            cbu3 = random.nextBoolean() ? bze.a(list, bze.a(cbu3, new cmz(0, n4, -4), "bridge_steep_stairs", ih2, true)) : bze.a(list, bze.a(cbu3, new cmz(0, n4, -8), "bridge_gentle_stairs", ih2, true));
            n4 = 4;
        }
        if (this.a || random.nextInt(10 - n2) != 0) {
            if (!bze.a(bze.h(), n2 + 1, cbu3, new cmz(-3, n4 + 1, -11), list, random)) {
                return false;
            }
        } else {
            bze.a(list, bze.a(cbu3, new cmz(-8 + random.nextInt(8), n4, -70 + random.nextInt(10)), "ship", ih2, true));
            this.a = true;
        }
        cbu3 = bze.a(list, bze.a(cbu3, new cmz(4, n4, 0), "bridge_end", ih2.a(ih.c), true));
        cbu3.m = -1;
        return true;
    }
}

