/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class mu
implements cfv {
    private final float a;
    private final float b;

    public mu(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    @Override
    public boolean a(Random random, abe abe2) {
        int n2 = 0;
        if (abe2.c() instanceof bga) {
            n2 = acz.h((bga)abe2.c());
        }
        return random.nextFloat() < this.a + (float)n2 * this.b;
    }

    static /* synthetic */ float a(mu mu2) {
        return mu2.a;
    }

    static /* synthetic */ float b(mu mu2) {
        return mu2.b;
    }
}

