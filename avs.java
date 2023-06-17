/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class avs
implements cfv {
    private final boolean a;

    public avs(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public boolean a(Random random, abe abe2) {
        boolean bl2 = abe2.b() != null;
        return bl2 == !this.a;
    }

    static /* synthetic */ boolean a(avs avs2) {
        return avs2.a;
    }
}

