/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;

public class cze
extends chb {
    private final int[] f;
    private final int g;
    private final int h;

    public cze(BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.f, 0, bufferedImage.getWidth());
        this.b();
    }

    public cze(int n2, int n3) {
        this.g = n2;
        this.h = n3;
        this.f = new int[n2 * n3];
        anq.a(this.aF_(), n2, n3);
    }

    @Override
    public void a(akx akx2) {
    }

    public void b() {
        anq.a(this.aF_(), this.f, this.g, this.h);
    }

    public int[] c() {
        return this.f;
    }
}

