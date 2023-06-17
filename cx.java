/*
 * Decompiled with CFR 0.150.
 */
class cx
implements awp {
    final /* synthetic */ bql a;

    cx(bql bql2) {
        this.a = bql2;
    }

    public String a() {
        return (String)bql.B().get(this.a.getClass()) + " // " + this.a.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

