/*
 * Decompiled with CFR 0.150.
 */
public class bqe
extends adr {
    private final int d = avj.a(kj.values().length);

    public bqe(iu iu2, fr fr2, int n2) {
        super(iu2, fr2, n2);
    }

    public int a(kj kj2, ajc ajc2) {
        if (!ajc2.b(kj2)) {
            return this.d + kj2.ordinal();
        }
        return -1;
    }

    @Override
    public void i() {
        super.i();
        avj.a(this.d, kj.values().length);
    }
}

