/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bur
extends dad {
    public bur(bkl bkl2, dfm ... arrdfm) {
        super(bkl2, mo.e, arrdfm);
        this.b("thorns");
    }

    @Override
    public int a(int n2) {
        return 10 + 20 * (n2 - 1);
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(bhl bhl2) {
        if (bhl2.a() instanceof uh) {
            return true;
        }
        return super.a(bhl2);
    }

    @Override
    public void b(bga bga2, cpk cpk2, int n2) {
        Random random = bga2.aW();
        bhl bhl2 = acz.b(bbh.h, bga2);
        if (bur.a(n2, random)) {
            if (cpk2 != null) {
                cpk2.a(ahy.a(bga2), (float)bur.b(n2, random));
            }
            if (bhl2 != null) {
                bhl2.a(3, bga2);
            }
        } else if (bhl2 != null) {
            bhl2.a(1, bga2);
        }
    }

    public static boolean a(int n2, Random random) {
        if (n2 <= 0) {
            return false;
        }
        return random.nextFloat() < 0.15f * (float)n2;
    }

    public static int b(int n2, Random random) {
        if (n2 > 10) {
            return n2 - 10;
        }
        return 1 + random.nextInt(4);
    }
}

