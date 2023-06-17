/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ce
implements p {
    public static final String[] a = new String[]{"tile.bed.notValid"};
    private int b;
    private float c;

    public ce() {
    }

    public ce(int n2, float f2) {
        this.b = n2;
        this.c = f2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.b = a2.F();
        this.c = a2.O();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.b);
        a2.a(this.c);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }
}

