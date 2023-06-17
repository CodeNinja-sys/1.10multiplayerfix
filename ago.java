/*
 * Decompiled with CFR 0.150.
 */
class ago
implements ckf {
    final /* synthetic */ bpx a;
    final /* synthetic */ bro b;

    ago(bro bro2, bpx bpx2) {
        this.b = bro2;
        this.a = bpx2;
    }

    @Override
    public int e() {
        cdp cdp2 = (cdp)bro.a(this.b).c(this.a);
        return cdp2 == null ? 0 : cdp2.e();
    }

    public qe a() {
        cdp cdp2 = (cdp)bro.a(this.b).c(this.a);
        return cdp2 == null ? bro.a : cdp2.a();
    }

    @Override
    public /* synthetic */ Object i() {
        return this.a();
    }
}

