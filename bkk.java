/*
 * Decompiled with CFR 0.150.
 */
public class bkk
extends ge {
    private String[] b;

    public bkk(bfa bfa2, boolean bl2) {
        super(bfa2);
        if (bl2) {
            this.e(0);
            this.a(true);
        }
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    public bkk a(String[] arrstring) {
        this.b = arrstring;
        return this;
    }

    @Override
    public String b(bhl bhl2) {
        if (this.b == null) {
            return super.b(bhl2);
        }
        int n2 = bhl2.h();
        if (n2 >= 0 && n2 < this.b.length) {
            return super.b(bhl2) + "." + this.b[n2];
        }
        return super.b(bhl2);
    }
}

