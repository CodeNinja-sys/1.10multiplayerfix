/*
 * Decompiled with CFR 0.150.
 */
class aem
implements Runnable {
    final /* synthetic */ kj a;
    final /* synthetic */ bix b;
    final /* synthetic */ adr c;
    final /* synthetic */ ajc d;
    final /* synthetic */ double e;
    final /* synthetic */ dfr f;

    aem(dfr dfr2, kj kj2, bix bix2, adr adr2, ajc ajc2, double d2) {
        this.f = dfr2;
        this.a = kj2;
        this.b = bix2;
        this.c = adr2;
        this.d = ajc2;
        this.e = d2;
    }

    @Override
    public void run() {
        this.f.a(this.a, this.b, this.c, this.d, this.e);
    }
}

