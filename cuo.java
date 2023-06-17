/*
 * Decompiled with CFR 0.150.
 */
class cuo
implements awp {
    final /* synthetic */ cvn a;

    cuo(cvn cvn2) {
        this.a = cvn2;
    }

    public String a() {
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", cvn.o(this.a).b(), cvn.o(this.a).a(), cvn.p(this.a), cvn.q(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

