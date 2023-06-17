/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.c;

import com.c.c.a.q;
import net.minecraft.s.n;

public class b
extends Exception {
    public final int a;
    public final String b;
    public final int c;
    public final String d;

    public b(int n2, String string, q q2) {
        super(string);
        this.a = n2;
        this.b = string;
        this.c = q2.b();
        this.d = q2.a();
    }

    public b(int n2, String string, int n3, String string2) {
        super(string);
        this.a = n2;
        this.b = string;
        this.c = n3;
        this.d = string2;
    }

    @Override
    public String toString() {
        if (this.c != -1) {
            String string = "mco.errorMessage." + this.c;
            String string2 = n.f(string);
            return (string2.equals(string) ? this.d : string2) + " - " + this.c;
        }
        return "Realms (" + this.a + ") " + this.b;
    }
}

