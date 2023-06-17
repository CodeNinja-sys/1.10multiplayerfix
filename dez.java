/*
 * Decompiled with CFR 0.150.
 */
class dez
implements awp {
    final /* synthetic */ cet a;

    dez(cet cet2) {
        this.a = cet2;
    }

    public String a() {
        return System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

