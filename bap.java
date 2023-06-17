/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class bap
extends xi {
    private static final Set e = aad.a(blg.f, blg.X, blg.r, blg.s, blg.ae, blg.aU, blg.aZ, blg.bk, blg.au, blg.cd, blg.aB);
    private static final float[] f = new float[]{6.0f, 8.0f, 8.0f, 8.0f, 6.0f};
    private static final float[] n = new float[]{-3.2f, -3.2f, -3.1f, -3.0f, -3.0f};

    protected bap(avx avx2) {
        super(avx2, e);
        this.b = f[avx2.ordinal()];
        this.c = n[avx2.ordinal()];
    }

    @Override
    public float a(bhl bhl2, dbk dbk2) {
        ahk ahk2 = dbk2.a();
        if (ahk2 == ahk.d || ahk2 == ahk.k || ahk2 == ahk.l) {
            return this.a;
        }
        return super.a(bhl2, dbk2);
    }
}

