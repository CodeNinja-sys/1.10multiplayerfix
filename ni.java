/*
 * Decompiled with CFR 0.150.
 */
import org.lwjgl.a.j;

class ni
implements awp {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ cwz c;

    ni(cwz cwz2, int n2, int n3) {
        this.c = cwz2;
        this.a = n2;
        this.b = n3;
    }

    public String a() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", this.a, this.b, j.q(), j.r());
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

