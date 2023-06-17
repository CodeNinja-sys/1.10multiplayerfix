/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.Random;
import net.minecraft.d.c;
import net.minecraft.w.ac;

public class ap
implements ac {
    public c a;

    public void a(Random random) {
        int n2 = random.nextInt(5);
        if (n2 <= 1) {
            this.a = net.minecraft.a.c.a;
        } else if (n2 <= 2) {
            this.a = net.minecraft.a.c.e;
        } else if (n2 <= 3) {
            this.a = net.minecraft.a.c.j;
        } else if (n2 <= 4) {
            this.a = net.minecraft.a.c.n;
        }
    }
}

