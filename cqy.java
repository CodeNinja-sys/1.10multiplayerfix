/*
 * Decompiled with CFR 0.150.
 */
public class cqy
extends ald {
    private final amq c;
    private boolean d;
    final /* synthetic */ amq b;

    public cqy(amq amq2, amq amq3) {
        this.b = amq2;
        super(amq3);
        this.c = amq3;
    }

    public boolean c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    @Override
    public void b() {
        if (this.a) {
            this.c.D();
            this.a = false;
        }
    }
}

