/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.f.ap;
import net.minecraft.g.fc;
import net.minecraft.u.aw;

public class ah
extends ap
implements aw {
    @Override
    public void a() {
        if (this.k != null && !this.k.C && this.k.B() % 20L == 0L) {
            this.n = this.E();
            if (this.n instanceof fc) {
                ((fc)this.n).c(this.k, this.l);
            }
        }
    }
}

