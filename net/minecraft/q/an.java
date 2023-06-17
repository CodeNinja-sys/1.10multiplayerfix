/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.e.e;

public class an {
    public static final an a = new an("");
    private final String b;

    public an(String string) {
        this.b = string;
    }

    public boolean a() {
        return this.b == null || this.b.isEmpty();
    }

    public String b() {
        return this.b;
    }

    public void a(e e2) {
        e2.a("Lock", this.b);
    }

    public static an b(e e2) {
        if (e2.b("Lock", 8)) {
            String string = e2.l("Lock");
            return new an(string);
        }
        return a;
    }
}

