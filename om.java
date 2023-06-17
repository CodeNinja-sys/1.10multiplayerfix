/*
 * Decompiled with CFR 0.150.
 */
public class om {
    private final bcz a;
    private Object b;
    private boolean c;

    public om(bcz bcz2, Object object) {
        this.a = bcz2;
        this.b = object;
        this.c = true;
    }

    public bcz a() {
        return this.a;
    }

    public void a(Object object) {
        this.b = object;
    }

    public Object b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    static /* synthetic */ boolean a(om om2, boolean bl2) {
        om2.c = bl2;
        return om2.c;
    }
}

