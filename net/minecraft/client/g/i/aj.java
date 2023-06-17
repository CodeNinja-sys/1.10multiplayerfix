/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.bb;
import net.minecraft.client.g.i.f;
import net.minecraft.u.bp;
import net.minecraft.w.e.bk;

public class aj
extends bb {
    private static final bp a = new bp("textures/entity/spider/cave_spider.png");

    public aj(f f2) {
        super(f2);
        this.d *= 0.7f;
    }

    protected void a(bk bk2, float f2) {
        bd.b(0.7f, 0.7f, 0.7f);
    }

    protected bp a(bk bk2) {
        return a;
    }
}

