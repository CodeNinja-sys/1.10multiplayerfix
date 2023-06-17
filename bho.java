/*
 * Decompiled with CFR 0.150.
 */
class bho
implements awp {
    final /* synthetic */ cet a;

    bho(cet cet2) {
        this.a = cet2;
    }

    public String a() {
        return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

