/*
 * Decompiled with CFR 0.150.
 */
public class oz
extends RuntimeException {
    private final cet a;

    public oz(cet cet2) {
        this.a = cet2;
    }

    public cet a() {
        return this.a;
    }

    @Override
    public Throwable getCause() {
        return this.a.b();
    }

    @Override
    public String getMessage() {
        return this.a.a();
    }
}

