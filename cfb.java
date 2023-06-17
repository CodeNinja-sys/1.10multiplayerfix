/*
 * Decompiled with CFR 0.150.
 */
class cfb
implements awp {
    final /* synthetic */ int a;
    final /* synthetic */ tt b;

    cfb(tt tt2, int n2) {
        this.b = tt2;
        this.a = n2;
    }

    public String a() {
        String string = "Once per " + this.a + " ticks";
        if (this.a == Integer.MAX_VALUE) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

