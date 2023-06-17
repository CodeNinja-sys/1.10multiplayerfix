/*
 * Decompiled with CFR 0.150.
 */
class aqh
implements awp {
    final /* synthetic */ cet a;

    aqh(cet cet2) {
        this.a = cet2;
    }

    public String a() {
        return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

