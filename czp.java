/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class czp
extends dad {
    protected czp(bkl bkl2, dfm ... arrdfm) {
        super(bkl2, mo.j, arrdfm);
        this.b("durability");
    }

    @Override
    public int a(int n2) {
        return 5 + (n2 - 1) * 8;
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
        if (bhl2.d()) {
            return true;
        }
        return super.a(bhl2);
    }

    public static boolean a(bhl bhl2, int n2, Random random) {
        if (bhl2.a() instanceof uh && random.nextFloat() < 0.6f) {
            return false;
        }
        return random.nextInt(n2 + 1) > 0;
    }
}

