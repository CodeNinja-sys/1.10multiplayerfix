/*
 * Decompiled with CFR 0.150.
 */
final class awd
implements ue {
    awd() {
    }

    @Override
    public int a(dbk dbk2, bnj bnj2, cmz cmz2, int n2) {
        int n3 = (Integer)dbk2.b(cux.a);
        int n4 = n3 * 32;
        int n5 = 255 - n3 * 8;
        int n6 = n3 * 4;
        return n4 << 16 | n5 << 8 | n6;
    }
}

