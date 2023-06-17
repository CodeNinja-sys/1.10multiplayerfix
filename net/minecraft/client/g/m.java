/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import org.lwjgl.opengl.GL11;

class m {
    private final int a;
    private boolean b;

    public m(int n2) {
        this.a = n2;
    }

    public void a() {
        this.a(false);
    }

    public void b() {
        this.a(true);
    }

    public void a(boolean bl2) {
        if (bl2 != this.b) {
            this.b = bl2;
            if (bl2) {
                GL11.k(this.a);
            } else {
                GL11.l(this.a);
            }
        }
    }
}

