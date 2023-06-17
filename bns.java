/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bns
extends azp {
    private final bom a;
    private final boolean b;

    public bns(cfv[] arrcfv, bom bom2, boolean bl2) {
        super(arrcfv);
        this.a = bom2;
        this.b = bl2;
    }

    @Override
    public bhl a(bhl bhl2, Random random, abe abe2) {
        acz.a(random, bhl2, this.a.a(random), this.b);
        return bhl2;
    }

    static /* synthetic */ bom a(bns bns2) {
        return bns2.a;
    }

    static /* synthetic */ boolean b(bns bns2) {
        return bns2.b;
    }
}

