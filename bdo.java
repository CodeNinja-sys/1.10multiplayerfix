/*
 * Decompiled with CFR 0.150.
 */
final class bdo
implements ccd {
    bdo() {
    }

    public void a(si si2, Float f2) {
        si2.a(f2.floatValue());
    }

    public Float a(si si2) {
        return Float.valueOf(si2.O());
    }

    @Override
    public bcz a(int n2) {
        return new bcz(n2, this);
    }

    @Override
    public /* synthetic */ Object b(si si2) {
        return this.a(si2);
    }
}

