/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cwq
implements cfv {
    private final float a;

    public cwq(float f2) {
        this.a = f2;
    }

    @Override
    public boolean a(Random random, abe abe2) {
        return random.nextFloat() < this.a;
    }

    static /* synthetic */ float a(cwq cwq2) {
        return cwq2.a;
    }
}

