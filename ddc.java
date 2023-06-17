/*
 * Decompiled with CFR 0.150.
 */
public class ddc {
    private static final bwh a = new cph();
    private static final bwh b = new jn();
    private static final bwh c = new ayq();

    private static int a(bnj bnj2, cmz cmz2, bwh bwh2) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (pj pj2 : cmz.b(cmz2.e(-1, 0, -1), cmz2.e(1, 0, 1))) {
            int n5 = bwh2.a(bnj2.a(pj2), pj2);
            n2 += (n5 & 0xFF0000) >> 16;
            n3 += (n5 & 0xFF00) >> 8;
            n4 += n5 & 0xFF;
        }
        return (n2 / 9 & 0xFF) << 16 | (n3 / 9 & 0xFF) << 8 | n4 / 9 & 0xFF;
    }

    public static int a(bnj bnj2, cmz cmz2) {
        return ddc.a(bnj2, cmz2, a);
    }

    public static int b(bnj bnj2, cmz cmz2) {
        return ddc.a(bnj2, cmz2, b);
    }

    public static int c(bnj bnj2, cmz cmz2) {
        return ddc.a(bnj2, cmz2, c);
    }
}

