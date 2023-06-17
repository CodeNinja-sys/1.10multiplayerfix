/*
 * Decompiled with CFR 0.150.
 */
public class ahv
extends cwv {
    private boolean a;
    private final String b;
    private final ckg c;

    public ahv(ckg ckg2, int n2, int n3, int n4, String string, boolean bl2) {
        super(n2, n3, n4, 150, 20, "");
        this.b = string;
        this.a = bl2;
        this.i = this.a();
        this.c = ckg2;
    }

    private String a() {
        return bf.a(this.b, new Object[0]) + ": " + bf.a(this.a ? "gui.yes" : "gui.no", new Object[0]);
    }

    public void b(boolean bl2) {
        this.a = bl2;
        this.i = this.a();
        this.c.a(this.j, bl2);
    }

    @Override
    public boolean b(bxy bxy2, int n2, int n3) {
        if (super.b(bxy2, n2, n3)) {
            this.a = !this.a;
            this.i = this.a();
            this.c.a(this.j, this.a);
            return true;
        }
        return false;
    }
}

