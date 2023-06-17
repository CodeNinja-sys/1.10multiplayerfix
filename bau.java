/*
 * Decompiled with CFR 0.150.
 */
class bau
implements awp {
    final /* synthetic */ cet a;

    bau(cet cet2) {
        this.a = cet2;
    }

    public String a() {
        Runtime runtime = Runtime.getRuntime();
        long l2 = runtime.maxMemory();
        long l3 = runtime.totalMemory();
        long l4 = runtime.freeMemory();
        long l5 = l2 / 1024L / 1024L;
        long l6 = l3 / 1024L / 1024L;
        long l7 = l4 / 1024L / 1024L;
        return l4 + " bytes (" + l7 + " MB) / " + l3 + " bytes (" + l6 + " MB) up to " + l2 + " bytes (" + l5 + " MB)";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

