/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class cvi
extends ey {
    private final anr a;

    public cvi(anr anr2) {
        this.a = anr2;
    }

    @Override
    public anr a(cmz cmz2) {
        return this.a;
    }

    @Override
    public anr[] a(anr[] arranr, int n2, int n3, int n4, int n5) {
        if (arranr == null || arranr.length < n4 * n5) {
            arranr = new anr[n4 * n5];
        }
        Arrays.fill(arranr, 0, n4 * n5, this.a);
        return arranr;
    }

    @Override
    public anr[] b(anr[] arranr, int n2, int n3, int n4, int n5) {
        if (arranr == null || arranr.length < n4 * n5) {
            arranr = new anr[n4 * n5];
        }
        Arrays.fill(arranr, 0, n4 * n5, this.a);
        return arranr;
    }

    @Override
    public anr[] a(anr[] arranr, int n2, int n3, int n4, int n5, boolean bl2) {
        return this.b(arranr, n2, n3, n4, n5);
    }

    @Override
    public cmz a(int n2, int n3, int n4, List list, Random random) {
        if (list.contains(this.a)) {
            return new cmz(n2 - n4 + random.nextInt(n4 * 2 + 1), 0, n3 - n4 + random.nextInt(n4 * 2 + 1));
        }
        return null;
    }

    @Override
    public boolean a(int n2, int n3, int n4, List list) {
        return list.contains(this.a);
    }
}

