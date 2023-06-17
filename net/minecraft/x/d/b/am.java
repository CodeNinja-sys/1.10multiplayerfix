/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class am
implements p {
    private String[] a;

    public am() {
    }

    public am(String[] arrstring) {
        this.a = arrstring;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = new String[a2.e()];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = a2.e(32767);
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a.length);
        String[] arrstring = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = arrstring[i2];
            a2.a(string);
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public String[] a() {
        return this.a;
    }
}

