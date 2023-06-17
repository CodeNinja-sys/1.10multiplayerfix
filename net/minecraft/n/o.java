/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

public class o
extends Exception {
    private final Object[] a;

    public o(String string, Object ... arrobject) {
        super(string);
        this.a = arrobject;
    }

    public Object[] a() {
        return this.a;
    }
}

