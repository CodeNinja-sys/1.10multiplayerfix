/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class ccb
implements wu {
    @Override
    public void a(beo beo2, Random random) {
        dad dad2 = (dad)dad.b.a(random);
        int n2 = cmk.a(random, dad2.e(), dad2.a());
        bhl bhl2 = hp.cn.a(new bc(dad2, n2));
        int n3 = 2 + random.nextInt(5 + n2 * 10) + 3 * n2;
        if (dad2.b()) {
            n3 *= 2;
        }
        if (n3 > 64) {
            n3 = 64;
        }
        beo2.add(new jc(new bhl(hp.aS), new bhl(hp.bY, n3), bhl2));
    }
}

