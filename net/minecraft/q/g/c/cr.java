/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import net.minecraft.e.e;
import net.minecraft.q.f;

public class cr
extends f {
    private e a = new e();

    public cr(String string) {
        super(string);
    }

    @Override
    public void a(e e2) {
        this.a = e2.o("Features");
    }

    @Override
    public e b(e e2) {
        e2.a("Features", this.a);
        return e2;
    }

    public void a(e e2, int n2, int n3) {
        this.a.a(cr.a(n2, n3), e2);
    }

    public static String a(int n2, int n3) {
        return "[" + n2 + "," + n3 + "]";
    }

    public e a() {
        return this.a;
    }
}

