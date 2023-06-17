/*
 * Decompiled with CFR 0.150.
 */
class dan
implements awp {
    final /* synthetic */ bql a;

    dan(bql bql2) {
        this.a = bql2;
    }

    public String a() {
        int n2 = bfa.c(this.a.k.n(this.a.l).t());
        try {
            return String.format("ID #%d (%s // %s)", n2, bfa.f(n2).n(), bfa.f(n2).getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + n2;
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

