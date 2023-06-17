/*
 * Decompiled with CFR 0.150.
 */
public class bgw
extends bfv {
    protected bgw(boolean bl2, int n2) {
        super(bl2, n2);
    }

    @Override
    public void a(bga bga2, anu anu2, int n2) {
        bga2.a_(bga2.aO() - (float)(4 * (n2 + 1)));
        super.a(bga2, anu2, n2);
    }

    @Override
    public void b(bga bga2, anu anu2, int n2) {
        bga2.a_(bga2.aO() + (float)(4 * (n2 + 1)));
        super.b(bga2, anu2, n2);
    }
}

