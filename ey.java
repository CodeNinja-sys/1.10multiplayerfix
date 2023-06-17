/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

public class ey {
    private oh a;
    private oh b;
    private final aja c = new aja(this);
    private final List d = ov.a(cff.f, cff.c, cff.g, cff.u, cff.t, cff.w, cff.x);

    protected ey() {
    }

    private ey(long l2, aaf aaf2, String string) {
        this();
        oh[] arroh = oh.a(l2, aaf2, string);
        this.a = arroh[0];
        this.b = arroh[1];
    }

    public ey(cvn cvn2) {
        this(cvn2.a(), cvn2.s(), cvn2.z());
    }

    public List a() {
        return this.d;
    }

    public anr a(cmz cmz2) {
        return this.a(cmz2, null);
    }

    public anr a(cmz cmz2, anr anr2) {
        return this.c.a(cmz2.a(), cmz2.c(), anr2);
    }

    public float a(float f2, int n2) {
        return f2;
    }

    public anr[] a(anr[] arranr, int n2, int n3, int n4, int n5) {
        azw.a();
        if (arranr == null || arranr.length < n4 * n5) {
            arranr = new anr[n4 * n5];
        }
        int[] arrn = this.a.a(n2, n3, n4, n5);
        try {
            for (int i2 = 0; i2 < n4 * n5; ++i2) {
                arranr[i2] = anr.a(arrn[i2], cff.b);
            }
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Invalid Biome id");
            sx sx2 = cet2.a("RawBiomeBlock");
            sx2.a("biomes[] size", arranr.length);
            sx2.a("x", n2);
            sx2.a("z", n3);
            sx2.a("w", n4);
            sx2.a("h", n5);
            throw new oz(cet2);
        }
        return arranr;
    }

    public anr[] b(anr[] arranr, int n2, int n3, int n4, int n5) {
        return this.a(arranr, n2, n3, n4, n5, true);
    }

    public anr[] a(anr[] arranr, int n2, int n3, int n4, int n5, boolean bl2) {
        azw.a();
        if (arranr == null || arranr.length < n4 * n5) {
            arranr = new anr[n4 * n5];
        }
        if (bl2 && n4 == 16 && n5 == 16 && (n2 & 0xF) == 0 && (n3 & 0xF) == 0) {
            anr[] arranr2 = this.c.b(n2, n3);
            System.arraycopy(arranr2, 0, arranr, 0, n4 * n5);
            return arranr;
        }
        int[] arrn = this.b.a(n2, n3, n4, n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            arranr[i2] = anr.a(arrn[i2], cff.b);
        }
        return arranr;
    }

    public boolean a(int n2, int n3, int n4, List list) {
        azw.a();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] arrn = this.a.a(n5, n6, n9, n10);
        try {
            for (int i2 = 0; i2 < n9 * n10; ++i2) {
                anr anr2 = anr.b(arrn[i2]);
                if (list.contains(anr2)) continue;
                return false;
            }
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Invalid Biome id");
            sx sx2 = cet2.a("Layer");
            sx2.a("Layer", this.a.toString());
            sx2.a("x", n2);
            sx2.a("z", n3);
            sx2.a("radius", n4);
            sx2.a("allowed", list);
            throw new oz(cet2);
        }
        return true;
    }

    public cmz a(int n2, int n3, int n4, List list, Random random) {
        azw.a();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] arrn = this.a.a(n5, n6, n9, n10);
        cmz cmz2 = null;
        int n11 = 0;
        for (int i2 = 0; i2 < n9 * n10; ++i2) {
            int n12 = n5 + i2 % n9 << 2;
            int n13 = n6 + i2 / n9 << 2;
            anr anr2 = anr.b(arrn[i2]);
            if (!list.contains(anr2) || cmz2 != null && random.nextInt(n11 + 1) != 0) continue;
            cmz2 = new cmz(n12, 0, n13);
            ++n11;
        }
        return cmz2;
    }

    public void b() {
        this.c.a();
    }
}

