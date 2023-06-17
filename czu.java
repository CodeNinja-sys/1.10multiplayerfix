/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class czu {
    public static final Comparator a = new ow();
    private final bzt b;
    private final bhi c;
    private final String d;
    private int e;
    private boolean f;
    private boolean g;

    public czu(bzt bzt2, bhi bhi2, String string) {
        this.b = bzt2;
        this.c = bhi2;
        this.d = string;
        this.g = true;
    }

    public void a(int n2) {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.b() + n2);
    }

    public void b(int n2) {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.b() - n2);
    }

    public void a() {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.a(1);
    }

    public int b() {
        return this.e;
    }

    public void c(int n2) {
        int n3 = this.e;
        this.e = n2;
        if (n3 != n2 || this.g) {
            this.g = false;
            this.e().a(this);
        }
    }

    public bhi c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public bzt e() {
        return this.b;
    }

    public boolean f() {
        return this.f;
    }

    public void a(boolean bl2) {
        this.f = bl2;
    }
}

