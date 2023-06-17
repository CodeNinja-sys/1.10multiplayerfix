/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.g;
import net.minecraft.client.g.r;

public class ci {
    private final g a;
    private final r b = new r();
    private static final ci c = new ci(0x200000);

    public static ci a() {
        return c;
    }

    public ci(int n2) {
        this.a = new g(n2);
    }

    public void b() {
        this.a.e();
        this.b.a(this.a);
    }

    public g c() {
        return this.a;
    }
}

