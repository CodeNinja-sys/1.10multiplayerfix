/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import java.awt.image.BufferedImage;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.g;
import net.minecraft.client.g.a.p;

public class m
extends g {
    private final int[] a;
    private final int b;
    private final int h;

    public m(BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.a, 0, bufferedImage.getWidth());
        this.a();
    }

    public m(int n2, int n3) {
        this.b = n2;
        this.h = n3;
        this.a = new int[n2 * n3];
        p.a(this.e(), n2, n3);
    }

    @Override
    public void a(s s2) {
    }

    public void a() {
        p.a(this.e(), this.a, this.b, this.h);
    }

    public int[] b() {
        return this.a;
    }
}

