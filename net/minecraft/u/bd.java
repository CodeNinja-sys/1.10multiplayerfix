/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

public abstract class bd {
    private Object a;
    private boolean b;

    public Object a() {
        if (!this.b) {
            this.b = true;
            this.a = this.b();
        }
        return this.a;
    }

    protected abstract Object b();
}

