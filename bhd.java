/*
 * Decompiled with CFR 0.150.
 */
final class bhd
implements ue {
    final /* synthetic */ gt a;

    bhd(gt gt2) {
        this.a = gt2;
    }

    @Override
    public int a(dbk dbk2, bnj bnj2, cmz cmz2, int n2) {
        azg azg2;
        if (bnj2 == null || cmz2 == null) {
            return -1;
        }
        bql bql2 = bnj2.q(cmz2);
        if (bql2 instanceof cbj && (azg2 = ((cbj)bql2).g()) instanceof ge) {
            dbk dbk3 = bfa.a(azg2).s();
            return this.a.a(dbk3, bnj2, cmz2, n2);
        }
        return -1;
    }
}

