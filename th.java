/*
 * Decompiled with CFR 0.150.
 */
class th
implements awp {
    final /* synthetic */ bql a;

    th(bql bql2) {
        this.a = bql2;
    }

    public String a() {
        dbk dbk2 = this.a.k.n(this.a.l);
        int n2 = dbk2.t().e(dbk2);
        if (n2 < 0) {
            return "Unknown? (Got " + n2 + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(n2)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", n2, string);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

