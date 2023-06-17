/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cmf
implements cfv {
    private final he[] a;
    private final bak b;

    public cmf(he[] arrhe, bak bak2) {
        this.a = arrhe;
        this.b = bak2;
    }

    @Override
    public boolean a(Random random, abe abe2) {
        cpk cpk2 = abe2.a(this.b);
        if (cpk2 == null) {
            return false;
        }
        for (he he2 : this.a) {
            if (he2.a(random, cpk2)) continue;
            return false;
        }
        return true;
    }

    static /* synthetic */ he[] a(cmf cmf2) {
        return cmf2.a;
    }

    static /* synthetic */ bak b(cmf cmf2) {
        return cmf2.b;
    }
}

