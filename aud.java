/*
 * Decompiled with CFR 0.150.
 */
final class aud
implements cmi {
    aud() {
    }

    @Override
    public int a(bhl bhl2, int n2) {
        if (n2 != 1) {
            return -1;
        }
        azt azt2 = avm.a(bhl2, "Colors");
        if (!(azt2 instanceof aya)) {
            return 0x8A8A8A;
        }
        int[] arrn = ((aya)azt2).c();
        if (arrn.length == 1) {
            return arrn[0];
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int n6 : arrn) {
            n3 += (n6 & 0xFF0000) >> 16;
            n4 += (n6 & 0xFF00) >> 8;
            n5 += (n6 & 0xFF) >> 0;
        }
        return (n3 /= arrn.length) << 16 | (n4 /= arrn.length) << 8 | (n5 /= arrn.length);
    }
}

