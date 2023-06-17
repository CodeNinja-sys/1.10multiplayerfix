/*
 * Decompiled with CFR 0.150.
 */
class wt
extends bek {
    private final bfv b;
    private final int c;
    final /* synthetic */ ame a;

    public wt(ame ame2, int n2, int n3, int n4, bfv bfv2, int n5) {
        this.a = ame2;
        super(n2, n3, n4, ab.a, bfv2.d() % 8 * 18, 198 + bfv2.d() / 8 * 18);
        this.b = bfv2;
        this.c = n5;
    }

    @Override
    public void b(int n2, int n3) {
        String string = bf.a(this.b.b(), new Object[0]);
        if (this.c >= 3 && this.b != ake.j) {
            string = string + " II";
        }
        ame.a(this.a, string, n2, n3);
    }

    static /* synthetic */ bfv a(wt wt2) {
        return wt2.b;
    }

    static /* synthetic */ int b(wt wt2) {
        return wt2.c;
    }
}

