/*
 * Decompiled with CFR 0.150.
 */
public abstract class cag {
    private Object a;
    private boolean b;

    public Object c() {
        if (!this.b) {
            this.b = true;
            this.a = this.b();
        }
        return this.a;
    }

    protected abstract Object b();
}

