/*
 * Decompiled with CFR 0.150.
 */
final class cpa
implements Runnable {
    final /* synthetic */ ds a;
    final /* synthetic */ acy b;

    cpa(ds ds2, acy acy2) {
        this.a = ds2;
        this.b = acy2;
    }

    @Override
    public void run() {
        this.a.a(this.b);
    }
}

