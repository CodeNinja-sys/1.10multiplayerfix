/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import net.minecraft.client.f.u;
import net.minecraft.client.k.at;
import net.minecraft.client.l.g;
import net.minecraft.client.l.j;

class k
implements Runnable {
    final /* synthetic */ g a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    k(g g2, String string, String string2) {
        this.a = g2;
        this.b = string;
        this.c = string2;
    }

    @Override
    public void run() {
        g.a(this.a).a(new at(new j(this, this.b, this.c), u.a("multiplayer.texturePrompt.line1", new Object[0]), u.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
    }

    static /* synthetic */ g a(k k2) {
        return k2.a;
    }
}

