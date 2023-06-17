/*
 * Decompiled with CFR 0.150.
 */
class ash
implements Runnable {
    final /* synthetic */ bxy a;
    final /* synthetic */ cil b;
    final /* synthetic */ hh c;

    ash(hh hh2, bxy bxy2, cil cil2) {
        this.c = hh2;
        this.a = bxy2;
        this.b = cil2;
    }

    @Override
    public void run() {
        this.a.a(this.b);
    }
}

