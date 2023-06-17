/*
 * Decompiled with CFR 0.150.
 */
final class cpt
implements awp {
    final /* synthetic */ int a;
    final /* synthetic */ bfa b;

    cpt(int n2, bfa bfa2) {
        this.a = n2;
        this.b = bfa2;
    }

    public String a() {
        try {
            return String.format("ID #%d (%s // %s)", this.a, this.b.n(), this.b.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + this.a;
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

