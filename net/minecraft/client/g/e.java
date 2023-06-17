/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import net.minecraft.client.g.ag;

public class e
implements ag {
    private int[] a;
    private int b;
    private int c;

    @Override
    public BufferedImage a(BufferedImage bufferedImage) {
        boolean bl2;
        if (bufferedImage == null) {
            return null;
        }
        this.b = 64;
        this.c = 64;
        BufferedImage bufferedImage2 = new BufferedImage(this.b, this.c, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        boolean bl3 = bl2 = bufferedImage.getHeight() == 32;
        if (bl2) {
            graphics.setColor(new Color(0, 0, 0, 0));
            graphics.fillRect(0, 32, 64, 32);
            graphics.drawImage(bufferedImage2, 24, 48, 20, 52, 4, 16, 8, 20, null);
            graphics.drawImage(bufferedImage2, 28, 48, 24, 52, 8, 16, 12, 20, null);
            graphics.drawImage(bufferedImage2, 20, 52, 16, 64, 8, 20, 12, 32, null);
            graphics.drawImage(bufferedImage2, 24, 52, 20, 64, 4, 20, 8, 32, null);
            graphics.drawImage(bufferedImage2, 28, 52, 24, 64, 0, 20, 4, 32, null);
            graphics.drawImage(bufferedImage2, 32, 52, 28, 64, 12, 20, 16, 32, null);
            graphics.drawImage(bufferedImage2, 40, 48, 36, 52, 44, 16, 48, 20, null);
            graphics.drawImage(bufferedImage2, 44, 48, 40, 52, 48, 16, 52, 20, null);
            graphics.drawImage(bufferedImage2, 36, 52, 32, 64, 48, 20, 52, 32, null);
            graphics.drawImage(bufferedImage2, 40, 52, 36, 64, 44, 20, 48, 32, null);
            graphics.drawImage(bufferedImage2, 44, 52, 40, 64, 40, 20, 44, 32, null);
            graphics.drawImage(bufferedImage2, 48, 52, 44, 64, 52, 20, 56, 32, null);
        }
        graphics.dispose();
        this.a = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
        this.b(0, 0, 32, 16);
        if (bl2) {
            this.a(32, 0, 64, 32);
        }
        this.b(0, 16, 64, 32);
        this.b(16, 48, 48, 64);
        return bufferedImage2;
    }

    @Override
    public void a() {
    }

    private void a(int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        for (n7 = n2; n7 < n4; ++n7) {
            for (n6 = n3; n6 < n5; ++n6) {
                int n8 = this.a[n7 + n6 * this.b];
                if ((n8 >> 24 & 0xFF) >= 128) continue;
                return;
            }
        }
        for (n7 = n2; n7 < n4; ++n7) {
            for (n6 = n3; n6 < n5; ++n6) {
                int n9 = n7 + n6 * this.b;
                this.a[n9] = this.a[n9] & 0xFFFFFF;
            }
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        for (int i2 = n2; i2 < n4; ++i2) {
            for (int i3 = n3; i3 < n5; ++i3) {
                int n6 = i2 + i3 * this.b;
                this.a[n6] = this.a[n6] | 0xFF000000;
            }
        }
    }
}

