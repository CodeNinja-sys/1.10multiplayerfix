/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class aou
extends to {
    private amh a;
    private dbk b;

    public aou(amh amh2, amt amt2) {
        this.a(amh2, amt2);
    }

    public void a(amh amh2, amt amt2) {
        this.a = amh2;
        this.b = amh2.s().a(amh2.h(), (Comparable)((Object)amt2));
    }

    @Override
    public boolean a(iu iu2, Random random, cmz cmz2) {
        for (int i2 = 0; i2 < 64; ++i2) {
            cmz cmz3 = cmz2.e(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            if (!iu2.c(cmz3) || iu2.q.n() && cmz3.b() >= 255 || !this.a.e(iu2, cmz3, this.b)) continue;
            iu2.a(cmz3, this.b, 2);
        }
        return true;
    }
}

