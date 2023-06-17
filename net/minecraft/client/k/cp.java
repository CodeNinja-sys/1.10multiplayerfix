/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.e;
import net.minecraft.client.k.ch;

public class cp
extends ch {
    private final e a;

    public cp(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, null, string);
    }

    public cp(int n2, int n3, int n4, int n5, int n6, String string) {
        super(n2, n3, n4, n5, n6, string);
        this.a = null;
    }

    public cp(int n2, int n3, int n4, e e2, String string) {
        super(n2, n3, n4, 150, 20, string);
        this.a = e2;
    }

    public e a() {
        return this.a;
    }
}

