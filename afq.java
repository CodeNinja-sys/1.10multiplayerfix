/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class afq
implements bzf {
    private final float a;
    private final Random b;

    public afq(cmz cmz2, cwl cwl2) {
        this.a = cwl2.d();
        this.b = cwl2.a(cmz2);
    }

    @Override
    public xo a(iu iu2, cmz cmz2, xo xo2) {
        if (this.a >= 1.0f || this.b.nextFloat() <= this.a) {
            return xo2;
        }
        return null;
    }
}

