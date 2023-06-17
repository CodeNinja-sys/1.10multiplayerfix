/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import e.a.t;
import net.minecraft.client.c.v;
import net.minecraft.client.c.y;

class aa
extends t {
    final /* synthetic */ y a;

    aa(y y2) {
        this.a = y2;
    }

    @Override
    public void a(String string, int n2) {
        if (!string.isEmpty()) {
            v.g().d(string);
        }
    }

    @Override
    public void b(String string, int n2) {
        if (!string.isEmpty()) {
            v.g().f(string);
        }
    }

    @Override
    public void a(String string, String string2, int n2) {
        if (!string2.isEmpty()) {
            v.g().b("Error in class '{}'", string);
            v.g().b(string2);
        }
    }
}

