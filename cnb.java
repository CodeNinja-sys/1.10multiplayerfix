/*
 * Decompiled with CFR 0.150.
 */
public class cnb {
    private static final dbk a = blg.a.s();
    private final char[] b = new char[65536];

    public dbk a(int n2, int n3, int n4) {
        dbk dbk2 = (dbk)bfa.w.a(this.b[cnb.b(n2, n3, n4)]);
        return dbk2 == null ? a : dbk2;
    }

    public void a(int n2, int n3, int n4, dbk dbk2) {
        this.b[cnb.b((int)n2, (int)n3, (int)n4)] = (char)bfa.w.a(dbk2);
    }

    private static int b(int n2, int n3, int n4) {
        return n2 << 12 | n4 << 8 | n3;
    }

    public int a(int n2, int n3) {
        int n4 = (n2 << 12 | n3 << 8) + 256 - 1;
        for (int i2 = 255; i2 >= 0; --i2) {
            dbk dbk2 = (dbk)bfa.w.a(this.b[n4 + i2]);
            if (dbk2 == null || dbk2 == a) continue;
            return i2;
        }
        return 0;
    }
}

