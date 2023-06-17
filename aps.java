/*
 * Decompiled with CFR 0.150.
 */
class aps
implements awp {
    final /* synthetic */ bfa a;
    final /* synthetic */ iu b;

    aps(iu iu2, bfa bfa2) {
        this.b = iu2;
        this.a = bfa2;
    }

    public String a() {
        try {
            return String.format("ID #%d (%s // %s)", bfa.c(this.a), this.a.n(), this.a.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + bfa.c(this.a);
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

