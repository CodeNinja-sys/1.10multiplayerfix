/*
 * Decompiled with CFR 0.150.
 */
public class cwr {
    public final byte[] a;
    private final int b;
    private final int c;

    public cwr(byte[] arrby, int n2) {
        this.a = arrby;
        this.b = n2;
        this.c = n2 + 4;
    }

    public int a(int n2, int n3, int n4) {
        int n5 = n2 << this.c | n4 << this.b | n3;
        int n6 = n5 >> 1;
        int n7 = n5 & 1;
        if (n7 == 0) {
            return this.a[n6] & 0xF;
        }
        return this.a[n6] >> 4 & 0xF;
    }
}

