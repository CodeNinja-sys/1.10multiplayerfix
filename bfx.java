/*
 * Decompiled with CFR 0.150.
 */
class bfx
implements Runnable {
    final /* synthetic */ chn a;
    final /* synthetic */ dfr b;

    bfx(dfr dfr2, chn chn2) {
        this.b = dfr2;
        this.a = chn2;
    }

    @Override
    public void run() {
        dfr.a(this.b).remove(this.a);
    }
}

