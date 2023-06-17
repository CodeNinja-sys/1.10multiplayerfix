/*
 * Decompiled with CFR 0.150.
 */
public class ccf
implements als {
    @Override
    public qa a(int n2, iu iu2, double d2, double d3, double d4, double d5, double d6, double d7, int ... arrn) {
        dbk dbk2 = bfa.g(arrn[0]);
        if (dbk2.t() != blg.a && dbk2.i() == cpb.a) {
            return null;
        }
        int n3 = bxy.B().al().a(dbk2);
        if (dbk2.t() instanceof cmy) {
            n3 = ((cmy)dbk2.t()).m(dbk2);
        }
        float f2 = (float)(n3 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n3 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n3 & 0xFF) / 255.0f;
        return new aor(iu2, d2, d3, d4, f2, f3, f4);
    }
}

